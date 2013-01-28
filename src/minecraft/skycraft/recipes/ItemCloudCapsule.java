package skycraft.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import skycraft.SkyCraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCloudCapsule 
{
	public static void loadrecipe() 
	{
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					"G  ",
					"C  ",
					"   ",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					" G ",
					" C ",
					"   ",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					"  G",
					"  C",
					"   ",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					"   ",
					"G  ",
					"C  ",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					"   ",
					" C ",
					" G ",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
		
		GameRegistry.addRecipe(new ItemStack(SkyCraftItems.cloudCapsule, 1), new Object[]
				{
					"   ",
					"  C",
					"  G",
					'G', SkyCraftItems.cloudTube, 'C', SkyCraftItems.cork
				});
	}
}
