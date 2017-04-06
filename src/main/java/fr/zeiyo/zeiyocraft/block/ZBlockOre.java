package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class ZBlockOre extends BlockOre {

    private Item drop;


    public ZBlockOre(String unlocalizedName, int harvestLevel, Item drop, String tool) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.drop = drop;
        this.setHarvestLevel(tool, harvestLevel);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.STONE);
    }

    public ZBlockOre(String unlocalizedName, int harvestLevel, Item dropped) {
        this(unlocalizedName, harvestLevel, dropped, "pickaxe");

    }

    public ZBlockOre(String unlocalizedName) {
        this(unlocalizedName, 1, null);

    }

    @Override
    public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
        return this.drop;
    }

    /*
    @Override
    public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
        return this.minDropped + random.nextInt(this.maxDropped - this.minDropped + fortune + 1);
    }
*/
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
            int i = 0;

            if (this == ZeiyoBlocks.rubyOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            } else if (this == ZeiyoBlocks.sapphireOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            } else if (this == ZeiyoBlocks.onyxOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            }
              else if (this == ZeiyoBlocks.amethystOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            }
              else if (this == ZeiyoBlocks.nacreOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            }
              else if (this == ZeiyoBlocks.jadeOre) {
                i = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            }

            return i;
        }
        return 0;
    }

}