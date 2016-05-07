package fr.zeiyo.zeiyocraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ZItemAlcohol extends ItemFood

{

    public ZItemAlcohol(String unlocalizedName, int healAmount, int duration, int amplifier)
    {
        super(healAmount, false);
        this.func_77655_b(unlocalizedName);
        this.func_77625_d(1);
        this.func_77848_i();
        this.func_185070_a(new PotionEffect(MobEffects.field_76431_k, duration, amplifier, false, false), 1.0F);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.func_77654_b(stack, worldIn, playerIn);
        return new ItemStack(ZeiyoItems.tankard);
    }

}