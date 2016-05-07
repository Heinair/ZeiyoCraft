package fr.zeiyo.zeiyocraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ZBlock extends Block

{

    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType soundType, int harvestLevel) 
    {
        super(material);
        this.func_149663_c(unlocalizedName);
        this.func_149647_a(CreativeTabs.field_78030_b);
        this.func_149711_c(hardness);
        this.func_149752_b(resistance);
        this.func_149672_a(soundType);
        this.setHarvestLevel("pickaxe", harvestLevel);
    }
    
    public ZBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType soundType) 
    {
        this(unlocalizedName, material, hardness, resistance, soundType, 1);
    }

    public ZBlock(String unlocalizedName, float hardness, float resistance) 
    {
        this(unlocalizedName, Material.field_151576_e, hardness, resistance, null);
    }

    public ZBlock(String unlocalizedName) 
    {
        this(unlocalizedName, 2.0f, 10.0f);
    }

}
