package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoConfig;
import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks {

    public static Block blockChocolateCake, blockWeirdCake;
    public static Block barleyCrops, grapeCrops, hempCrops;
    public static Block chair;
    public static Block amethystOre, jadeOre, nacreOre, onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
    public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock,  bronzeBlock, silverBlock, electrumBlock, jadeBlock, nacreBlock, amethystBlock;

    public static void initBlocks() {

        // Food

        blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F);
        blockWeirdCake = new ZBlockCake("blockChocolateCake", 2, 0.2F, new PotionEffect(MobEffects.REGENERATION, 350, 1, false, false));
        barleyCrops = new ZBlockCrops("barleyCrops", 0);
        grapeCrops = new ZBlockCrops("grapeCrops", 1);
        hempCrops = new ZBlockCrops("hempCrops", 2);
        
        // Miscellaneous
        
        chair = new ZBlockSittable("chair", Material.WOOD);
        
        // Ore Blocks

        copperOre = new ZBlock("copperOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        tinOre = new ZBlock("tinOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        silverOre = new ZBlock("silverOre", Material.ROCK, 3.0F, 5.0F, SoundType.STONE);
        onyxOre = new ZBlockOre("onyxOre", Material.ROCK, 3, ZeiyoItems.onyx);
        rubyOre = new ZBlockOre("rubyOre", Material.ROCK, 3, ZeiyoItems.ruby);
        sapphireOre = new ZBlockOre("sapphireOre", Material.ROCK, 3, ZeiyoItems.sapphire);
        amethystOre = new ZBlockOre("amethystOre", Material.ROCK, 3, ZeiyoItems.amethyst);
        jadeOre = new ZBlockOre("jadeOre", Material.ROCK, 3, ZeiyoItems.jade);
        nacreOre = new ZBlock("nacreOre", Material.GROUND, 0.6F, 0.0F, SoundType.GROUND, "shovel", 0);

        // Compressed Blocks

        steelBlock = new ZBlock("steelBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        copperBlock = new ZBlock("copperBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        tinBlock = new ZBlock("tinBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        bronzeBlock = new ZBlock("bronzeBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        silverBlock = new ZBlock("silverBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        electrumBlock = new ZBlock("electrumBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        onyxBlock = new ZBlock("onyxBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        rubyBlock = new ZBlock("rubyBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        sapphireBlock = new ZBlock("sapphireBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        jadeBlock = new ZBlock("jadeBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        nacreBlock = new ZBlock("nacreBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);
        amethystBlock = new ZBlock("amethystBlock", Material.IRON, 5.0F, 10.0F, SoundType.METAL, 2);

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