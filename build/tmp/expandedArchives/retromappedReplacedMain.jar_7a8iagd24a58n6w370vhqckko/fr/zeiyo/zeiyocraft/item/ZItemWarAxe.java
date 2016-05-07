package fr.zeiyo.zeiyocraft.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Set;

import net.minecraft.item.Item.ToolMaterial;
public class ZItemWarAxe extends ItemTool
{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap});
    public int id;

    
    public ZItemWarAxe(String unlocalizedName, ToolMaterial material, int nmb)
    {
        super(material, EFFECTIVE_ON);
        this.func_77655_b(unlocalizedName);
        this.func_77637_a(CreativeTabs.field_78037_j);
        this.isRepairable();
        this.field_77865_bY = 6.0F + material.func_78000_c();
        this.field_185065_c = - 2.9F;
        this.id = nmb;
    }

    public ZItemWarAxe(String unlocalizedName, ToolMaterial material)
    {
        this(unlocalizedName, material, -1);
    }

    /*
    @Override
    public Set<String> getToolClasses(ItemStack stack)
    {
        return ImmutableSet.of("axe", "sword");
    }
	*/

    @Override
    public boolean func_77644_a(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.func_77972_a(1, attacker);
        return true;
    }

    @Override
    public boolean func_82789_a(ItemStack toRepair, ItemStack repair)
    {
        return ZCraftingUtils.getRepairItem(id) == repair.func_77973_b() ? true : super.func_82789_a(toRepair, repair);
    }

    public float func_150893_a(ItemStack stack, IBlockState state)
    {
        return state.func_185904_a() != Material.field_151575_d &&  state.func_185904_a() != Material.field_151585_k &&  state.func_185904_a() != Material.field_151582_l ? super.func_150893_a(stack, state) : this.field_77864_a;
    }

}
