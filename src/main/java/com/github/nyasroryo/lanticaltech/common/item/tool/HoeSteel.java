package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolHoe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class HoeSteel extends ToolHoe {

  public static final String MyName = "hoeSteel";
  public static final Item THIS_ITEM = new HoeSteel();

  public HoeSteel() {
    super(ToolMaterials.STEEL, MyName);
  }

}
