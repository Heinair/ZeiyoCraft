package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
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
			if (this.isWearingFullSet(player, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(22), 0, 650);
			}
			else if (this.isWearingFullSet(player, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(12), 1, 50);
			}
			else if (this.isWearingFullSet(player, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(3), 0, 50);
			}
			else if (this.isWearingFullSet(player, ZeiyoItems.nacreHelmet, ZeiyoItems.nacreChestplate, ZeiyoItems.nacreLeggings, ZeiyoItems.nacreBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(13), 0, 50);
			}
			else if (this.isWearingFullSet(player, ZeiyoItems.jadeHelmet, ZeiyoItems.jadeChestplate, ZeiyoItems.jadeLeggings, ZeiyoItems.jadeBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(8), 0, 50);
			}
			else if (this.isWearingFullSet(player, ZeiyoItems.amethystHelmet, ZeiyoItems.amethystChestplate, ZeiyoItems.amethystLeggings, ZeiyoItems.amethystBoots))
			{
				this.effectPlayer(player, Potion.getPotionById(5), 0, 50);
			}
		}

    }
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier, int duration)
	{
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion , duration, amplifier, false, false));
	}
	
	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) 
	{		
		 return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;

	}


    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
}