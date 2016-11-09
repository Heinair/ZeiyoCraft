package fr.zeiyo.zeiyocraft.world;

import fr.zeiyo.zeiyocraft.block.ZeiyoBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ZeiyoWorldGen implements IWorldGenerator {

    private WorldGenerator gen_ruby;
    private WorldGenerator gen_sapphire;
    private WorldGenerator gen_amethyst;
    private WorldGenerator gen_nacre;
    private WorldGenerator gen_jade;
    private WorldGenerator gen_copper;
    private WorldGenerator gen_tin;
    private WorldGenerator gen_silver;
    private WorldGenerator gen_onyx;

    public ZeiyoWorldGen() {
        this.gen_ruby = new WorldGenMinable(ZeiyoBlocks.rubyOre.getDefaultState(), 5);
        this.gen_sapphire = new WorldGenMinable(ZeiyoBlocks.sapphireOre.getDefaultState(), 5);
        this.gen_nacre = new WorldGenMinable(ZeiyoBlocks.nacreOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.GRAVEL));
        this.gen_jade = new WorldGenMinable(ZeiyoBlocks.jadeOre.getDefaultState(), 5);
        this.gen_amethyst = new WorldGenMinable(ZeiyoBlocks.amethystOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.END_STONE));
        this.gen_copper = new WorldGenMinable(ZeiyoBlocks.copperOre.getDefaultState(), 9);
        this.gen_tin = new WorldGenMinable(ZeiyoBlocks.tinOre.getDefaultState(), 9);
        this.gen_silver = new WorldGenMinable(ZeiyoBlocks.silverOre.getDefaultState(), 8);
        this.gen_onyx = new WorldGenMinable(ZeiyoBlocks.onyxOre.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK));
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        BlockPos forBiome = new BlockPos(chunkX * 16, 62, chunkZ * 16);

        switch (world.provider.getDimension()) {


            case -1: // Nether

                this.runGenerator(this.gen_onyx, world, random, chunkX, chunkZ, 3, 0, 80);

                break;

            case 0: // Overworld

                if (world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(2) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(17) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(35) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(36) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(37) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(38) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(39)) {
                    this.runGenerator(this.gen_ruby, world, random, chunkX, chunkZ, 1, 2, 11);
                }

                if (world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(0) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(24)) {
                    this.runGenerator(this.gen_nacre, world, random, chunkX, chunkZ, 4, 0, 46);
                }
                
                if (world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(5) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(19) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(12) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(13) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(30) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(31)) {
                    this.runGenerator(this.gen_sapphire, world, random, chunkX, chunkZ, 1, 2, 14);
                }
                
                if (world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(6) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(21) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(22) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(23) || world.provider.getBiomeForCoords(forBiome) == Biome.getBiome(29)) {
                    this.runGenerator(this.gen_jade, world, random, chunkX, chunkZ, 1, 2, 14);
                }                              

                this.runGenerator(this.gen_copper, world, random, chunkX, chunkZ, 30, 0, 72);
                this.runGenerator(this.gen_tin, world, random, chunkX, chunkZ, 10, 0, 72);
                this.runGenerator(this.gen_silver, world, random, chunkX, chunkZ, 20, 0, 62);

                break;

            case 1: // End
            	
            	this.runGenerator(this.gen_amethyst, world, random, chunkX, chunkZ, 3, 0, 52);

                break;

        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }

}