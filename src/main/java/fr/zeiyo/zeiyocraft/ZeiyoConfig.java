package fr.zeiyo.zeiyocraft;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ZeiyoConfig
{

    public static boolean areAlloysEnabled = true;
    public static boolean areNewOresEnabled = true;
    public static boolean areWarAxesEnabled = true;
    public static boolean isKeyEnabled = true;
    public static boolean isAlcoholEnabled = true;
    public static boolean isDrugEnabled = true;
    public static boolean isNewFoodEnabled = true;
    public static boolean isChairEnabled = true;
    public static boolean newEffects = true;

    public static void syncConfig(Configuration config) {
        try {
            config.load();

            Property areAlloysRelatedItemsAndBlocksEnabled = config.get("Ores, Armors, Tools and Weapons",
                    "isAlloysRelatedItemsAndBlocksEnabled",
                    "true",
                    "Whether everything related to alloys is avalaible (Tin, Copper and Silver ores, Bronze, Steel and Electrum armors, tools and weapons)");

            areAlloysEnabled = areAlloysRelatedItemsAndBlocksEnabled.getBoolean();

            Property areNewOresRelatedItemsAndBlocksEnabled = config.get("Ores, Armors, Tools and Weapons",
                    "isNewOresRelatedItemsAndBlocksEnabled",
                    "true",
                    "Whether everything related to the 6 new rare ores is avalaible (Ruby, Sapphire, Jade, Nacre, Onyx and Amethyst ores, armors, tools and weapons)");

            areNewOresEnabled = areNewOresRelatedItemsAndBlocksEnabled.getBoolean();

            Property areVanillaWarAxesEnabled = config.get("Ores, Armors, Tools and Weapons",
                    "areVanillaWarAxesEnabled",
                    "true",
                    "Whether the diamond, iron, golden, and wooden war axes are avalaibles");

            areWarAxesEnabled = areVanillaWarAxesEnabled.getBoolean();

            Property areArmorEffectsEnabled = config.get("Ores, Armors, Tools and Weapons",
                    "areArmorEffectsEnabled",
                    "true",
                    "Whether wearing a full set of armor grants a potion effect");

            newEffects = areArmorEffectsEnabled.getBoolean();

            Property areAlcoholsEnabled = config.get("Food",
                    "areAlcoholsEnabled",
                    "true",
                    "Whether alchols(and the crops used to make them : barley, grape, etc...) are available or not") ;

            isAlcoholEnabled = areAlcoholsEnabled.getBoolean();

            Property areDrugsEnabled = config.get("Food",
                    "areDrugsEnabled",
                    "true",
                    "Whether drugs (and the crops used to make them : hemp) are available or not ");

            isDrugEnabled = areDrugsEnabled.getBoolean();

            Property areNewDishesEnabled = config.get("Food",
                    "areNewDishesAvailable",
                    "true",
                    "Whether the new dishes are available or not");

            isNewFoodEnabled = areNewDishesEnabled.getBoolean();

            Property isKeySystemEnabled = config.get("Miscellaneous",
                    "isKeySystemEnabled",
                    "true",
                    "Whether the keys are available or not");

            isKeyEnabled = isKeySystemEnabled.getBoolean();

            Property areChairsEnabled = config.get("Miscellaneous",
                    "areChairsEnabled",
                    "true",
                    "Whether the chairs are enabled or not");

            isChairEnabled = areChairsEnabled.getBoolean();

        } catch (Exception e) {
        } finally {
            if (config.hasChanged()) config.save();
        }
    }

}
