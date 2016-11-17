package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class ZBlockOre extends Block {

    private Item drop;
    private int meta;
    private int minDropped;
    private int maxDropped;

    public ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item drop, int meta, int[] quantity) {
        super(blockMaterial);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.drop = drop;
        this.meta = meta;
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.drop = drop;
        this.minDropped = quantity[0];
        this.maxDropped = quantity[1];
        this.setHardness(5.0F);
        this.setResistance(3.0F);
        this.setSoundType(SoundType.STONE);
    }


    public ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item drop, int[] quantity) {

        this(unlocalizedName, blockMaterial, harvestLevel, drop, 0, quantity);

    }

    public ZBlockOre(String unlocalizedName, Material blockMaterial, int harvestLevel, Item dropped) {
        this(unlocalizedName, blockMaterial, harvestLevel, dropped, new int[]{1, 1});

    }

    public ZBlockOre(String unlocalizedName, Material blockMaterial) {
        this(unlocalizedName, blockMaterial, 1, null);

    }

    @Override
    public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
        return this.drop;
    }

    @Override
    public int damageDropped(IBlockState blockstate) {
        return this.meta;
    }

    @Override
    public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
        if (this.minDropped >= this.maxDropped)
            return this.minDropped;
        return this.minDropped + random.nextInt(this.maxDropped - this.minDropped + fortune + 1);
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;

            if (this == ZeiyoBlocks.rubyOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            } else if (this == ZeiyoBlocks.sapphireOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            } else if (this == ZeiyoBlocks.onyxOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
              else if (this == ZeiyoBlocks.amethystOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
              else if (this == ZeiyoBlocks.nacreOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
              else if (this == ZeiyoBlocks.jadeOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }

            return i;
        }
        return 0;
    }

}