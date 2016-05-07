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

            if(world.field_72995_K)
                return;

            TileEntity tileEntity = world.func_175625_s(pos);
            if(tileEntity instanceof TileEntityLockable)
            {
                TileEntityLockable tileEntityLockable = (TileEntityLockable) tileEntity;

                EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();

                ItemStack current = player.func_184614_ca();
                if(tileEntityLockable.func_174893_q_())
                {
                    if(current != null && current.func_77973_b() == ZeiyoItems.key)
                    {
                        if(!tileEntityLockable.func_174891_i().func_180159_b().equals(current.func_82833_r()))
                        {
                        	//world.playSound(player, pos, SoundEvents.item_flintandsteel_use, SoundCategory.BLOCKS, 1.0F, 1.0F);
                            player.field_71135_a.func_147359_a(new SPacketChat(new TextComponentTranslation("text.key.errorOnKey"), (byte)2));
                            event.setCanceled(true);
                        }
                    }
                    else
                    {
                    	//world.playSound(player, pos, SoundEvents.ui_button_click, SoundCategory.BLOCKS, 1.0F, 1.0F); // random.wood.click
                        player.field_71135_a.func_147359_a(new SPacketChat(new TextComponentTranslation("text.key.errorOnBlock"), (byte)2));

                        event.setCanceled(true);
                    }
                }
                else
                {
                    if(current != null && current.func_77973_b() == ZeiyoItems.key)
                    {
                        if(!current.func_82833_r().equals(I18n.func_74838_a(current.func_77973_b().func_77658_a() +".name")))
                        {
                            tileEntityLockable.func_174892_a(new LockCode(current.func_82833_r()));
                            //world.playSound(player, pos, SoundEvents.ui_button_click, SoundCategory.BLOCKS, 1.0F, 1.0F);
                            player.field_71135_a.func_147359_a(new SPacketChat((new TextComponentTranslation("text.key.successOnLock")), (byte)2));

                        }
                        else
                        {
                            player.field_71135_a.func_147359_a(new SPacketChat((new TextComponentTranslation("text.key.errorOnKeyName")), (byte)2));
                        }
                        event.setCanceled(true);
                    }
                }
            }
        
    }

    @SubscribeEvent
    public void onBreakBlock(BreakEvent event)
    {
        if(event.getWorld().field_72995_K)
            return;

        EntityPlayerMP player = (EntityPlayerMP) event.getPlayer();

        TileEntity tileEntity = event.getWorld().func_175625_s(event.getPos());
        if(tileEntity instanceof TileEntityLockable)
        {
            TileEntityLockable tileEntityLockable = (TileEntityLockable) tileEntity;
            if(tileEntityLockable.func_174893_q_())
            {
                if(!hasRequiredKey(event.getPlayer(), tileEntityLockable))
                {
                    player.field_71135_a.func_147359_a(new SPacketChat((new TextComponentTranslation("text.key.errorOnDestroyBlock")), (byte)2));
                    event.setCanceled(true);
                }
            }
        }
    }

    public boolean hasRequiredKey(EntityPlayer player, TileEntityLockable tileEntityLockable)
    {
        for(ItemStack stack : player.field_71071_by.field_70462_a)
        {
            if(stack != null && stack.func_77973_b() == ZeiyoItems.key)
            {
                if(tileEntityLockable.func_174891_i().func_180159_b().equals(stack.func_82833_r()))
                {
                    return true;
                }
            }

        }
        return false;
    }

}