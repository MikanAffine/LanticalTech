package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolPickaxe;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class PickaxeSteel extends ToolPickaxe {

  public static final String MyName = "pickaxeSteel";
  public static final Item THIS_ITEM = new PickaxeSteel();

  public PickaxeSteel() {
    super(ToolMaterials.STEEL, MyName);
  }

}
