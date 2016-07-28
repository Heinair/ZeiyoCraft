package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils.*;

public class ZeiyoCrafting {

    public static void createCrafts() {

        // Smelts

        GameRegistry.addSmelting(Items.EGG, new ItemStack(ZeiyoItems.hardboiledEgg), 0.15F);
        GameRegistry.addSmelting(ZeiyoItems.barley, new ItemStack(ZeiyoItems.malt), 0.15F);
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(ZeiyoItems.puriFlesh), 0.05F);
        GameRegistry.addSmelting(Items.POISONOUS_POTATO, new ItemStack(ZeiyoItems.vodkaExtract), 0.05F);
        GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ZeiyoItems.barleySeeds), 0.05F);

        // Crafts

        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.chocolateCake), new Object[]{"XCX", "SOS", "CBC", 'X', Items.MILK_BUCKET, 'C', new ItemStack(Items.DYE, 1, 3), 'S', Items.SUGAR, 'O', Items.EGG, 'B', Items.WHEAT});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.steelIngot), new Object[]{" # ", "#P#", " # ", 'P', Items.IRON_INGOT, '#', Items.COAL});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.vegetableStew), new Object[]{"CPR", " B ", 'R', new ItemStack(Blocks.PUMPKIN), 'C', Items.CARROT, 'P', Items.BAKED_POTATO, 'B', Items.BOWL});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.bronzeIngot, 2), new Object[]{"## ", "P# ", 'P', ZeiyoItems.tinIngot, '#', ZeiyoItems.copperIngot});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.electrumIngot, 2), new Object[]{"#P#", 'P', Items.GOLD_INGOT, '#', ZeiyoItems.silverIngot});
        GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.steelBlock), new Object[]{"###", "#P#", "###", 'P', Blocks.IRON_BLOCK, '#', Blocks.COAL_BLOCK});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.tankard), new Object[]{"# #", "# #", "###", '#', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.beerTankard), new Object[]{"###", "#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.malt, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.wineTankard), new Object[]{"###", "#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.grape, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.ciderTankard), new Object[]{"#P#", " O ", 'P', Items.WATER_BUCKET, '#', Items.APPLE, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.vodkaTankard), new Object[]{"#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.vodkaExtract, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.chair, 3), new Object[]{"#  ", "#P#", "B B", 'P', Blocks.WOOL, '#', Blocks.PLANKS, 'B', Blocks.LOG});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.applePie), new Object[]{"PE ", "#  ", 'P', Items.APPLE, '#', Items.SUGAR, 'E', Items.EGG});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.key), new Object[]{" EP", " EP", " P ", 'P', Items.GOLD_INGOT, 'E', Items.GOLD_NUGGET});
        GameRegistry.addRecipe(new ItemStack(Items.SADDLE), new Object[]{"PPP", "# #", "F F", 'F', Items.IRON_INGOT, 'P', Items.LEATHER, '#', Items.STRING});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.pipe), new Object[]{"P  ", " PP", 'P', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.hempPipe), new Object[]{"PPP", "PFP", 'F', ZeiyoItems.pipe  , 'P', ZeiyoItems.hemp});
        GameRegistry.addRecipe(new ItemStack(Blocks.WOOL), new Object[]{"PP", "PP",'P', Items.STRING});


        // Ore, armors, tools, and compressed blocks-related Crafts

        warAxeCraft(Blocks.PLANKS, ZeiyoItems.woodenWarAxe);
        warAxeCraft(Blocks.COBBLESTONE, ZeiyoItems.stoneWarAxe);
        warAxeCraft(Items.GOLD_INGOT, ZeiyoItems.goldWarAxe);
        warAxeCraft(Items.IRON_INGOT, ZeiyoItems.ironWarAxe);
        warAxeCraft(Items.DIAMOND, ZeiyoItems.diamondWarAxe);

        armorCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelHelmet, ZeiyoItems.steelChestplate, ZeiyoItems.steelLeggings, ZeiyoItems.steelBoots);
        toolsCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelPickaxe, ZeiyoItems.steelAxe, ZeiyoItems.steelSpade, ZeiyoItems.steelHoe, ZeiyoItems.steelSword, ZeiyoItems.steelWarAxe);
        compressedCraft(ZeiyoItems.steelIngot, ZeiyoBlocks.steelBlock);

        armorCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzeHelmet, ZeiyoItems.bronzeChestplate, ZeiyoItems.bronzeLeggings, ZeiyoItems.bronzeBoots);
        toolsCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzePickaxe, ZeiyoItems.bronzeAxe, ZeiyoItems.bronzeSpade, ZeiyoItems.bronzeHoe, ZeiyoItems.bronzeSword, ZeiyoItems.bronzeWarAxe);
        compressedCraft(ZeiyoItems.bronzeIngot, ZeiyoBlocks.bronzeBlock);
        oreCompressedCraft(ZeiyoItems.tinIngot, ZeiyoBlocks.tinBlock, ZeiyoBlocks.tinOre, 0.6F);
        oreCompressedCraft(ZeiyoItems.copperIngot, ZeiyoBlocks.copperBlock, ZeiyoBlocks.copperOre, 0.5F);

        armorCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumHelmet, ZeiyoItems.electrumChestplate, ZeiyoItems.electrumLeggings, ZeiyoItems.electrumBoots);
        toolsCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumPickaxe, ZeiyoItems.electrumAxe, ZeiyoItems.electrumSpade, ZeiyoItems.electrumHoe, ZeiyoItems.electrumSword, ZeiyoItems.electrumWarAxe);
        compressedCraft(ZeiyoItems.electrumIngot, ZeiyoBlocks.electrumBlock);
        oreCompressedCraft(ZeiyoItems.silverIngot, ZeiyoBlocks.silverBlock, ZeiyoBlocks.silverOre, 0.8F);

        armorCraft(ZeiyoItems.onyx, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots);
        toolsCraft(ZeiyoItems.onyx, ZeiyoItems.onyxPickaxe, ZeiyoItems.onyxAxe, ZeiyoItems.onyxSpade, ZeiyoItems.onyxHoe, ZeiyoItems.onyxSword, ZeiyoItems.onyxWarAxe);
        oreCompressedCraft(ZeiyoItems.onyx, ZeiyoBlocks.onyxBlock, ZeiyoBlocks.onyxOre, 1.15F);

        armorCraft(ZeiyoItems.ruby, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots);
        toolsCraft(ZeiyoItems.ruby, ZeiyoItems.rubyPickaxe, ZeiyoItems.rubyAxe, ZeiyoItems.rubySpade, ZeiyoItems.rubyHoe, ZeiyoItems.rubySword, ZeiyoItems.rubyWarAxe);
        oreCompressedCraft(ZeiyoItems.ruby, ZeiyoBlocks.rubyBlock, ZeiyoBlocks.rubyOre, 1.15F);

        armorCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots);
        toolsCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphirePickaxe, ZeiyoItems.sapphireAxe, ZeiyoItems.sapphireSpade, ZeiyoItems.sapphireHoe, ZeiyoItems.sapphireSword, ZeiyoItems.sapphireWarAxe);
        oreCompressedCraft(ZeiyoItems.sapphire, ZeiyoBlocks.sapphireBlock, ZeiyoBlocks.sapphireOre, 1.15F);
        
        armorCraft(ZeiyoItems.jade, ZeiyoItems.jadeHelmet, ZeiyoItems.jadeChestplate, ZeiyoItems.jadeLeggings, ZeiyoItems.jadeBoots);
        toolsCraft(ZeiyoItems.jade, ZeiyoItems.jadePickaxe, ZeiyoItems.jadeAxe, ZeiyoItems.jadeSpade, ZeiyoItems.jadeHoe, ZeiyoItems.jadeSword, ZeiyoItems.jadeWarAxe);
        oreCompressedCraft(ZeiyoItems.jade, ZeiyoBlocks.jadeBlock, ZeiyoBlocks.jadeOre, 1.15F);
        
        armorCraft(ZeiyoItems.nacre, ZeiyoItems.nacreHelmet, ZeiyoItems.nacreChestplate, ZeiyoItems.nacreLeggings, ZeiyoItems.nacreBoots);
        toolsCraft(ZeiyoItems.nacre, ZeiyoItems.nacrePickaxe, ZeiyoItems.nacreAxe, ZeiyoItems.nacreSpade, ZeiyoItems.nacreHoe, ZeiyoItems.nacreSword, ZeiyoItems.nacreWarAxe);
        oreCompressedCraft(ZeiyoItems.nacre, ZeiyoBlocks.nacreBlock, ZeiyoBlocks.nacreOre, 1.15F);
        
        armorCraft(ZeiyoItems.nacre, ZeiyoItems.nacreHelmet, ZeiyoItems.nacreChestplate, ZeiyoItems.nacreLeggings, ZeiyoItems.nacreBoots);
        toolsCraft(ZeiyoItems.nacre, ZeiyoItems.nacrePickaxe, ZeiyoItems.nacreAxe, ZeiyoItems.nacreSpade, ZeiyoItems.nacreHoe, ZeiyoItems.nacreSword, ZeiyoItems.nacreWarAxe);
        oreCompressedCraft(ZeiyoItems.nacre, ZeiyoBlocks.nacreBlock, ZeiyoBlocks.nacreOre, 1.15F);
        
        uncraftIntoPiece(Items.LEATHER, Items.LEATHER_HELMET, Items.LEATHER_CHESTPLATE, Items.LEATHER_LEGGINGS, Items.LEATHER_BOOTS);
        uncraftIntoBlock(Blocks.PLANKS, Items.WOODEN_PICKAXE, Items.WOODEN_SWORD, Items.WOODEN_SHOVEL, Items.WOODEN_AXE, Items.WOODEN_HOE, ZeiyoItems.woodenWarAxe);
        uncraftIntoBlock(Blocks.COBBLESTONE, Items.STONE_PICKAXE, Items.STONE_SWORD, Items.STONE_SHOVEL, Items.STONE_AXE, Items.STONE_HOE, ZeiyoItems.stoneWarAxe);
        
        smeltIntoGems(Items.IRON_INGOT, Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS, Items.IRON_PICKAXE, Items.IRON_SWORD, Items.IRON_SHOVEL, Items.IRON_AXE, Items.IRON_HOE, ZeiyoItems.ironWarAxe);
        smeltIntoGems(Items.GOLD_INGOT, Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS, Items.GOLDEN_PICKAXE, Items.GOLDEN_SWORD, Items.GOLDEN_SHOVEL, Items.GOLDEN_AXE, Items.GOLDEN_HOE, ZeiyoItems.goldWarAxe);
        smeltIntoGems(Items.DIAMOND, Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS, Items.DIAMOND_PICKAXE, Items.DIAMOND_SWORD, Items.DIAMOND_SHOVEL, Items.DIAMOND_AXE, Items.DIAMOND_HOE, ZeiyoItems.diamondWarAxe);
        smeltIntoGems(ZeiyoItems.electrumIngot, ZeiyoItems.electrumHelmet, ZeiyoItems.electrumChestplate, ZeiyoItems.electrumLeggings, ZeiyoItems.electrumBoots, ZeiyoItems.electrumPickaxe, ZeiyoItems.electrumSword, ZeiyoItems.electrumSpade, ZeiyoItems.electrumAxe, ZeiyoItems.electrumHoe, ZeiyoItems.electrumWarAxe);
        smeltIntoGems(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzeHelmet, ZeiyoItems.bronzeChestplate, ZeiyoItems.bronzeLeggings, ZeiyoItems.bronzeBoots, ZeiyoItems.bronzePickaxe, ZeiyoItems.bronzeSword, ZeiyoItems.bronzeSpade, ZeiyoItems.bronzeAxe, ZeiyoItems.bronzeHoe, ZeiyoItems.bronzeWarAxe);
        smeltIntoGems(ZeiyoItems.steelIngot, ZeiyoItems.steelHelmet, ZeiyoItems.steelChestplate, ZeiyoItems.steelLeggings, ZeiyoItems.steelBoots, ZeiyoItems.steelPickaxe, ZeiyoItems.steelSword, ZeiyoItems.steelSpade, ZeiyoItems.steelAxe, ZeiyoItems.steelHoe, ZeiyoItems.steelWarAxe);
        smeltIntoGems(ZeiyoItems.amethyst, ZeiyoItems.amethystHelmet, ZeiyoItems.amethystChestplate, ZeiyoItems.amethystLeggings, ZeiyoItems.amethystBoots, ZeiyoItems.amethystPickaxe, ZeiyoItems.amethystSword, ZeiyoItems.amethystSpade, ZeiyoItems.amethystAxe, ZeiyoItems.amethystHoe, ZeiyoItems.amethystWarAxe);
        smeltIntoGems(ZeiyoItems.sapphire, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots, ZeiyoItems.sapphirePickaxe, ZeiyoItems.sapphireSword, ZeiyoItems.sapphireSpade, ZeiyoItems.sapphireAxe, ZeiyoItems.sapphireHoe, ZeiyoItems.sapphireWarAxe);
        smeltIntoGems(ZeiyoItems.ruby, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots, ZeiyoItems.rubyPickaxe, ZeiyoItems.rubySword, ZeiyoItems.rubySpade, ZeiyoItems.rubyAxe, ZeiyoItems.rubyHoe, ZeiyoItems.rubyWarAxe);
        smeltIntoGems(ZeiyoItems.jade, ZeiyoItems.jadeHelmet, ZeiyoItems.jadeChestplate, ZeiyoItems.jadeLeggings, ZeiyoItems.jadeBoots, ZeiyoItems.jadePickaxe, ZeiyoItems.jadeSword, ZeiyoItems.jadeSpade, ZeiyoItems.jadeAxe, ZeiyoItems.jadeHoe, ZeiyoItems.jadeWarAxe);
        smeltIntoGems(ZeiyoItems.onyx, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots, ZeiyoItems.onyxPickaxe, ZeiyoItems.onyxSword, ZeiyoItems.onyxSpade, ZeiyoItems.onyxAxe, ZeiyoItems.onyxHoe, ZeiyoItems.onyxWarAxe);
        smeltIntoGems(ZeiyoItems.nacre, ZeiyoItems.nacreHelmet, ZeiyoItems.nacreChestplate, ZeiyoItems.nacreLeggings, ZeiyoItems.nacreBoots, ZeiyoItems.nacrePickaxe, ZeiyoItems.nacreSword, ZeiyoItems.nacreSpade, ZeiyoItems.nacreAxe, ZeiyoItems.nacreHoe, ZeiyoItems.nacreWarAxe);
        
    }


}