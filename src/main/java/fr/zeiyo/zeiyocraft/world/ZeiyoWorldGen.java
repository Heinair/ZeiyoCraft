package fr.zeiyo.zeiyocraft.world;

import java.util.Random;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
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



	
	
	public ZeiyoWorldGen() 
	{
	    this.gen_ruby = new WorldGenMinable(ZeiyoBlocks.rubyOre.getDefaultState(), 5);
	    this.gen_sapphire = new WorldGenMinable(ZeiyoBlocks.sapphireOre.getDefaultState(), 5);
	    this.gen_copper = new WorldGenMinable(ZeiyoBlocks.copperOre.getDefaultState(), 9);
	    this.gen_tin = new WorldGenMinable(ZeiyoBlocks.tinOre.getDefaultState(), 9);
	    this.gen_silver = new WorldGenMinable(ZeiyoBlocks.silverOre.getDefaultState(), 8);



	}
    
	
	

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		
		case 0: // Overworld
			this.runGenerator(this.gen_ruby, world, random, chunkX, chunkZ, 1, 2, 9);
	    	this.runGenerator(this.gen_sapphire, world, random, chunkX, chunkZ, 1, 4, 14);
	    	this.runGenerator(this.gen_copper, world, random, chunkX, chunkZ, 25, 0, 72);
	    	this.runGenerator(this.gen_tin, world, random, chunkX, chunkZ, 20, 0, 72);
	    	this.runGenerator(this.gen_silver, world, random, chunkX, chunkZ, 18, 0, 42);

			break;
		case -1: // Nether

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
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
	

    

}
