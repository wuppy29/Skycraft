package skycraft.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import skycraft.SkyCraft;
import skycraft.core.common.CommonProxySkyCraft;

public class ItemTreeBarkMesh extends Item
{
	public static final String[] barkMeshType = new String[] {"Oak", "Spruce", "Birch", "Jungle"};
	
	public ItemTreeBarkMesh(int id) 
	{
		super(id);
		this.setCreativeTab(SkyCraft.tabSkyCraftItems);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setIconCoord(0, 2);
		this.setItemName("Bark Mesh");
	}
	
	@SideOnly(Side.CLIENT)
    public int getIconFromDamage(int par1)
    {
        int var2 = MathHelper.clamp_int(par1, 0, 3);
        return this.iconIndex + var2 % 1 * 1 + var2 / 1;
    }
	
	@Override
	public String getItemNameIS(ItemStack itemstack) {
		return getItemName() + "." + barkMeshType[itemstack.getItemDamage()];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
	    for (int var4 = 0; var4 < 4; ++var4)
	    {
	        par3List.add(new ItemStack(par1, 1, var4));
        }
	}
	
	public String getTextureFile()
    {
            return CommonProxySkyCraft.Items_PNG;
    }
}
