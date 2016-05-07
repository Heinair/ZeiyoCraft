package fr.zeiyo.zeiyocraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ZEntitySittable extends Entity
{
    public int blockPosX;
    public int blockPosY;
    public int blockPosZ;

    public ZEntitySittable(World world)
    {
        super(world);
        this.field_70145_X = true;
        this.field_70131_O = 0.01F;
        this.field_70130_N = 0.01F;
    }

    public ZEntitySittable(World world, double x, double y, double z, double y0ffset)
    {
        this(world);
        this.blockPosX = (int) x;
        this.blockPosY = (int) y;
        this.blockPosZ = (int) z;
        func_70107_b(x + 0.5D, y + y0ffset, z + 0.5D);
    }

    public ZEntitySittable(World world, double x, double y, double z, double y0ffset, int rotation, double rotationOffset)
    {
        this(world);
        this.blockPosX = (int) x;
        this.blockPosY = (int) y;
        this.blockPosZ = (int) z;
        setPostionConsideringRotation(x + 0.5D, y + y0ffset, z + 0.5D, rotation, rotationOffset);
    }

    public void setPostionConsideringRotation(double x, double y, double z, int rotation, double rotationOffset)
    {
        switch (rotation)
        {
            case 2:
                z += rotationOffset;
                break;
            case 0:
                z -= rotationOffset;
                break;
            case 3:
                x -= rotationOffset;
                break;
            case 1:
                x += rotationOffset;
                break;
        }
        func_70107_b(x, y, z);
    }

    @Override
    public double func_70042_X()
    {
        return this.field_70131_O * 0.0D;
    }

    @Override
    protected boolean func_142008_O()
    {
        return false;
    }

    @Override
    public void func_70030_z()
    {
        if (!this.field_70170_p.field_72995_K)
        {
            if (this.func_184207_aI() == false | this.field_70170_p.func_175623_d(new BlockPos(blockPosX, blockPosY, blockPosZ)))
            {
                this.func_70106_y();
                field_70170_p.func_175666_e(func_180425_c(), field_70170_p.func_180495_p(func_180425_c()).func_177230_c());
            }
        }
    }

    @Override
    protected void func_70088_a()
    {
    }

    @Override
    public void func_70037_a(NBTTagCompound nbttagcompound)
    {
    }

    @Override
    public void func_70014_b(NBTTagCompound nbttagcompound)
    {
    }

}