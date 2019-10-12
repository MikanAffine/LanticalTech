package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolAxe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class AxeSteel extends ToolAxe {

  public static final String MyName = "axeSteel";
  public static final Item THIS_ITEM = new AxeSteel();

  public AxeSteel() {
    super(ToolMaterials.STEEL, MyName);
  }

}
