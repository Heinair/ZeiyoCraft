package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.item.ItemMonsterPlacer;

/**
 * Created by Luca on 09/04/2017.
 */
public class ZItemMonsterPlacer extends ItemMonsterPlacer {
    public ZItemMonsterPlacer(String unlocalizedName)
    {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
    }
}
