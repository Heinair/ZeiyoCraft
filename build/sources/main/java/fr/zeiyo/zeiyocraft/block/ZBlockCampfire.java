/*

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class ZBlockCampfire extends Block
{

        private final boolean isBurning;
        private static boolean keepInventory;

        protected ZBlockCampfire(String unlocalizedName, boolean isBurning)
        {
            super(Material.rock);
            this.setUnlocalizedName(unlocalizedName);
            this.isBurning = isBurning;
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

        @SideOnly(Side.CLIENT)
        public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
        {
            if (this.isBurning)
            {
                double d0 = (double)pos.getX() + 0.5D;
                double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
                double d2 = (double)pos.getZ() + 0.5D;
                double d3 = 0.52D;
                double d4 = rand.nextDouble() * 0.6D - 0.3D;

                worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
                worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);


                if (this.isActive)
                {

                    float f = (float)par2 + 0.5F;
                    float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
                    float f2 = (float)par4 + 0.5F;
                    float f3 = 0.52F;
                    float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

                    if (l == 4)
                    {
                        par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                        par1World.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    }
                    else if (l == 5)
                    {
                        par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                        par1World.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                    }
                    else if (l == 2)
                    {
                        par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                        par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                    }
                    else if (l == 3)
                    {
                        par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                        par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                    }
                }

            }
        }

        public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
        {
            if (worldIn.isRemote)
            {
                return true;
            }
            else
            {
                TileEntity tileentity = worldIn.getTileEntity(pos);

                if (tileentity instanceof TileEntityFurnace)
                {
                    playerIn.displayGUIChest((TileEntityFurnace)tileentity);
                }

                return true;
            }
        }

 
        public TileEntity createNewTileEntity(World worldIn, int meta)
        {
            return new TileEntityFurnace();
        }

        public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
        {
            if (!keepInventory)
            {
                TileEntity tileentity = worldIn.getTileEntity(pos);

                if (tileentity instanceof TileEntityFurnace)
                {
                    InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityFurnace) tileentity);
                    worldIn.updateComparatorOutputLevel(pos, this);
                }
            }

            super.breakBlock(worldIn, pos, state);
        }

        public boolean hasComparatorInputOverride()
        {
            return true;
        }

        public int getComparatorInputOverride(World worldIn, BlockPos pos)
        {
            return Container.calcRedstone(worldIn.getTileEntity(pos));
        }

}
*/
