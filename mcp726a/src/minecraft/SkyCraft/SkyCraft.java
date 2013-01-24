package skycraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import skycraft.core.References;
import skycraft.core.common.CommonProxySkyCraft;

import skycraft.core.creativetabs.*;

import skycraft.core.blocks.*;

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
	
	public static CreativeTabs tabSkyCraftBlocks = new tabSkyCraftBlocks(CreativeTabs.getNextID(), "SkyCraft Blocks");
	public static CreativeTabs tabSkyCraftItems = new tabSkyCraftItems(CreativeTabs.getNextID(), "SkyCraft Items");
	public static CreativeTabs tabSkyCraftArmor = new tabSkyCraftArmor(CreativeTabs.getNextID(), "SkyCraft Armor");
	public static CreativeTabs tabSkyCraftTools = new tabSkyCraftTools(CreativeTabs.getNextID(), "SkyCraft Tools");
	public static CreativeTabs tabSkyCraftMobs = new tabSkyCraftMobs(CreativeTabs.getNextID(), "SkyCraft Mobs");
	
	public final static Block CloudBlock = new CloudBlock(3000, 0, Material.air).setLightOpacity(3);
	
	@PreInit
	public void init(FMLPreInitializationEvent event)
	{
		proxy.loadTextures();
	}
	
	@Init
	private void load(FMLInitializationEvent event)
	{
		LanguageRegistry.addName(CloudBlock, ("Cloud Block"));
        MinecraftForge.setBlockHarvestLevel((CloudBlock), null , 0);
        GameRegistry.registerBlock(CloudBlock, ("Cloud Block"));
	}
}