package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolPickaxe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class PickaxeBronze extends ToolPickaxe {

  public static final String MyName = "pickaxeBronze";
  public static final Item THIS_ITEM = new PickaxeBronze();

  public PickaxeBronze() {
    super(ToolMaterials.BRONZE, MyName);
  }

}
