package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ZItemAxe extends ItemAxe
{

	public int id;

	public ZItemAxe(String unlocalizedName, ToolMaterial material, int nmb)
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
