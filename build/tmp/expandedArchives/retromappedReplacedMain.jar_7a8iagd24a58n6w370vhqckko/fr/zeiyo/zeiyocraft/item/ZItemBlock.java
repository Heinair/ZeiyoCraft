package fr.zeiyo.zeiyocraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlockSpecial;

public class ZItemBlock extends ItemBlockSpecial

{

	public ZItemBlock(String unlocalizedName, Block block, CreativeTabs tab)
	{
		super(block);
		this.func_77655_b(unlocalizedName);
		this.func_77637_a(tab);
	}

}