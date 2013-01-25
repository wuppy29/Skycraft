package skycraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import skycraft.SkyCraft;
import skycraft.core.client.ClientProxySkyCraft;
import skycraft.core.common.CommonProxySkyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class CloudBlock extends Block
{
    public CloudBlock(int id, int texture, Material material)
    {
    	super(id, texture, material);
    	this.setBlockName("Cloud");
    	this.setHardness(0.01f);
    	this.setStepSound(Block.soundSnowFootstep);
    	this.setCreativeTab(SkyCraft.tabSkyCraftBlocks);
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getMobilityFlag()
    {
        return 2;
    }
    
    @Override
    public String getTextureFile () 
    {
        return CommonProxySkyCraft.CloudBlock_PNG;
    }
}