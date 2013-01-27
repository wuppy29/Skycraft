package skycraft.core.client;

import net.minecraftforge.client.MinecraftForgeClient;
import skycraft.core.common.CommonProxySkyCraft;

public class ClientProxySkyCraft extends CommonProxySkyCraft
{
	@Override
	public void loadTextures() 
	{
        MinecraftForgeClient.preloadTexture(Blocks_PNG);
	}
}
