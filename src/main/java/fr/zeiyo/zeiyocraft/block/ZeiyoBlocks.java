package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ZeiyoBlocks {

    public static Block blockChocolateCake, blockWeirdCake;
    public static Block barleyCrops, grapeCrops, hempCrops, chiliPepperCrops, tomatoCrops;
    public static Block chair, rottenFleshBlock;
    public static Block amethystOre, jadeOre, nacreOre, onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
    public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock,  bronzeBlock, silverBlock, electrumBlock, jadeBlock, nacreBlock, amethystBlock;

    public static void initBlocks() {

        // Food

        blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F);
        blockWeirdCake = new ZBlockCake("blockWeirdCake", 2, 0.2F, new PotionEffect(MobEffects.REGENERATION, 350, 1, false, false));
        barleyCrops = new ZBlockCrops("barleyCrops", 0, "vanilla");
        grapeCrops = new ZBlockCrops("grapeCrops", 1, "harvestable");
        hempCrops = new ZBlockCrops("hempCrops", 2, "harvestable");
        chiliPepperCrops = new ZBlockCrops("chiliPepperCrops", 3, "harvestable");
        tomatoCrops = new ZBlockCrops("tomatoCrops", 4, "harvestable");


        // Miscellaneous
        
        chair = new ZBlockSittable("chair", Material.WOOD);
        rottenFleshBlock = new ZBlock("rottenFleshBlock", Material.ROCK, 2.0F, 3.0F, SoundType.CLOTH);
        
        // Ore Blocks

        copperOre = new ZBlock("copperOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        tinOre = new ZBlock("tinOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        silverOre = new ZBlock("silverOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        onyxOre = new ZBlockOre("onyxOre", 3, ZeiyoItems.onyx);
        rubyOre = new ZBlockOre("rubyOre", 3, ZeiyoItems.ruby);
        sapphireOre = new ZBlockOre("sapphireOre", 3, ZeiyoItems.sapphire);
        amethystOre = new ZBlockOre("amethystOre", 3, ZeiyoItems.amethyst);
        jadeOre = new ZBlockOre("jadeOre", 3, ZeiyoItems.jade);
        nacreOre = new ZBlockOre("nacreOre", 0, ZeiyoItems.nacre, "shovel").setHardness(0.6F).setResistance(0.0F);

        // Compressed Blocks

        steelBlock = new ZBlockCompressedOre("steelBlock");
        copperBlock = new ZBlockCompressedOre("copperBlock");
        tinBlock = new ZBlockCompressedOre("tinBlock");
        bronzeBlock = new ZBlockCompressedOre("bronzeBlock");
        silverBlock = new ZBlockCompressedOre("silverBlock");
        electrumBlock = new ZBlockCompressedOre("electrumBlock");
        onyxBlock = new ZBlockCompressedOre("onyxBlock");
        rubyBlock = new ZBlockCompressedOre("rubyBlock");
        sapphireBlock = new ZBlockCompressedOre("sapphireBlock");
        jadeBlock = new ZBlockCompressedOre("jadeBlock");
        nacreBlock = new ZBlockCompressedOre("nacreBlock");
        amethystBlock = new ZBlockCompressedOre("amethystBlock");

    }

    public static void registerBlocks() {
    	
        // Food
    	
        if(ZeiyoConfig.isNewFoodEnabled)
        {
            registerBlock(blockChocolateCake);
            registerBlock(blockWeirdCake);
            registerBlock(chiliPepperCrops);
            registerBlock(tomatoCrops);
        }

        if(ZeiyoConfig.isAlcoholEnabled)
        {
            registerBlock(barleyCrops);
            registerBlock(grapeCrops);
        }
        if(ZeiyoConfig.isDrugEnabled)registerBlock(hempCrops);
        
        // Miscellaneous
        
        if(ZeiyoConfig.isChairEnabled)registerBlock(chair);

        registerBlock(rottenFleshBlock);

        // Alloy-Related Blocks

        if(ZeiyoConfig.areAlloysEnabled)
        {
            registerBlock(copperOre);
            registerBlock(tinOre);
            registerBlock(silverOre);

            registerBlock(steelBlock);
            registerBlock(copperBlock);
            registerBlock(tinBlock);
            registerBlock(bronzeBlock);
            registerBlock(silverBlock);
            registerBlock(electrumBlock);

            OreDictionary.registerOre("oreCopper", copperOre);
            OreDictionary.registerOre("oreTin", tinOre);
            OreDictionary.registerOre("oreSilver", silverOre);

            OreDictionary.registerOre("blockSteel", steelBlock);
            OreDictionary.registerOre("blockCopper", copperBlock);
            OreDictionary.registerOre("blockTin", tinBlock);
            OreDictionary.registerOre("blockBronze", bronzeBlock);
            OreDictionary.registerOre("blockSilver", silverBlock);
            OreDictionary.registerOre("blockElectrum", electrumBlock);

        }

        // New Ores Related Blocks

        if(ZeiyoConfig.areNewOresEnabled)
        {

            registerBlock(onyxOre);
            registerBlock(rubyOre);
            registerBlock(sapphireOre);
            registerBlock(nacreOre);
            registerBlock(jadeOre);
            registerBlock(amethystOre);

            registerBlock(onyxBlock);
            registerBlock(rubyBlock);
            registerBlock(sapphireBlock);
            registerBlock(jadeBlock);
            registerBlock(amethystBlock);
            registerBlock(nacreBlock);

            OreDictionary.registerOre("oreOnyx", onyxOre);
            OreDictionary.registerOre("blockOnyx", onyxBlock);

            OreDictionary.registerOre("oreRuby", rubyOre);
            OreDictionary.registerOre("blockRuby", rubyBlock);

            OreDictionary.registerOre("oreSapphire", sapphireOre);
            OreDictionary.registerOre("blockSapphire", sapphireBlock);

            OreDictionary.registerOre("oreJade", jadeOre);
            OreDictionary.registerOre("blockJade", jadeBlock);

            OreDictionary.registerOre("oreAmethyst", amethystOre);
            OreDictionary.registerOre("blockAmethyst", amethystBlock);

            OreDictionary.registerOre("oreNacre", nacreOre);
            OreDictionary.registerOre("blockNacre", nacreBlock);

        }
        
    }

    private static void registerBlock(Block block) {

        ForgeRegistries.BLOCKS.register(block);
        Item itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);
        }

}