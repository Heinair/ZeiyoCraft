package fr.zeiyo.block;

import fr.zeiyo.item.ZeiyoItems;
import net.minecraft.block.BlockCake;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZBlockCake extends BlockCake

{
	
	public ZBlockCake(String unlocalizedName) 
    {
        
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(0.5F);
		this.setStepSound(soundTypeCloth);
		this.disableStats();
		
	}
			
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos)
	{
	        return ZeiyoItems.chocolateCake;
	}
	


}
