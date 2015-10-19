package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils.*;

public class ZeiyoCrafting 
{

	public static void createCrafts()
	{

        // Smelts

		GameRegistry.addSmelting(Items.egg, new ItemStack(ZeiyoItems.hardboiledEgg), 0.15F);
		GameRegistry.addSmelting(ZeiyoItems.barley, new ItemStack(ZeiyoItems.malt), 0.15F);
		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(ZeiyoItems.puriFlesh), 0.05F);

        // Crafts

		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.chocolateCake), new Object[] {"XCX", "SOS", "CBC",'X', Items.milk_bucket, 'C', new ItemStack(Items.dye, 1, 3), 'S', Items.sugar, 'O', Items.egg, 'B', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.steelIngot), new Object[] {"###", "#P#", "###",'P', Items.iron_ingot, '#', Items.coal});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.vegetableStew), new Object[] {"CPR", " B ", 'R', new ItemStack(Blocks.pumpkin), 'C', Items.carrot, 'P', Items.baked_potato, 'B', Items.bowl});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.bronzeIngot), new Object[] {"## ", "P# ",'P', ZeiyoItems.tinIngot, '#', ZeiyoItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.electrumIngot), new Object[] {"#P#",'P', Items.gold_ingot, '#', ZeiyoItems.silverIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.steelBlock), new Object[] {"###", "#P#", "###",'P', Blocks.iron_block, '#', Blocks.coal_block});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.tankard), new Object[] {"# #", "# #", "###", '#', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.beerTankard), new Object[] {"###", "#P#", " O ",'P', Items.water_bucket, '#', ZeiyoItems.malt, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.wineTankard), new Object[] {"###", "#P#", " O ",'P', Items.water_bucket, '#', ZeiyoItems.grape, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.ciderTankard), new Object[] {"#P#", " O ",'P', Items.water_bucket, '#', Items.apple, 'O', ZeiyoItems.tankard});
		GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.chair), new Object[] {"#  ", "#P#", "B B",'P', Blocks.wool, '#', Blocks.planks, 'B', Blocks.log});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.applePie), new Object[] {"PE ", "#  ",'P', Items.apple, '#', Items.sugar,'E', Items.egg});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.key), new Object[] {" EP", " EP"," P ",'P', Items.gold_ingot, 'E', Items.gold_nugget});
		GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[] {"PPP", "# #", "F F", 'F', Items.iron_ingot ,'P', Items.leather, '#', Items.string});

		// Ore, armors, tools, and compressed blocks-related Crafts

		warAxeCraft(Blocks.planks, ZeiyoItems.woodenWarAxe);
		warAxeCraft(Blocks.cobblestone, ZeiyoItems.stoneWarAxe);
		warAxeCraft(Items.gold_ingot, ZeiyoItems.goldWarAxe);
		warAxeCraft(Items.iron_ingot, ZeiyoItems.ironWarAxe);
		warAxeCraft(Items.diamond, ZeiyoItems.diamondWarAxe);

		armorCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelHelmet, ZeiyoItems.steelChestplate, ZeiyoItems.steelLeggings, ZeiyoItems.steelBoots);
		toolsCraft(ZeiyoItems.steelIngot, ZeiyoItems.steelPickaxe, ZeiyoItems.steelAxe, ZeiyoItems.steelSpade, ZeiyoItems.steelHoe, ZeiyoItems.steelSword, ZeiyoItems.steelWarAxe);
		compressedCraft(ZeiyoItems.steelIngot, ZeiyoBlocks.steelBlock);

		armorCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzeHelmet, ZeiyoItems.bronzeChestplate, ZeiyoItems.bronzeLeggings, ZeiyoItems.bronzeBoots);
		toolsCraft(ZeiyoItems.bronzeIngot, ZeiyoItems.bronzePickaxe, ZeiyoItems.bronzeAxe, ZeiyoItems.bronzeSpade, ZeiyoItems.bronzeHoe, ZeiyoItems.bronzeSword, ZeiyoItems.bronzeWarAxe);
		compressedCraft(ZeiyoItems.bronzeIngot, ZeiyoBlocks.bronzeBlock);
		oreCompressedCraft(ZeiyoItems.tinIngot, ZeiyoBlocks.tinBlock, ZeiyoBlocks.tinOre, 0.6F);
		oreCompressedCraft(ZeiyoItems.copperIngot, ZeiyoBlocks.copperBlock, ZeiyoBlocks.copperOre, 0.5F);

		armorCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumHelmet, ZeiyoItems.electrumChestplate, ZeiyoItems.electrumLeggings, ZeiyoItems.electrumBoots);
		toolsCraft(ZeiyoItems.electrumIngot, ZeiyoItems.electrumPickaxe, ZeiyoItems.electrumAxe, ZeiyoItems.electrumSpade, ZeiyoItems.electrumHoe, ZeiyoItems.electrumSword, ZeiyoItems.electrumWarAxe);
		compressedCraft(ZeiyoItems.electrumIngot, ZeiyoBlocks.electrumBlock);
		oreCompressedCraft(ZeiyoItems.silverIngot, ZeiyoBlocks.silverBlock, ZeiyoBlocks.silverOre, 0.8F);

		armorCraft(ZeiyoItems.onyx, ZeiyoItems.onyxHelmet, ZeiyoItems.onyxChestplate, ZeiyoItems.onyxLeggings, ZeiyoItems.onyxBoots);
		toolsCraft(ZeiyoItems.onyx, ZeiyoItems.onyxPickaxe, ZeiyoItems.onyxAxe, ZeiyoItems.onyxSpade, ZeiyoItems.onyxHoe, ZeiyoItems.onyxSword, ZeiyoItems.onyxWarAxe);
		oreCompressedCraft(ZeiyoItems.onyx, ZeiyoBlocks.onyxBlock, ZeiyoBlocks.onyxOre, 1.15F);
		
		armorCraft(ZeiyoItems.ruby, ZeiyoItems.rubyHelmet, ZeiyoItems.rubyChestplate, ZeiyoItems.rubyLeggings, ZeiyoItems.rubyBoots);
		toolsCraft(ZeiyoItems.ruby, ZeiyoItems.rubyPickaxe, ZeiyoItems.rubyAxe, ZeiyoItems.rubySpade, ZeiyoItems.rubyHoe, ZeiyoItems.rubySword, ZeiyoItems.rubyWarAxe);
		oreCompressedCraft(ZeiyoItems.ruby, ZeiyoBlocks.rubyBlock, ZeiyoBlocks.rubyOre, 1.15F);
		
		armorCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphireHelmet, ZeiyoItems.sapphireChestplate, ZeiyoItems.sapphireLeggings, ZeiyoItems.sapphireBoots);
		toolsCraft(ZeiyoItems.sapphire, ZeiyoItems.sapphirePickaxe, ZeiyoItems.sapphireAxe, ZeiyoItems.sapphireSpade, ZeiyoItems.sapphireHoe, ZeiyoItems.sapphireSword, ZeiyoItems.sapphireWarAxe);
		oreCompressedCraft(ZeiyoItems.sapphire, ZeiyoBlocks.sapphireBlock, ZeiyoBlocks.sapphireOre, 1.15F);

	}
	
	
}
