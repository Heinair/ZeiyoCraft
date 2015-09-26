package fr.zeiyo.zeiyocraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ZBlockOre extends Block
{
	
	private Item drop;
	private int meta;
	private int minDropeed;
	private int maxDropped;
	
	protected ZBlockOre(String unlocalizedName, Material blockMaterial,int harvestLevel, Item drop, int meta, int[] quantity) 
	{
        super(blockMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.drop = drop;
        this.meta = meta;
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.drop = drop;
        this.minDropeed = quantity[0];
        this.maxDropped = quantity[1];
        this.setHardness(5.0F);
        this.setResistance(3.0F);
        this.setStepSound(soundTypePiston);
    }
	
	
	protected ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item drop, int[] quantity) 
	{
        
		this(unlocalizedName, blockMaterial, harvestLevel, drop, 0, quantity);
        
  
    }
	
	protected ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item dropped) 
	{
        this(unlocalizedName, blockMaterial, harvestLevel, dropped, new int[]{1,1});

    }
	
	protected ZBlockOre(String unlocalizedName, Material blockMaterial) 
	{
        this(unlocalizedName, blockMaterial, 1 , null);

    }
	
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) 
	{
	    return this.drop;
	}

	@Override
	public int damageDropped(IBlockState blockstate) 
	{
	    return this.meta;
	}
	
	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) 
	{
	    if (this.minDropeed >= this.maxDropped)
	        return this.minDropeed;
	    return this.minDropeed + random.nextInt(this.maxDropped - this.minDropeed + fortune + 1);
	}

}
