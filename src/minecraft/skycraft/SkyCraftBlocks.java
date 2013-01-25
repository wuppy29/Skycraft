package skycraft;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.CloudBlock;

public class SkyCraftBlocks 
{
	public static final Block CloudBlock = new CloudBlock(3000, 0, Material.air).setLightOpacity(3);
	
	public static void loadBlocks()
	{
		LanguageRegistry.addName(CloudBlock, "Cloud Block");
        MinecraftForge.setBlockHarvestLevel((CloudBlock), null , 0);
        GameRegistry.registerBlock(CloudBlock, "Cloud Block");
	}
}
