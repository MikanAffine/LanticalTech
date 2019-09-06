package com.github.nyasroryo.lanticaltech.common.block;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public abstract class BlockBase extends Block {


  public BlockBase(String dataKey) {
    super( (Material)((Object[])BlockData.blockBaseData.get(dataKey))[1]);
    /*
    Array define in BlockData.java:
     new Object[] {
          Name,
          Material,
          WalkSound,
          Hardness,
          Resistance,
          HarvestTool,
          HarvestLevel

     */
    this
        .setSoundType((SoundType) ((Object[])BlockData.blockBaseData.get(dataKey))[2])
        .setHardness((float) ((Object[])BlockData.blockBaseData.get(dataKey))[3])
        .setResistance((float) ((Object[])BlockData.blockBaseData.get(dataKey))[4])
        .setHarvestLevel((String) ((Object[])BlockData.blockBaseData.get(dataKey))[5], (int) ((Object[])BlockData.blockBaseData.get(dataKey))[6]);
    this.setCreativeTab(CreativeTab.TAB_BLOCKS);
    this.setTranslationKey((String) ((Object[])BlockData.blockBaseData.get(dataKey))[0]);
    this.setRegistryName((String) ((Object[])BlockData.blockBaseData.get(dataKey))[0]);
  }
}