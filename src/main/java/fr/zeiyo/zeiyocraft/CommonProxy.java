package fr.zeiyo.zeiyocraft;

import fr.zeiyo.zeiyocraft.achievement.ZAchievement;
import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import fr.zeiyo.zeiyocraft.crafting.ZeiyoCrafting;
import fr.zeiyo.zeiyocraft.entity.ZEntitySittable;
import fr.zeiyo.zeiyocraft.event.ZKeyEvent;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import fr.zeiyo.zeiyocraft.world.ZeiyoWorldGen;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

        if(ZeiyoConfig.areNewOresEnabled)ZeiyoItems.loots();
        ZeiyoBlocks.initBlocks();
        ZeiyoItems.initItems();
        ZeiyoBlocks.registerBlocks();
        ZeiyoItems.registerItems();
       //ZAchievement.initAchievement();
       //ZAchievement.registerAchievements();

    }

    public void init(FMLInitializationEvent e) {

        GameRegistry.registerWorldGenerator(new ZeiyoWorldGen(), 0);
        ZeiyoCrafting.createCrafts();
        MinecraftForge.addGrassSeed(new ItemStack(ZeiyoItems.grapeSeeds), 2);
        MinecraftForge.addGrassSeed(new ItemStack(ZeiyoItems.hempSeeds), 1);
        if(ZeiyoConfig.isKeyEnabled)MinecraftForge.EVENT_BUS.register(new ZKeyEvent());
        EntityRegistry.registerModEntity(new ResourceLocation(ZeiyoMain.MODID + ":" + "chair") , ZEntitySittable.class, "Chair", 4200, ZeiyoMain.instance, 80, 1, false);

        //MinecraftForge.addGrassSeed(new ItemStack(ZeiyoItems.barleySeeds), 5);
        //ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ZeiyoItems.grapeSeeds), 3, 9, 55));
        //ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ZeiyoItems.grapeSeeds), 3, 9, 55));

    }

    public void postInit(FMLPostInitializationEvent e) {
    }

}