package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
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
        registerBlock(blockChocolateCake);
        registerBlock(barleyCrops);
        registerBlock(grapeCrops);

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

    private static void registerBlock(Block block)
    {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    
}