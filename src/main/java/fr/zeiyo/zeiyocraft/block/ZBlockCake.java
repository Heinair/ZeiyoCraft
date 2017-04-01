package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ZBlockCake extends BlockCake
{

    public int foodPoints;
    public float saturationPoints;

    public ZBlockCake(String unlocalizedName, int food, float saturation) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.setHardness(0.5F);
        this.setSoundType(SoundType.CLOTH);
        this.disableStats();
        this.foodPoints = food;
        this.saturationPoints = saturation;

    }

    private void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
        if (player.canEat(false)) {
            player.getFoodStats().addStats(foodPoints, saturationPoints);
            int i = ((Integer) state.getValue(BITES)).intValue();

            if (i < 6) {
                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
            } else {
                worldIn.setBlockToAir(pos);
            }
        }
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(ZeiyoItems.chocolateCake);
    }

}