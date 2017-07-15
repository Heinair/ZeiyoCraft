package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ZCraftingUtils {

    public static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item spade, Item sword, Item warAxe, Item item) {
        GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(axe), new Object[]{"II ", "IS ", " S ", 'S', Items.STICK, 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(hoe), new Object[]{"II ", " S ", " S ", 'S', Items.STICK, 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(pickaxe), new Object[]{"III", " S ", " S ", 'S', Items.STICK, 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + spade.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(spade), new Object[]{" I ", " S ", " S ", 'S', Items.STICK, 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(sword), new Object[]{" I ", " I ", " S ", 'S', Items.STICK, 'I', item});
        registerWarAxeCrafting(item, warAxe);
    }

    public static void registerWarAxeCrafting(Item item, Item warAxe) {
        GameRegistry.addShapedRecipe(new ResourceLocation("" + warAxe.getRegistryName()), new ResourceLocation("zeiyocraft:weaponsandtools"), new ItemStack(warAxe), new Object[]{"III", "ISI", " S ", 'S', Items.STICK, 'I', item});
    }

    public static void registerArmorCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item item) {
        GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("zeiyocraft:armors"), new ItemStack(helmet), new Object[]{"III", "I I", "   ", 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("zeiyocraft:armors"), new ItemStack(chestplate), new Object[]{"I I", "III", "III", 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("zeiyocraft:armors"), new ItemStack(leggings), new Object[]{"III", "I I", "I I", 'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("zeiyocraft:armors"), new ItemStack(boots), new Object[]{"I I", "I I", "   ", 'I', item});
    }

    public static String getOreDictionnaryName(Item item)
    {
        String oreDictName;
        oreDictName = ZeiyoItems.onyx == item ? "gemOnyx" : ZeiyoItems.ruby == item ? "gemRuby" : ZeiyoItems.sapphire == item ? "gemSapphire" : ZeiyoItems.jade == item ? "gemJade" : ZeiyoItems.nacre == item ? "gemNacre" : "gemAmethyst";

        return oreDictName;
    }

    public static void oreCompressedCraft(Item item, Block block, Block ore, float exp) {

        if (ore != null)
            GameRegistry.addSmelting(ore, new ItemStack(item), exp);

        GameRegistry.addShapedRecipe(new ResourceLocation("" + block.getRegistryName()), new ResourceLocation("zeiyocraft:blocks"), new ItemStack(block), new Object[]{"III", "III", "III",'I', item});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + item.getRegistryName()+ "fromBlock"), new ResourceLocation("zeiyocraft:items"), new ItemStack(item, 9), new Object[]{"I", 'I', block});
    }

    public static void compressedCraft(Item item, Block block) {

        oreCompressedCraft(item, block, null, 0.0F);

    }
    public static Item getRepairItem(int id) {

        switch (id) {
            case 0:
                return ZeiyoItems.steelIngot;
            case 1:
                return ZeiyoItems.bronzeIngot;
            case 2:
                return ZeiyoItems.electrumIngot;
            case 3:
                return ZeiyoItems.onyx;
            case 4:
                return ZeiyoItems.ruby;
            case 5:
                return ZeiyoItems.sapphire;
            case 6:
            	return ZeiyoItems.jade;
            case 7 : 
            	return ZeiyoItems.nacre;           	
            case 8 : 
            	return ZeiyoItems.amethyst;
                
            case 100:
                return Items.GOLD_INGOT;
            case 101:
                return Items.IRON_INGOT;
            case 102:
                return Items.DIAMOND;

            default:
                return null;

        }

    }

}
