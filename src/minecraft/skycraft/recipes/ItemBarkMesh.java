package skycraft.recipes;

import net.minecraft.item.ItemStack;
import skycraft.SkyCraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemBarkMesh {

	public static void loadrecipe() 
	{
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2), new Object[]
				{
					"BB ",
					"BB ",
					"   ",
					'B', SkyCraftItems.treeBark
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2), new Object[]
				{
					" BB",
					" BB",
					"   ",
					'B', SkyCraftItems.treeBark
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2), new Object[]
				{
					"   ",
					"BB ",
					"BB ",
					'B', SkyCraftItems.treeBark
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2), new Object[]
				{
					"   ",
					" BB",
					" BB",
					'B', SkyCraftItems.treeBark
				});
	}

}
