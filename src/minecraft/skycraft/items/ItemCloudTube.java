package skycraft.items;

import skycraft.SkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.item.Item;

public class ItemCloudTube extends Item
{

	public ItemCloudTube(int id) 
	{
		super(id);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
		this.setIconCoord(1, 0);
		this.setItemName("Cloud Tube");
	}
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
	
}
