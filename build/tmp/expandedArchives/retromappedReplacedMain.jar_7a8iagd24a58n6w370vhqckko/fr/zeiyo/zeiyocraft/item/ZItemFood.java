package fr.zeiyo.zeiyocraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ZItemFood extends ItemFood

{

    public ZItemFood(String unlocalizedName, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.func_77655_b(unlocalizedName);
        this.func_77637_a(CreativeTabs.field_78039_h);
    }

}