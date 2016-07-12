package fr.zeiyo.zeiyocraft.item;

import com.google.common.collect.Sets;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ZItemAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER});
    public int id;

    public ZItemAxe(String unlocalizedName, ToolMaterial material, int nmb) {
        super(material, EFFECTIVE_ON);
        this.setUnlocalizedName(unlocalizedName);
        this.isRepairable();
        this.damageVsEntity = 4.0F + material.getDamageVsEntity();
        this.setRegistryName(unlocalizedName);
        this.attackSpeed = -3.1F;
        this.id = nmb;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        return state.getMaterial() != Material.WOOD && state.getMaterial() != Material.PLANTS && state.getMaterial() != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }

}
