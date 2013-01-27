package skycraft.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import skycraft.SkyCraft;
import skycraft.SkyCraftBlocks;
import skycraft.core.client.ClientProxySkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
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
        return 1;
    }
    
    public String getTextureFile() 
    {
        return CommonProxySkyCraft.Blocks_PNG;
    }
    
    //trys to update on tick
    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
       par1World.scheduleBlockUpdate(par2, par3, par4, SkyCraftBlocks.cloudBlock.blockID, 1);
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
    				ItemStack stack = null;
    				EntityItem item = null;
    				List list = null;
    				
    				list = par1World.getEntitiesWithinAABB(EntityItem.class, AxisAlignedBB.getAABBPool().addOrModifyAABBInPool(par2, par3, par4, par2 + 3, par3 + 1, par4 + 3));
    				
    				if(list != null)
    				{
    					Iterator iterator = list.iterator();
    					
    					while(iterator.hasNext())
    					{
    						Entity entity = (Entity)iterator.next();
    						
    						if(entity instanceof EntityItem)
    						{
    							item = (EntityItem) entity;
    							stack = item.func_92014_d();
    						}
    					}
    				}
    				
    				if(stack != null)
    				{
    					if(stack.getItem() == Item.feather)
        				{
        					par1World.setBlock(par2 + 1, par3, par4 + 1, SkyCraftBlocks.portalBlock.blockID); 
        					par1World.setBlock(par2 + 2, par3, par4 + 1, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 3, par3, par4 + 1, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 1, par3, par4 + 2, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 2, par3, par4 + 2, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 3, par3, par4 + 2, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 1, par3, par4 + 3, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 2, par3, par4 + 3, SkyCraftBlocks.portalBlock.blockID);
        	    			par1World.setBlock(par2 + 3, par3, par4 + 3, SkyCraftBlocks.portalBlock.blockID);
        	    			
        	    			if(item != null)
        	    			{
        	    				item.setDead();
        	    			}
        				}
    				}
    			}
    		}
    	}
    	
    	//sends for the update
    	par1World.scheduleBlockUpdate(par2, par3, par4, SkyCraftBlocks.cloudBlock.blockID, 1);
    }
}