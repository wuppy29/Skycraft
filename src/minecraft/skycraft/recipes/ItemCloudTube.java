package skycraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import skycraft.SkyCraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCloudTube {

	public static void loadrecipe() 
	{
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudTube, 1), new Object[]
				{
					"G G",
					"G G",
					"GGG",
					'G', Block.thinGlass
				});		
	}

}
