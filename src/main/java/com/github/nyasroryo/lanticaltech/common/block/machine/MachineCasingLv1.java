package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.common.block.BlockData;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv1 extends BlockBase {

  private static final String NAME = "MachineCasingLv1";
  private static final Object[] DATA = (Object[]) BlockData.blockBaseData.get(NAME);
  public static final Block ME = new MachineCasingLv1();
  public static final Item BROTHER = new ItemBlock(ME).setRegistryName(NAME);

  public MachineCasingLv1() {
    super(NAME);
  }

}