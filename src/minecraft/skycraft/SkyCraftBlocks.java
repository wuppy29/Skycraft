package skycraft;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.CloudBlock;
import skycraft.blocks.PortalBlock;

public class SkyCraftBlocks 
{
	public static final Block CloudBlock = new CloudBlock(3000, 0, Material.air).setLightOpacity(3);
	
	public static final Block PortalBlock = new PortalBlock(3001, 0, Material.portal);
	
	public static void loadBlocks()
	{
		LanguageRegistry.addName(CloudBlock, "Cloud Block");
        MinecraftForge.setBlockHarvestLevel((CloudBlock), null , 0);
        GameRegistry.registerBlock(CloudBlock, "Cloud Block");
	
        LanguageRegistry.addName(PortalBlock, "Portal Block");
        MinecraftForge.setBlockHarvestLevel((PortalBlock), null , 0);
        GameRegistry.registerBlock(PortalBlock, "Portal Block");
	}
}
