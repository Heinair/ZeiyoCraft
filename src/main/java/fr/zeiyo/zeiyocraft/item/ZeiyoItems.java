package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.material.ZArmorMaterial;
import fr.zeiyo.zeiyocraft.material.ZToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.config.GuiEditArrayEntries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ZeiyoItems

{
	
	// Food-related Items
	
	public static Item chocolateCake;
	public static Item hardboiledEgg, applePie, puriFlesh, vegetableStew;
	public static Item barleySeeds, barley, malt, grapeSeeds, grape;
    public static Item tankard, beerTankard, wineTankard, ciderTankard;

    // Miscellaneous

    public static Item copperCoin, silverCoin, goldCoin;
	public static Item key;

    // Vanilla

    public static Item woodenWarAxe, stoneWarAxe, goldWarAxe, ironWarAxe, diamondWarAxe;

    // Steel

	public static Item steelIngot;
	public static Item steelPickaxe, steelAxe, steelSpade, steelHoe, steelSword, steelWarAxe;
	public static Item steelHelmet, steelChestplate, steelLeggings, steelBoots;
	
	// Bronze-related Items
	
	public static Item copperIngot,tinIngot, bronzeIngot;
	public static Item bronzePickaxe, bronzeAxe, bronzeSpade, bronzeHoe, bronzeSword, bronzeWarAxe;
	public static Item bronzeHelmet, bronzeChestplate, bronzeLeggings, bronzeBoots;

	// Electrum-related Items

	public static Item silverIngot, electrumIngot;
    public static Item electrumPickaxe, electrumAxe, electrumSpade, electrumHoe, electrumSword, electrumWarAxe;
    public static Item electrumHelmet, electrumChestplate, electrumLeggings, electrumBoots;
	
	// Onyx
	
	public static Item onyx;
	public static Item onyxPickaxe, onyxAxe, onyxSpade, onyxHoe, onyxSword, onyxWarAxe;
    public static Item onyxHelmet, onyxChestplate, onyxLeggings, onyxBoots;

    // Ruby
	
	public static Item ruby;
    public static Item rubyPickaxe, rubyAxe, rubySpade, rubyHoe, rubySword, rubyWarAxe;
    public static Item rubyHelmet, rubyChestplate, rubyLeggings, rubyBoots;

    // Sapphire
	
	public static Item sapphire;
    public static Item sapphirePickaxe, sapphireAxe, sapphireSpade, sapphireHoe, sapphireSword, sapphireWarAxe;
    public static Item sapphireHelmet, sapphireChestplate, sapphireLeggings, sapphireBoots;
	
    public static void initItems()
        
    {

        // Food

        chocolateCake = new ZItemBlock("chocolateCake", ZeiyoBlocks.blockChocolateCake, CreativeTabs.tabFood).setMaxStackSize(1);
        hardboiledEgg = new ZItemFood("hardboiledEgg", 3, 0.1F, false);
        applePie = new ZItemFood("applePie", 8, 0.3F, false);
        puriFlesh = new ZItemFood("puriFlesh", 4, 0.1F, true);
        vegetableStew = new ZItemSoup("vegetableStew", 8);
        malt = new ZItem("malt").setCreativeTab(CreativeTabs.tabMaterials);
        barleySeeds = new ZItemSeeds("barleySeeds", ZeiyoBlocks.barleyCrops, Blocks.farmland);
        barley = new ZItem("barley").setCreativeTab(CreativeTabs.tabMaterials);
        grapeSeeds = new ZItemSeeds("grapeSeeds", ZeiyoBlocks.grapeCrops, Blocks.farmland);
        grape = new ZItemFood("grape", 4, 0.3F, false);
        tankard = new ZItem("tankard").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(16);
        beerTankard = new ZItemAlcohol("beerTankard", 2, 600, 2);
        ciderTankard = new ZItemAlcohol("ciderTankard", 2, 700, 2);
        wineTankard = new ZItemAlcohol("wineTankard", 2, 800, 2);

        // Miscellaneous

        copperCoin = new ZItem("copperCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        silverCoin = new ZItem("silverCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        goldCoin = new ZItem("goldCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        key = new ZItem("key").setCreativeTab(CreativeTabs.tabMisc).setMaxStackSize(1);

        // Vanilla

        woodenWarAxe = new ZItemWarAxe("woodenWarAxe", Item.ToolMaterial.WOOD);
        stoneWarAxe = new ZItemWarAxe("stoneWarAxe", Item.ToolMaterial.STONE);
        goldWarAxe = new ZItemWarAxe("goldWarAxe", Item.ToolMaterial.GOLD, 100);
        ironWarAxe = new ZItemWarAxe("ironWarAxe", Item.ToolMaterial.IRON, 101);
        diamondWarAxe = new ZItemWarAxe("diamondWarAxe", Item.ToolMaterial.DIAMOND, 102);


        // Steel

        steelIngot = new ZItem("steelIngot").setCreativeTab(CreativeTabs.tabMaterials);
        steelPickaxe = new ZItemPickaxe("steelPickaxe", ZToolMaterial.STEEL, 0);
        steelAxe = new ZItemAxe("steelAxe", ZToolMaterial.STEEL, 0);
        steelSpade = new ZItemSpade("steelSpade", ZToolMaterial.STEEL, 0);
        steelHoe = new ZItemHoe("steelHoe", ZToolMaterial.STEEL, 0);
        steelSword = new ZItemSword("steelSword", ZToolMaterial.STEEL, 0);
        steelWarAxe = new ZItemWarAxe("steelWarAxe", ZToolMaterial.STEEL, 0);
        steelHelmet = new ZItemArmor("steelHelmet", ZArmorMaterial.STEELA, 1, EntityEquipmentSlot.HEAD, 0);
        steelChestplate = new ZItemArmor("steelChestplate", ZArmorMaterial.STEELA, 1, EntityEquipmentSlot.CHEST, 0);
        steelLeggings = new ZItemArmor("steelLeggings", ZArmorMaterial.STEELA, 2, EntityEquipmentSlot.LEGS, 0);
        steelBoots = new ZItemArmor("steelBoots", ZArmorMaterial.STEELA, 1, EntityEquipmentSlot.FEET, 0);

        // Bronze-related Items

        copperIngot = new ZItem("copperIngot").setCreativeTab(CreativeTabs.tabMaterials);
        tinIngot = new ZItem("tinIngot").setCreativeTab(CreativeTabs.tabMaterials);
        bronzeIngot = new ZItem("bronzeIngot").setCreativeTab(CreativeTabs.tabMaterials);
        bronzePickaxe = new ZItemPickaxe("bronzePickaxe", ZToolMaterial.BRONZE, 1);
        bronzeAxe = new ZItemAxe("bronzeAxe", ZToolMaterial.BRONZE, 1);
        bronzeSpade = new ZItemSpade("bronzeSpade", ZToolMaterial.BRONZE, 1);
        bronzeHoe = new ZItemHoe("bronzeHoe", ZToolMaterial.BRONZE, 1);
        bronzeSword = new ZItemSword("bronzeSword", ZToolMaterial.BRONZE, 1);
        bronzeWarAxe = new ZItemWarAxe("bronzeWarAxe", ZToolMaterial.BRONZE, 1);
        bronzeHelmet = new ZItemArmor("bronzeHelmet", ZArmorMaterial.BRONZEA, 1, EntityEquipmentSlot.HEAD, 1);
        bronzeChestplate = new ZItemArmor("bronzeChestplate", ZArmorMaterial.BRONZEA, 1, EntityEquipmentSlot.CHEST, 1);
        bronzeLeggings = new ZItemArmor("bronzeLeggings", ZArmorMaterial.BRONZEA, 2, EntityEquipmentSlot.LEGS, 1);
        bronzeBoots = new ZItemArmor("bronzeBoots", ZArmorMaterial.BRONZEA, 1, EntityEquipmentSlot.FEET, 1);

        // Electrum-related Items

        silverIngot = new ZItem("silverIngot").setCreativeTab(CreativeTabs.tabMaterials);
        electrumIngot = new ZItem("electrumIngot").setCreativeTab(CreativeTabs.tabMaterials);
        electrumPickaxe = new ZItemPickaxe("electrumPickaxe", ZToolMaterial.ELECTRUM, 2);
        electrumAxe = new ZItemAxe("electrumAxe", ZToolMaterial.ELECTRUM, 2);
        electrumSpade = new ZItemSpade("electrumSpade", ZToolMaterial.ELECTRUM, 2);
        electrumHoe = new ZItemHoe("electrumHoe", ZToolMaterial.ELECTRUM, 2);
        electrumSword = new ZItemSword("electrumSword", ZToolMaterial.ELECTRUM, 2);        
        electrumWarAxe = new ZItemWarAxe("electrumWarAxe", ZToolMaterial.ELECTRUM, 2);
        electrumHelmet = new ZItemArmor("electrumHelmet", ZArmorMaterial.ELECTRUMA, 1, EntityEquipmentSlot.HEAD, 2);
        electrumChestplate = new ZItemArmor("electrumChestplate", ZArmorMaterial.ELECTRUMA, 1, EntityEquipmentSlot.CHEST, 2);
        electrumLeggings = new ZItemArmor("electrumLeggings", ZArmorMaterial.ELECTRUMA, 2, EntityEquipmentSlot.LEGS, 2);
        electrumBoots = new ZItemArmor("electrumBoots", ZArmorMaterial.ELECTRUMA, 1, EntityEquipmentSlot.FEET, 2);

        // Onyx

        onyxPickaxe = new ZItemPickaxe("onyxPickaxe", ZToolMaterial.ONYX, 3);
        onyxAxe = new ZItemAxe("onyxAxe", ZToolMaterial.ONYX, 3);
        onyxSpade = new ZItemSpade("onyxSpade", ZToolMaterial.ONYX, 3);
        onyxHoe = new ZItemHoe("onyxHoe", ZToolMaterial.ONYX, 3);
        onyxSword = new ZItemSword("onyxSword", ZToolMaterial.ONYX, 3);
        onyxWarAxe = new ZItemWarAxe("onyxWarAxe", ZToolMaterial.ONYX, 3);
        onyxHelmet = new ZItemArmor("onyxHelmet", ZArmorMaterial.ONYXA, 1, EntityEquipmentSlot.HEAD, 3);
        onyxChestplate = new ZItemArmor("onyxChestplate", ZArmorMaterial.ONYXA, 1, EntityEquipmentSlot.CHEST, 3);
        onyxLeggings = new ZItemArmor("onyxLeggings", ZArmorMaterial.ONYXA, 2, EntityEquipmentSlot.LEGS, 3);
        onyxBoots = new ZItemArmor("onyxBoots", ZArmorMaterial.ONYXA, 1, EntityEquipmentSlot.FEET, 3);

        // Ruby

        rubyPickaxe = new ZItemPickaxe("rubyPickaxe", ZToolMaterial.RUBY, 4);
        rubyAxe = new ZItemAxe("rubyAxe", ZToolMaterial.RUBY, 4);
        rubySpade = new ZItemSpade("rubySpade", ZToolMaterial.RUBY, 4);
        rubyHoe = new ZItemHoe("rubyHoe", ZToolMaterial.RUBY, 4);
        rubySword = new ZItemSword("rubySword", ZToolMaterial.RUBY, 4);
        rubyWarAxe = new ZItemWarAxe("rubyWarAxe", ZToolMaterial.RUBY, 4);
        rubyHelmet = new ZItemArmor("rubyHelmet", ZArmorMaterial.RUBYA, 1, EntityEquipmentSlot.HEAD, 4);
        rubyChestplate = new ZItemArmor("rubyChestplate", ZArmorMaterial.RUBYA, 1, EntityEquipmentSlot.CHEST, 4);
        rubyLeggings = new ZItemArmor("rubyLeggings", ZArmorMaterial.RUBYA, 2, EntityEquipmentSlot.LEGS, 4);
        rubyBoots = new ZItemArmor("rubyBoots", ZArmorMaterial.RUBYA, 1, EntityEquipmentSlot.FEET, 4);

        // Sapphire

        sapphirePickaxe = new ZItemPickaxe("sapphirePickaxe", ZToolMaterial.SAPPHIRE, 5);
        sapphireAxe = new ZItemAxe("sapphireAxe", ZToolMaterial.SAPPHIRE, 5);
        sapphireSpade = new ZItemSpade("sapphireSpade", ZToolMaterial.SAPPHIRE, 5);
        sapphireHoe = new ZItemHoe("sapphireHoe", ZToolMaterial.SAPPHIRE, 5);
        sapphireSword = new ZItemSword("sapphireSword", ZToolMaterial.SAPPHIRE, 5);
        sapphireWarAxe = new ZItemWarAxe("sapphireWarAxe", ZToolMaterial.SAPPHIRE, 5);
        sapphireHelmet = new ZItemArmor("sapphireHelmet", ZArmorMaterial.SAPPHIREA, 1, EntityEquipmentSlot.HEAD, 5);
        sapphireChestplate = new ZItemArmor("sapphireChestplate", ZArmorMaterial.SAPPHIREA, 1, EntityEquipmentSlot.CHEST, 5);
        sapphireLeggings = new ZItemArmor("sapphireLeggings", ZArmorMaterial.SAPPHIREA, 2, EntityEquipmentSlot.LEGS, 5);
        sapphireBoots = new ZItemArmor("sapphireBoots", ZArmorMaterial.SAPPHIREA, 1, EntityEquipmentSlot.FEET, 5);
        
    }
    
	public static void registerItems()

	{

        // Food

        GameRegistry.register(chocolateCake);
        GameRegistry.register(hardboiledEgg);
        GameRegistry.register(applePie);
        GameRegistry.register(puriFlesh);
        GameRegistry.register(vegetableStew);
        GameRegistry.register(malt);
        GameRegistry.register(barleySeeds);
        GameRegistry.register(barley);
        GameRegistry.register(grapeSeeds);
        GameRegistry.register(grape);
        GameRegistry.register(tankard);
        GameRegistry.register(beerTankard);
        GameRegistry.register(ciderTankard);
        GameRegistry.register(wineTankard);

        // Miscellaneous

        GameRegistry.register(copperCoin);
        GameRegistry.register(silverCoin);
        GameRegistry.register(goldCoin);
        GameRegistry.register(key);

        // Vanilla

        GameRegistry.register(woodenWarAxe);
        GameRegistry.register(stoneWarAxe);
        GameRegistry.register(goldWarAxe);
        GameRegistry.register(ironWarAxe);
        GameRegistry.register(diamondWarAxe);

        // Steel

        GameRegistry.register(steelIngot);
        GameRegistry.register(steelPickaxe);
        GameRegistry.register(steelAxe);
        GameRegistry.register(steelSpade);
        GameRegistry.register(steelHoe);
        GameRegistry.register(steelSword);
        GameRegistry.register(steelWarAxe);
        GameRegistry.register(steelHelmet);
        GameRegistry.register(steelChestplate);
        GameRegistry.register(steelLeggings);
        GameRegistry.register(steelBoots);

        // Bronze-related Items
        
        GameRegistry.register(copperIngot);
        GameRegistry.register(tinIngot);
        GameRegistry.register(bronzeIngot);
        GameRegistry.register(bronzePickaxe);
        GameRegistry.register(bronzeAxe);
        GameRegistry.register(bronzeSpade);
        GameRegistry.register(bronzeHoe);
        GameRegistry.register(bronzeSword);
        GameRegistry.register(bronzeWarAxe);
        GameRegistry.register(bronzeHelmet);
        GameRegistry.register(bronzeChestplate);
        GameRegistry.register(bronzeLeggings);
        GameRegistry.register(bronzeBoots);
        
        // Electrum-related Items

        GameRegistry.register(silverIngot);
        GameRegistry.register(electrumIngot);
        GameRegistry.register(electrumPickaxe);
        GameRegistry.register(electrumAxe);
        GameRegistry.register(electrumSpade);
        GameRegistry.register(electrumHoe);
        GameRegistry.register(electrumSword);
        GameRegistry.register(electrumWarAxe);
        GameRegistry.register(electrumHelmet);
        GameRegistry.register(electrumChestplate);
        GameRegistry.register(electrumLeggings);
        GameRegistry.register(electrumBoots);
        
        // Onyx

        GameRegistry.register(onyxPickaxe);
        GameRegistry.register(onyxAxe);
        GameRegistry.register(onyxSpade);
        GameRegistry.register(onyxHoe);
        GameRegistry.register(onyxSword);
        GameRegistry.register(onyxWarAxe);
        GameRegistry.register(onyxHelmet);
        GameRegistry.register(onyxChestplate);
        GameRegistry.register(onyxLeggings);
        GameRegistry.register(onyxBoots);
        
        // Ruby 

        GameRegistry.register(rubyPickaxe);
        GameRegistry.register(rubyAxe);
        GameRegistry.register(rubySpade);
        GameRegistry.register(rubyHoe);
        GameRegistry.register(rubySword);
        GameRegistry.register(rubyWarAxe);
        GameRegistry.register(rubyHelmet);
        GameRegistry.register(rubyChestplate);
        GameRegistry.register(rubyLeggings);
        GameRegistry.register(rubyBoots);
        
        // Sapphire

        GameRegistry.register(sapphirePickaxe);
        GameRegistry.register(sapphireAxe);
        GameRegistry.register(sapphireSpade);
        GameRegistry.register(sapphireHoe);
        GameRegistry.register(sapphireSword);
        GameRegistry.register(sapphireWarAxe);
        GameRegistry.register(sapphireHelmet);
        GameRegistry.register(sapphireChestplate);
        GameRegistry.register(sapphireLeggings);
        GameRegistry.register(sapphireBoots);

    }
	
	public static void loots()

	{

		GameRegistry.register(onyx = new ZItem("onyx").setCreativeTab(CreativeTabs.tabMaterials));
		GameRegistry.register(ruby = new ZItem("ruby").setCreativeTab(CreativeTabs.tabMaterials));
		GameRegistry.register(sapphire = new ZItem("sapphire").setCreativeTab(CreativeTabs.tabMaterials));

	}

}