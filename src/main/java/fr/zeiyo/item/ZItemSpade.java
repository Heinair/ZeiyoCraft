package fr.zeiyo.item;

import net.minecraft.item.ItemSpade;

public class ZItemSpade extends ItemSpade
{

	public ZItemSpade(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
