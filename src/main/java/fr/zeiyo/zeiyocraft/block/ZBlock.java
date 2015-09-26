package fr.zeiyo.zeiyocraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZBlock extends Block

{

    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, Block.SoundType soundType, int harvestLevel) 
    {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setStepSound(soundType);
        this.setHarvestLevel("pickaxe", harvestLevel);
    }
    
    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, Block.SoundType soundType) 
    {
        this(unlocalizedName, material, hardness, resistance, soundType, 1);
    }

    public ZBlock(String unlocalizedName, float hardness, float resistance) 
    {
        this(unlocalizedName, Material.rock, hardness, resistance, null);
    }

    public ZBlock(String unlocalizedName) 
    {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}
