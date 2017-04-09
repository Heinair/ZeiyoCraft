package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ZItemArmor extends ItemArmor

{

	protected int id;

	public ZItemArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, int nmb) {
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
		this.isRepairable();
		this.id = nmb;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(ZeiyoConfig.newEffects)
		{
			if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.onyxHelmet), new ItemStack(ZeiyoItems.onyxChestplate), new ItemStack(ZeiyoItems.onyxLeggings), new ItemStack(ZeiyoItems.onyxBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(22), 0, 650);
			}
			else if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.rubyHelmet), new ItemStack(ZeiyoItems.rubyChestplate), new ItemStack(ZeiyoItems.rubyLeggings), new ItemStack(ZeiyoItems.rubyBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(12), 1, 50);
			}
			else if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.sapphireHelmet), new ItemStack(ZeiyoItems.sapphireChestplate), new ItemStack(ZeiyoItems.sapphireLeggings), new ItemStack(ZeiyoItems.sapphireBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(3), 0, 50);
			}
			else if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.nacreHelmet), new ItemStack(ZeiyoItems.nacreChestplate), new ItemStack(ZeiyoItems.nacreLeggings), new ItemStack(ZeiyoItems.nacreBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(13), 0, 50);
			}
			else if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.jadeHelmet), new ItemStack(ZeiyoItems.jadeChestplate), new ItemStack(ZeiyoItems.jadeLeggings), new ItemStack(ZeiyoItems.jadeBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(8), 0, 50);
			}
			else if (this.isWearingFullSet(player, new ItemStack(ZeiyoItems.amethystHelmet), new ItemStack(ZeiyoItems.amethystChestplate), new ItemStack(ZeiyoItems.amethystLeggings), new ItemStack(ZeiyoItems.amethystBoots)))
			{
				this.effectPlayer(player, Potion.getPotionById(5), 0, 50);
			}
		}

	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier, int duration)
	{
		if(!player.worldObj.isRemote)
		{
			if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
				player.addPotionEffect(new PotionEffect(potion , duration, amplifier, false, false));
		}
	}

	private boolean isWearingFullSet(EntityPlayer player, ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots)
	{
		if(player.worldObj.isRemote) return false;

		for(ItemStack is : player.getArmorInventoryList())
		{
			if(!(is.areItemsEqualIgnoreDurability(is, helmet) || is.areItemsEqualIgnoreDurability(is, chestplate)
					|| is.areItemsEqualIgnoreDurability(is, leggings) || is.areItemsEqualIgnoreDurability(is, helmet)
					|| is.areItemsEqualIgnoreDurability(is, boots)))
			{
				return false;
			}
		}

		return true;

	}


	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}