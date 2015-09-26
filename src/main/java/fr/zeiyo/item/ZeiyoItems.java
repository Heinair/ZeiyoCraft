package fr.zeiyo.item;

import fr.zeiyo.ZeiyoMain;
import fr.zeiyo.ZeiyoUtils;
import fr.zeiyo.block.ZeiyoBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public final class ZeiyoItems 

{
	// Materials
	
	public static ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 500, 6.0F, 2.5F, 13);
	public static ArmorMaterial BRONZEA = EnumHelper.addArmorMaterial("BRONZEA", "zeiyo:bronze", 19, new int[] {3,6,5,2}, 9);	
	public static ToolMaterial ELECTRUM = EnumHelper.addToolMaterial("ELECTRUM", 2, 500, 7.5F, 2.0F, 13);
	public static ArmorMaterial ELECTRUMA = EnumHelper.addArmorMaterial("ELECTRUMA", "zeiyo:electrum", 19, new int[] {2,6,5,3}, 9);
	public static ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 750, 6.0F, 2.0F, 13);
	public static ArmorMaterial STEELA = EnumHelper.addArmorMaterial("STEEL", "zeiyo:steel", 19, new int[] {2,6,6,2}, 9);
	public static ToolMaterial ONYX = EnumHelper.addToolMaterial("ONYX", 3, 2556, 8.0F, 3.0F, 14);
	public static ArmorMaterial ONYXA = EnumHelper.addArmorMaterial("ONYX", "zeiyo:onyx", 40, new int[] {3, 8, 6, 3}, 14);
	public static ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 1561, 8.0F, 4.0F, 10);
	public static ArmorMaterial RUBYA = EnumHelper.addArmorMaterial("RUBY", "zeiyo:ruby", 33, new int[] {3, 8, 6, 3}, 10);
	public static ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 3, 1561, 10.0F, 3.0F, 10);
	public static ArmorMaterial SAPPHIREA = EnumHelper.addArmorMaterial("SAPPHIRE", "zeiyo:sapphire", 33, new int[] {3, 8, 6, 3}, 10);
	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 1761, 8.5F, 3.5F, 18);
	public static ArmorMaterial EMERALDA = EnumHelper.addArmorMaterial("EMERALD", "zeiyo:emerald", 33, new int[] {3, 8, 6, 3}, 18);
	
	// Items
	
	public static Item chocolateCake;
	public static Item hardboiledEgg;
	public static Item applePie;
	public static Item puriFlesh;

	
	// Steel
	
	public static Item steelIngot;
	public static Item steelPickaxe;
	public static Item steelAxe;
	public static Item steelSpade;
	public static Item steelHoe;
	public static Item steelSword;
	public static Item steelHelmet;
	public static Item steelChestplate;
	public static Item steelLeggings;
	public static Item steelBoots;
	
	// Bronze
	
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item bronzeIngot;
	public static Item bronzePickaxe;
	public static Item bronzeAxe;
	public static Item bronzeSpade;
	public static Item bronzeHoe;
	public static Item bronzeSword;
	public static Item bronzeHelmet;
	public static Item bronzeChestplate;
	public static Item bronzeLeggings;
	public static Item bronzeBoots;
	
	// Electrum

	public static Item silverIngot;
	public static Item electrumIngot;
	public static Item electrumPickaxe;
	public static Item electrumAxe;
	public static Item electrumSpade;
	public static Item electrumHoe;
	public static Item electrumSword;
	public static Item electrumHelmet;
	public static Item electrumChestplate;
	public static Item electrumLeggings;
	public static Item electrumBoots;
	
	// Onyx
	
	public static Item onyx;
	public static Item onyxPickaxe;
	public static Item onyxAxe;
	public static Item onyxSpade;
	public static Item onyxHoe;
	public static Item onyxSword;
	public static Item onyxHelmet;
	public static Item onyxChestplate;
	public static Item onyxLeggings;
	public static Item onyxBoots;
	
	// Ruby
	
	public static Item ruby;
	public static Item rubyPickaxe;
	public static Item rubyAxe;
	public static Item rubySpade;
	public static Item rubyHoe;
	public static Item rubySword;
	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;
	
	// Sapphire
	
	public static Item sapphire;
	public static Item sapphirePickaxe;
	public static Item sapphireAxe;
	public static Item sapphireSpade;
	public static Item sapphireHoe;
	public static Item sapphireSword;
	public static Item sapphireHelmet;
	public static Item sapphireChestplate;
	public static Item sapphireLeggings;
	public static Item sapphireBoots;
	
	// Emerald
	
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldSpade;
	public static Item emeraldHoe;
	public static Item emeraldSword;
	public static Item emeraldHelmet;
	public static Item emeraldChestplate;
	public static Item emeraldLeggings;
	public static Item emeraldBoots;

	
	public static void createItems() 
	
	{
		
		// Food
		
		GameRegistry.registerItem(hardboiledEgg = new ZItemFood("hardboiledEgg", 4, 0.4F, false), "hardboiledEgg");
		GameRegistry.registerItem(chocolateCake = new ZItemBlock("chocolateCake", ZeiyoBlocks.blockChocolateCake, CreativeTabs.tabFood), "chocolateCake");
		GameRegistry.registerItem(applePie = new ZItemFood("applePie", 8, 0.5F, false),"applePie");
		GameRegistry.registerItem(puriFlesh = new ZItemFood("puriFlesh", 4, 0.3F, false),"puriFlesh");
		
		// Steel
		
		GameRegistry.registerItem(steelIngot = new ZItem("steelIngot"), "steelIngot");
		GameRegistry.registerItem(steelPickaxe = new ZItemPickaxe("steelPickaxe", STEEL), "steelPickaxe");
		GameRegistry.registerItem(steelAxe = new ZItemAxe("steelAxe", STEEL), "steelAxe");
		GameRegistry.registerItem(steelSpade = new ZItemSpade("steelSpade", STEEL), "steelSpade");
		GameRegistry.registerItem(steelHoe = new ZItemHoe("steelHoe", STEEL), "steelHoe");
		GameRegistry.registerItem(steelSword = new ZItemSword("steelSword", STEEL), "steelSword");
		GameRegistry.registerItem(steelHelmet = new ZItemArmor("steelHelmet", STEELA, 1, 0), "steelHelmet");
		GameRegistry.registerItem(steelChestplate = new ZItemArmor("steelChestplate", STEELA, 1, 1), "steelChestplate");
		GameRegistry.registerItem(steelLeggings = new ZItemArmor("steelLeggings", STEELA, 2, 2), "steelLeggings");
		GameRegistry.registerItem(steelBoots = new ZItemArmor("steelBoots", STEELA, 1, 3), "steelBoots");
		
		// Bronze
		
		GameRegistry.registerItem(copperIngot = new ZItem("copperIngot"), "copperIngot");
		GameRegistry.registerItem(tinIngot = new ZItem("tinIngot"), "tinIngot");
		GameRegistry.registerItem(bronzeIngot = new ZItem("bronzeIngot"), "bronzeIngot");
		GameRegistry.registerItem(bronzePickaxe = new ZItemPickaxe("bronzePickaxe", BRONZE), "bronzePickaxe");
		GameRegistry.registerItem(bronzeAxe = new ZItemAxe("bronzeAxe", BRONZE), "bronzeAxe");
		GameRegistry.registerItem(bronzeSpade = new ZItemSpade("bronzeSpade", BRONZE), "bronzeSpade");
		GameRegistry.registerItem(bronzeHoe = new ZItemHoe("bronzeHoe", BRONZE), "bronzeHoe");
		GameRegistry.registerItem(bronzeSword = new ZItemSword("bronzeSword", BRONZE), "bronzeSword");
		GameRegistry.registerItem(bronzeHelmet = new ZItemArmor("bronzeHelmet", BRONZEA, 1, 0), "bronzeHelmet");
		GameRegistry.registerItem(bronzeChestplate = new ZItemArmor("bronzeChestplate", BRONZEA, 1, 1), "bronzeChestplate");
		GameRegistry.registerItem(bronzeLeggings = new ZItemArmor("bronzeLeggings", BRONZEA, 2, 2), "bronzeLeggings");
		GameRegistry.registerItem(bronzeBoots = new ZItemArmor("bronzeBoots", BRONZEA, 1, 3), "bronzeBoots");
		
		// Electrum
		
		GameRegistry.registerItem(silverIngot = new ZItem("silverIngot"), "silverIngot");
		GameRegistry.registerItem(electrumIngot = new ZItem("electrumIngot"), "electrumIngot");
		GameRegistry.registerItem(electrumPickaxe = new ZItemPickaxe("electrumPickaxe", ELECTRUM), "electrumPickaxe");
		GameRegistry.registerItem(electrumAxe = new ZItemAxe("electrumAxe", ELECTRUM), "electrumAxe");
		GameRegistry.registerItem(electrumSpade = new ZItemSpade("electrumSpade", ELECTRUM), "electrumSpade");
		GameRegistry.registerItem(electrumHoe = new ZItemHoe("electrumHoe", ELECTRUM), "electrumHoe");
		GameRegistry.registerItem(electrumSword = new ZItemSword("electrumSword", ELECTRUM), "electrumSword");
		GameRegistry.registerItem(electrumHelmet = new ZItemArmor("electrumHelmet", ELECTRUMA, 1, 0), "electrumHelmet");
		GameRegistry.registerItem(electrumChestplate = new ZItemArmor("electrumChestplate", ELECTRUMA, 1, 1), "electrumChestplate");
		GameRegistry.registerItem(electrumLeggings = new ZItemArmor("electrumLeggings", ELECTRUMA, 2, 2), "electrumLeggings");
		GameRegistry.registerItem(electrumBoots = new ZItemArmor("electrumBoots", ELECTRUMA, 1, 3), "electrumBoots");
		
		// Onyx
		
		GameRegistry.registerItem(onyxPickaxe = new ZItemPickaxe("onyxPickaxe", ONYX), "onyxPickaxe");
		GameRegistry.registerItem(onyxAxe = new ZItemAxe("onyxAxe", ONYX), "onyxAxe");
		GameRegistry.registerItem(onyxSpade = new ZItemSpade("onyxSpade", ONYX), "onyxSpade");
		GameRegistry.registerItem(onyxHoe = new ZItemHoe("onyxHoe", ONYX), "onyxHoe");
		GameRegistry.registerItem(onyxSword = new ZItemSword("onyxSword", ONYX), "onyxSword");
		GameRegistry.registerItem(onyxHelmet = new ZItemArmor("onyxHelmet", ONYXA, 1, 0), "onyxHelmet");
		GameRegistry.registerItem(onyxChestplate = new ZItemArmor("onyxChestplate", ONYXA, 1, 1), "onyxChestplate");
		GameRegistry.registerItem(onyxLeggings = new ZItemArmor("onyxLeggings", ONYXA, 2, 2), "onyxLeggings");
		GameRegistry.registerItem(onyxBoots = new ZItemArmor("onyxBoots", ONYXA, 1, 3), "onyxBoots");
		
		// Ruby
		
		GameRegistry.registerItem(rubyPickaxe = new ZItemPickaxe("rubyPickaxe", RUBY), "rubyPickaxe");
		GameRegistry.registerItem(rubyAxe = new ZItemAxe("rubyAxe", RUBY), "rubyAxe");
		GameRegistry.registerItem(rubySpade = new ZItemSpade("rubySpade", RUBY), "rubySpade");
		GameRegistry.registerItem(rubyHoe = new ZItemHoe("rubyHoe", RUBY), "rubyHoe");
		GameRegistry.registerItem(rubySword = new ZItemSword("rubySword", RUBY), "rubySword");
		GameRegistry.registerItem(rubyHelmet = new ZItemArmor("rubyHelmet", RUBYA, 1, 0), "rubyHelmet");
		GameRegistry.registerItem(rubyChestplate = new ZItemArmor("rubyChestplate", RUBYA, 1, 1), "rubyChestplate");
		GameRegistry.registerItem(rubyLeggings = new ZItemArmor("rubyLeggings", RUBYA, 2, 2), "rubyLeggings");
		GameRegistry.registerItem(rubyBoots = new ZItemArmor("rubyBoots", RUBYA, 1, 3), "rubyBoots");
		
		// Sapphire

		
		GameRegistry.registerItem(sapphirePickaxe = new ZItemPickaxe("sapphirePickaxe", SAPPHIRE), "sapphirePickaxe");
		GameRegistry.registerItem(sapphireAxe = new ZItemAxe("sapphireAxe", SAPPHIRE), "sapphireAxe");
		GameRegistry.registerItem(sapphireSpade = new ZItemSpade("sapphireSpade", SAPPHIRE), "sapphireSpade");
		GameRegistry.registerItem(sapphireHoe = new ZItemHoe("sapphireHoe", SAPPHIRE), "sapphireHoe");
		GameRegistry.registerItem(sapphireSword = new ZItemSword("sapphireSword", SAPPHIRE), "sapphireSword");
		GameRegistry.registerItem(sapphireHelmet = new ZItemArmor("sapphireHelmet", SAPPHIREA, 1, 0), "sapphireHelmet");
		GameRegistry.registerItem(sapphireChestplate = new ZItemArmor("sapphireChestplate", SAPPHIREA, 1, 1), "sapphireChestplate");
		GameRegistry.registerItem(sapphireLeggings = new ZItemArmor("sapphireLeggings", SAPPHIREA, 2, 2), "sapphireLeggings");
		GameRegistry.registerItem(sapphireBoots = new ZItemArmor("sapphireBoots", SAPPHIREA, 1, 3), "sapphireBoots"); 
		
		// Emerald
		
		GameRegistry.registerItem(emeraldPickaxe = new ZItemPickaxe("emeraldPickaxe", EMERALD), "emeraldPickaxe");
		GameRegistry.registerItem(emeraldAxe = new ZItemAxe("emeraldAxe", EMERALD), "emeraldAxe");
		GameRegistry.registerItem(emeraldSpade = new ZItemSpade("emeraldSpade", EMERALD), "emeraldSpade");
		GameRegistry.registerItem(emeraldHoe = new ZItemHoe("emeraldHoe", EMERALD), "emeraldHoe");
		GameRegistry.registerItem(emeraldSword = new ZItemSword("emeraldSword", EMERALD), "emeraldSword");
		GameRegistry.registerItem(emeraldHelmet = new ZItemArmor("emeraldHelmet", EMERALDA, 1, 0), "emeraldHelmet");
		GameRegistry.registerItem(emeraldChestplate = new ZItemArmor("emeraldChestplate", EMERALDA, 1, 1), "emeraldChestplate");
		GameRegistry.registerItem(emeraldLeggings = new ZItemArmor("emeraldLeggings", EMERALDA, 2, 2), "emeraldLeggings");
		GameRegistry.registerItem(emeraldBoots = new ZItemArmor("emeraldBoots", EMERALDA, 1, 3), "emeraldBoots");
	
	
    }
	
	public static void createLootsItems()
	{
		
		GameRegistry.registerItem(onyx = new ZItem("onyx"), "onyx");
		GameRegistry.registerItem(ruby = new ZItem("ruby"), "ruby");
		GameRegistry.registerItem(sapphire = new ZItem("sapphire"), "sapphire");


		
	}
	
	
	
}