package fr.zeiyo.zeiyocraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class ZItemSeeds extends ItemSeeds
{

    public ZItemSeeds(String unlocalizedName, Block crops, Block soil)
    {
        super(crops, soil);
        this.func_77655_b(unlocalizedName);
        this.func_77637_a(CreativeTabs.field_78035_l);
    }

}