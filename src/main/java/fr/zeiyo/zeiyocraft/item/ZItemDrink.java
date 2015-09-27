package fr.zeiyo.zeiyocraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ZItemDrink extends ItemFood
{

    public ZItemDrink(String unlocalizedName, int healAmount)
    {
        super(healAmount, false);
        this.setUnlocalizedName(unlocalizedName);
        this.setMaxStackSize(1);
    }


    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        super.onItemUseFinish(stack, worldIn, playerIn);
        worldIn.playSoundAtEntity(playerIn, "random.drink", 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
        return new ItemStack(ZeiyoItems.tankard);
    }


}
