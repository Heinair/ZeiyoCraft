package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks
{

	public static Block blockChocolateCake;
    public static Block barleyCrops, grapeCrops;
	public static Block onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
	public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock, bronzeBlock, silverBlock, electrumBlock;

    public static void createBlocks() 
    {

        GameRegistry.registerBlock(blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F), "blockChocolateCake");
        GameRegistry.registerBlock(barleyCrops = new ZBlockCrops("barleyCrops", ZeiyoItems.barleySeeds, ZeiyoItems.barley), "barleyCrops");
        GameRegistry.registerBlock(grapeCrops = new ZBlockCrops("grapeCrops", ZeiyoItems.grapeSeeds, ZeiyoItems.grape), "grapeCrops");

        // Compressed Blocks

        GameRegistry.registerBlock(steelBlock = new ZBlock("steelBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "steelBlock");
        GameRegistry.registerBlock(copperBlock = new ZBlock("copperBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "copperBlock");
        GameRegistry.registerBlock(tinBlock = new ZBlock("tinBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "tinBlock");
        GameRegistry.registerBlock(bronzeBlock = new ZBlock("bronzeBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "bronzeBlock");
        GameRegistry.registerBlock(silverBlock = new ZBlock("silverBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "silverBlock");
        GameRegistry.registerBlock(electrumBlock = new ZBlock("electrumBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "electrumBlock");
        GameRegistry.registerBlock(onyxBlock = new ZBlock("onyxBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "onyxBlock");
        GameRegistry.registerBlock(rubyBlock = new ZBlock("rubyBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "rubyBlock");
        GameRegistry.registerBlock(sapphireBlock = new ZBlock("sapphireBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "sapphireBlock");

        // Ore blocks

        GameRegistry.registerBlock(copperOre = new ZBlock("copperOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "copperOre");
        GameRegistry.registerBlock(tinOre = new ZBlock("tinOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "tinOre");
        GameRegistry.registerBlock(silverOre = new ZBlock("silverOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "silverOre");
        GameRegistry.registerBlock(onyxOre = new ZBlockOre("onyxOre", Material.rock, 3, ZeiyoItems.onyx), "onyxOre");
        GameRegistry.registerBlock(rubyOre = new ZBlockOre("rubyOre", Material.rock, 3, ZeiyoItems.ruby), "rubyOre");
        GameRegistry.registerBlock(sapphireOre = new ZBlockOre("sapphireOre", Material.rock, 3, ZeiyoItems.sapphire), "sapphireOre");

    }
    
}