package skycraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import skycraft.SkyCraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemBarkMesh {

	public static void loadrecipe() 
	{
		//Oak Recipes
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 0), new Object[] {"## ", "## ", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 0), new Object[] {"   ", "## ", "## ", '#', new ItemStack(SkyCraftItems.bark, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 0), new Object[] {" ##", " ##", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 0), new Object[] {"   ", " ##", " ##", '#', new ItemStack(SkyCraftItems.bark, 1, 0)});
		
		//Spruce
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 1), new Object[] {"## ", "## ", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 1), new Object[] {"   ", "## ", "## ", '#', new ItemStack(SkyCraftItems.bark, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 1), new Object[] {" ##", " ##", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 1), new Object[] {"   ", " ##", " ##", '#', new ItemStack(SkyCraftItems.bark, 1, 1)});
		
		//Birch
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 2), new Object[] {"## ", "## ", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 2), new Object[] {"   ", "## ", "## ", '#', new ItemStack(SkyCraftItems.bark, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 2), new Object[] {" ##", " ##", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 2), new Object[] {"   ", " ##", " ##", '#', new ItemStack(SkyCraftItems.bark, 1, 2)});
		
		//Jungle
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 3), new Object[] {"## ", "## ", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 3), new Object[] {"   ", "## ", "## ", '#', new ItemStack(SkyCraftItems.bark, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 3), new Object[] {" ##", " ##", "   ", '#', new ItemStack(SkyCraftItems.bark, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.treeBarkMesh, 2, 3), new Object[] {"   ", " ##", " ##", '#', new ItemStack(SkyCraftItems.bark, 1, 3)});
	}

}
