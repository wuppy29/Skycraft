package skycraft.core.client;

import net.minecraftforge.client.MinecraftForgeClient;
import skycraft.core.common.CommonProxySkyCraft;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxySkyCraft extends CommonProxySkyCraft
{
	@Override
	public void loadTextures() 
	{
        MinecraftForgeClient.preloadTexture(Blocks_PNG);
	}
	
	@Override
	public void registerTickHandler()
	{
		TickRegistry.registerTickHandler(new CloudCollecterHandler(), Side.CLIENT);
	}
}
