package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolShovel;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class ShovelBronze extends ToolShovel {

  public static final String MyName = "shovelBronze";
  public static final Item THIS_ITEM = new ShovelBronze();

  public ShovelBronze() {
    super(ToolMaterials.BRONZE, MyName);
  }

}
