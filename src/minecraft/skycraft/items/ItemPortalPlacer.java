package skycraft.items;

import skycraft.SkyCraft;
import skycraft.SkyCraftBlocks;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemPortalPlacer extends Item
{
	public ItemPortalPlacer(int id) 
	{
		super(id);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
		this.setIconCoord(0, 0);
		this.setItemName("Portal Placer");
	}
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		if(!par3World.isRemote)
		{
			int direction = MathHelper.floor_double((double)(par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
			
			if(direction == 3)
			{
				for(int z = - 2; z < 2; z++)
				{
					for(int x = 0; x < 5; x++)
					{
						if(par3World.getBlockId(par4 + x, par5 + 1, par6 + z) != 0)
						{
							par2EntityPlayer.addChatMessage("There is no room for a portal here.");
							return false;
						}
					}
				}
				
				par3World.setBlock(par4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 4, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 4, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 4, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 4, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 3, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 3, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 3, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 3, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 3, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
			}
			else if(direction == 1)
			{
				for(int z = - 2; z < 2; z++)
				{
					for(int x = 0; x < 5; x++)
					{
						if(par3World.getBlockId(par4 - x, par5 + 1, par6 + z) != 0)
						{
							par2EntityPlayer.addChatMessage("There is no room for a portal here.");
							return false;
						}
					}
				}
				
				par3World.setBlock(par4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 4, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 4, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 4, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 4, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 3, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 3, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 3, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 3, par5 + 1, par6, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 3, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
			}
			else if(direction == 2)
			{
				for(int x = - 2; x < 2; x++)
				{
					for(int z = 0; z < 5; z++)
					{
						if(par3World.getBlockId(par4 + x, par5 + 1, par6 - z) != 0)
						{
							par2EntityPlayer.addChatMessage("There is no room for a portal here.");
							return false;
						}
					}
				}
				
				par3World.setBlock(par4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4, par5 + 1, par6 - 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 4, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 3, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 3, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 - 1, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 - 3, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 - 3, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 - 3, SkyCraftBlocks.portalBlock.blockID);
			}
			else
			{
				for(int x = - 2; x < 2; x++)
				{
					for(int z = 0; z < 5; z++)
					{
						if(par3World.getBlockId(par4 + x, par5 + 1, par6 + z) != 0)
						{
							par2EntityPlayer.addChatMessage("There is no room for a portal here.");
							return false;
						}
					}
				}
				
				par3World.setBlock(par4, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4, par5 + 1, par6 + 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 4, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 4, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 3, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 3, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 2, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 + 2, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				par3World.setBlock(par4 - 2, par5 + 1, par6 + 1, SkyCraftBlocks.cloudBlock.blockID);
				
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 - 1, par5 + 1, par6 + 3, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4, par5 + 1, par6 + 3, SkyCraftBlocks.portalBlock.blockID);
				
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 1, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 2, SkyCraftBlocks.portalBlock.blockID);
				par3World.setBlock(par4 + 1, par5 + 1, par6 + 3, SkyCraftBlocks.portalBlock.blockID);
			}
			
			return true;
		}
		else
			return false;
    }
}
