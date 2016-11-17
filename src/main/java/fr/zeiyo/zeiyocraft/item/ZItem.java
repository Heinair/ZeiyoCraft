package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.item.Item;

public class ZItem extends Item

{

    public ZItem(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
    }

}
