package fr.zeiyo.zeiyocraft.event;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.LockCode;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.util.Random;

public class ZKeyEvent
{
	protected static Random keyRand = new Random();
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event)
    {
       
            World world = event.getWorld();
            BlockPos pos = event.getPos();

            if(world.isRemote)
                return;

            TileEntity tileEntity = world.getTileEntity(pos);
            if(tileEntity instanceof TileEntityLockable)
            {
                TileEntityLockable tileEntityLockable = (TileEntityLockable) tileEntity;

                EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();

                ItemStack current = player.getHeldItemMainhand();
                if(tileEntityLockable.isLocked())
                {
                    if(current != null && current.getItem() == ZeiyoItems.key)
                    {
                        if(!tileEntityLockable.getLockCode().getLock().equals(current.getDisplayName()))
                        {
                            world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
                        	player.addChatComponentMessage(new TextComponentTranslation("text.key.errorOnKey", new Object[0]), true);
                        	event.setCanceled(true);
                        }
                    }
                    else
                    {
                        world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
                    	player.addChatComponentMessage(new TextComponentTranslation("text.key.errorOnBlock", new Object[0]), true);
                        event.setCanceled(true);
                    }
                }
                else
                {
                    if(current != null && current.getItem() == ZeiyoItems.key)
                    {
                        if(!current.getDisplayName().equals(I18n.translateToLocal(current.getItem().getUnlocalizedName() +".name")))
                        {
                            tileEntityLockable.setLockCode(new LockCode(current.getDisplayName()));
                            world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
                            player.addChatComponentMessage(new TextComponentTranslation("text.key.successOnLock", new Object[0]), true);

                        }
                        else
                        {
                        	
                            player.addChatComponentMessage(new TextComponentTranslation("text.key.errorOnKeyName", new Object[0]), true);
                        }
                        event.setCanceled(true);
                    }
                }
            }
        
    }

    @SubscribeEvent
    public void onBreakBlock(BreakEvent event)
    {
        if(event.getWorld().isRemote)
            return;

        EntityPlayerMP player = (EntityPlayerMP) event.getPlayer();

        TileEntity tileEntity = event.getWorld().getTileEntity(event.getPos());
        if(tileEntity instanceof TileEntityLockable)
        {
            TileEntityLockable tileEntityLockable = (TileEntityLockable) tileEntity;
            if(tileEntityLockable.isLocked())
            {
                if(!hasRequiredKey(event.getPlayer(), tileEntityLockable))
                {
                    player.addChatComponentMessage(new TextComponentTranslation("text.key.errorOnDestroyBlock", new Object[0]), true);

                	event.setCanceled(true);
                }
            }
        }
    }

    public boolean hasRequiredKey(EntityPlayer player, TileEntityLockable tileEntityLockable)
    {
        for(ItemStack stack : player.inventory.mainInventory)
        {
            if(stack != null && stack.getItem() == ZeiyoItems.key)
            {
                if(tileEntityLockable.getLockCode().getLock().equals(stack.getDisplayName()))
                {
                    return true;
                }
            }

        }
        return false;
    }

}
