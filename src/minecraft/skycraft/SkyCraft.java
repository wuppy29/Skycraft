package skycraft;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.DimensionManager;
import skycraft.core.FuelHandler;
import skycraft.core.References;
import skycraft.core.common.CommonProxySkyCraft;
import skycraft.creativetabs.TabSkyCraftArmor;
import skycraft.creativetabs.TabSkyCraftBlocks;
import skycraft.creativetabs.TabSkyCraftItems;
import skycraft.creativetabs.TabSkyCraftMobs;
import skycraft.creativetabs.TabSkyCraftTools;
import skycraft.skydimension.WorldProviderSky;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

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
	
	public static int dimension = 2;
	
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
		
		//SkyCraftOres contains all the ores + ore code
		SkyCraftOres.loadOres();
		
		//SkyCraftItems contains all the recipes + recipe code
		SkyCraftRecipes.loadRecipies();
		
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		GameRegistry.registerWorldGenerator(new skycraft.core.WorldGenHandler());
		
		DimensionManager.registerProviderType(dimension, WorldProviderSky.class, false);
		DimensionManager.registerDimension(dimension, dimension);
	}

}