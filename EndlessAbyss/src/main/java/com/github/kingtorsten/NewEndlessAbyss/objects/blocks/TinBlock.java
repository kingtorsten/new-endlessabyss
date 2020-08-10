package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TinBlock extends Block
{

    public TinBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 4.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
