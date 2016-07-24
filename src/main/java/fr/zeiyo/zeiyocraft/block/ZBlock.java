package fr.zeiyo.zeiyocraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZBlock extends Block

{
	
	public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType soundType,String tool ,int harvestLevel) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(soundType);
        this.setHarvestLevel(tool, harvestLevel);
        this.setRegistryName(unlocalizedName);
    }

    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType soundType, int harvestLevel) {
        this(unlocalizedName, material, hardness, resistance, soundType, "pickaxe", harvestLevel);
    }

    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType soundType) {
        this(unlocalizedName, material, hardness, resistance, soundType, 1);
    }

    public ZBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, hardness, resistance, null);
    }

    public ZBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

}
