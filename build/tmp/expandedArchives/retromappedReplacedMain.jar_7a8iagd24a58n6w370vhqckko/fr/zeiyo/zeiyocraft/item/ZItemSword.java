package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import net.minecraft.item.Item.ToolMaterial;
public class ZItemSword extends ItemSword
{

	public int id;

	public ZItemSword(String unlocalizedName, ToolMaterial material, int nmb)
	{
		super(material);
		this.func_77655_b(unlocalizedName);
		this.isRepairable();
		this.id = nmb;
	}

	@Override
	public boolean func_82789_a(ItemStack toRepair, ItemStack repair)
	{
		return ZCraftingUtils.getRepairItem(id) == repair.func_77973_b() ? true : super.func_82789_a(toRepair, repair);
	}

}


