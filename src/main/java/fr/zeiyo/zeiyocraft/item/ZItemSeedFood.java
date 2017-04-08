package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeedFood;

public class ZItemSeedFood extends ItemSeedFood
{
    public ZItemSeedFood(String unlocalizedName, int healAmount, float saturation, Block crop, Block soil)
    {
        super(healAmount, saturation, crop, soil);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
    }
}
