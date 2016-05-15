package fr.zeiyo.zeiyocraft.item;

import java.util.Set;

import com.google.common.collect.Sets;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ZItemAxe extends ItemTool
{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate});
	public int id;

	public ZItemAxe(String unlocalizedName, ToolMaterial material, int nmb)
	{
		super(material, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedName);
		this.isRepairable();
		this.damageVsEntity = 4.0F + material.getDamageVsEntity();
		this.setRegistryName(unlocalizedName);
		this.attackSpeed = -3.1F;
		this.id = nmb;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.wood && material != Material.plants && material != Material.vine ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
