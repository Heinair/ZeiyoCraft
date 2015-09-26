package fr.zeiyo.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemReed;

public class ZItemBlock extends ItemReed
{

	public ZItemBlock(String unlocalizedName, Block block, CreativeTabs tab) 
	{
		super(block);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
	}
	
	

}