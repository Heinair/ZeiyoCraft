package fr.zeiyo.zeiyocraft.item;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.material.ZArmorMaterial;
import fr.zeiyo.zeiyocraft.material.ZToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ZeiyoItems

{

    // Food-related Items

    public static Item chocolateCake, weirdCake;
    public static Item hardboiledEgg, applePie, puriFlesh, vegetableStew, vodkaExtract, cheese;
    public static Item barleySeeds, barley, malt, grapeSeeds, grape, hempSeeds, hemp;
    public static Item tankard, beerTankard, wineTankard, ciderTankard, vodkaTankard;
    public static Item pipe, hempPipe;

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

    public static Item copperIngot, tinIngot, bronzeIngot;
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
    
    // Jade
    
    public static Item jade;
    public static Item jadePickaxe, jadeAxe, jadeSpade, jadeHoe, jadeSword, jadeWarAxe;
    public static Item jadeHelmet, jadeChestplate, jadeLeggings, jadeBoots;
    
    // Amethyst
    
    public static Item amethyst;
    public static Item amethystPickaxe, amethystAxe, amethystSpade, amethystHoe, amethystSword, amethystWarAxe;
    public static Item amethystHelmet, amethystChestplate, amethystLeggings, amethystBoots;
    
    // Nacre
    
    public static Item nacre;
    public static Item nacrePickaxe, nacreAxe, nacreSpade, nacreHoe, nacreSword, nacreWarAxe;
    public static Item nacreHelmet, nacreChestplate, nacreLeggings, nacreBoots;
    
    

    public static void initItems()

    {

        // Food

        chocolateCake = new ZItemBlock("chocolateCake", ZeiyoBlocks.blockChocolateCake, CreativeTabs.FOOD).setMaxStackSize(1);
        weirdCake = new ZItemBlock("weirdCake", ZeiyoBlocks.blockWeirdCake, CreativeTabs.FOOD).setMaxStackSize(1);
        hardboiledEgg = new ZItemFood("hardboiledEgg", 3, 0.1F, false);
        applePie = new ZItemFood("applePie", 8, 0.3F, false);
        puriFlesh = new ZItemFood("puriFlesh", 4, 0.1F, true);
        vegetableStew = new ZItemSoup("vegetableStew", 8);
        vodkaExtract = new ZItem("vodkaExtract").setCreativeTab(CreativeTabs.MATERIALS);
        malt = new ZItem("malt").setCreativeTab(CreativeTabs.MATERIALS);
        barleySeeds = new ZItemSeeds("barleySeeds", ZeiyoBlocks.barleyCrops, Blocks.FARMLAND);
        barley = new ZItem("barley").setCreativeTab(CreativeTabs.MATERIALS);
        grapeSeeds = new ZItemSeeds("grapeSeeds", ZeiyoBlocks.grapeCrops, Blocks.FARMLAND);
        grape = new ZItemFood("grape", 4, 0.3F, false);
        hempSeeds = new ZItemSeeds("hempSeeds", ZeiyoBlocks.hempCrops, Blocks.FARMLAND);
        hemp = new ZItem("hemp").setCreativeTab(CreativeTabs.MATERIALS);
        tankard = new ZItem("tankard").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(16);
        beerTankard = new ZItemAlcohol("beerTankard", 2, 0.1F, MobEffects.HASTE, 900, 0);
        ciderTankard = new ZItemAlcohol("ciderTankard", 2, 0.1F, MobEffects.HASTE, 900, 0);
        wineTankard = new ZItemAlcohol("wineTankard", 2, 0.1F, MobEffects.STRENGTH, 1000, 0);
        vodkaTankard = new ZItemAlcohol("vodkaTankard", 2, 0.1F, MobEffects.RESISTANCE,1000, 0);
        pipe = new ZItem("pipe").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(16);
        hempPipe = new ZItemDrug("hempPipe", 1500, 2);
        cheese = new ZItemFood("cheese", 5, 0.2F, false);

        // Miscellaneous

        copperCoin = new ZItem("copperCoin").setCreativeTab(CreativeTabs.SEARCH);
        silverCoin = new ZItem("silverCoin").setCreativeTab(CreativeTabs.SEARCH);
        goldCoin = new ZItem("goldCoin").setCreativeTab(CreativeTabs.SEARCH);
        key = new ZItem("key").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1);

        // Vanilla

        woodenWarAxe = new ZItemWarAxe("woodenWarAxe", Item.ToolMaterial.WOOD);
        stoneWarAxe = new ZItemWarAxe("stoneWarAxe", Item.ToolMaterial.STONE);
        goldWarAxe = new ZItemWarAxe("goldWarAxe", Item.ToolMaterial.GOLD, 100);
        ironWarAxe = new ZItemWarAxe("ironWarAxe", Item.ToolMaterial.IRON, 101);
        diamondWarAxe = new ZItemWarAxe("diamondWarAxe", Item.ToolMaterial.DIAMOND, 102);


        // Steel

        steelIngot = new ZItem("steelIngot").setCreativeTab(CreativeTabs.MATERIALS);
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

        copperIngot = new ZItem("copperIngot").setCreativeTab(CreativeTabs.MATERIALS);
        tinIngot = new ZItem("tinIngot").setCreativeTab(CreativeTabs.MATERIALS);
        bronzeIngot = new ZItem("bronzeIngot").setCreativeTab(CreativeTabs.MATERIALS);
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

        silverIngot = new ZItem("silverIngot").setCreativeTab(CreativeTabs.MATERIALS);
        electrumIngot = new ZItem("electrumIngot").setCreativeTab(CreativeTabs.MATERIALS);
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
        
        // Jade

        jadePickaxe = new ZItemPickaxe("jadePickaxe", ZToolMaterial.JADE, 6);
        jadeAxe = new ZItemAxe("jadeAxe", ZToolMaterial.JADE, 6);
        jadeSpade = new ZItemSpade("jadeSpade", ZToolMaterial.JADE, 6);
        jadeHoe = new ZItemHoe("jadeHoe", ZToolMaterial.JADE, 6);
        jadeSword = new ZItemSword("jadeSword", ZToolMaterial.JADE, 6);
        jadeWarAxe = new ZItemWarAxe("jadeWarAxe", ZToolMaterial.JADE, 6);
        jadeHelmet = new ZItemArmor("jadeHelmet", ZArmorMaterial.JADEA, 1, EntityEquipmentSlot.HEAD, 6);
        jadeChestplate = new ZItemArmor("jadeChestplate", ZArmorMaterial.JADEA, 1, EntityEquipmentSlot.CHEST, 6);
        jadeLeggings = new ZItemArmor("jadeLeggings", ZArmorMaterial.JADEA, 2, EntityEquipmentSlot.LEGS, 6);
        jadeBoots = new ZItemArmor("jadeBoots", ZArmorMaterial.JADEA, 1, EntityEquipmentSlot.FEET, 6);
        
        // Nacre

        nacrePickaxe = new ZItemPickaxe("nacrePickaxe", ZToolMaterial.NACRE, 7);
        nacreAxe = new ZItemAxe("nacreAxe", ZToolMaterial.NACRE, 7);
        nacreSpade = new ZItemSpade("nacreSpade", ZToolMaterial.NACRE, 7);
        nacreHoe = new ZItemHoe("nacreHoe", ZToolMaterial.NACRE, 7);
        nacreSword = new ZItemSword("nacreSword", ZToolMaterial.NACRE, 7);
        nacreWarAxe = new ZItemWarAxe("nacreWarAxe", ZToolMaterial.NACRE, 7);
        nacreHelmet = new ZItemArmor("nacreHelmet", ZArmorMaterial.NACREA, 1, EntityEquipmentSlot.HEAD, 7);
        nacreChestplate = new ZItemArmor("nacreChestplate", ZArmorMaterial.NACREA, 1, EntityEquipmentSlot.CHEST, 7);
        nacreLeggings = new ZItemArmor("nacreLeggings", ZArmorMaterial.NACREA, 2, EntityEquipmentSlot.LEGS, 7);
        nacreBoots = new ZItemArmor("nacreBoots", ZArmorMaterial.NACREA, 1, EntityEquipmentSlot.FEET, 7);
        
        // Amethyst

        amethystPickaxe = new ZItemPickaxe("amethystPickaxe", ZToolMaterial.AMETHYST, 8);
        amethystAxe = new ZItemAxe("amethystAxe", ZToolMaterial.AMETHYST, 8);
        amethystSpade = new ZItemSpade("amethystSpade", ZToolMaterial.AMETHYST, 8);
        amethystHoe = new ZItemHoe("amethystHoe", ZToolMaterial.AMETHYST, 8);
        amethystSword = new ZItemSword("amethystSword", ZToolMaterial.AMETHYST, 8);
        amethystWarAxe = new ZItemWarAxe("amethystWarAxe", ZToolMaterial.AMETHYST, 8);
        amethystHelmet = new ZItemArmor("amethystHelmet", ZArmorMaterial.AMETHYSTA, 1, EntityEquipmentSlot.HEAD, 8);
        amethystChestplate = new ZItemArmor("amethystChestplate", ZArmorMaterial.AMETHYSTA, 1, EntityEquipmentSlot.CHEST, 8);
        amethystLeggings = new ZItemArmor("amethystLeggings", ZArmorMaterial.AMETHYSTA, 2, EntityEquipmentSlot.LEGS, 8);
        amethystBoots = new ZItemArmor("amethystBoots", ZArmorMaterial.AMETHYSTA, 1, EntityEquipmentSlot.FEET, 8);
       
    }

    public static void registerItems()
    {

        // Food

        if(ZeiyoConfig.isNewFoodEnabled)
        {

            registerItem(chocolateCake);
            registerItem(weirdCake);
            registerItem(hardboiledEgg);
            registerItem(applePie);
            registerItem(puriFlesh);
            registerItem(vegetableStew);
            registerItem(cheese);

        }

        // Alcohols

        if(ZeiyoConfig.isAlcoholEnabled)
        {

            registerItem(vodkaExtract);
            registerItem(malt);
            registerItem(barleySeeds);
            registerItem(barley);
            registerItem(grapeSeeds);
            registerItem(grape);

            registerItem(tankard);
            registerItem(beerTankard);
            registerItem(ciderTankard);
            registerItem(wineTankard);
            registerItem(vodkaTankard);

        }


        // Drugs

        if(ZeiyoConfig.isDrugEnabled)
        {

            registerItem(hempSeeds);
            registerItem(hemp);

            registerItem(pipe);
            registerItem(hempPipe);

        }


        // Miscellaneous

        registerItem(copperCoin);
        registerItem(silverCoin);
        registerItem(goldCoin);
        if(ZeiyoConfig.isKeyEnabled)registerItem(key);

        // War Axes

        if(ZeiyoConfig.areWarAxesEnabled)
        {

            registerItem(woodenWarAxe);
            registerItem(stoneWarAxe);
            registerItem(goldWarAxe);
            registerItem(ironWarAxe);
            registerItem(diamondWarAxe);

        }


        if(ZeiyoConfig.areAlloysEnabled)
        {

            // Steel

            registerItem(steelIngot);
            registerItem(steelPickaxe);
            registerItem(steelAxe);
            registerItem(steelSpade);
            registerItem(steelHoe);
            registerItem(steelSword);
            registerItem(steelWarAxe);
            registerItem(steelHelmet);
            registerItem(steelChestplate);
            registerItem(steelLeggings);
            registerItem(steelBoots);

            // Bronze-related Items

            registerItem(copperIngot);
            registerItem(tinIngot);
            registerItem(bronzeIngot);
            registerItem(bronzePickaxe);
            registerItem(bronzeAxe);
            registerItem(bronzeSpade);
            registerItem(bronzeHoe);
            registerItem(bronzeSword);
            registerItem(bronzeWarAxe);
            registerItem(bronzeHelmet);
            registerItem(bronzeChestplate);
            registerItem(bronzeLeggings);
            registerItem(bronzeBoots);

            // Electrum-related Items

            registerItem(silverIngot);
            registerItem(electrumIngot);
            registerItem(electrumPickaxe);
            registerItem(electrumAxe);
            registerItem(electrumSpade);
            registerItem(electrumHoe);
            registerItem(electrumSword);
            registerItem(electrumWarAxe);
            registerItem(electrumHelmet);
            registerItem(electrumChestplate);
            registerItem(electrumLeggings);
            registerItem(electrumBoots);

        }

        if(ZeiyoConfig.areNewOresEnabled)
        {

            // Onyx

            registerItem(onyxPickaxe);
            registerItem(onyxAxe);
            registerItem(onyxSpade);
            registerItem(onyxHoe);
            registerItem(onyxSword);
            registerItem(onyxWarAxe);
            registerItem(onyxHelmet);
            registerItem(onyxChestplate);
            registerItem(onyxLeggings);
            registerItem(onyxBoots);

            // Ruby

            registerItem(rubyPickaxe);
            registerItem(rubyAxe);
            registerItem(rubySpade);
            registerItem(rubyHoe);
            registerItem(rubySword);
            registerItem(rubyWarAxe);
            registerItem(rubyHelmet);
            registerItem(rubyChestplate);
            registerItem(rubyLeggings);
            registerItem(rubyBoots);

            // Sapphire

            registerItem(sapphirePickaxe);
            registerItem(sapphireAxe);
            registerItem(sapphireSpade);
            registerItem(sapphireHoe);
            registerItem(sapphireSword);
            registerItem(sapphireWarAxe);
            registerItem(sapphireHelmet);
            registerItem(sapphireChestplate);
            registerItem(sapphireLeggings);
            registerItem(sapphireBoots);

            // Jade

            registerItem(jadePickaxe);
            registerItem(jadeAxe);
            registerItem(jadeSpade);
            registerItem(jadeHoe);
            registerItem(jadeSword);
            registerItem(jadeWarAxe);
            registerItem(jadeHelmet);
            registerItem(jadeChestplate);
            registerItem(jadeLeggings);
            registerItem(jadeBoots);

            // Nacre

            registerItem(nacrePickaxe);
            registerItem(nacreAxe);
            registerItem(nacreSpade);
            registerItem(nacreHoe);
            registerItem(nacreSword);
            registerItem(nacreWarAxe);
            registerItem(nacreHelmet);
            registerItem(nacreChestplate);
            registerItem(nacreLeggings);
            registerItem(nacreBoots);

            // Amethyst

            registerItem(amethystPickaxe);
            registerItem(amethystAxe);
            registerItem(amethystSpade);
            registerItem(amethystHoe);
            registerItem(amethystSword);
            registerItem(amethystWarAxe);
            registerItem(amethystHelmet);
            registerItem(amethystChestplate);
            registerItem(amethystLeggings);
            registerItem(amethystBoots);

        }

    }

    public static void loots()
    {

        registerItem(onyx = new ZItem("onyx").setCreativeTab(CreativeTabs.MATERIALS));
        registerItem(ruby = new ZItem("ruby").setCreativeTab(CreativeTabs.MATERIALS));
        registerItem(sapphire = new ZItem("sapphire").setCreativeTab(CreativeTabs.MATERIALS));
        registerItem(jade = new ZItem("jade").setCreativeTab(CreativeTabs.MATERIALS));
        registerItem(nacre = new ZItem("nacre").setCreativeTab(CreativeTabs.MATERIALS));
        registerItem(amethyst = new ZItem("amethyst").setCreativeTab(CreativeTabs.MATERIALS));

    }
    
    private static void registerItem(Item item) {
        GameRegistry.register(item);
    }

}