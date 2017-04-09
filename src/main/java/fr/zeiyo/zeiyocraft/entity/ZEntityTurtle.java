package fr.zeiyo.zeiyocraft.entity;

import fr.zeiyo.zeiyocraft.item.ZeiyoItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

import javax.annotation.Nullable;

public class ZEntityTurtle extends EntityAnimal
{


    public ZEntityTurtle(World world) {
        super(world);
        setSize(0.6F, 0.3F);
        preventEntitySpawning = true;
    }


    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
        this.tasks.addTask(2, new EntityAITempt(this, 1.0D, ZeiyoItems.tomato, false));
        this.tasks.addTask(3, new EntityAIFollowParent(this, 1.1D));

    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable)
    {
        return new ZEntityTurtle(worldObj);
    }

    public float getEyeHeight()
    {
        return this.isChild() ? this.height : 0.1F;
    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
    }

    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_COW_AMBIENT;
    }

    protected SoundEvent getHurtSound()
    {
        return SoundEvents.ENTITY_COW_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_COW_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_SHULKER;
    }
}
