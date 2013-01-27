package skycraft.items;

import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.item.Item;

public class ItemTreeBark extends Item
{
	public ItemTreeBark(int id) 
	{
		super(id);
	}
	
	public String getTextureFile()
    {
       return CommonProxySkyCraft.Items_PNG;
    }
}
