package skycraft;

import skycraft.items.ItemPortalPlacer;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class SkyCraftItems 
{
	public static final Item portalPlacer = new ItemPortalPlacer(6000).setIconIndex(0).setItemName("portalPlacer");
	
	public static void loadItems()
	{
		LanguageRegistry.addName(portalPlacer, "Portal Placer");
	}
}
