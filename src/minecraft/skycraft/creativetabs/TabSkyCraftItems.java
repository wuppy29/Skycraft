package skycraft.creativetabs;

import skycraft.SkyCraftItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabSkyCraftItems extends CreativeTabs 
{
	
	public TabSkyCraftItems(int i, String str)
	{
		super(i, str);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return SkyCraftItems.portalPlacer.itemID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "SkyCraft Items";
	}
	
}
