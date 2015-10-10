package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoCrafting 
{

	public static void createCrafts()
	{

        // Smelts

		GameRegistry.addSmelting(Items.egg, new ItemStack(ZeiyoItems.hardboiledEgg), 0.15F);
		GameRegistry.addSmelting(ZeiyoItems.barley, new ItemStack(ZeiyoItems.malt), 0.15F);
        GameRegistry.addSmelting(Items.wheat_seeds, new ItemStack(ZeiyoItems.barleySeeds), 0.15F);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(ZeiyoItems.puriFlesh), 0.05F);

        // Crafts

		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.chocolateCake), new Object[] {"XCX", "SOS", "CBC",'X', Items.milk_bucket, 'C', new ItemStack(Items.dye, 1, 12), 'S', Items.sugar, 'O', Items.egg, 'B', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.steelIngot), new Object[] {"###", "#P#", "###",'P', Items.iron_ingot, '#', Items.coal});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.bronzeIngot), new Object[] {"## ", "P# ",'P', ZeiyoItems.tinIngot, '#', ZeiyoItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.electrumIngot), new Object[] {"#P#",'P', Items.gold_ingot, '#', ZeiyoItems.silverIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.steelBlock), new Object[] {"###", "#P#", "###",'P', Blocks.iron_block, '#', Blocks.coal_block});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.tankard), new Object[] {"# #", "# #", "###", '#', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.beerTankard), new Object[] {"###", "#P#", " O ",'P', Items.water_bucket, '#', ZeiyoItems.malt, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.wineTankard), new Object[] {"###", "#P#", " O ",'P', Items.water_bucket, '#', ZeiyoItems.grape, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.ciderTankard), new Object[] {"#P#", " O ",'P', Items.water_bucket, '#', Items.apple, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.applePie), new Object[] {"PE ", "#  ",'P', Items.apple, '#', Items.sugar,'E', Items.egg});
        GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[] {"PPP", "# #" ,'P', Items.leather, '#', Items.string});



		// Ore, armors, tools, and compressed blocks-related Crafts

        ZCraftingUtils.armorCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelHelmet, ZeiyoItems.steelChestplate, ZeiyoItems.steelLeggings, ZeiyoItems.steelBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelPickaxe, ZeiyoItems.steelAxe, ZeiyoItems.steelSpade, ZeiyoItems.steelHoe, ZeiyoItems.steelSword);
		ZCraftingUtils.compressedCraft(ZeiyoItems.steelIngot, ZeiyoBlocks.steelBlock);

		ZCraftingUtils.armorCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzeHelmet, ZeiyoItems.bronzeChestplate, ZeiyoItems.bronzeLeggings, ZeiyoItems.bronzeBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzePickaxe, ZeiyoItems.bronzeAxe, ZeiyoItems.bronzeSpade, ZeiyoItems.bronzeHoe, ZeiyoItems.bronzeSword);
		ZCraftingUtils.compressedCraft(ZeiyoItems.bronzeIngot, ZeiyoBlocks.bronzeBlock);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.tinIngot, ZeiyoBlocks.tinBlock, ZeiyoBlocks.tinOre, 0.6F);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.copperIngot, ZeiyoBlocks.copperBlock, ZeiyoBlocks.copperOre, 0.5F);

		ZCraftingUtils.armorCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumHelmet, ZeiyoItems.electrumChestplate, ZeiyoItems.electrumLeggings, ZeiyoItems.electrumBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumPickaxe, ZeiyoItems.electrumAxe, ZeiyoItems.electrumSpade, ZeiyoItems.electrumHoe, ZeiyoItems.electrumSword);
		ZCraftingUtils.compressedCraft(ZeiyoItems.electrumIngot, ZeiyoBlocks.electrumBlock);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.silverIngot, ZeiyoBlocks.silverBlock, ZeiyoBlocks.silverOre, 0.8F);

		ZCraftingUtils.armorCraft(ZeiyoItems.onyx, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.onyx, ZeiyoItems.onyxPickaxe, ZeiyoItems.onyxAxe, ZeiyoItems.onyxSpade, ZeiyoItems.onyxHoe, ZeiyoItems.onyxSword);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.onyx, ZeiyoBlocks.onyxBlock, ZeiyoBlocks.onyxOre, 1.15F);
		
		ZCraftingUtils.armorCraft(ZeiyoItems.ruby, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.ruby, ZeiyoItems.rubyPickaxe, ZeiyoItems.rubyAxe, ZeiyoItems.rubySpade, ZeiyoItems.rubyHoe, ZeiyoItems.rubySword);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.ruby, ZeiyoBlocks.rubyBlock, ZeiyoBlocks.rubyOre, 1.15F);
		
		ZCraftingUtils.armorCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots);
		ZCraftingUtils.toolsCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphirePickaxe, ZeiyoItems.sapphireAxe, ZeiyoItems.sapphireSpade, ZeiyoItems.sapphireHoe, ZeiyoItems.sapphireSword);
		ZCraftingUtils.oreCompressedCraft(ZeiyoItems.sapphire, ZeiyoBlocks.sapphireBlock, ZeiyoBlocks.sapphireOre, 1.15F);
		
		ZCraftingUtils.armorCraft(Items.emerald, ZeiyoItems.emeraldHelmet, ZeiyoItems.emeraldChestplate, ZeiyoItems.emeraldLeggings, ZeiyoItems.emeraldBoots);
		ZCraftingUtils.toolsCraft(Items.emerald, ZeiyoItems.emeraldPickaxe, ZeiyoItems.emeraldAxe, ZeiyoItems.emeraldSpade, ZeiyoItems.emeraldHoe, ZeiyoItems.emeraldSword);

	}
	
	
}
