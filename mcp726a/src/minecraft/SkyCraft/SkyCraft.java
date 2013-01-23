package skycraft;

import skycraft.core.References;
import skycraft.core.common.CommonProxySkyCraft;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SkyCraft 
{
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY) 
	public static CommonProxySkyCraft proxy;
	
	@PreInit
	public void init(FMLPreInitializationEvent event)
	{
		proxy.loadTextures();
	}
	
	@Init
	private void load(FMLInitializationEvent event)
	{
		
	}
}