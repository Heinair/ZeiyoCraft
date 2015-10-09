package fr.zeiyo.zeiyocraft.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZBlockCrops extends BlockCrops implements IGrowable
{

    public static Item cropItem;
    public static Item seedItem;

    protected ZBlockCrops(String unlocalizedName, Item crop, Item seed)
    {
        this.setUnlocalizedName(unlocalizedName);
        cropItem = crop;
        seedItem = seed;

    }

    protected Item getCrop()
    {
        return this.cropItem;
    }

    protected Item getSeed()
    {
        return this.seedItem;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return this.getSeed();
    }

    @Override
    public EnumPlantType getPlantType (IBlockAccess world, BlockPos pos)
    {
        return EnumPlantType.Crop;
    }

}