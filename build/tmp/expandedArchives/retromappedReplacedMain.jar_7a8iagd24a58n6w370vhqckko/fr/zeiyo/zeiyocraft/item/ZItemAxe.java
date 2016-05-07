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

import net.minecraft.item.Item.ToolMaterial;
public class ZItemAxe extends ItemTool
{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap, Blocks.field_150471_bO, Blocks.field_150452_aw});
	public int id;

	public ZItemAxe(String unlocalizedName, ToolMaterial material, int nmb)
	{
		super(material, EFFECTIVE_ON);
		this.func_77655_b(unlocalizedName);
		this.isRepairable();
		this.field_77865_bY = 4.0F + material.func_78000_c();
		this.field_185065_c = -3.1F;
		this.id = nmb;
	}

	@Override
	public boolean func_82789_a(ItemStack toRepair, ItemStack repair)
	{
		return ZCraftingUtils.getRepairItem(id) == repair.func_77973_b() ? true : super.func_82789_a(toRepair, repair);
	}
	
	public float func_150893_a(ItemStack stack, IBlockState state)
    {
        Material material = state.func_185904_a();
        return material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l ? super.func_150893_a(stack, state) : this.field_77864_a;
    }

}
