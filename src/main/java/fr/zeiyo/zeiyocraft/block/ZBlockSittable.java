package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.entity.ZCollisionHelper;
import fr.zeiyo.zeiyocraft.entity.ZEntitySittable;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class ZBlockSittable extends Block
{
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public ZBlockSittable(String unlocalizedName, Material material)
    {
        super(material);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(1.0F);
        this.setHarvestLevel("axe", 0);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean isFullCube()
    {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if(this.sitOnBlock(world, pos.getX(), pos.getY(), pos.getZ(), player, 7 * 0.0625))
        {
            world.updateComparatorOutputLevel(pos, this);
            return true;
        }
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, BlockPos pos)
    {
        setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.2F, 0.9F);
    }

    @Override
    public void addCollisionBoxesToList(World world, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity)
    {
        if (!(collidingEntity instanceof ZEntitySittable))
        {
            int metadata = getMetaFromState(state);
            float[] data = ZCollisionHelper.fixRotation(metadata, 0.825F, 0.1F, 0.9F, 0.9F);
            setBlockBounds(data[0], 0.6F, data[1], data[2], 1.2F, data[3]);
            super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
            setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.6F, 0.9F);
            super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
        }
        else
        {
            setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
            super.addCollisionBoxesToList(world, pos, state, mask, list, collidingEntity);
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {

        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return ZeiyoItems.chocolateCake;
    }
    
   /* @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
    {
        if (this == FurnitureBlocks.chair_wood)
            return new ItemStack(FurnitureItems.itemChairWood);
        if (this == FurnitureBlocks.chair_stone)
            return new ItemStack(FurnitureItems.itemChairStone);
        return null;
    }*/

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        state = state.withProperty(FACING, placer.getHorizontalFacing());
        return state;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
    }

    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] { FACING });
    }

    @Override
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    @Override
    public int getComparatorInputOverride(World world, BlockPos pos)
    {
        return this.isSomeoneSitting(world, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
    }

    public static boolean sitOnBlock(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer, double par6)
    {
        if (!checkForExistingEntity(par1World, x, y, z, par5EntityPlayer))
        {
            ZEntitySittable nemb = new ZEntitySittable(par1World, x, y, z, par6);
            par1World.spawnEntityInWorld(nemb);
            par5EntityPlayer.mountEntity(nemb);
        }
        return true;
    }

  /*  public static boolean sitOnBlockWithRotationOffset(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer, double par6, int metadata, double offset)
    {
        if (!checkForExistingEntity(par1World, x, y, z, par5EntityPlayer))
        {
            ZEntitySittable nemb = new ZEntitySittable(par1World, x, y, z, par6, metadata, offset);
            par1World.spawnEntityInWorld(nemb);
            par5EntityPlayer.mountEntity(nemb);
        }
        return true;
    }*/

    public static boolean checkForExistingEntity(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer)
    {
        List<ZEntitySittable> listEMB = par1World.getEntitiesWithinAABB(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB)
        {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z)
            {
                if (mount.riddenByEntity == null)
                {
                    par5EntityPlayer.mountEntity(mount);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSomeoneSitting(World world, double x, double y, double z)
    {
        List<ZEntitySittable> listEMB = world.getEntitiesWithinAABB(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB)
        {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z)
            {
                return mount.riddenByEntity != null;
            }
        }
        return false;
    }
}