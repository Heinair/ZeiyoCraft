package fr.zeiyo.zeiyocraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ZBlockOre extends Block
{
	
	private Item drop;
	private int meta;
	private int minDropped;
	private int maxDropped;

	public ZBlockOre(String unlocalizedName, Material blockMaterial,int harvestLevel, Item drop, int meta, int[] quantity)
	{
        super(blockMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.drop = drop;
        this.meta = meta;
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.drop = drop;
        this.minDropped = quantity[0];
        this.maxDropped = quantity[1];
        this.setHardness(5.0F);
        this.setResistance(3.0F);
        this.setStepSound(soundTypePiston);
    }


	public ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item drop, int[] quantity)
	{
        
		this(unlocalizedName, blockMaterial, harvestLevel, drop, 0, quantity);

    }

	public ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item dropped)
	{
        this(unlocalizedName, blockMaterial, harvestLevel, dropped, new int[]{1,1});

    }

	public ZBlockOre(String unlocalizedName, Material blockMaterial)
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
	    if (this.minDropped >= this.maxDropped)
	        return this.minDropped;
	    return this.minDropped + random.nextInt(this.maxDropped - this.minDropped + fortune + 1);
	}

	@Override
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
	{

		IBlockState state = world.getBlockState(pos);
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
		{
			int j = 0;

            if (this == ZeiyoBlocks.rubyOre)
			{
				j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			}
			else if (this == ZeiyoBlocks.sapphireOre)
			{
				j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			}
			else if (this == ZeiyoBlocks.onyxOre)
			{
				j = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			}

			return j;
		}
		return 0;
	}

}