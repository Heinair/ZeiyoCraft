package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils.*;

public class ZeiyoCrafting {


    public static void registerCrafting ()
    {

        if(ZeiyoConfig.isNewFoodEnabled)
        {
            GameRegistry.addSmelting(Items.EGG, new ItemStack(ZeiyoItems.hardboiledEgg), 0.15F);
            GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(ZeiyoItems.puriFlesh), 0.05F);
            GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ZeiyoItems.cheese), 0.10F);
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.chocolateCake.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.chocolateCake), new Object[]{"XCX", "SOS", "CBC", 'X', Items.MILK_BUCKET, 'C', new ItemStack(Items.DYE, 1, 3), 'S', Items.SUGAR, 'O', Items.EGG, 'B', Items.WHEAT});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.applePie.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.applePie), new Object[]{"PE ", "#  ", 'P', Items.APPLE, '#', Items.SUGAR, 'E', Items.EGG});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.vegetableStew.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.vegetableStew), new Object[]{"CPR", " B ", 'R', new ItemStack(Blocks.PUMPKIN), 'C', Items.CARROT, 'P', Items.BAKED_POTATO, 'B', Items.BOWL});
            GameRegistry.addShapelessRecipe(new ResourceLocation("" + ZeiyoItems.chiliPepper.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.chiliPepper), Ingredient.fromItems(Items.CARROT, Items.BLAZE_POWDER));
            GameRegistry.addShapelessRecipe(new ResourceLocation("" + ZeiyoItems.tomatoSeeds.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.tomatoSeeds), Ingredient.fromItem(ZeiyoItems.tomato));

        }

        if(ZeiyoConfig.isAlcoholEnabled)
        {
            GameRegistry.addShapelessRecipe(new ResourceLocation("" + ZeiyoItems.grapeSeeds.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.grapeSeeds), Ingredient.fromItem(ZeiyoItems.grape));

            GameRegistry.addSmelting(ZeiyoItems.barley, new ItemStack(ZeiyoItems.malt), 0.15F);
            GameRegistry.addSmelting(Items.POISONOUS_POTATO, new ItemStack(ZeiyoItems.vodkaExtract), 0.05F);
            GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ZeiyoItems.barleySeeds), 0.05F);

            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.tankard.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.tankard), new Object[]{"# #", "# #", "###", '#', Items.STICK});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.beerTankard.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.beerTankard), new Object[]{"###", "#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.malt, 'O', ZeiyoItems.tankard});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.wineTankard.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.wineTankard), new Object[]{"###", "#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.grape, 'O', ZeiyoItems.tankard});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.ciderTankard.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.ciderTankard), new Object[]{"#P#", " O ", 'P', Items.WATER_BUCKET, '#', Items.APPLE, 'O', ZeiyoItems.tankard});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.vodkaTankard.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.vodkaTankard), new Object[]{"#P#", " O ", 'P', Items.WATER_BUCKET, '#', ZeiyoItems.vodkaExtract, 'O', ZeiyoItems.tankard});

        }

        if(ZeiyoConfig.isDrugEnabled)
        {

            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.weirdCake.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.weirdCake), new Object[]{"XCX", "SOS", "CBC", 'X', Items.MILK_BUCKET, 'C', new ItemStack(ZeiyoItems.hemp), 'S', Items.SUGAR, 'O', Items.EGG, 'B', Items.WHEAT});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.pipe.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(ZeiyoItems.pipe), new Object[]{"P  ", " PP", 'P', Items.STICK});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.hempPipe.getRegistryName()), new ResourceLocation("zeiyocraft:food"),  new ItemStack(ZeiyoItems.hempPipe), new Object[]{"PPP", "PFP", 'F', ZeiyoItems.pipe  , 'P', ZeiyoItems.hemp});

        }

        if(ZeiyoConfig.isChairEnabled)GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoBlocks.chair.getRegistryName()), new ResourceLocation("zeiyocraft:blocks"), new ItemStack(ZeiyoBlocks.chair, 3), new Object[]{"#  ", "#P#", "B B", 'P', Blocks.WOOL, '#', Blocks.PLANKS, 'B', Blocks.LOG});
        if(ZeiyoConfig.isKeyEnabled)GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.key.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(ZeiyoItems.key), new Object[]{" EP", " EP", " P ", 'P', Items.GOLD_INGOT, 'E', Items.GOLD_NUGGET});

        GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoBlocks.rottenFleshBlock.getRegistryName()), new ResourceLocation("zeiyocraft:blocks"), new ItemStack(ZeiyoBlocks.rottenFleshBlock), new Object[]{"XXX", "XXX", "XXX", 'X', Items.ROTTEN_FLESH});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + Blocks.WOOL.getRegistryName()), new ResourceLocation("zeiyocraft:blocks"), new ItemStack(Blocks.WOOL), new Object[]{"PP", "PP",'P', Items.STRING});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + Items.SADDLE.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(Items.SADDLE), new Object[]{"PPP", "# #", "F F", 'F', Items.IRON_INGOT, 'P', Items.LEATHER, '#', Items.STRING});
        GameRegistry.addShapelessRecipe(new ResourceLocation("" + Items.NAME_TAG.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(Items.NAME_TAG), Ingredient.fromItems(Items.LEATHER, Items.STRING));
        GameRegistry.addShapelessRecipe(new ResourceLocation("" + Items.ROTTEN_FLESH.getRegistryName()), new ResourceLocation("zeiyocraft:food"), new ItemStack(Items.ROTTEN_FLESH, 9), Ingredient.fromStacks(new ItemStack(ZeiyoBlocks.rottenFleshBlock)));


        if(ZeiyoConfig.areNewOresEnabled)
        {

            registerArmorCrafting(ZeiyoItems.amethystHelmet, ZeiyoItems.amethystChestplate, ZeiyoItems.amethystLeggings, ZeiyoItems.amethystBoots, ZeiyoItems.amethyst);
            registerToolCrafting(ZeiyoItems.amethystAxe, ZeiyoItems.amethystHoe, ZeiyoItems.amethystPickaxe, ZeiyoItems.amethystSpade, ZeiyoItems.amethystSword, ZeiyoItems.amethystWarAxe, ZeiyoItems.amethyst);
            oreCompressedCraft(ZeiyoItems.amethyst, ZeiyoBlocks.amethystBlock, ZeiyoBlocks.amethystOre, 1.15F);

            registerArmorCrafting(ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots, ZeiyoItems.ruby);
            registerToolCrafting(ZeiyoItems.rubyAxe, ZeiyoItems.rubyHoe, ZeiyoItems.rubyPickaxe, ZeiyoItems.rubySpade, ZeiyoItems.rubySword, ZeiyoItems.rubyWarAxe, ZeiyoItems.ruby);
            oreCompressedCraft(ZeiyoItems.ruby, ZeiyoBlocks.rubyBlock, ZeiyoBlocks.rubyOre, 1.15F);

            registerArmorCrafting(ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots, ZeiyoItems.sapphire);
            registerToolCrafting(ZeiyoItems.sapphireAxe, ZeiyoItems.sapphireHoe, ZeiyoItems.sapphirePickaxe, ZeiyoItems.sapphireSpade, ZeiyoItems.sapphireSword, ZeiyoItems.sapphireWarAxe, ZeiyoItems.sapphire);
            oreCompressedCraft(ZeiyoItems.sapphire, ZeiyoBlocks.sapphireBlock, ZeiyoBlocks.sapphireOre, 1.15F);

            registerArmorCrafting(ZeiyoItems.nacreHelmet, ZeiyoItems.nacreChestplate, ZeiyoItems.nacreLeggings, ZeiyoItems.nacreBoots, ZeiyoItems.nacre);
            registerToolCrafting(ZeiyoItems.nacreAxe, ZeiyoItems.nacreHoe, ZeiyoItems.nacrePickaxe, ZeiyoItems.nacreSpade, ZeiyoItems.nacreSword, ZeiyoItems.nacreWarAxe, ZeiyoItems.nacre);
            oreCompressedCraft(ZeiyoItems.nacre, ZeiyoBlocks.nacreBlock, ZeiyoBlocks.nacreOre, 1.15F);

            registerArmorCrafting(ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots, ZeiyoItems.onyx);
            registerToolCrafting(ZeiyoItems.onyxAxe, ZeiyoItems.onyxHoe, ZeiyoItems.onyxPickaxe, ZeiyoItems.onyxSpade, ZeiyoItems.onyxSword, ZeiyoItems.onyxWarAxe, ZeiyoItems.onyx);
            oreCompressedCraft(ZeiyoItems.onyx, ZeiyoBlocks.onyxBlock, ZeiyoBlocks.onyxOre, 1.15F);

            registerArmorCrafting(ZeiyoItems.jadeHelmet, ZeiyoItems.jadeChestplate, ZeiyoItems.jadeLeggings, ZeiyoItems.jadeBoots, ZeiyoItems.jade);
            registerToolCrafting(ZeiyoItems.jadeAxe, ZeiyoItems.jadeHoe, ZeiyoItems.jadePickaxe, ZeiyoItems.jadeSpade, ZeiyoItems.jadeSword, ZeiyoItems.jadeWarAxe, ZeiyoItems.jade);
            oreCompressedCraft(ZeiyoItems.jade, ZeiyoBlocks.jadeBlock, ZeiyoBlocks.jadeOre, 1.15F);

        }

        if(ZeiyoConfig.areAlloysEnabled)
        {

            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.bronzeIngot.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(ZeiyoItems.bronzeIngot), new Object[]{"II", "SI",  'S', ZeiyoItems.tinIngot, 'I', ZeiyoItems.copperIngot});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.steelIngot.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(ZeiyoItems.steelIngot), new Object[]{" I ", "ISI", " I ",  'S', Items.IRON_INGOT, 'I', Items.COAL});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.electrumIngot.getRegistryName()), new ResourceLocation("zeiyocraft:items"), new ItemStack(ZeiyoItems.electrumIngot), new Object[]{"ISI",  'S', Items.GOLD_INGOT, 'I', ZeiyoItems.silverIngot});

            oreCompressedCraft(ZeiyoItems.copperIngot, ZeiyoBlocks.copperBlock, ZeiyoBlocks.copperOre, 0.5F);
            oreCompressedCraft(ZeiyoItems.tinIngot, ZeiyoBlocks.tinBlock, ZeiyoBlocks.tinOre, 0.7F);
            oreCompressedCraft(ZeiyoItems.silverIngot, ZeiyoBlocks.silverBlock, ZeiyoBlocks.silverOre, 0.8F);


            registerArmorCrafting(ZeiyoItems.bronzeHelmet, ZeiyoItems.bronzeChestplate, ZeiyoItems.bronzeLeggings, ZeiyoItems.bronzeBoots, ZeiyoItems.bronzeIngot);
            registerToolCrafting(ZeiyoItems.bronzeAxe, ZeiyoItems.bronzeHoe, ZeiyoItems.bronzePickaxe, ZeiyoItems.bronzeSpade, ZeiyoItems.bronzeSword, ZeiyoItems.bronzeWarAxe, ZeiyoItems.bronzeIngot);
            compressedCraft(ZeiyoItems.bronzeIngot, ZeiyoBlocks.bronzeBlock);

            registerArmorCrafting(ZeiyoItems.steelHelmet, ZeiyoItems.steelChestplate, ZeiyoItems.steelLeggings, ZeiyoItems.steelBoots, ZeiyoItems.steelIngot);
            registerToolCrafting(ZeiyoItems.steelAxe, ZeiyoItems.steelHoe, ZeiyoItems.steelPickaxe, ZeiyoItems.steelSpade, ZeiyoItems.steelSword, ZeiyoItems.steelWarAxe, ZeiyoItems.steelIngot);
            compressedCraft(ZeiyoItems.steelIngot, ZeiyoBlocks.steelBlock);

            registerArmorCrafting(ZeiyoItems.electrumHelmet, ZeiyoItems.electrumChestplate, ZeiyoItems.electrumLeggings, ZeiyoItems.electrumBoots, ZeiyoItems.electrumIngot);
            registerToolCrafting(ZeiyoItems.electrumAxe, ZeiyoItems.electrumHoe, ZeiyoItems.electrumPickaxe, ZeiyoItems.electrumSpade, ZeiyoItems.electrumSword, ZeiyoItems.electrumWarAxe, ZeiyoItems.electrumIngot);
            compressedCraft(ZeiyoItems.electrumIngot, ZeiyoBlocks.electrumBlock);

        }

        if(ZeiyoConfig.areWarAxesEnabled) {

            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.woodenWarAxe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(ZeiyoItems.woodenWarAxe), new Object[]{"III", "ISI", " S ", 'S', Items.STICK, 'I', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ResourceLocation("" + ZeiyoItems.stoneWarAxe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(ZeiyoItems.stoneWarAxe), new Object[]{"III", "ISI", " S ", 'S', Items.STICK, 'I', Blocks.COBBLESTONE});
            registerWarAxeCrafting(Items.GOLD_INGOT, ZeiyoItems.goldWarAxe);
            registerWarAxeCrafting(Items.IRON_INGOT, ZeiyoItems.ironWarAxe);
            registerWarAxeCrafting(Items.DIAMOND, ZeiyoItems.diamondWarAxe);

        }

    }




}

