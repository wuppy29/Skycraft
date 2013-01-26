package skycraft.items;

import net.minecraft.item.Item;
import skycraft.SkyCraft;
import skycraft.core.common.CommonProxySkyCraft;

public class ItemTreeBarkMesh extends Item
{
	public ItemTreeBarkMesh(int id) 
	{
		super(id);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
	}
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
	
}
