package fr.zeiyo.zeiyocraft.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import fr.zeiyo.zeiyocraft.crafting.ZCraftingUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class ZItemWarAxe extends ItemAxe
{

    private float attackDamage;
    public int id;

    public ZItemWarAxe(String unlocalizedName, ToolMaterial tool, int nmb)
    {
        super(tool);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.attackDamage = 4.0F + tool.getDamageVsEntity();
        this.isRepairable();
        this.id = nmb;
    }

    public ZItemWarAxe(String unlocalizedName, ToolMaterial tool)
    {
        this(unlocalizedName, tool, 404);

    }


    @Override
    public Set<String> getToolClasses(ItemStack stack)
    {
        return ImmutableSet.of("axe", "sword");
    }


    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return ZCraftingUtils.getRepairItem(id) == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

    @Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.attackDamage, 0));
        return multimap;
    }

}
