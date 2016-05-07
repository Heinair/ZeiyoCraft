package fr.zeiyo.zeiyocraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSoup;

public class ZItemSoup extends ItemSoup
{

    public ZItemSoup(String unlocalizedName, int healAmount)
    {

        super(healAmount);
        this.func_77655_b(unlocalizedName);
        this.func_77637_a(CreativeTabs.field_78039_h);

    }

}