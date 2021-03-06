package skycraft.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import skycraft.SkyCraft;
import skycraft.SkyCraftBlocks;
import skycraft.core.client.ClientProxySkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import skycraft.skydimension.SkyTeleporter;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PortalBlock extends Block
{
	public PortalBlock(int id, int texture, Material material)
    {
    	super(id, texture, material);
    	this.setBlockName("Portal");
    	this.setStepSound(Block.soundGlassFootstep);
    	this.setLightValue(0.75F);
    	this.setHardness(-1.0F);
    	this.setCreativeTab(SkyCraft.tabSkyCraftBlocks);
    	this.setTickRandomly(true);
    }

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
		{
		   if (par5Entity instanceof EntityPlayerMP)
		   {
		     EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
		   if (par5Entity.dimension != SkyCraft.dimension)
		   {
			   thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, SkyCraft.dimension, new SkyTeleporter(thePlayer.mcServer.worldServerForDimension(SkyCraft.dimension)));
		   }
		   else
		   {
			   thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new SkyTeleporter(thePlayer.mcServer.worldServerForDimension(0)));
		   }
		   }
		  
		}
	}
	
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    
    //Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been cleared to be reused)
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    //Updates the blocks bounds based on its current state. Args: world, x, y, z
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if (par1IBlockAccess.getBlockId(par2 - 1, par3, par4) != this.blockID && par1IBlockAccess.getBlockId(par2 + 1, par3, par4) != this.blockID)
        {
            this.setBlockBounds(0F, 0.4F, 0F, 1F, 0.6F, 1F);
        }
        else
        {
            this.setBlockBounds(0F, 0.4F, 0F, 1F, 0.6F, 1F);
        }
    }

    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        for (int var6 = 0; var6 < 4; ++var6)
        {
            double var7 = (double)((float)par2 + par5Random.nextFloat());
            double var9 = (double)((float)par3 + par5Random.nextFloat());
            double var11 = (double)((float)par4 + par5Random.nextFloat());
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = par5Random.nextInt(2) * 2 - 1;
            var13 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
            var15 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
            var17 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;

            if (par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && par1World.getBlockId(par2 + 1, par3, par4) != this.blockID)
            {
                var7 = (double)par2 + 0.5D + 0.25D * (double)var19;
                var13 = (double)(par5Random.nextFloat() * 2.0F * (float)var19);
            }
            else
            {
                var11 = (double)par4 + 0.5D + 0.25D * (double)var19;
                var17 = (double)(par5Random.nextFloat() * 2.0F * (float)var19);
            }

        }
    }
    
    //Pistons can move block = 0
    //Pistons can move on top of block = 1
    //Pistons can't move at all = 2
    public int getMobilityFlag()
    {
        return 2;
    }
    
    //Only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return 0;
    }
    
    public String getTextureFile() 
    {
        return CommonProxySkyCraft.Blocks_PNG;
    }
 
}
