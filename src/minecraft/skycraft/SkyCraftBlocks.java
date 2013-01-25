package skycraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.CloudBlock;
import skycraft.blocks.PortalBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SkyCraftBlocks 
{
	//Cloud Block
	public final static Block CloudBlock = new CloudBlock(3000, 0, Material.air);
	
	//Portal Block
	public final static PortalBlock PortalBlock = new PortalBlock(3001, 0, Material.portal);
	
	public static void loadBlocks()
	{
		//Cloud Block
		LanguageRegistry.addName(CloudBlock, ("Cloud Block"));
        MinecraftForge.setBlockHarvestLevel((CloudBlock), null , 0);
        GameRegistry.registerBlock(CloudBlock, ("Cloud Block"));
        
        //Portal Block
        LanguageRegistry.addName(PortalBlock, ("Portal Block"));
        MinecraftForge.setBlockHarvestLevel((PortalBlock), null , 0);
        GameRegistry.registerBlock(PortalBlock, ("Portal Block"));
	}
}
