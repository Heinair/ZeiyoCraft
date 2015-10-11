package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ZItemSword extends ItemSword
{

	public int id;

	public ZItemSword(String unlocalizedName, ToolMaterial material, int nmb)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.id = nmb;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}


