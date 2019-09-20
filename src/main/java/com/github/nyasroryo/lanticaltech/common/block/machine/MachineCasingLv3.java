package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.packedconsts.BlockData;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv3 extends BlockBase {

  private static final String NAME = "MachineCasingLv3";
  private static final Object[] DATA = BlockData.blockBaseData.get(NAME);
  public static final Block THIS_BLOCK = new MachineCasingLv3();
  public static final Item THIS_ITEMBLOCK = new ItemBlock(THIS_BLOCK).setRegistryName(NAME);

  public MachineCasingLv3() {
    super(NAME);
  }
}