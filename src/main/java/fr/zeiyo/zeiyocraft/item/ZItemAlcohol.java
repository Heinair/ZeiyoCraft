package fr.zeiyo.zeiyocraft.item;


import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ZItemAlcohol extends ItemFood
{
    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    private boolean alwaysEdible;
    /** represents the potion effect that will occurr upon eating this food. Set by setPotionEffect */
    private Potion potionId;
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;

    private int effectDuration, effectAmplifier;

    public ZItemAlcohol(String unlocalizedName, int amount, float saturation, Potion potion, int duration, int amplifier)
    {
        super(amount, saturation, false);
    	this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.healAmount = amount;
        this.saturationModifier = saturation;
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setAlwaysEdible();
        this.alwaysEdible = true;
        this.potionId = potion;
        this.effectAmplifier = amplifier;
        this.effectDuration = duration;
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
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));
        }

        return stack;
    }


    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.potionId != null && worldIn.rand.nextFloat() < this.potionEffectProbability)
        {
            player.addPotionEffect(new PotionEffect(this.potionId));
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 0, false, false));
        }
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World itemStackIn, EntityPlayer worldIn, EnumHand playerIn)
    {
        ItemStack itemstack = worldIn.getHeldItem(playerIn);

        if (worldIn.canEat(true))
        {
            worldIn.setActiveHand(playerIn);
            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
        }
        else
        {
            return new ActionResult(EnumActionResult.FAIL, itemstack);
        }
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        this.onItemUseFinish1(stack, worldIn, entityLiving);
        return new ItemStack(ZeiyoItems.tankard);
    }

}