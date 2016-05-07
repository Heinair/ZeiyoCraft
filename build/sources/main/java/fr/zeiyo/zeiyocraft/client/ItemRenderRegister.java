package fr.zeiyo.zeiyocraft.client;

import fr.zeiyo.zeiyocraft.ZeiyoMain;
import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister

{

	public static void reg(Item item)
	{
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ZeiyoMain.MODID+ ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void registerItemRenderer()
	{

		// Food-related Items

		reg(ZeiyoItems.chocolateCake);
		reg(ZeiyoItems.hardboiledEgg);
		reg(ZeiyoItems.applePie);
        reg(ZeiyoItems.vegetableStew);
		reg(ZeiyoItems.puriFlesh);
        reg(ZeiyoItems.malt);
		reg(ZeiyoItems.barley);
		reg(ZeiyoItems.barleySeeds);
        reg(ZeiyoItems.grape);
		reg(ZeiyoItems.grapeSeeds);
        reg(ZeiyoItems.tankard);
        reg(ZeiyoItems.beerTankard);
        reg(ZeiyoItems.wineTankard);
        reg(ZeiyoItems.ciderTankard);

        // Miscellaneous

        reg(ZeiyoItems.copperCoin);
        reg(ZeiyoItems.silverCoin);
        reg(ZeiyoItems.goldCoin);
		reg(ZeiyoItems.key);

		// Vanilla

		reg(ZeiyoItems.woodenWarAxe);
		reg(ZeiyoItems.stoneWarAxe);
		reg(ZeiyoItems.goldWarAxe);
		reg(ZeiyoItems.ironWarAxe);
		reg(ZeiyoItems.diamondWarAxe);

		// Steel

		reg(ZeiyoItems.steelIngot);
		reg(ZeiyoItems.steelPickaxe);
		reg(ZeiyoItems.steelAxe);
		reg(ZeiyoItems.steelSpade);
		reg(ZeiyoItems.steelHoe);
		reg(ZeiyoItems.steelSword);
        reg(ZeiyoItems.steelWarAxe);
        reg(ZeiyoItems.steelHelmet);
		reg(ZeiyoItems.steelChestplate);
		reg(ZeiyoItems.steelLeggings);
		reg(ZeiyoItems.steelBoots);

		// Bronze-related Items

		reg(ZeiyoItems.tinIngot);
		reg(ZeiyoItems.copperIngot);
		reg(ZeiyoItems.bronzeIngot);
		reg(ZeiyoItems.bronzePickaxe);
		reg(ZeiyoItems.bronzeAxe);
		reg(ZeiyoItems.bronzeSpade);
		reg(ZeiyoItems.bronzeHoe);
		reg(ZeiyoItems.bronzeSword);
        reg(ZeiyoItems.bronzeWarAxe);
        reg(ZeiyoItems.bronzeHelmet);
		reg(ZeiyoItems.bronzeChestplate);
		reg(ZeiyoItems.bronzeLeggings);
		reg(ZeiyoItems.bronzeBoots);

		// Electrum-related Items

		reg(ZeiyoItems.silverIngot);
		reg(ZeiyoItems.electrumIngot);
        reg(ZeiyoItems.electrumPickaxe);
        reg(ZeiyoItems.electrumAxe);
        reg(ZeiyoItems.electrumSpade);
        reg(ZeiyoItems.electrumHoe);
        reg(ZeiyoItems.electrumSword);
        reg(ZeiyoItems.electrumWarAxe);
        reg(ZeiyoItems.electrumHelmet);
        reg(ZeiyoItems.electrumChestplate);
        reg(ZeiyoItems.electrumLeggings);
        reg(ZeiyoItems.electrumBoots);

        // Onyx

		reg(ZeiyoItems.onyx);
		reg(ZeiyoItems.onyxPickaxe);
		reg(ZeiyoItems.onyxAxe);
		reg(ZeiyoItems.onyxSpade);
		reg(ZeiyoItems.onyxHoe);
		reg(ZeiyoItems.onyxSword);
        reg(ZeiyoItems.onyxWarAxe);
        reg(ZeiyoItems.onyxHelmet);
		reg(ZeiyoItems.onyxChestplate);
		reg(ZeiyoItems.onyxLeggings);
		reg(ZeiyoItems.onyxBoots);

        // Ruby

		reg(ZeiyoItems.ruby);
		reg(ZeiyoItems.rubyPickaxe);
		reg(ZeiyoItems.rubyAxe);
		reg(ZeiyoItems.rubySpade);
		reg(ZeiyoItems.rubyHoe);
		reg(ZeiyoItems.rubySword);
        reg(ZeiyoItems.rubyWarAxe);
        reg(ZeiyoItems.rubyHelmet);
		reg(ZeiyoItems.rubyChestplate);
		reg(ZeiyoItems.rubyLeggings);
		reg(ZeiyoItems.rubyBoots);

        // Sapphire

		reg(ZeiyoItems.sapphire);
		reg(ZeiyoItems.sapphirePickaxe);
		reg(ZeiyoItems.sapphireAxe);
		reg(ZeiyoItems.sapphireSpade);
		reg(ZeiyoItems.sapphireHoe);
		reg(ZeiyoItems.sapphireSword);
        reg(ZeiyoItems.sapphireWarAxe);
        reg(ZeiyoItems.sapphireHelmet);
		reg(ZeiyoItems.sapphireChestplate);
		reg(ZeiyoItems.sapphireLeggings);
		reg(ZeiyoItems.sapphireBoots);

	}

}