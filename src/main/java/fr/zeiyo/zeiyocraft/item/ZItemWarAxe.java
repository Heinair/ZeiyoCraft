package fr.zeiyo.zeiyocraft.item;

import com.google.common.collect.Sets;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ZItemWarAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});
    public int id;


    public ZItemWarAxe(String unlocalizedName, ToolMaterial material, int nmb) {
        super(material, EFFECTIVE_ON);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.isRepairable();
        this.damageVsEntity = 6.0F + material.getDamageVsEntity();
        this.attackSpeed = -2.9F;
        this.id = nmb;
        this.setRegistryName(unlocalizedName);
    }

    public ZItemWarAxe(String unlocalizedName, ToolMaterial material) {
        this(unlocalizedName, material, -1);
    }

    /*
    @Override
    public Set<String> getToolClasses(ItemStack stack)
    {
        return ImmutableSet.of("axe", "sword");
    }
	*/

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        return state.getMaterial() != Material.wood && state.getMaterial() != Material.plants && state.getMaterial() != Material.vine ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
