package skycraft.core;

import skycraft.SkyCraftItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{

	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel.itemID == SkyCraftItems.alchroznicCoal.itemID)
		{
			return 10000;
		}
		else
		{
			return 0;			
		}
	}

}
