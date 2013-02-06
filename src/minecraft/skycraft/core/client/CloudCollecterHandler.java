package skycraft.core.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import skycraft.SkyCraftItems;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class CloudCollecterHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) 
	{
		
	}
	
	int ticker = 0;
	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) 
	{
		Minecraft minecraft = FMLClientHandler.instance().getClient();
        EntityPlayer player = minecraft.thePlayer;
        ItemStack itemStack = null;
        
        if(player!= null)
        {
        	itemStack = player.inventory.getCurrentItem();
        	if(itemStack != null)
        	{
        		if(player.posY >= 128 && minecraft.inGameHasFocus && itemStack.getItem() == SkyCraftItems.cloudCapsule)
            	{
        			if(itemStack.getItemDamage() < 10 && ticker == 80)
        			{
        				itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        				ticker = 0;
        			}
        			else
        				ticker++;
            	}
        		else
        			ticker = 0;
        	}
        }
	}

	@Override
	public EnumSet<TickType> ticks() 
	{
		return EnumSet.of(TickType.CLIENT, TickType.CLIENTGUI, TickType.RENDER);
	}

	@Override
	public String getLabel() 
	{
		return null;
	}

}
