package fr.zeiyo.item;

import net.minecraft.item.ItemAxe;

public class ZItemAxe extends ItemAxe
{

	protected ZItemAxe(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}
