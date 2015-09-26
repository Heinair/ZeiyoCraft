package fr.zeiyo.zeiyocraft;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.crafting.ZeiyoCrafting;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import fr.zeiyo.zeiyocraft.world.ZeiyoWorldGen;
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
	    	
	    	
	    }

	    public void postInit(FMLPostInitializationEvent e) 	    
	    {
	    	

	    }

}