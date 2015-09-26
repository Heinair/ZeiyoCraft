package fr.zeiyo.block;

import fr.zeiyo.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks 

{
	
	public static Block blockChocolateCake;
	public static Block steelBlock;
	public static Block onyxOre;
	public static Block onyxBlock;
	public static Block rubyOre;
	public static Block rubyBlock;
	public static Block sapphireOre;
	public static Block sapphireBlock;
	public static Block copperOre;
	public static Block tinOre;
	public static Block copperBlock;
	public static Block tinBlock;
	public static Block bronzeBlock;
	public static Block silverOre;
	public static Block silverBlock;
	public static Block electrumBlock;
	
    public static void createBlocks() 
    {
    	
        GameRegistry.registerBlock(blockChocolateCake = new ZBlockCake("blockChocolateCake"), "blockChocolateCake");
        GameRegistry.registerBlock(steelBlock = new ZBlock("steelBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "steelBlock");
        GameRegistry.registerBlock(onyxBlock = new ZBlock("onyxBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "onyxBlock");
        GameRegistry.registerBlock(onyxOre = new ZBlockOre("onyxOre", Material.rock, 3, ZeiyoItems.onyx), "onyxOre");
        GameRegistry.registerBlock(rubyBlock = new ZBlock("rubyBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "rubyBlock");
        GameRegistry.registerBlock(rubyOre = new ZBlockOre("rubyOre", Material.rock, 3, ZeiyoItems.ruby), "rubyOre");
        GameRegistry.registerBlock(sapphireBlock = new ZBlock("sapphireBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "sapphireBlock");
        GameRegistry.registerBlock(bronzeBlock = new ZBlock("bronzeBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "bronzeBlock");
        GameRegistry.registerBlock(sapphireOre = new ZBlockOre("sapphireOre", Material.rock, 3, ZeiyoItems.sapphire), "sapphireOre");
        GameRegistry.registerBlock(copperOre = new ZBlock("copperOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "copperOre");
        GameRegistry.registerBlock(tinOre = new ZBlock("tinOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "tinOre");
        GameRegistry.registerBlock(copperBlock = new ZBlock("copperBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "copperBlock");
        GameRegistry.registerBlock(tinBlock = new ZBlock("tinBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "tinBlock");
        GameRegistry.registerBlock(silverOre = new ZBlock("silverOre", Material.rock, 5.0F, 3.0F, Block.soundTypePiston), "silverOre");
        GameRegistry.registerBlock(silverBlock = new ZBlock("silverBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "silverBlock");
        GameRegistry.registerBlock(electrumBlock = new ZBlock("electrumBlock", Material.iron , 5.0F, 10.0F, Block.soundTypeMetal,2), "electrumBlock");

           	
    }
    
}