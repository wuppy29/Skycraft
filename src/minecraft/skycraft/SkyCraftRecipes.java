package skycraft;

import net.minecraft.item.crafting.FurnaceRecipes;

public class SkyCraftRecipes 
{

	public static void loadRecipies() 
	{
		skycraft.recipes.ItemBarkMesh.loadrecipe();
		skycraft.recipes.ItemCloudTube.loadrecipe();
		skycraft.recipes.ItemCloudCapsule.loadrecipe();
	}

}
