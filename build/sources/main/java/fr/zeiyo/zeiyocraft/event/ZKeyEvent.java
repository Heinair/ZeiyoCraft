package fr.zeiyo.zeiyocraft.event;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.*;
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
                        	//world.playSound(player, pos, SoundEvents.item_flintandsteel_use, SoundCategory.BLOCKS, 1.0F, 1.0F);
                            player.playerNetServerHandler.sendPacket(new SPacketChat(new TextComponentTranslation("text.key.errorOnKey"), (byte)2));
                            event.setCanceled(true);
                        }
                    }
                    else
                    {
                    	//world.playSound(player, pos, SoundEvents.ui_button_click, SoundCategory.BLOCKS, 1.0F, 1.0F); // random.wood.click
                        player.playerNetServerHandler.sendPacket(new SPacketChat(new TextComponentTranslation("text.key.errorOnBlock"), (byte)2));

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
                            //world.playSound(player, pos, SoundEvents.ui_button_click, SoundCategory.BLOCKS, 1.0F, 1.0F);
                            player.playerNetServerHandler.sendPacket(new SPacketChat((new TextComponentTranslation("text.key.successOnLock")), (byte)2));

                        }
                        else
                        {
                            player.playerNetServerHandler.sendPacket(new SPacketChat((new TextComponentTranslation("text.key.errorOnKeyName")), (byte)2));
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
                    player.playerNetServerHandler.sendPacket(new SPacketChat((new TextComponentTranslation("text.key.errorOnDestroyBlock")), (byte)2));
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