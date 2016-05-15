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
        this.setUnlocalizedName(unlocalizedName);
        this.setMaxStackSize(1);
        this.setAlwaysEdible();
        this.setRegistryName(unlocalizedName);
        this.setPotionEffect(new PotionEffect(MobEffects.confusion, duration, amplifier, false, false), 1.0F);
    }

    
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        return new ItemStack(ZeiyoItems.tankard);               
    }

}