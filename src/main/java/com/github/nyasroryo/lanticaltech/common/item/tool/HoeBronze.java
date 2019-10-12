package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolHoe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class HoeBronze extends ToolHoe {

  public static final String MyName = "hoeBronze";
  public static final Item THIS_ITEM = new HoeBronze();

  public HoeBronze() {
    super(ToolMaterials.BRONZE, MyName);
  }

}
