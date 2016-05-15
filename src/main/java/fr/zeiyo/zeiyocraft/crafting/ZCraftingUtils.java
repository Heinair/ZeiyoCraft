package fr.zeiyo.zeiyocraft.crafting;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.Sys;

public class ZCraftingUtils
{

    public static void oreCompressedCraft(Item item, Block block, Block ore, float exp)
    {

        if (ore != null)
            GameRegistry.addSmelting(ore, new ItemStack(item), exp);

        GameRegistry.addRecipe(new ItemStack(block), new Object[] {"###","###", "###", '#', item});
        GameRegistry.addShapelessRecipe(new ItemStack(item, 9), new Object[] {block});

    }

    public static void compressedCraft(Item item, Block block)
    {

        oreCompressedCraft(item, block, null, 0.0F);

    }

    public static void armorCraft(Item item, Item armorHelmet, Item armorChestplate, Item armorLeggings, Item armorBoots)
    {

        GameRegistry.addRecipe(new ItemStack(armorHelmet), new Object[] {"###", "# #", '#', item});
        GameRegistry.addRecipe(new ItemStack(armorChestplate), new Object[] {"# #", "###", "###", '#', item});
        GameRegistry.addRecipe(new ItemStack(armorLeggings), new Object[] {"###", "# #", "# #", '#', item});
        GameRegistry.addRecipe(new ItemStack(armorBoots), new Object[] {"# #", "# #", '#', item});

    }

    public static void toolsCraft (Item item , Item pickaxe, Item axe, Item spade, Item hoe, Item sword, Item warAxe)
    {

        pickaxeCraft(item, pickaxe);
        axeCraft(item, axe);
        spadeCraft(item, spade);
        hoeCraft(item, hoe);
        swordCraft(item, sword);
        warAxeCraft(item, warAxe);

    }

    public static void pickaxeCraft(Item item, Item pickaxe)
    {
        GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"###", " P ", " P ",'P', Items.stick, '#', item});
    }

    public static void axeCraft(Item item, Item axe)
    {
        GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"## ", "#P ", " P ",'P', Items.stick, '#', item});
    }

    public static void spadeCraft(Item item, Item spade)
    {
        GameRegistry.addRecipe(new ItemStack(spade), new Object[] {" # ", " P ", " P ",'P', Items.stick, '#', item});
    }

    public static void hoeCraft(Item item, Item hoe)
    {
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"## ", " P ", " P ",'P', Items.stick, '#', item});
    }

    public static void swordCraft(Item item, Item sword)
    {
        GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" # ", " # ", " P ",'P', Items.stick, '#', item});
    }

    public static void warAxeCraft(Item item, Item warAxe)
    {
        GameRegistry.addRecipe(new ItemStack(warAxe), new Object[] {"###", "#P#", " P ", 'P', Items.stick, '#', item});
    }
    public static void warAxeCraft(Block block, Item warAxe)
    {
        GameRegistry.addRecipe(new ItemStack(warAxe), new Object[] {"###", "#P#", " P ", 'P', Items.stick, '#', block});
    }


    public static Item getRepairItem(int id)
    {

        switch(id)
        {
            case 0 : return ZeiyoItems.steelIngot;
            case 1 : return ZeiyoItems.bronzeIngot;
            case 2 : return ZeiyoItems.electrumIngot;
            case 3 : return ZeiyoItems.onyx;
            case 4 : return ZeiyoItems.ruby;
            case 5 : return ZeiyoItems.sapphire;
            case 100 : return Items.gold_ingot;
            case 101 : return Items.iron_ingot;
            case 102 : return Items.diamond;

            default : return null;

        }

    }

}
