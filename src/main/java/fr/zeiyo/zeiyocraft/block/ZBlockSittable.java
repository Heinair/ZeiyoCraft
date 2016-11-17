package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.entity.ZEntitySittable;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class ZBlockSittable extends Block {
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    protected static final AxisAlignedBB SITTABLE_AABB = new AxisAlignedBB(0.1F, 0.0F, 0.1F, 0.9F, 1.2F, 0.9F);


    public ZBlockSittable(String unlocalizedName, Material material) {
        super(material);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.setHardness(1.0F);
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        this.setHarvestLevel("axe", 0);
        this.setSoundType(SoundType.WOOD);
    }
    

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }


    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing heldItem, float side, float hitX, float hitY) {

        if (!(checkForExistingEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn))) {

            if (this.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 7 * 0.0625)) {
                worldIn.updateComparatorOutputLevel(pos, this);
                return true;
            }

        }


        return false;
    }
    /*

    @Override
    @SideOnly(Side.CLIENT)
    public boolean addHitEffects(IBlockState state, World worldObj, RayTraceResult target, net.minecraft.client.particle.ParticleManager manager) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean addDestroyEffects(World world, BlockPos pos, net.minecraft.client.particle.ParticleManager manager) {
        return true;
    }
    
    */
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return null;
    } 
    

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SITTABLE_AABB;
    }
   
   /* @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB p_185477_4_, List<AxisAlignedBB> p_185477_5_, Entity p_185477_6_) {
        addCollisionBoxToList(pos, this.SITTABLE_AABB, p_185477_5_, state.getSelectedBoundingBox(worldIn, pos));
           }
   
*/
    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState state = super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        state = state.withProperty(FACING, placer.getHorizontalFacing());
        return state;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public boolean hasComparatorInputOverride(IBlockState state) {
        return true;
    }

    @Override
    public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
        return this.isSomeoneSitting(worldIn, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
    }


    public static boolean sitOnBlock(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer, double par6) {
        if (!checkForExistingEntity(par1World, x, y, z, par5EntityPlayer)) {
            ZEntitySittable nemb = new ZEntitySittable(par1World, x, y, z, par6);
            par1World.spawnEntityInWorld(nemb);
            par5EntityPlayer.startRiding(nemb);
        }

        return true;
    }

    public static boolean checkForExistingEntity(World par1World, double x, double y, double z, EntityPlayer par5EntityPlayer) {
        List<ZEntitySittable> listEMB = par1World.getEntitiesWithinAABB(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB) {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z) {
                if (mount.isBeingRidden() == false) {
                    par5EntityPlayer.startRiding(mount);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSomeoneSitting(World world, double x, double y, double z) {
        List<ZEntitySittable> listEMB = world.getEntitiesWithinAABB(ZEntitySittable.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).expand(1D, 1D, 1D));
        for (ZEntitySittable mount : listEMB) {
            if (mount.blockPosX == x && mount.blockPosY == y && mount.blockPosZ == z) {
                return mount.isBeingRidden() != false;
            }
        }
        return false;
    }
}