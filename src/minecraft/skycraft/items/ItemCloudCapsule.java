package skycraft.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import skycraft.SkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemCloudCapsule extends Item
{
	public static final String[] cloudCapsule = new String[] {"", ":1", ":2", ":3", ":4", ":5", ":6", ":7", ":8", ":9", ":10"};

	public ItemCloudCapsule(int id) 
	{
		super(id);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setIconCoord(3, 0);
		this.setItemName("Cloud Capsules");
	}
	
	@SideOnly(Side.CLIENT)
    public int getIconFromDamage(int par1)
    {
        int var2 = MathHelper.clamp_int(par1, 0, 10);
        return this.iconIndex + var2 % 1 * 1 + var2 / 1;
    }
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + cloudCapsule[itemstack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
	    for (int var2 = 0; var2 < 11; ++var2)
	    {
	        par3List.add(new ItemStack(par1, 1, var2));
        }
	}
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
}
