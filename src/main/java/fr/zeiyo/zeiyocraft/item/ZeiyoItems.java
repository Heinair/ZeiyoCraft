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
	public static Item hardboiledEgg, applePie, puriFlesh, vegetableStew;
	public static Item barleySeeds, barley, malt, grapeSeeds, grape;
    public static Item tankard, beerTankard, wineTankard, ciderTankard;

    // Miscellaneous

    public static Item copperCoin, silverCoin, goldCoin;
	public static Item key;
    public static Item itemChair;

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
	
    public static void initItems()
        
    {

        // Food

        chocolateCake = new ZItemBlock("chocolateCake", ZeiyoBlocks.blockChocolateCake, CreativeTabs.tabFood);
        hardboiledEgg = new ZItemFood("hardboiledEgg", 3, 0.1F, false);
        applePie = new ZItemFood("applePie", 8, 0.3F, false);
        puriFlesh = new ZItemFood("puriFlesh", 4, 0.1F, true);
        vegetableStew = new ZItemSoup("vegetableStew", 8);
        malt = new ZItem("malt").setCreativeTab(CreativeTabs.tabMaterials);
        barleySeeds = new ZItemSeeds("barleySeeds", ZeiyoBlocks.barleyCrops, Blocks.farmland);
        barley = new ZItem("barley").setCreativeTab(CreativeTabs.tabMaterials);
        grapeSeeds = new ZItemSeeds("grapeSeeds", ZeiyoBlocks.grapeCrops, Blocks.farmland);
        grape = new ZItemFood("grape", 4, 0.3F, false);
        tankard = new ZItem("tankard").setCreativeTab(CreativeTabs.tabAllSearch);
        beerTankard = new ZItemAlcohol("beerTankard", 2, 30, 2);
        ciderTankard = new ZItemAlcohol("ciderTankard", 2, 30, 2);
        wineTankard = new ZItemAlcohol("wineTankard", 2, 45, 2);

        // Miscellaneous

        copperCoin = new ZItem("copperCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        silverCoin = new ZItem("silverCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        goldCoin = new ZItem("goldCoin").setCreativeTab(CreativeTabs.tabAllSearch).setMaxStackSize(100);
        key = new ZItem("key").setCreativeTab(CreativeTabs.tabMisc).setMaxStackSize(1);
        itemChair = new ZItemBlock("itemChair", ZeiyoBlocks.chair, CreativeTabs.tabDecorations).setMaxStackSize(16);

        // Steel

        steelIngot = new ZItem("steelIngot").setCreativeTab(CreativeTabs.tabMaterials);
        steelPickaxe = new ZItemPickaxe("steelPickaxe", ZToolMaterial.STEEL, 0);
        steelAxe = new ZItemAxe("steelAxe", ZToolMaterial.STEEL, 0);
        steelSpade = new ZItemSpade("steelSpade", ZToolMaterial.STEEL, 0);
        steelHoe = new ZItemHoe("steelHoe", ZToolMaterial.STEEL, 0);
        steelSword = new ZItemSword("steelSword", ZToolMaterial.STEEL, 0);
        steelHelmet = new ZItemArmor("steelHelmet", ZArmorMaterial.STEELA, 1, 0, 0);
        steelChestplate = new ZItemArmor("steelChestplate", ZArmorMaterial.STEELA, 1, 1, 0);
        steelLeggings = new ZItemArmor("steelLeggings", ZArmorMaterial.STEELA, 2, 2, 0);
        steelBoots = new ZItemArmor("steelBoots", ZArmorMaterial.STEELA, 1, 3, 0);

        // Bronze-related Items

        copperIngot = new ZItem("copperIngot").setCreativeTab(CreativeTabs.tabMaterials);
        tinIngot = new ZItem("tinIngot").setCreativeTab(CreativeTabs.tabMaterials);
        bronzeIngot = new ZItem("bronzeIngot").setCreativeTab(CreativeTabs.tabMaterials);
        bronzePickaxe = new ZItemPickaxe("bronzePickaxe", ZToolMaterial.BRONZE, 1);
        bronzeAxe = new ZItemAxe("bronzeAxe", ZToolMaterial.BRONZE, 1);
        bronzeSpade = new ZItemSpade("bronzeSpade", ZToolMaterial.BRONZE, 1);
        bronzeHoe = new ZItemHoe("bronzeHoe", ZToolMaterial.BRONZE, 1);
        bronzeSword = new ZItemSword("bronzeSword", ZToolMaterial.BRONZE, 1);
        bronzeHelmet = new ZItemArmor("bronzeHelmet", ZArmorMaterial.BRONZEA, 1, 0, 1);
        bronzeChestplate = new ZItemArmor("bronzeChestplate", ZArmorMaterial.BRONZEA, 1, 1, 1);
        bronzeLeggings = new ZItemArmor("bronzeLeggings", ZArmorMaterial.BRONZEA, 2, 2, 1);
        bronzeBoots = new ZItemArmor("bronzeBoots", ZArmorMaterial.BRONZEA, 1, 3, 1);

        // Electrum-related Items

        silverIngot = new ZItem("silverIngot").setCreativeTab(CreativeTabs.tabMaterials);
        electrumIngot = new ZItem("electrumIngot").setCreativeTab(CreativeTabs.tabMaterials);
        electrumPickaxe = new ZItemPickaxe("electrumPickaxe", ZToolMaterial.ELECTRUM, 2);
        electrumAxe = new ZItemAxe("electrumAxe", ZToolMaterial.ELECTRUM, 2);
        electrumSpade = new ZItemSpade("electrumSpade", ZToolMaterial.ELECTRUM, 2);
        electrumHoe = new ZItemHoe("electrumHoe", ZToolMaterial.ELECTRUM, 2);
        electrumSword = new ZItemSword("electrumSword", ZToolMaterial.ELECTRUM, 2);
        electrumHelmet = new ZItemArmor("electrumHelmet", ZArmorMaterial.ELECTRUMA, 1, 0, 2);
        electrumChestplate = new ZItemArmor("electrumChestplate", ZArmorMaterial.ELECTRUMA, 1, 1, 2);
        electrumLeggings = new ZItemArmor("electrumLeggings", ZArmorMaterial.ELECTRUMA, 2, 2, 2);
        electrumBoots = new ZItemArmor("electrumBoots", ZArmorMaterial.ELECTRUMA, 1, 3, 2);

        // Onyx

        onyxPickaxe = new ZItemPickaxe("onyxPickaxe", ZToolMaterial.ONYX, 3);
        onyxAxe = new ZItemAxe("onyxAxe", ZToolMaterial.ONYX, 3);
        onyxSpade = new ZItemSpade("onyxSpade", ZToolMaterial.ONYX, 3);
        onyxHoe = new ZItemHoe("onyxHoe", ZToolMaterial.ONYX, 3);
        onyxSword = new ZItemSword("onyxSword", ZToolMaterial.ONYX, 3);
        onyxHelmet = new ZItemArmor("onyxHelmet", ZArmorMaterial.ONYXA, 1, 0, 3);
        onyxChestplate = new ZItemArmor("onyxChestplate", ZArmorMaterial.ONYXA, 1, 1, 3);
        onyxLeggings = new ZItemArmor("onyxLeggings", ZArmorMaterial.ONYXA, 2, 2, 3);
        onyxBoots = new ZItemArmor("onyxBoots", ZArmorMaterial.ONYXA, 1, 3, 3);

        // Ruby

        rubyPickaxe = new ZItemPickaxe("rubyPickaxe", ZToolMaterial.RUBY, 4);
        rubyAxe = new ZItemAxe("rubyAxe", ZToolMaterial.RUBY, 4);
        rubySpade = new ZItemSpade("rubySpade", ZToolMaterial.RUBY, 4);
        rubyHoe = new ZItemHoe("rubyHoe", ZToolMaterial.RUBY, 4);
        rubySword = new ZItemSword("rubySword", ZToolMaterial.RUBY, 4);
        rubyHelmet = new ZItemArmor("rubyHelmet", ZArmorMaterial.RUBYA, 1, 0, 4);
        rubyChestplate = new ZItemArmor("rubyChestplate", ZArmorMaterial.RUBYA, 1, 1, 4);
        rubyLeggings = new ZItemArmor("rubyLeggings", ZArmorMaterial.RUBYA, 2, 2, 4);
        rubyBoots = new ZItemArmor("rubyBoots", ZArmorMaterial.RUBYA, 1, 3, 4);

        // Sapphire

        sapphirePickaxe = new ZItemPickaxe("sapphirePickaxe", ZToolMaterial.SAPPHIRE, 5);
        sapphireAxe = new ZItemAxe("sapphireAxe", ZToolMaterial.SAPPHIRE, 5);
        sapphireSpade = new ZItemSpade("sapphireSpade", ZToolMaterial.SAPPHIRE, 5);
        sapphireHoe = new ZItemHoe("sapphireHoe", ZToolMaterial.SAPPHIRE, 5);
        sapphireSword = new ZItemSword("sapphireSword", ZToolMaterial.SAPPHIRE, 5);
        sapphireHelmet = new ZItemArmor("sapphireHelmet", ZArmorMaterial.SAPPHIREA, 1, 0, 5);
        sapphireChestplate = new ZItemArmor("sapphireChestplate", ZArmorMaterial.SAPPHIREA, 1, 1, 5);
        sapphireLeggings = new ZItemArmor("sapphireLeggings", ZArmorMaterial.SAPPHIREA, 2, 2, 5);
        sapphireBoots = new ZItemArmor("sapphireBoots", ZArmorMaterial.SAPPHIREA, 1, 3, 5);
        
    }
    
	public static void registerItems()

	{

        // Food

        GameRegistry.registerItem(chocolateCake, chocolateCake.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(hardboiledEgg, hardboiledEgg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(applePie, applePie.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(puriFlesh, puriFlesh.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(vegetableStew, vegetableStew.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(malt, malt.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(barleySeeds, barleySeeds.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(barley, barley.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(grapeSeeds, grapeSeeds.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(grape, grape.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(tankard, tankard.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(beerTankard, beerTankard.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ciderTankard, ciderTankard.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(wineTankard, wineTankard.getUnlocalizedName().substring(5));

        // Miscellaneous

        GameRegistry.registerItem(copperCoin, copperCoin.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(silverCoin, silverCoin.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(goldCoin, goldCoin.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(key, key.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemChair, itemChair.getUnlocalizedName().substring(5));

        // Steel

        GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelPickaxe, steelPickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelAxe, steelAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelSpade, steelSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelHoe, steelHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelSword, steelSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelHelmet, steelHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelChestplate, steelChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelLeggings, steelLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(steelBoots, steelBoots.getUnlocalizedName().substring(5));

        // Bronze-related Items
        
        GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(tinIngot, tinIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeIngot, bronzeIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzePickaxe, bronzePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeAxe, bronzeAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeSpade, bronzeSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeHoe, bronzeHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeSword, bronzeSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeHelmet, bronzeHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeChestplate, bronzeChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeLeggings, bronzeLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bronzeBoots, bronzeBoots.getUnlocalizedName().substring(5));
        
        // Electrum-related Items

        GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumIngot, electrumIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumPickaxe, electrumPickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumAxe, electrumAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumSpade, electrumSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumHoe, electrumHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumSword, electrumSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumHelmet, electrumHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumChestplate, electrumChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumLeggings, electrumLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(electrumBoots, electrumBoots.getUnlocalizedName().substring(5));
        
        // Onyx

        GameRegistry.registerItem(onyxPickaxe, onyxPickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxAxe, onyxAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxSpade, onyxSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxHoe, onyxHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxSword, onyxSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxHelmet, onyxHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxChestplate, onyxChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxLeggings, onyxLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(onyxBoots, onyxBoots.getUnlocalizedName().substring(5));
        
        // Ruby 

        GameRegistry.registerItem(rubyPickaxe, rubyPickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyAxe, rubyAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubySpade, rubySpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyHoe, rubyHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubySword, rubySword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyHelmet, rubyHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyChestplate, rubyChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyLeggings, rubyLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(rubyBoots, rubyBoots.getUnlocalizedName().substring(5));
        
        // Sapphire

        GameRegistry.registerItem(sapphirePickaxe, sapphirePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireAxe, sapphireAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireSpade, sapphireSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireHoe, sapphireHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireSword, sapphireSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireHelmet, sapphireHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireChestplate, sapphireChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireLeggings, sapphireLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphireBoots, sapphireBoots.getUnlocalizedName().substring(5));



    }
	
	public static void loots()

	{

		GameRegistry.registerItem(onyx = new ZItem("onyx").setCreativeTab(CreativeTabs.tabMaterials), "onyx");
		GameRegistry.registerItem(ruby = new ZItem("ruby").setCreativeTab(CreativeTabs.tabMaterials), "ruby");
		GameRegistry.registerItem(sapphire = new ZItem("sapphire").setCreativeTab(CreativeTabs.tabMaterials), "sapphire");

	}

}