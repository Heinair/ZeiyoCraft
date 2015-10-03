package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZBlockCrops extends BlockCrops
{
    protected int id;

    public ZBlockCrops(String unlocalizedName, int nmb)
    {
        this.setUnlocalizedName(unlocalizedName);
        id = nmb;
    }

    @Override
    public Item getCrop()
    {

        if (this.id == 0)
        {

            return ZeiyoItems.barley;

        }

        else
        {
            return ZeiyoItems.grape;
        }

    }

    @Override
    public Item getSeed()
    {
        if (this.id == 0)
        {
            return ZeiyoItems.barleySeeds;
        }

        else
        {
            return ZeiyoItems.grapeSeeds;
        }
    }

    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return this.getSeed();
    }

}
