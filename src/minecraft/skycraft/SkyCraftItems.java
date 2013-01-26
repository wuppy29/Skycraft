package skycraft;

import skycraft.items.ItemCloudCapsule;
import skycraft.items.ItemCloudTube;
import skycraft.items.ItemPortalPlacer;
import skycraft.items.ItemTreeBark;
import skycraft.items.ItemTreeBarkMesh;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SkyCraftItems 
{
	public static final Item portalPlacer = new ItemPortalPlacer(4000).setIconCoord(0, 0).setItemName("Portal Placer");
	
	public static final Item treeBark = new ItemTreeBark(4001).setIconCoord(0, 1).setItemName("Tree Bark");
	public static final Item treeBarkMesh = new ItemTreeBarkMesh(4002).setIconCoord(0, 2).setItemName("Tree Bark Mesh");
	
	public static final Item cloudTube = new ItemCloudTube(4003).setIconCoord(1, 0).setItemName("Cloud Tube");
	public static final Item cloudCapsule = new ItemCloudCapsule(4004).setIconCoord(2, 0).setItemName("Cloud Capsule");
	
	public static void loadItems()
	{
		LanguageRegistry.addName(portalPlacer, "Portal Placer");
		GameRegistry.registerItem(portalPlacer, "Portal Placer");
		
		LanguageRegistry.addName(treeBark, "Tree Bark");
		GameRegistry.registerItem(treeBark, "Tree Bark");

		LanguageRegistry.addName(treeBarkMesh, "Tree Bark Mesh");
		GameRegistry.registerItem(treeBarkMesh, "Tree Bark Mesh");
		
		LanguageRegistry.addName(cloudTube, "Cloud Tube");
		GameRegistry.registerItem(cloudTube, "Cloud Tube");
		
		LanguageRegistry.addName(cloudCapsule, "Cloud Capsule");
		GameRegistry.registerItem(cloudCapsule, "Cloud Capsule");
	}
}
