package com.github.nyasroryo.lanticaltech.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreCopper extends Block {
    public OreCopper() {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        this.setHardness(6.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setTranslationKey("oreCopper");
    }
}