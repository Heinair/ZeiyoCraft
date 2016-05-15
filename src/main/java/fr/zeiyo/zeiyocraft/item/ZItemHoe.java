package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ZItemHoe extends ItemHoe {

    public int id;

    public ZItemHoe(String unlocalizedName, ToolMaterial material, int nmb) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.isRepairable();
        this.id = nmb;
        this.setRegistryName(unlocalizedName);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

}
