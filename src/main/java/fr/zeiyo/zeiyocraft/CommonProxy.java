package fr.zeiyo.zeiyocraft;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.crafting.ZeiyoCrafting;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import fr.zeiyo.zeiyocraft.world.ZeiyoWorldGen;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{

	    public void preInit(FMLPreInitializationEvent e) 
	    {
	    	
	    	ZeiyoItems.createLootsItems();
	    	ZeiyoBlocks.createBlocks();
	    	ZeiyoItems.createItems();
	    	
	    }

	    public void init(FMLInitializationEvent e) 	    
	    {
	    	
	        GameRegistry.registerWorldGenerator(new ZeiyoWorldGen(), 0);
	    	ZeiyoCrafting.createCrafts();
			MinecraftForge.addGrassSeed(new ItemStack(ZeiyoItems.barleySeeds), 10);
			MinecraftForge.addGrassSeed(new ItemStack(ZeiyoItems.grapeSeeds), 3);



		}

	    public void postInit(FMLPostInitializationEvent e){ }

}