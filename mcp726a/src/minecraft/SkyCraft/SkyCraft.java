package skycraft;

import net.minecraft.creativetab.CreativeTabs;
import skycraft.core.References;
import skycraft.core.common.CommonProxySkyCraft;
import skycraft.core.creativetabs.tabSkyCraftArmor;
import skycraft.core.creativetabs.tabSkyCraftBlocks;
import skycraft.core.creativetabs.tabSkyCraftItems;
import skycraft.core.creativetabs.tabSkyCraftMobs;
import skycraft.core.creativetabs.tabSkyCraftTools;
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
	
	public CreativeTabs tabSkyCraftBlocks = new tabSkyCraftBlocks(CreativeTabs.getNextID(), "SkyCraft Blocks");
	public CreativeTabs tabSkyCraftItems = new tabSkyCraftItems(CreativeTabs.getNextID(), "SkyCraft Items");
	public CreativeTabs tabSkyCraftArmor = new tabSkyCraftArmor(CreativeTabs.getNextID(), "SkyCraft Armor");
	public CreativeTabs tabSkyCraftTools = new tabSkyCraftTools(CreativeTabs.getNextID(), "SkyCraft Tools");
	public CreativeTabs tabSkyCraftMobs = new tabSkyCraftMobs(CreativeTabs.getNextID(), "SkyCraft Mobs");
	
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