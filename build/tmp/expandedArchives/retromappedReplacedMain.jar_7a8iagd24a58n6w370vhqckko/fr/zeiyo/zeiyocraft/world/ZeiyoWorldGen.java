package fr.zeiyo.zeiyocraft.world;

import java.util.Random;

import com.google.common.base.Predicate;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ZeiyoWorldGen implements IWorldGenerator 
{
	
	private WorldGenerator gen_ruby;
	private WorldGenerator gen_sapphire;
	private WorldGenerator gen_copper;
	private WorldGenerator gen_tin;
	private WorldGenerator gen_silver;
    private WorldGenerator gen_onyx;

    public ZeiyoWorldGen()
	{
	    this.gen_ruby = new WorldGenMinable(ZeiyoBlocks.rubyOre.func_176223_P(), 5);
	    this.gen_sapphire = new WorldGenMinable(ZeiyoBlocks.sapphireOre.func_176223_P(), 5);
	    this.gen_copper = new WorldGenMinable(ZeiyoBlocks.copperOre.func_176223_P(), 9);
	    this.gen_tin = new WorldGenMinable(ZeiyoBlocks.tinOre.func_176223_P(), 9);
	    this.gen_silver = new WorldGenMinable(ZeiyoBlocks.silverOre.func_176223_P(), 8);
        this.gen_onyx = new WorldGenMinable(ZeiyoBlocks.onyxOre.func_176223_P(), 6, BlockMatcher.func_177642_a(Blocks.field_150424_aL));
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
    	
    BlockPos forBiome = new BlockPos(chunkX * 16, 62, chunkZ * 16);

	switch (world.field_73011_w.getDimension())
	{



        case -1: // Nether

            this.runGenerator(this.gen_onyx, world, random, chunkX, chunkZ, 4, 0, 80);

            break;

        case 0: // Overworld

			if(world.field_73011_w.getBiomeGenForCoords(forBiome) == BiomeGenBase.func_150568_d(2) || world.field_73011_w.getBiomeGenForCoords(forBiome) == BiomeGenBase.func_150568_d(17))
			{
				this.runGenerator(this.gen_ruby, world, random, chunkX, chunkZ, 1, 2, 9);
			}

			if(world.field_73011_w.getBiomeGenForCoords(forBiome) == BiomeGenBase.func_150568_d(0) || world.field_73011_w.getBiomeGenForCoords(forBiome) == BiomeGenBase.func_150568_d(24))
			{
				this.runGenerator(this.gen_sapphire, world, random, chunkX, chunkZ, 1, 4, 14);
			}

            this.runGenerator(this.gen_copper, world, random, chunkX, chunkZ, 30, 0, 72);
    	    this.runGenerator(this.gen_tin, world, random, chunkX, chunkZ, 10, 0, 72);
    	    this.runGenerator(this.gen_silver, world, random, chunkX, chunkZ, 12, 0, 42);

		    break;

		case 1: // End

            break;
		
	}
}
    
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) 
	{
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) 
	    {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.func_180709_b(world, rand, new BlockPos(x, y, z));
	    }
	}

}