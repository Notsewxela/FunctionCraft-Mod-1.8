package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockPlatinumOre extends BlockFunctionCraft
{
    public BlockPlatinumOre()
    {
        super(Material.rock);
        this.setBlockName("orePlatinum");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("orePlatinum");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",2);
        this.setStepSound(soundTypeStone);
    }
}
