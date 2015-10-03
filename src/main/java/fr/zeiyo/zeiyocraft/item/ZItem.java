package fr.zeiyo.zeiyocraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZItem extends Item
{
	
	public ZItem(String unlocalizedName)
	{
	    super();
	    this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(CreativeTabs.tabMaterials);
	}

}
