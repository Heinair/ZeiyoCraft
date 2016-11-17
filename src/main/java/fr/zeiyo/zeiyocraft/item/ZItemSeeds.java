package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;

public class ZItemSeeds extends ItemSeeds {

    public ZItemSeeds(String unlocalizedName, Block crops, Block soil) {
        super(crops, soil);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
    }

}