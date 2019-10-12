package com.github.nyasroryo.lanticaltech.common.block;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import com.github.nyasroryo.lanticaltech.common.packedconsts.BlockData;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public abstract class BlockBase extends Block {


  public BlockBase(String dataKey) {
    super( (Material) BlockData.blockBaseData.get(dataKey)[1]);
    /*
    BlockData.java中使用的标准方块数据数组:
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
        .setSoundType((SoundType) BlockData.blockBaseData.get(dataKey)[2])
        .setHardness((float) BlockData.blockBaseData.get(dataKey)[3])
        .setResistance((float) BlockData.blockBaseData.get(dataKey)[4])
        .setHarvestLevel((String) BlockData.blockBaseData.get(dataKey)[5], (int) BlockData.blockBaseData.get(dataKey)[6]);
    this.setCreativeTab(CreativeTab.TAB_BLOCKS);
    this.setTranslationKey((String) BlockData.blockBaseData.get(dataKey)[0]);
    this.setRegistryName(((String) BlockData.blockBaseData.get(dataKey)[0]).toLowerCase());
  }
}