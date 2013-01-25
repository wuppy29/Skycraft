package skycraft.creativetabs;

import skycraft.SkyCraft;
import skycraft.SkyCraftBlocks;
import skycraft.blocks.CloudBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabSkyCraftBlocks extends CreativeTabs
{
	
	public TabSkyCraftBlocks(int i, String str)
	{
		super(i, str);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return SkyCraftBlocks.CloudBlock.blockID;
	}
	
	public String getTranslatedTabLabel()
	{
		return "SkyCraft Blocks";
	}
}
