package fr.zeiyo.zeiyocraft;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ZeiyoMain.MODID, name = ZeiyoMain.NAME, version = ZeiyoMain.VERSION, guiFactory = ZeiyoMain.GUI_FACTORY)

public class ZeiyoMain

{

    @Instance("zeiyocraft")
    public static ZeiyoMain instance;
    public static final String MODID = "zeiyocraft";
    public static final String NAME = "ZeiyoCraft";
    public static final String VERSION = "0.7.2";
    public static final String GUI_FACTORY = "fr.zeiyo.zeiyocraft.gui.ZGuiFactory";
    public static Configuration CONFIG = new Configuration();

    @SidedProxy(clientSide = "fr.zeiyo.zeiyocraft.client.ClientProxy", serverSide = "fr.zeiyo.zeiyocraft.server.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        CONFIG = new Configuration(e.getSuggestedConfigurationFile());
        ZeiyoConfig.syncConfig(CONFIG);
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
