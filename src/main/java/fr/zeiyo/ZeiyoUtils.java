package fr.zeiyo;

import fr.zeiyo.item.ZItemArmor;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	
	public static void materialCraft(Item material, Block materialBlock)
	{
		
		GameRegistry.addRecipe(new ItemStack(materialBlock), new Object[] {"###","###", "###", '#', material});
		GameRegistry.addShapelessRecipe(new ItemStack(material, 9), new Object[] {materialBlock});
				
	}
	
	public static void armorCraft(Item craftingItem, Item armorHelmet, Item armorChestplate, Item armorLeggings, Item armorBoots)
	{
		
		GameRegistry.addRecipe(new ItemStack(armorHelmet), new Object[] {"###", "# #", '#', craftingItem});
		GameRegistry.addRecipe(new ItemStack(armorChestplate), new Object[] {"# #", "###", "###", '#', craftingItem});
		GameRegistry.addRecipe(new ItemStack(armorLeggings), new Object[] {"###", "# #", "# #", '#', craftingItem});
		GameRegistry.addRecipe(new ItemStack(armorBoots), new Object[] {"# #", "# #", '#', craftingItem});

	}
	
	public static void toolsCraft (Item craftingItem , Item pickaxe, Item axe, Item spade, Item hoe, Item sword)
	{
		
		pickaxeCraft(craftingItem, pickaxe);
		axeCraft(craftingItem, axe);
		spadeCraft(craftingItem, spade);
		hoeCraft(craftingItem, hoe);
		swordCraft(craftingItem, sword);
	
	}
	
	public static void pickaxeCraft(Item craftingItem, Item pickaxe)
	{	
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"###", " P ", " P ",'P', Items.stick, '#', craftingItem});		
	}
	
	public static void axeCraft(Item craftingItem, Item axe)
	{		
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"## ", "#P ", " P ",'P', Items.stick, '#', craftingItem});		
	}
	
	public static void spadeCraft(Item craftingItem, Item spade)
	{		
		GameRegistry.addRecipe(new ItemStack(spade), new Object[] {" # ", " P ", " P ",'P', Items.stick, '#', craftingItem});		
	}
	
	public static void hoeCraft(Item craftingItem, Item hoe)
	{	
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"## ", " P ", " P ",'P', Items.stick, '#', craftingItem});		
	}
	
	public static void swordCraft(Item craftingItem, Item sword)
	{	
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" # ", " # ", " P ",'P', Items.stick, '#', craftingItem});		
	}
	
    public static ItemStack getRepairItemStack(ItemStack repairMaterial, Item zRepairMaterial )
    {
        if (repairMaterial != null) return repairMaterial;
        Item ret = zRepairMaterial;
        if (ret == null) return null;
        repairMaterial = new ItemStack(ret, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
        return repairMaterial;
    }
    

	
}
