package skycraft;

import skycraft.items.ItemCloudCapsule;
import skycraft.items.ItemCloudTube;
import skycraft.items.ItemCork;
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
	
	public static final Item bark = new ItemTreeBark(4001);
	public static final String[] barkTypeNames = new String[] {"Oak", "Spruce", "Birch", "Jungle"};
	
	public static final Item treeBarkMesh = new ItemTreeBarkMesh(4002).setIconCoord(0, 2);
	public static final String[] barkMeshNames = new String[] {"Oak", "Spruce", "Birch", "Jungle"};
	
	public static final Item cork = new ItemCork(4003).setIconCoord(2, 0).setItemName("Cork");
	
	public static final Item cloudTube = new ItemCloudTube(4004).setIconCoord(1, 0).setItemName("Cloud Tube");
	
	public static final Item cloudCapsule = new ItemCloudCapsule(4005).setIconCoord(3, 0);
	public static final String[] cloudCapsuleIds = new String[] {"", ":1", ":2", ":3", ":4", ":5", ":6", ":7", ":8", ":9", ":10"};	
	
	
	public static void loadItems()
	{
		
		for (int var1 = 0; var1 < 4; ++var1) 
		{
			ItemStack barkTypeStack = new ItemStack(bark, 1, var1);
			ItemStack barkMeshStack = new ItemStack(treeBarkMesh, 1, var1);
			
			LanguageRegistry.addName(barkTypeStack, barkTypeNames[barkTypeStack.getItemDamage()] + " " + "Bark");
			LanguageRegistry.addName(barkMeshStack, barkMeshNames[barkMeshStack.getItemDamage()] + " " + "Bark Mesh");
		}
		
		for (int var2 = 0; var2 < 11; ++var2)
		{
			ItemStack cloudCapsuleStack = new ItemStack(cloudCapsule, 1, var2);
			
			LanguageRegistry.addName(cloudCapsuleStack, "Cloud Capsule" + cloudCapsuleIds[cloudCapsuleStack.getItemDamage()]);
		}
		
		LanguageRegistry.addName(portalPlacer, "Portal Placer");
		GameRegistry.registerItem(portalPlacer, "Portal Placer");
		
		LanguageRegistry.addName(cork, "Cork");
		GameRegistry.registerItem(cork, "Cork");
		
		LanguageRegistry.addName(cloudTube, "Cloud Tube");
		GameRegistry.registerItem(cloudTube, "Cloud Tube");
	}
}
