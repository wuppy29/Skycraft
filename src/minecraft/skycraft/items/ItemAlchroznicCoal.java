package skycraft.items;

import skycraft.SkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.item.Item;

public class ItemAlchroznicCoal extends Item {

	public ItemAlchroznicCoal(int par1) {
		super(par1);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
		this.setIconCoord(0, 3);
		this.setItemName("Alchroznic Coal");
	}

	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
	
}
