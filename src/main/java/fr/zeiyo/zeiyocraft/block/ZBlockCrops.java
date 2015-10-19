package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
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
    public int id;

    protected ZBlockCrops(String unlocalizedName, int nmb)
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.id = nmb;
    }

    @Override
    protected Item getCrop()
    {

        switch(id)
        {
            case 0 : return ZeiyoItems.barley;
            case 1 : return ZeiyoItems.grape;

            default : return null;
        }

    }

    @Override
    protected Item getSeed()
    {
        switch(id)
        {
            case 0 : return ZeiyoItems.barleySeeds;
            case 1 : return ZeiyoItems.grapeSeeds;

            default : return null;
        }
    }

    @Override
    public EnumPlantType getPlantType (IBlockAccess world, BlockPos pos)
    {
        return EnumPlantType.Crop;
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return this.getSeed();
    }

}