package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolShovel;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class ShovelSteel extends ToolShovel {

  public static final String MyName = "shovelSteel";
  public static final Item THIS_ITEM = new ShovelSteel();

  public ShovelSteel() {
    super(ToolMaterials.STEEL, MyName);
  }

}
