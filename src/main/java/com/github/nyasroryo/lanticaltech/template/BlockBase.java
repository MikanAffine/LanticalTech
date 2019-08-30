package com.github.nyasroryo.lanticaltech.template;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public abstract class BlockBase extends Block {

  public BlockBase
      (
          Material Material,
          String Name,
          SoundType Sound,
          float Hardness,
          float Resistance,
          String HarvestTool,
          int HarvestLevel
      ) {
    super(Material);
    this
        .setSoundType(Sound)
        .setHardness(Hardness)
        .setResistance(Resistance)
        .setHarvestLevel(HarvestTool, HarvestLevel);
    this.setCreativeTab(CreativeTab.TAB_BLOCKS);
    this.setTranslationKey(Name);
    this.setRegistryName(Name);
  }
}
