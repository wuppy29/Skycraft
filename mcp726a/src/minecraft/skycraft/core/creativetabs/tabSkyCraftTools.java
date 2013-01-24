package skycraft.core.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.creativetab.CreativeTabs;

public class tabSkyCraftTools extends CreativeTabs 
{

	public tabSkyCraftTools(int i, String str)
	{
		super(i, str);
	}
	
	@SideOnly(Side.CLIENT)
	public BlockPortal getTabIconIndex()
	{
		//Temp Icon
		return Block.portal;
	}
	
	public String getTranslatedTabLabel()
	{
		return "SkyCraft Tools";
	}
	
}