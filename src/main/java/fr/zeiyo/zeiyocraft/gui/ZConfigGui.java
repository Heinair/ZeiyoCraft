package fr.zeiyo.zeiyocraft.gui;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ZConfigGui extends GuiConfig{


    public ZConfigGui(GuiScreen parentScreen) {
        super(parentScreen,
                getConfigElements(),
                ZeiyoMain.MODID,
                true,
                false,
                GuiConfig.getAbridgedConfigPath(ZeiyoMain.CONFIG.toString()));




    }

    /** Compiles a list of config elements */
    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        //Add categories to config GUI
        list.add(categoryElement("Ores, Armors, Tools and Weapons", "Ores, Armors, Tools and Weapons", "fr.zeiyo.zeiyocraft.gui.ZConfigGui.category.ores"));
        list.add(categoryElement("Food", "Food", "fr.zeiyo.zeiyocraft.gui.ZConfigGui.category.food"));
        list.add(categoryElement("Miscellaneous", "Miscellaneous", "fr.zeiyo.zeiyocraft.gui.ZConfigGui.category.miscellaneous"));

        return list;
    }

    /** Creates a button linking to another screen where all options of the category are available */
    private static IConfigElement categoryElement(String category, String name, String tooltip_key) {
        return new DummyConfigElement.DummyCategoryElement(name, tooltip_key,
                new ConfigElement(ZeiyoMain.CONFIG.getCategory(category)).getChildElements());
    }


}
