package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ZBlockCake extends BlockCake
{

    public int foodPoints;
    public float saturationPoints;
    public PotionEffect potionEffect;

    public ZBlockCake(String unlocalizedName, int food, float saturation, PotionEffect effect) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(ZeiyoMain.MODID + ":" + unlocalizedName);
        this.setHardness(0.5F);
        this.setSoundType(SoundType.CLOTH);
        this.disableStats();
        this.foodPoints = food;
        this.saturationPoints = saturation;
        this.potionEffect = effect;

    }
    public  ZBlockCake(String unlocalizedName, int food, float saturation) {
        this(unlocalizedName, food, saturation, null);
    }

    private void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
        if (player.canEat(false)) {
            player.getFoodStats().addStats(foodPoints, saturationPoints);

            if(potionEffect!=null)
            {
                player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 350, 1, false, false));
                player.addPotionEffect(potionEffect);
            }
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