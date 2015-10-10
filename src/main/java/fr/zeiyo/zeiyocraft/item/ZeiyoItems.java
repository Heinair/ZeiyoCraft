package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.material.ZArmorMaterial;
import fr.zeiyo.zeiyocraft.material.ZToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ZeiyoItems

{
	
	// Food-related Items
	
	public static Item chocolateCake;
	public static Item hardboiledEgg;
	public static Item applePie;
	public static Item puriFlesh;
	public static Item barleySeeds, barley, malt, grapeSeeds, grape;
    public static Item tankard, beerTankard, wineTankard, ciderTankard;

    // Coins

    public static Item copperCoin, silverCoin, goldCoin;

    // Steel

	public static Item steelIngot;
	public static Item steelPickaxe, steelAxe, steelSpade, steelHoe, steelSword;
	public static Item steelHelmet, steelChestplate, steelLeggings, steelBoots;
	
	// Bronze-related Items
	
	public static Item copperIngot,tinIngot, bronzeIngot;
	public static Item bronzePickaxe, bronzeAxe, bronzeSpade, bronzeHoe, bronzeSword;
	public static Item bronzeHelmet, bronzeChestplate, bronzeLeggings, bronzeBoots;

	// Electrum-related Items

	public static Item silverIngot, electrumIngot;
    public static Item electrumPickaxe, electrumAxe, electrumSpade, electrumHoe, electrumSword;
    public static Item electrumHelmet, electrumChestplate, electrumLeggings, electrumBoots;
	
	// Onyx
	
	public static Item onyx;
	public static Item onyxPickaxe, onyxAxe, onyxSpade, onyxHoe, onyxSword;
    public static Item onyxHelmet, onyxChestplate, onyxLeggings, onyxBoots;

    // Ruby
	
	public static Item ruby;
    public static Item rubyPickaxe, rubyAxe, rubySpade, rubyHoe, rubySword;
    public static Item rubyHelmet, rubyChestplate, rubyLeggings, rubyBoots;

    // Sapphire
	
	public static Item sapphire;
    public static Item sapphirePickaxe, sapphireAxe, sapphireSpade, sapphireHoe, sapphireSword;
    public static Item sapphireHelmet, sapphireChestplate, sapphireLeggings, sapphireBoots;

    // Emerald

    public static Item emeraldPickaxe, emeraldAxe, emeraldSpade, emeraldHoe, emeraldSword;
    public static Item emeraldHelmet, emeraldChestplate, emeraldLeggings, emeraldBoots;
	
	public static void createItems()

	{
		
		// Food
		
		GameRegistry.registerItem(hardboiledEgg = new ZItemFood("hardboiledEgg", 3, 0.1F, false), "hardboiledEgg");
		GameRegistry.registerItem(chocolateCake = new ZItemBlock("chocolateCake", ZeiyoBlocks.blockChocolateCake, CreativeTabs.tabFood), "chocolateCake");
		GameRegistry.registerItem(applePie = new ZItemFood("applePie", 8, 0.3F, false),"applePie");
		GameRegistry.registerItem(puriFlesh = new ZItemFood("puriFlesh", 4, 0.1F, true),"puriFlesh");
		GameRegistry.registerItem(barleySeeds = new ZItemSeeds("barleySeeds", ZeiyoBlocks.barleyCrops, Blocks.farmland), "barleySeeds");
        GameRegistry.registerItem(barley = new ZItem("barley"), "barley");
		GameRegistry.registerItem(grapeSeeds = new ZItemSeeds("grapeSeeds", ZeiyoBlocks.grapeCrops, Blocks.farmland), "grapeSeeds");
		GameRegistry.registerItem(grape = new ZItemFood("grape", 4, 0.3F, false), "grape");
        GameRegistry.registerItem(malt = new ZItem("malt"), "malt");
        GameRegistry.registerItem(tankard = new ZItem("tankard"), "tankard");
        GameRegistry.registerItem(beerTankard = new ZItemDrink("beerTankard", 2).setAlwaysEdible().setPotionEffect(9, 30, 2 , 1.0F), "beerTankard");
        GameRegistry.registerItem(ciderTankard = new ZItemDrink("ciderTankard", 2).setAlwaysEdible().setPotionEffect(9, 30, 2 , 1.0F), "ciderTankard");
        GameRegistry.registerItem(wineTankard = new ZItemDrink("wineTankard", 2).setAlwaysEdible().setPotionEffect(9, 40, 2 , 1.0F), "wineTankard");

        // Coins

        GameRegistry.registerItem(copperCoin = new ZItem("copperCoin").setMaxStackSize(100), "copperCoin");
        GameRegistry.registerItem(silverCoin = new ZItem("silverCoin").setMaxStackSize(100), "silverCoin");
        GameRegistry.registerItem(goldCoin = new ZItem("goldCoin").setMaxStackSize(100), "goldCoin");

        // Steel
		
		GameRegistry.registerItem(steelIngot = new ZItem("steelIngot"), "steelIngot");
		GameRegistry.registerItem(steelPickaxe = new ZItemPickaxe("steelPickaxe", ZToolMaterial.STEEL, 0), "steelPickaxe");
		GameRegistry.registerItem(steelAxe = new ZItemAxe("steelAxe", ZToolMaterial.STEEL, 0), "steelAxe");
		GameRegistry.registerItem(steelSpade = new ZItemSpade("steelSpade", ZToolMaterial.STEEL, 0), "steelSpade");
		GameRegistry.registerItem(steelHoe = new ZItemHoe("steelHoe", ZToolMaterial.STEEL, 0), "steelHoe");
		GameRegistry.registerItem(steelSword = new ZItemSword("steelSword", ZToolMaterial.STEEL, 0), "steelSword");
		GameRegistry.registerItem(steelHelmet = new ZItemArmor("steelHelmet", ZArmorMaterial.STEELA, 1, 0, 0), "steelHelmet");
		GameRegistry.registerItem(steelChestplate = new ZItemArmor("steelChestplate", ZArmorMaterial.STEELA, 1, 1, 0), "steelChestplate");
		GameRegistry.registerItem(steelLeggings = new ZItemArmor("steelLeggings", ZArmorMaterial.STEELA, 2, 2, 0), "steelLeggings");
		GameRegistry.registerItem(steelBoots = new ZItemArmor("steelBoots", ZArmorMaterial.STEELA, 1, 3, 0), "steelBoots");
		
		// Bronze
		
		GameRegistry.registerItem(copperIngot = new ZItem("copperIngot"), "copperIngot");
		GameRegistry.registerItem(tinIngot = new ZItem("tinIngot"), "tinIngot");
		GameRegistry.registerItem(bronzeIngot = new ZItem("bronzeIngot"), "bronzeIngot");
		GameRegistry.registerItem(bronzePickaxe = new ZItemPickaxe("bronzePickaxe", ZToolMaterial.BRONZE, 1), "bronzePickaxe");
		GameRegistry.registerItem(bronzeAxe = new ZItemAxe("bronzeAxe", ZToolMaterial.BRONZE, 1), "bronzeAxe");
		GameRegistry.registerItem(bronzeSpade = new ZItemSpade("bronzeSpade", ZToolMaterial.BRONZE, 1), "bronzeSpade");
		GameRegistry.registerItem(bronzeHoe = new ZItemHoe("bronzeHoe", ZToolMaterial.BRONZE, 1), "bronzeHoe");
		GameRegistry.registerItem(bronzeSword = new ZItemSword("bronzeSword", ZToolMaterial.BRONZE, 1), "bronzeSword");
		GameRegistry.registerItem(bronzeHelmet = new ZItemArmor("bronzeHelmet", ZArmorMaterial.BRONZEA, 1, 0, 1), "bronzeHelmet");
		GameRegistry.registerItem(bronzeChestplate = new ZItemArmor("bronzeChestplate", ZArmorMaterial.BRONZEA, 1, 1, 1), "bronzeChestplate");
		GameRegistry.registerItem(bronzeLeggings = new ZItemArmor("bronzeLeggings", ZArmorMaterial.BRONZEA, 2, 2, 1), "bronzeLeggings");
		GameRegistry.registerItem(bronzeBoots = new ZItemArmor("bronzeBoots", ZArmorMaterial.BRONZEA, 1, 3, 1), "bronzeBoots");
		
		// Electrum
		
		GameRegistry.registerItem(silverIngot = new ZItem("silverIngot"), "silverIngot");
		GameRegistry.registerItem(electrumIngot = new ZItem("electrumIngot"), "electrumIngot");
		GameRegistry.registerItem(electrumPickaxe = new ZItemPickaxe("electrumPickaxe", ZToolMaterial.ELECTRUM, 2), "electrumPickaxe");
		GameRegistry.registerItem(electrumAxe = new ZItemAxe("electrumAxe", ZToolMaterial.ELECTRUM, 2), "electrumAxe");
		GameRegistry.registerItem(electrumSpade = new ZItemSpade("electrumSpade", ZToolMaterial.ELECTRUM, 2), "electrumSpade");
		GameRegistry.registerItem(electrumHoe = new ZItemHoe("electrumHoe", ZToolMaterial.ELECTRUM, 2), "electrumHoe");
		GameRegistry.registerItem(electrumSword = new ZItemSword("electrumSword", ZToolMaterial.ELECTRUM, 2), "electrumSword");
		GameRegistry.registerItem(electrumHelmet = new ZItemArmor("electrumHelmet", ZArmorMaterial.ELECTRUMA, 1, 0, 2), "electrumHelmet");
		GameRegistry.registerItem(electrumChestplate = new ZItemArmor("electrumChestplate", ZArmorMaterial.ELECTRUMA, 1, 1, 2), "electrumChestplate");
		GameRegistry.registerItem(electrumLeggings = new ZItemArmor("electrumLeggings", ZArmorMaterial.ELECTRUMA, 2, 2, 2), "electrumLeggings");
		GameRegistry.registerItem(electrumBoots = new ZItemArmor("electrumBoots", ZArmorMaterial.ELECTRUMA, 1, 3, 2), "electrumBoots");
		
		// Onyx
		
		GameRegistry.registerItem(onyxPickaxe = new ZItemPickaxe("onyxPickaxe", ZToolMaterial.ONYX, 3), "onyxPickaxe");
		GameRegistry.registerItem(onyxAxe = new ZItemAxe("onyxAxe", ZToolMaterial.ONYX, 3), "onyxAxe");
		GameRegistry.registerItem(onyxSpade = new ZItemSpade("onyxSpade", ZToolMaterial.ONYX, 3), "onyxSpade");
		GameRegistry.registerItem(onyxHoe = new ZItemHoe("onyxHoe", ZToolMaterial.ONYX, 3), "onyxHoe");
		GameRegistry.registerItem(onyxSword = new ZItemSword("onyxSword", ZToolMaterial.ONYX, 3), "onyxSword");
		GameRegistry.registerItem(onyxHelmet = new ZItemArmor("onyxHelmet", ZArmorMaterial.ONYXA, 1, 0, 3), "onyxHelmet");
		GameRegistry.registerItem(onyxChestplate = new ZItemArmor("onyxChestplate", ZArmorMaterial.ONYXA, 1, 1, 3), "onyxChestplate");
		GameRegistry.registerItem(onyxLeggings = new ZItemArmor("onyxLeggings", ZArmorMaterial.ONYXA, 2, 2, 3), "onyxLeggings");
		GameRegistry.registerItem(onyxBoots = new ZItemArmor("onyxBoots", ZArmorMaterial.ONYXA, 1, 3, 3), "onyxBoots");
		
		// Ruby
		
		GameRegistry.registerItem(rubyPickaxe = new ZItemPickaxe("rubyPickaxe", ZToolMaterial.RUBY, 4), "rubyPickaxe");
		GameRegistry.registerItem(rubyAxe = new ZItemAxe("rubyAxe", ZToolMaterial.RUBY, 4), "rubyAxe");
		GameRegistry.registerItem(rubySpade = new ZItemSpade("rubySpade", ZToolMaterial.RUBY, 4), "rubySpade");
		GameRegistry.registerItem(rubyHoe = new ZItemHoe("rubyHoe", ZToolMaterial.RUBY, 4), "rubyHoe");
		GameRegistry.registerItem(rubySword = new ZItemSword("rubySword", ZToolMaterial.RUBY, 4), "rubySword");
		GameRegistry.registerItem(rubyHelmet = new ZItemArmor("rubyHelmet", ZArmorMaterial.RUBYA, 1, 0, 4), "rubyHelmet");
		GameRegistry.registerItem(rubyChestplate = new ZItemArmor("rubyChestplate", ZArmorMaterial.RUBYA, 1, 1, 4), "rubyChestplate");
		GameRegistry.registerItem(rubyLeggings = new ZItemArmor("rubyLeggings", ZArmorMaterial.RUBYA, 2, 2, 4), "rubyLeggings");
		GameRegistry.registerItem(rubyBoots = new ZItemArmor("rubyBoots", ZArmorMaterial.RUBYA, 1, 3, 4), "rubyBoots");
		
		// Sapphire

		GameRegistry.registerItem(sapphirePickaxe = new ZItemPickaxe("sapphirePickaxe", ZToolMaterial.SAPPHIRE, 5), "sapphirePickaxe");
		GameRegistry.registerItem(sapphireAxe = new ZItemAxe("sapphireAxe", ZToolMaterial.SAPPHIRE, 5), "sapphireAxe");
		GameRegistry.registerItem(sapphireSpade = new ZItemSpade("sapphireSpade", ZToolMaterial.SAPPHIRE, 5), "sapphireSpade");
		GameRegistry.registerItem(sapphireHoe = new ZItemHoe("sapphireHoe", ZToolMaterial.SAPPHIRE, 5), "sapphireHoe");
		GameRegistry.registerItem(sapphireSword = new ZItemSword("sapphireSword", ZToolMaterial.SAPPHIRE, 5), "sapphireSword");
		GameRegistry.registerItem(sapphireHelmet = new ZItemArmor("sapphireHelmet", ZArmorMaterial.SAPPHIREA, 1, 0, 5), "sapphireHelmet");
		GameRegistry.registerItem(sapphireChestplate = new ZItemArmor("sapphireChestplate", ZArmorMaterial.SAPPHIREA, 1, 1, 5), "sapphireChestplate");
		GameRegistry.registerItem(sapphireLeggings = new ZItemArmor("sapphireLeggings", ZArmorMaterial.SAPPHIREA, 2, 2, 5), "sapphireLeggings");
		GameRegistry.registerItem(sapphireBoots = new ZItemArmor("sapphireBoots", ZArmorMaterial.SAPPHIREA, 1, 3, 5), "sapphireBoots");
		
		// Emerald
		
		GameRegistry.registerItem(emeraldPickaxe = new ZItemPickaxe("emeraldPickaxe", ZToolMaterial.EMERALD, 6), "emeraldPickaxe");
		GameRegistry.registerItem(emeraldAxe = new ZItemAxe("emeraldAxe", ZToolMaterial.EMERALD, 6), "emeraldAxe");
		GameRegistry.registerItem(emeraldSpade = new ZItemSpade("emeraldSpade", ZToolMaterial.EMERALD, 6), "emeraldSpade");
		GameRegistry.registerItem(emeraldHoe = new ZItemHoe("emeraldHoe", ZToolMaterial.EMERALD,6), "emeraldHoe");
		GameRegistry.registerItem(emeraldSword = new ZItemSword("emeraldSword", ZToolMaterial.EMERALD, 6), "emeraldSword");
		GameRegistry.registerItem(emeraldHelmet = new ZItemArmor("emeraldHelmet", ZArmorMaterial.EMERALDA, 1, 0, 6), "emeraldHelmet");
		GameRegistry.registerItem(emeraldChestplate = new ZItemArmor("emeraldChestplate", ZArmorMaterial.EMERALDA, 1, 1, 6), "emeraldChestplate");
		GameRegistry.registerItem(emeraldLeggings = new ZItemArmor("emeraldLeggings", ZArmorMaterial.EMERALDA, 2, 2, 6), "emeraldLeggings");
		GameRegistry.registerItem(emeraldBoots = new ZItemArmor("emeraldBoots", ZArmorMaterial.EMERALDA, 1, 3, 6), "emeraldBoots");

    }
	
	public static void createLootsItems()

	{

		GameRegistry.registerItem(onyx = new ZItem("onyx"), "onyx");
		GameRegistry.registerItem(ruby = new ZItem("ruby"), "ruby");
		GameRegistry.registerItem(sapphire = new ZItem("sapphire"), "sapphire");

	}

}