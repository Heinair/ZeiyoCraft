package fr.zeiyo.client;

import fr.zeiyo.ZeiyoMain;
import fr.zeiyo.ZeiyoUtils;
import fr.zeiyo.block.ZeiyoBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister

{
	
	 public static void registerBlockRenderer() 
	 {
		 
		 ZeiyoUtils.reg(ZeiyoBlocks.blockChocolateCake);
		 ZeiyoUtils.reg(ZeiyoBlocks.steelBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.onyxOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.onyxBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.rubyOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.rubyBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.sapphireOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.sapphireBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.copperOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.tinOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.bronzeBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.tinBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.copperBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.silverOre);
		 ZeiyoUtils.reg(ZeiyoBlocks.silverBlock);
		 ZeiyoUtils.reg(ZeiyoBlocks.electrumBlock);


		 
		 
     }
	 
}
