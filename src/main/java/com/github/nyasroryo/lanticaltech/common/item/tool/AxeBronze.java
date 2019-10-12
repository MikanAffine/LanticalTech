package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolAxe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class AxeBronze extends ToolAxe {

  public static final String MyName = "axeBronze";
  public static final Item THIS_ITEM = new AxeBronze();

  public AxeBronze() {
    super(ToolMaterials.BRONZE, MyName);
  }

}
