package fr.zeiyo.zeiyocraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class ZEntitySittable extends Entity {
    public int blockPosX;
    public int blockPosY;
    public int blockPosZ;

    public ZEntitySittable(World world) {
        super(world);
        this.noClip = true;
        this.height = 0.01F;
        this.width = 0.01F;
    }

    public ZEntitySittable(World world, double x, double y, double z, double y0ffset) {
        this(world);
        this.blockPosX = (int) x;
        this.blockPosY = (int) y;
        this.blockPosZ = (int) z;
        setPosition(x + 0.5D, y + y0ffset, z + 0.5D);
    }

    public ZEntitySittable(World world, double x, double y, double z, double y0ffset, int rotation, double rotationOffset) {
        this(world);
        this.blockPosX = (int) x;
        this.blockPosY = (int) y;
        this.blockPosZ = (int) z;
        setPostionConsideringRotation(x + 0.5D, y + y0ffset, z + 0.5D, rotation, rotationOffset);
    }

    public void setPostionConsideringRotation(double x, double y, double z, int rotation, double rotationOffset) {
        switch (rotation) {
            case 3:
                x -= rotationOffset;
                break;
            case 2:
                z += rotationOffset;
                break;
            case 1:
                x += rotationOffset;
                break;
            case 0:
                z -= rotationOffset;
                break;
        }
        setPosition(x, y, z);
    }

    @Override
    public double getMountedYOffset() {
        return this.height * 0.0D;
    }

    @Override
    protected boolean shouldSetPosAfterLoading() {
        return false;
    }

    @Override
    public void onEntityUpdate() {
        if (!this.world.isRemote) {
            if (this.isBeingRidden() == false | this.world.isAirBlock(new BlockPos(blockPosX, blockPosY, blockPosZ))) {
                this.setDead();
                world.updateComparatorOutputLevel(getPosition(), world.getBlockState(getPosition()).getBlock());
            }
        }
    }

    @Override
    protected void entityInit() {
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
    }

}