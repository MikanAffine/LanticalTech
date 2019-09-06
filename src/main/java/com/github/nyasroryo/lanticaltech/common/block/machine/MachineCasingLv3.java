package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.common.block.BlockData;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv3 extends BlockBase {

  private static final String NAME = "MachineCasingLv3";
  private static final Object[] DATA = (Object[]) BlockData.blockBaseData.get(NAME);
  public static final Block ME = new MachineCasingLv3();
  public static final Item BROTHER = new ItemBlock(ME).setRegistryName(NAME);

  public MachineCasingLv3() {
    super(NAME);
  }
}