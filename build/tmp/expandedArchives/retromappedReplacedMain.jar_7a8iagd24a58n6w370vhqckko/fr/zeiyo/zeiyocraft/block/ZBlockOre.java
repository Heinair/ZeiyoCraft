package fr.zeiyo.zeiyocraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
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
        this.func_149663_c(unlocalizedName);
        this.drop = drop;
        this.meta = meta;
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.func_149647_a(CreativeTabs.field_78030_b);
        this.drop = drop;
        this.minDropped = quantity[0];
        this.maxDropped = quantity[1];
        this.func_149711_c(5.0F);
        this.func_149752_b(3.0F);
        this.func_149672_a(SoundType.field_185851_d);
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
	public Item func_180660_a(IBlockState blockstate, Random random, int fortune) 
	{
	    return this.drop;
	}

	@Override
	public int func_180651_a(IBlockState blockstate) 
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
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).field_73012_v : new Random();
        if (this.func_180660_a(state, rand, fortune) != Item.func_150898_a(this))
        {
            int i = 0;

            if (this == ZeiyoBlocks.rubyOre)
			{
				i = MathHelper.func_76136_a(rand, 3, 7);
			}
			else if (this == ZeiyoBlocks.sapphireOre)
			{
				i = MathHelper.func_76136_a(rand, 3, 7);
			}
			else if (this == ZeiyoBlocks.onyxOre)
			{
				i = MathHelper.func_76136_a(rand, 3, 7);
			}

            return i;
        }
        return 0;
    }

}