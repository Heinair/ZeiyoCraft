package fr.zeiyo.zeiyocraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ZeiyoMain.MODID, name = ZeiyoMain.NAME, version = ZeiyoMain.VERSION)

public class ZeiyoMain

{

    @Instance("zeiyocraft")
    public static ZeiyoMain instance;
    public static final String MODID = "zeiyocraft";
    public static final String NAME = "ZeiyoCraft";
    public static final String VERSION = "0.5.2";

    @SidedProxy(clientSide = "fr.zeiyo.zeiyocraft.client.ClientProxy", serverSide = "fr.zeiyo.zeiyocraft.server.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        this.proxy.preInit(e);

    }

    @EventHandler
    public void init(FMLInitializationEvent e) {

        this.proxy.init(e);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        this.proxy.postInit(e);

    }

}
