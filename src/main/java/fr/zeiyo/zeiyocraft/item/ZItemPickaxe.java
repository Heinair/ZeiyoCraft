package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ZItemPickaxe extends ItemPickaxe
{

	public int id;

	protected ZItemPickaxe(String unlocalizedName, ToolMaterial material, int nmb)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		id = nmb;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}


