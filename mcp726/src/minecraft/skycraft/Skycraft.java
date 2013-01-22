package skycraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Skycraft", name = "Skycraft", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Skycraft 
{
	@Init
	public void load(FMLInitializationEvent event) 
	{

	}
}