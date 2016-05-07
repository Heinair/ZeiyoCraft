package fr.zeiyo.zeiyocraft.block;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZBlockCake extends BlockCake

{

	public int foodPoints;
    public float saturationPoints;

	public ZBlockCake(String unlocalizedName, int food, float saturation)
    {
        super();
		this.func_149663_c(unlocalizedName);
		this.func_149711_c(0.5F);
		this.func_149672_a(SoundType.field_185854_g);
		this.func_149649_H();
        this.foodPoints = food;
        this.saturationPoints = saturation;
		
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		this.eatCake(worldIn, pos, state, playerIn);
		return true;
	}

	private void eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		if (player.func_71043_e(false))
		{
			player.func_71024_bL().func_75122_a(foodPoints, saturationPoints);
            int i = ((Integer)state.func_177229_b(field_176589_a)).intValue();

			if (i < 6)
			{
				worldIn.func_180501_a(pos, state.func_177226_a(field_176589_a, Integer.valueOf(i + 1)), 3);
			}
			else
			{
				worldIn.func_175698_g(pos);
			}
		}
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos)
	{
	        return ZeiyoItems.chocolateCake;
	}

}