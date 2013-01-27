package skycraft.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import skycraft.SkyCraft;
import skycraft.SkyCraftBlocks;
import skycraft.core.client.ClientProxySkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CloudBlock extends Block
{
    public CloudBlock(int id, int texture, Material material)
    {
    	super(id, texture, material);
    	this.setBlockName("Cloud");
    	this.setHardness(0.01f);
    	this.setStepSound(Block.soundSnowFootstep);
    	this.setCreativeTab(SkyCraft.tabSkyCraftBlocks);
    	this.setTickRandomly(true);
    }

    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getMobilityFlag()
    {
        return 2;
    }
    
    public String getTextureFile() 
    {
        return CommonProxySkyCraft.Blocks_PNG;
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) 
    {
    	int cloud = SkyCraftBlocks.cloudBlock.blockID;
    	
    	if(par1World.getBlockId(par2 + 1, par3, par4) == cloud)
    	{
    		//Check for cloud frame
    		if(par1World.getBlockId(par2 + 2, par3, par4) == cloud && par1World.getBlockId(par2 + 3, par3, par4) == cloud &&
    				par1World.getBlockId(par2 + 4, par3, par4) == cloud && par1World.getBlockId(par2, par3, par4 + 1) == cloud &&
    				par1World.getBlockId(par2, par3, par4 + 2) == cloud && par1World.getBlockId(par2, par3, par4 + 3) == cloud &&
    				par1World.getBlockId(par2, par3, par4 + 4) == cloud && par1World.getBlockId(par2 + 1, par3, par4 + 4) == cloud && 
    				par1World.getBlockId(par2 + 2, par3, par4 + 4) == cloud && par1World.getBlockId(par2 + 3, par3, par4 + 4) == cloud &&
    				par1World.getBlockId(par2 + 4, par3, par4 + 4) == cloud && par1World.getBlockId(par2 + 4, par3, par4 + 1) == cloud &&
    				par1World.getBlockId(par2 + 4, par3, par4 + 2) == cloud && par1World.getBlockId(par2 + 4, par3, par4 + 3) == cloud)
    		{
    			//empty middle
    			if(par1World.getBlockId(par2 + 1, par3, par4 + 1) == 0 && par1World.getBlockId(par2 + 2, par3, par4 + 1) == 0 &&
    					par1World.getBlockId(par2 + 3, par3, par4 + 1) == 0 && par1World.getBlockId(par2 + 1, par3, par4 + 2) == 0 &&
    					par1World.getBlockId(par2 + 2, par3, par4 + 2) == 0 && par1World.getBlockId(par2 + 3, par3, par4 + 2) == 0 &&
    					par1World.getBlockId(par2 + 1, par3, par4 + 3) == 0 && par1World.getBlockId(par2 + 2, par3, par4 + 3) == 0 &&
    					par1World.getBlockId(par2 + 3, par3, par4 + 3) == 0)
    			{
    				System.out.println("good portal");
    			}
    		}
    	}
    }
}