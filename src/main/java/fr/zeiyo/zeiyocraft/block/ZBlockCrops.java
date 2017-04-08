package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZBlockCrops extends BlockCrops implements IGrowable

{
    public int id;

    protected ZBlockCrops(String unlocalizedName, int nmb) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.id = nmb;
    }

    @Override
    protected Item getCrop() {

        switch (id) {
            case 0:
                return ZeiyoItems.barley;
            case 1:
                return ZeiyoItems.grape;           
            case 2 : 
            	return ZeiyoItems.hemp;
            case 3:
                return ZeiyoItems.chiliPepper;

            default:
                return null;
        }

    }

    @Override
    protected Item getSeed() {
        switch (id) {
            case 0:
                return ZeiyoItems.barleySeeds;
            case 1:
                return ZeiyoItems.grape;
            case 2 :
            	return ZeiyoItems.hempSeeds;
            case 3:
                return ZeiyoItems.chiliPepper;

            default:
                return null;
        }
    }

    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        IBlockState soil = worldIn.getBlockState(pos.down());;

        switch(id) {
            case 3:
                if(worldIn.getBiome(pos).getRainfall() < 0.05F)
                {
                    return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
                }
                return false;

            default:
                return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        }
    }


    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        if(id==3)
        {
            if(worldIn.getBiome(pos).getRainfall() < 0.05F)
            {
                return !this.isMaxAge(state);
            }

            return false;
        }

        return !this.isMaxAge(state);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos) {
        return this.getSeed();
    }

}