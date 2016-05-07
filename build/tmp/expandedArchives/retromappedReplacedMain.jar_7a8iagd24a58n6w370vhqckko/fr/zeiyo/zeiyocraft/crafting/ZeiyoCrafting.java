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

		GameRegistry.addSmelting(Items.field_151110_aK, new ItemStack(ZeiyoItems.hardboiledEgg), 0.15F);
		GameRegistry.addSmelting(ZeiyoItems.barley, new ItemStack(ZeiyoItems.malt), 0.15F);
		GameRegistry.addSmelting(Items.field_151078_bh, new ItemStack(ZeiyoItems.puriFlesh), 0.05F);

        // Crafts

		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.chocolateCake), new Object[] {"XCX", "SOS", "CBC",'X', Items.field_151117_aB, 'C', new ItemStack(Items.field_151100_aR, 1, 3), 'S', Items.field_151102_aT, 'O', Items.field_151110_aK, 'B', Items.field_151015_O});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.steelIngot), new Object[] {"###", "#P#", "###",'P', Items.field_151042_j, '#', Items.field_151044_h});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.vegetableStew), new Object[] {"CPR", " B ", 'R', new ItemStack(Blocks.field_150423_aK), 'C', Items.field_151172_bF, 'P', Items.field_151168_bH, 'B', Items.field_151054_z});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.bronzeIngot), new Object[] {"## ", "P# ",'P', ZeiyoItems.tinIngot, '#', ZeiyoItems.copperIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.electrumIngot), new Object[] {"#P#",'P', Items.field_151043_k, '#', ZeiyoItems.silverIngot});
		GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.steelBlock), new Object[] {"###", "#P#", "###",'P', Blocks.field_150339_S, '#', Blocks.field_150402_ci});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.tankard), new Object[] {"# #", "# #", "###", '#', Items.field_151055_y});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.beerTankard), new Object[] {"###", "#P#", " O ",'P', Items.field_151131_as, '#', ZeiyoItems.malt, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.wineTankard), new Object[] {"###", "#P#", " O ",'P', Items.field_151131_as, '#', ZeiyoItems.grape, 'O', ZeiyoItems.tankard});
        GameRegistry.addRecipe(new ItemStack(ZeiyoItems.ciderTankard), new Object[] {"#P#", " O ",'P', Items.field_151131_as, '#', Items.field_151034_e, 'O', ZeiyoItems.tankard});
		GameRegistry.addRecipe(new ItemStack(ZeiyoBlocks.chair), new Object[] {"#  ", "#P#", "B B",'P', Blocks.field_150325_L, '#', Blocks.field_150344_f, 'B', Blocks.field_150364_r});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.applePie), new Object[] {"PE ", "#  ",'P', Items.field_151034_e, '#', Items.field_151102_aT,'E', Items.field_151110_aK});
		GameRegistry.addRecipe(new ItemStack(ZeiyoItems.key), new Object[] {" EP", " EP"," P ",'P', Items.field_151043_k, 'E', Items.field_151074_bl});
		GameRegistry.addRecipe(new ItemStack(Items.field_151141_av), new Object[] {"PPP", "# #", "F F", 'F', Items.field_151042_j ,'P', Items.field_151116_aA, '#', Items.field_151007_F});

		// Ore, armors, tools, and compressed blocks-related Crafts

		warAxeCraft(Blocks.field_150344_f, ZeiyoItems.woodenWarAxe);
		warAxeCraft(Blocks.field_150347_e, ZeiyoItems.stoneWarAxe);
		warAxeCraft(Items.field_151043_k, ZeiyoItems.goldWarAxe);
		warAxeCraft(Items.field_151042_j, ZeiyoItems.ironWarAxe);
		warAxeCraft(Items.field_151045_i, ZeiyoItems.diamondWarAxe);

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
