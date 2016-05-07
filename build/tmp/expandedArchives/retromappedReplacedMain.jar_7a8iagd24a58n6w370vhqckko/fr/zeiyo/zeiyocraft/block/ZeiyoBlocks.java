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

        chair =  new ZBlockSittable("chair", Material.field_151575_d);
        //campfire = new ZBlockCampfire("campfire", false);

        // Ore Blocks

        copperOre = new ZBlock("copperOre", Material.field_151576_e, 5.0F, 3.0F, SoundType.field_185851_d);
        tinOre = new ZBlock("tinOre", Material.field_151576_e, 5.0F, 3.0F, SoundType.field_185851_d);
        silverOre = new ZBlock("silverOre", Material.field_151576_e, 5.0F, 3.0F, SoundType.field_185851_d);
        onyxOre = new ZBlockOre("onyxOre", Material.field_151576_e, 3, ZeiyoItems.onyx);
        rubyOre = new ZBlockOre("rubyOre", Material.field_151576_e, 3, ZeiyoItems.ruby);
        sapphireOre = new ZBlockOre("sapphireOre", Material.field_151576_e, 3, ZeiyoItems.sapphire);

        // Compressed Blocks

        steelBlock = new ZBlock("steelBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        copperBlock = new ZBlock("copperBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        tinBlock = new ZBlock("tinBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        bronzeBlock = new ZBlock("bronzeBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        silverBlock = new ZBlock("silverBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        electrumBlock = new ZBlock("electrumBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        onyxBlock = new ZBlock("onyxBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        rubyBlock = new ZBlock("rubyBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);
        sapphireBlock = new ZBlock("sapphireBlock", Material.field_151573_f , 5.0F, 10.0F, SoundType.field_185852_e,2);

    }
    
    public static void registerBlocks()
    {

        // Food

        GameRegistry.registerBlock(blockChocolateCake, blockChocolateCake.func_149739_a().substring(5));
        GameRegistry.registerBlock(barleyCrops, barleyCrops.func_149739_a().substring(5));
        GameRegistry.registerBlock(grapeCrops, grapeCrops.func_149739_a().substring(5));

        // Ore Blocks

        GameRegistry.registerBlock(copperOre, copperOre.func_149739_a().substring(5));
        GameRegistry.registerBlock(tinOre, tinOre.func_149739_a().substring(5));
        GameRegistry.registerBlock(silverOre, silverOre.func_149739_a().substring(5));
        GameRegistry.registerBlock(onyxOre, onyxOre.func_149739_a().substring(5));
        GameRegistry.registerBlock(rubyOre, rubyOre.func_149739_a().substring(5));
        GameRegistry.registerBlock(sapphireOre, sapphireOre.func_149739_a().substring(5));

        // Miscellaneous

        GameRegistry.registerBlock(chair, chair.func_149739_a().substring(5));
        //GameRegistry.registerBlock(campfire, campfire.getUnlocalizedName().substring(5));

        // Compressed Blocks

        GameRegistry.registerBlock(steelBlock, steelBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(copperBlock, copperBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(tinBlock, tinBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(bronzeBlock, bronzeBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(silverBlock, silverBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(electrumBlock, electrumBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(onyxBlock, onyxBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(rubyBlock, rubyBlock.func_149739_a().substring(5));
        GameRegistry.registerBlock(sapphireBlock, sapphireBlock.func_149739_a().substring(5));

    }
    
}