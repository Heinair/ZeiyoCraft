package fr.zeiyo.zeiyocraft.item;


import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.Random;

public class ZItemDrug extends Item
{

    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;

    public ZItemDrug(String unlocalizedName, int amount, float saturation)
    {
    	this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.healAmount = amount;
        this.saturationModifier = saturation;
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setMaxStackSize(1);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish1(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        stack.func_190918_g(1);

        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(healAmount, saturationModifier);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));
        }

        return stack;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && worldIn.rand.nextFloat() < this.potionEffectProbability)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 0, false, false));
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 0, false, false));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    @Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 24;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.NONE;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World itemStackIn, EntityPlayer worldIn, EnumHand playerIn)
    {
        ItemStack itemstack = worldIn.getHeldItem(playerIn);
        worldIn.setActiveHand(playerIn);
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        this.onItemUseFinish1(stack, worldIn, entityLiving);
        return new ItemStack(ZeiyoItems.pipe);
    }
    
}