package skycraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.CloudBlock;
import skycraft.core.References;
import skycraft.core.common.CommonProxySkyCraft;


import skycraft.core.blocks.*;
import skycraft.creativetabs.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SkyCraft 
{
		
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY) 
	public static CommonProxySkyCraft proxy;
	
	public static CreativeTabs tabSkyCraftBlocks = new TabSkyCraftBlocks(CreativeTabs.getNextID(), "SkyCraft Blocks");
	public static CreativeTabs tabSkyCraftItems = new TabSkyCraftItems(CreativeTabs.getNextID(), "SkyCraft Items");
	public static CreativeTabs tabSkyCraftArmor = new TabSkyCraftArmor(CreativeTabs.getNextID(), "SkyCraft Armor");
	public static CreativeTabs tabSkyCraftTools = new TabSkyCraftTools(CreativeTabs.getNextID(), "SkyCraft Tools");
	public static CreativeTabs tabSkyCraftMobs = new TabSkyCraftMobs(CreativeTabs.getNextID(), "SkyCraft Mobs");
	
	@PreInit
	public void init(FMLPreInitializationEvent event)
	{
		proxy.loadTextures();
	}
	
	@Init
	private void load(FMLInitializationEvent event)
	{
		//SkyCraftBlocks contains all the blocks + block code
		SkyCraftBlocks.loadBlocks();
		
		//SkyCraftItems contains all the items + item code
		SkyCraftItems.loadItems();
	}
}