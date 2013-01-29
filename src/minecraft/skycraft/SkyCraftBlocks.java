package skycraft;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.AlchroznicFurnaceBlock;
import skycraft.blocks.CloudBlock;
import skycraft.blocks.PortalBlock;

public class SkyCraftBlocks 
{
	public static final Block cloudBlock = new CloudBlock(3000, 0, Material.air);
	
	public static final Block portalBlock = new PortalBlock(3001, 1, Material.portal);
	
	public static final Block alchroznicFurnaceIdle = new AlchroznicFurnaceBlock(3002, false);
	public static final Block alchroznicFurnaceActive = new AlchroznicFurnaceBlock(3003, true);
	
	public static void loadBlocks()
	{
		LanguageRegistry.addName(cloudBlock, "Cloud Block");
        MinecraftForge.setBlockHarvestLevel((cloudBlock), null , 0);
        GameRegistry.registerBlock(cloudBlock, "Cloud Block");
	
        LanguageRegistry.addName(portalBlock, "Portal Block");
        MinecraftForge.setBlockHarvestLevel((portalBlock), null , 0);
        GameRegistry.registerBlock(portalBlock, "Portal Block");
	}
}
