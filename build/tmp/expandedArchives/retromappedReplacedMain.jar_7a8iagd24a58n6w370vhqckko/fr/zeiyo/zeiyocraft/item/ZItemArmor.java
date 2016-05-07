package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import net.minecraft.item.ItemArmor.ArmorMaterial;
public class ZItemArmor extends ItemArmor

{

	protected int id;

    public ZItemArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, int nmb)
	{
        super(material, renderIndex, armorType);
        this.func_77655_b(unlocalizedName);
        this.isRepairable();
		this.id = nmb;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		
		if (this.isWearingFullSet(player, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots)) 
		{
			this.effectPlayer(player, Potion.func_188412_a(22), 0, 600);
		}
		if (this.isWearingFullSet(player, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots)) 
		{
			this.effectPlayer(player, Potion.func_188412_a(12), 0, 50);
		}
		if (this.isWearingFullSet(player, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots)) 
		{
			this.effectPlayer(player, Potion.func_188412_a(13), 0, 50);
		}

		
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier, int duration)
	{
		if (player.func_70660_b(potion) == null || player.func_70660_b(potion).func_76459_b() <= 1)
			player.func_70690_d(new PotionEffect(potion , duration, amplifier, false, false));
	}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) 
	{
		return player.field_71071_by.func_70440_f(3) != null && player.field_71071_by.func_70440_f(3).func_77973_b() == helmet
				&& player.field_71071_by.func_70440_f(2) != null && player.field_71071_by.func_70440_f(2).func_77973_b() == chestplate
				&& player.field_71071_by.func_70440_f(1) != null && player.field_71071_by.func_70440_f(1).func_77973_b() == leggings
				&& player.field_71071_by.func_70440_f(0) != null && player.field_71071_by.func_70440_f(0).func_77973_b() == boots;
	}

    @Override
    public boolean func_82789_a(ItemStack toRepair, ItemStack repair)
    {
        return ZCraftingUtils.getRepairItem(id) == repair.func_77973_b() ? true : super.func_82789_a(toRepair, repair);
    }

}
	

