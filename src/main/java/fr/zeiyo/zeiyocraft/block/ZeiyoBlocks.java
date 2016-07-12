package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks {

    public static Block blockChocolateCake;
    public static Block barleyCrops, grapeCrops, hempCrops;
    public static Block chair, campfire;
    public static Block onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
    public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock, bronzeBlock, silverBlock, electrumBlock, charcoalBlock;

    public static void initBlocks() {

        // Food

        blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F);
        barleyCrops = new ZBlockCrops("barleyCrops", 0);
        grapeCrops = new ZBlockCrops("grapeCrops", 1);
        hempCrops = new ZBlockCrops("hempCrops", 2);
        
        // Miscellaneous

        chair = new ZBlockSittable("chair", Material.WOOD);
        //campfire = new ZBlockCampfire("campfire", false);

        // Ore Blocks

        copperOre = new ZBlock("copperOre", Material.ROCK, 5.0F, 3.0F, SoundType.STONE);
        tinOre = new ZBlock("tinOre", Material.ROCK, 5.0F, 3.0F, SoundType.STONE);
        silverOre = new ZBlock("silverOre", Material.ROCK, 5.0F, 3.0F, SoundType.STONE);
        onyxOre = new ZBlockOre("onyxOre", Material.ROCK, 3, ZeiyoItems.onyx);
        rubyOre = new ZBlockOre("rubyOre", Material.ROCK, 3, ZeiyoItems.ruby);
        sapphireOre = new ZBlockOre("sapphireOre", Material.ROCK, 3, ZeiyoItems.sapphire);

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

    }

    public static void registerBlocks() {
    	
        // Food
        registerBlock(blockChocolateCake);
        registerBlock(barleyCrops);
        registerBlock(grapeCrops);
        registerBlock(hempCrops);

        // Ore Blocks

        registerBlock(copperOre);
        registerBlock(tinOre);
        registerBlock(silverOre);
        registerBlock(onyxOre);
        registerBlock(rubyOre);
        registerBlock(sapphireOre);

        // Miscellaneous

        registerBlock(chair);
        //registerBlock(campfire, campfire.getUnlocalizedName().substring(5));

        // Compressed Blocks

        registerBlock(steelBlock);
        registerBlock(copperBlock);
        registerBlock(tinBlock);
        registerBlock(bronzeBlock);
        registerBlock(silverBlock);
        registerBlock(electrumBlock);
        registerBlock(onyxBlock);
        registerBlock(rubyBlock);
        registerBlock(sapphireBlock);

    }

    private static void registerBlock(Block block) {
    	
    	GameRegistry.registerBlock(block, ZeiyoMain.MODID + ":" +block.getUnlocalizedName().substring(5));	
        }

}