package fr.zeiyo.zeiyocraft.client;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister

{

    public static void reg(Block block)
    {
        Minecraft.func_71410_x().func_175599_af().func_175037_a() .func_178086_a(Item.func_150898_a(block), 0, new ModelResourceLocation(ZeiyoMain.MODID + ":" + block.func_149739_a().substring(5), "inventory"));
    }

	 public static void registerBlockRenderer() 
	 {

         // Food

		 reg(ZeiyoBlocks.barleyCrops);
         reg(ZeiyoBlocks.grapeCrops);
		 reg(ZeiyoBlocks.blockChocolateCake);

         // Miscellaneous

         reg(ZeiyoBlocks.chair);
         //reg(ZeiyoBlocks.campfire);

         // Ore Blocks

         reg(ZeiyoBlocks.copperOre);
         reg(ZeiyoBlocks.tinOre);
         reg(ZeiyoBlocks.silverOre);
         reg(ZeiyoBlocks.onyxOre);
         reg(ZeiyoBlocks.rubyOre);
         reg(ZeiyoBlocks.sapphireOre);

		 // Compressed Blocks

		 reg(ZeiyoBlocks.steelBlock);
         reg(ZeiyoBlocks.tinBlock);
         reg(ZeiyoBlocks.copperBlock);
         reg(ZeiyoBlocks.bronzeBlock);
         reg(ZeiyoBlocks.silverBlock);
         reg(ZeiyoBlocks.electrumBlock);
		 reg(ZeiyoBlocks.onyxBlock);
		 reg(ZeiyoBlocks.rubyBlock);
		 reg(ZeiyoBlocks.sapphireBlock);

     }
	 
}
