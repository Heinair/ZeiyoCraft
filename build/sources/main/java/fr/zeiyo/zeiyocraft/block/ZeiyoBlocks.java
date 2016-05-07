package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoBlocks
{

	public static Block blockChocolateCake;
    public static Block barleyCrops, grapeCrops;
    public static Block chair, campfire;
	public static Block onyxOre, rubyOre, sapphireOre, copperOre, tinOre, silverOre;
	public static Block onyxBlock, steelBlock, rubyBlock, sapphireBlock, copperBlock, tinBlock, bronzeBlock, silverBlock, electrumBlock, charcoalBlock;

    public static void initBlocks()
    {

        // Food

        blockChocolateCake = new ZBlockCake("blockChocolateCake", 4, 0.5F);
        barleyCrops = new ZBlockCrops("barleyCrops", 0);
        grapeCrops = new ZBlockCrops("grapeCrops", 1);

        // Miscellaneous

        chair =  new ZBlockSittable("chair", Material.wood);
        //campfire = new ZBlockCampfire("campfire", false);

        // Ore Blocks

        copperOre = new ZBlock("copperOre", Material.rock, 5.0F, 3.0F, SoundType.STONE);
        tinOre = new ZBlock("tinOre", Material.rock, 5.0F, 3.0F, SoundType.STONE);
        silverOre = new ZBlock("silverOre", Material.rock, 5.0F, 3.0F, SoundType.STONE);
        onyxOre = new ZBlockOre("onyxOre", Material.rock, 3, ZeiyoItems.onyx);
        rubyOre = new ZBlockOre("rubyOre", Material.rock, 3, ZeiyoItems.ruby);
        sapphireOre = new ZBlockOre("sapphireOre", Material.rock, 3, ZeiyoItems.sapphire);

        // Compressed Blocks

        steelBlock = new ZBlock("steelBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        copperBlock = new ZBlock("copperBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        tinBlock = new ZBlock("tinBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        bronzeBlock = new ZBlock("bronzeBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        silverBlock = new ZBlock("silverBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        electrumBlock = new ZBlock("electrumBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        onyxBlock = new ZBlock("onyxBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        rubyBlock = new ZBlock("rubyBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);
        sapphireBlock = new ZBlock("sapphireBlock", Material.iron , 5.0F, 10.0F, SoundType.METAL,2);

    }
    
    public static void registerBlocks()
    {

        // Food

        GameRegistry.registerBlock(blockChocolateCake, blockChocolateCake.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(barleyCrops, barleyCrops.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(grapeCrops, grapeCrops.getUnlocalizedName().substring(5));

        // Ore Blocks

        GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tinOre, tinOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(silverOre, silverOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(onyxOre, onyxOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sapphireOre, sapphireOre.getUnlocalizedName().substring(5));

        // Miscellaneous

        GameRegistry.registerBlock(chair, chair.getUnlocalizedName().substring(5));
        //GameRegistry.registerBlock(campfire, campfire.getUnlocalizedName().substring(5));

        // Compressed Blocks

        GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tinBlock, tinBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(bronzeBlock, bronzeBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(silverBlock, silverBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(electrumBlock, electrumBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(onyxBlock, onyxBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sapphireBlock, sapphireBlock.getUnlocalizedName().substring(5));

    }
    
}