package fr.zeiyo.zeiyocraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class ZItemSeeds extends ItemSeeds {

    public ZItemSeeds(String unlocalizedName, Block crops, Block soil) {
        super(crops, soil);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setRegistryName(unlocalizedName);
    }

}