package fr.zeiyo.zeiyocraft;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ZeiyoUtils 
{
	
	public static String modid = ZeiyoMain.MODID;
	
	public static void reg(Block block) 
	{
	     Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void reg(Item item)
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void oreCompressedCraft(Item item, Block block, Block ore, float exp)
    {

        if (ore != null)
        {
           GameRegistry.addSmelting(ore, new ItemStack(item), exp);
        }

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
	
	public static void toolsCraft (Item item , Item pickaxe, Item axe, Item spade, Item hoe, Item sword)
	{
		
		pickaxeCraft(item, pickaxe);
		axeCraft(item, axe);
		spadeCraft(item, spade);
		hoeCraft(item, hoe);
		swordCraft(item, sword);
	
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

}
