package skycraft.skydimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import skycraft.SkyCraft;

public class WorldProviderSky extends WorldProvider
{

	@Override
	public String getDimensionName() 
	{
		return "The Sky";
	}
	
	public boolean canRespawnHere()
	 {
	  return true;
	 }
	
	public void registerWorldChunkManager()
	 {
	  this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.beach, 0.8F, 0.1F);
	  this.dimensionId = SkyCraft.dimension;
	 }
	
	@Override
	 public IChunkProvider createChunkGenerator()
	 {
	  return new ChunkProviderSky(worldObj, worldObj.getSeed(), true);
	 }
	
}
