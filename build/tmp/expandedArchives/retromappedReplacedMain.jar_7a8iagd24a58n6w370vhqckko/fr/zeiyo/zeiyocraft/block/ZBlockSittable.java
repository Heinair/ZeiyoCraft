package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.entity.ZEntitySittable;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class ZBlockSittable extends Block
{
    public static final PropertyDirection FACING = PropertyDirection.func_177712_a("facing", EnumFacing.Plane.HORIZONTAL);
    protected static final AxisAlignedBB SITTABLE_AABB = new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.9F, 1.2F, 0.9F);

    
    public ZBlockSittable(String unlocalizedName, Material material)
    {
        super(material);
        this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(FACING, EnumFacing.NORTH));
        this.func_149663_c(unlocalizedName);
        this.func_149711_c(1.0F);
        this.func_149647_a(CreativeTabs.field_78031_c);
        this.setHarvestLevel("axe", 0);
    }
    
    @Override
    public boolean func_149662_c(IBlockState state)
    {
        return false;
    }
    
    @Override
    public boolean func_149686_d(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean func_180639_a(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	
    	if(!(checkForExistingEntity(worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p(), playerIn)))
        {

            if(this.sitOnBlock(worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p(), playerIn, 7 * 0.0625))
            {
            	worldIn.func_175666_e(pos, this);
                return true;
            }

        }


        return false;    
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean addHitEffects(IBlockState state, World worldObj, RayTraceResult target, net.minecraft.client.particle.EffectRenderer effectRenderer)
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean addDestroyEffects(World world, BlockPos pos, net.minecraft.client.particle.EffectRenderer effectRenderer)
    {
        return true;
    }

    @Override
    public AxisAlignedBB func_185496_a(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SITTABLE_AABB;
    }
    
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB func_180640_a(IBlockState worldIn, World pos, BlockPos state)
    {
        return worldIn.func_185890_d(pos, state);
    }

    @Override
    public void func_185477_a(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB p_185477_4_, List<AxisAlignedBB> p_185477_5_, Entity p_185477_6_)
    {
        func_185492_a(pos, this.SITTABLE_AABB, p_185477_5_, state.func_185890_d(worldIn, pos));
    }

    @Override
    public IBlockState func_180642_a(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = super.func_180642_a(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        state = state.func_177226_a(FACING, placer.func_174811_aO());
        return state;
    }

    @Override
    public int func_176201_c(IBlockState state)
    {
        return ((EnumFacing) state.func_177229_b(FACING)).func_176736_b();
    }

    @Override
    protected BlockStateContainer func_180661_e()
    {
        return new BlockStateContainer(this, new IProperty[] { FACING });
    }

    @Override
    public boolean func_149740_M(IBlockState state)
    {
        return true;
    }

    @Override
    public int func_180641_l(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return this.isSomeoneSitting(worldIn, pos.func_177958_n(), pos.func_177956_o(), pos.func_177952_p()) ? 1 : 0;
    }
    

    public static boolean sitOnBlock(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer, double par6)
    {
        if (!checkForExistingEntity(par1World, x, y, z, par5EntityPlayer))
        {
            ZEntitySittable nemb = new ZEntitySittable(par1World, x, y, z, par6);
            par1World.func_72838_d(nemb);
            par5EntityPlayer.func_184220_m(nemb);
        }

        return true;
    }

    public static boolean checkForExistingEntity(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer)
    {
        List<ZEntitySittable> listEMB = par1World.func_72872_a(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).func_72314_b(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB)
        {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z)
            {
                if (mount.func_184207_aI() == false)
                {
                    par5EntityPlayer.func_184220_m(mount);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSomeoneSitting(World world, double x, double y, double z)
    {
        List<ZEntitySittable> listEMB = world.func_72872_a(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).func_72314_b(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB)
        {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z)
            {
                return mount.func_184207_aI() != false;
            }
        }
        return false;
    }
}