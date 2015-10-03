package fr.zeiyo.zeiyocraft.client;

import fr.zeiyo.zeiyocraft.ZeiyoUtils;
import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;

public class BlockRenderRegister

{
	
	 public static void registerBlockRenderer() 
	 {

		 ZeiyoUtils.reg(ZeiyoBlocks.barleyCrops);
         ZeiyoUtils.reg(ZeiyoBlocks.grapeCrops);
		 ZeiyoUtils.reg(ZeiyoBlocks.blockChocolateCake);

		 // Compressed Blocks

		 ZeiyoUtils.reg(ZeiyoBlocks.steelBlock);
         ZeiyoUtils.reg(ZeiyoBlocks.tinBlock);
         ZeiyoUtils.reg(ZeiyoBlocks.copperBlock);
         ZeiyoUtils.reg(ZeiyoBlocks.bronzeBlock);
         ZeiyoUtils.reg(ZeiyoBlocks.silverBlock);
         ZeiyoUtils.reg(ZeiyoBlocks.electrumBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.onyxBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.rubyBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.sapphireBlock);

         // Ore Blocks

         ZeiyoUtils.reg(ZeiyoBlocks.copperOre);
         ZeiyoUtils.reg(ZeiyoBlocks.tinOre);
         ZeiyoUtils.reg(ZeiyoBlocks.silverOre);
         ZeiyoUtils.reg(ZeiyoBlocks.onyxOre);
         ZeiyoUtils.reg(ZeiyoBlocks.rubyOre);
         ZeiyoUtils.reg(ZeiyoBlocks.sapphireOre);

     }
	 
}
