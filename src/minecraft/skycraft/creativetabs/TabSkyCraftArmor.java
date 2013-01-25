package skycraft.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.creativetab.CreativeTabs;

public class TabSkyCraftArmor extends CreativeTabs 
{

	public TabSkyCraftArmor(int i, String str)
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
		return "SkyCraft Armor";
	}
	
}
