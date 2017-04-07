package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks {

    public static Block blockChocolateCake, blockWeirdCake;
    public static Block barleyCrops, grapeCrops, hempCrops;
    public static Block chair, rottenFleshBlock;
    public static Block amethystOre, jadeOre, nacreOre, onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
    public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock,  bronzeBlock, silverBlock, electrumBlock, jadeBlock, nacreBlock, amethystBlock;

    public static void initBlocks() {

        // Food

        blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F);
        blockWeirdCake = new ZBlockCake("blockWeirdCake", 2, 0.2F, new PotionEffect(MobEffects.REGENERATION, 350, 1, false, false));
        barleyCrops = new ZBlockCrops("barleyCrops", 0);
        grapeCrops = new ZBlockCrops("grapeCrops", 1);
        hempCrops = new ZBlockCrops("hempCrops", 2);
        
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

        steelBlock = new ZBlock("steelBlock");
        copperBlock = new ZBlock("copperBlock");
        tinBlock = new ZBlock("tinBlock");
        bronzeBlock = new ZBlock("bronzeBlock");
        silverBlock = new ZBlock("silverBlock");
        electrumBlock = new ZBlock("electrumBlock");
        onyxBlock = new ZBlock("onyxBlock");
        rubyBlock = new ZBlock("rubyBlock");
        sapphireBlock = new ZBlock("sapphireBlock");
        jadeBlock = new ZBlock("jadeBlock");
        nacreBlock = new ZBlock("nacreBlock");
        amethystBlock = new ZBlock("amethystBlock");

    }

    public static void registerBlocks() {
    	
        // Food
    	
        if(ZeiyoConfig.isNewFoodEnabled)
        {
            registerBlock(blockChocolateCake);
            registerBlock(blockWeirdCake);
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

        }
        
    }

    private static void registerBlock(Block block) {

        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }

}