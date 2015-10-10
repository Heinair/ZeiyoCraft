package fr.zeiyo.zeiyocraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSoup;

public class ZItemSoup extends ItemSoup
{

    public ZItemSoup(String unlocalizedName, int healAmount)
    {

        super(healAmount);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabFood);

    }

}
