package fr.zeiyo.item;

import net.minecraft.item.ItemPickaxe;

public class ZItemPickaxe extends ItemPickaxe
{

	protected ZItemPickaxe(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	}

}


