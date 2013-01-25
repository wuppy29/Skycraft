package skycraft;

import skycraft.items.ItemCloudTube;
import skycraft.items.ItemPortalPlacer;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class SkyCraftItems 
{
	public static final Item portalPlacer = new ItemPortalPlacer(4000).setIconIndex(0).setItemName("portalPlacer");
	public static final Item cloudTube = new ItemCloudTube(4001).setIconIndex(1).setItemName("cloudTube");
	
	public static void loadItems()
	{
		LanguageRegistry.addName(portalPlacer, "Portal Placer");
		GameRegistry.registerItem(portalPlacer, "Portal Placer");
		
		LanguageRegistry.addName(cloudTube, "Cloud Tube");
		GameRegistry.registerItem(cloudTube, "Cloud Tube");
	}
}
