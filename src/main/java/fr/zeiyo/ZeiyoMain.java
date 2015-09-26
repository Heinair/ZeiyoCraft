package fr.zeiyo;

import fr.zeiyo.client.*;
import fr.zeiyo.server.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ZeiyoMain.MODID, name = "Zeiyo", version = ZeiyoMain.VERSION)

public class ZeiyoMain

{
	
	@Instance("zeiyo") public static ZeiyoMain instance;
    public static final String MODID = "zeiyo";
    public static final String VERSION = "0.2.1";
    
    @SidedProxy(clientSide="fr.zeiyo.client.ClientProxy", serverSide="fr.zeiyo.server.ServerProxy")
    public static CommonProxy proxy;
				    
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
				
        this.proxy.preInit(e);
									
	}
	@EventHandler
	public void init(FMLInitializationEvent e)
	{				
		
	    this.proxy.init(e);   	
	    
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
				
	    this.proxy.postInit(e);
	    
	}
	
}
