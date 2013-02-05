package skycraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.MinecraftForge;
import skycraft.blocks.ores.AlchroznicCoalOre;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SkyCraftOres 
{
	
	public static final Block alchroznicCoalOre = new AlchroznicCoalOre(3500, 32, Material.rock);
	
	public static void loadOres()
	{
		LanguageRegistry.addName(alchroznicCoalOre, "Alchroznic Coal Ore");
        MinecraftForge.setBlockHarvestLevel((alchroznicCoalOre), null , 0);
        GameRegistry.registerBlock(alchroznicCoalOre, "Alchroznic Coal Ore");
        
        MinecraftForge.setBlockHarvestLevel(alchroznicCoalOre, "pickaxe", 2);
	}
	
}
