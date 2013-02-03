package skycraft.core.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.EntityFX;
import net.minecraftforge.client.MinecraftForgeClient;
import skycraft.core.common.CommonProxySkyCraft;
import skycraft.particals.PortalParticle;

public class ClientProxySkyCraft extends CommonProxySkyCraft
{
	
	@Override
	public void loadTextures() 
	{
        MinecraftForgeClient.preloadTexture(Blocks_PNG);
	}
	
}
