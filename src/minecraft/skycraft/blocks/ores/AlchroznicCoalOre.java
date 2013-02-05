package skycraft.blocks.ores;

import java.util.Random;

import skycraft.SkyCraft;
import skycraft.SkyCraftItems;
import skycraft.SkyCraftOres;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class AlchroznicCoalOre extends Block {

	public AlchroznicCoalOre(int id, int texture, Material material) {
		super(id, texture, material);
		this.setBlockName("Alchroznic Coal Ore");
		this.setCreativeTab(SkyCraft.tabSkyCraftBlocks);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundStoneFootstep);
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return SkyCraftItems.alchroznicCoal.itemID;
    }

	protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(SkyCraftOres.alchroznicCoalOre);
    }
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int var8 = 0;

            if (this.blockID == SkyCraftOres.alchroznicCoalOre.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);    
        }
    }
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Blocks_PNG;
    }
}
