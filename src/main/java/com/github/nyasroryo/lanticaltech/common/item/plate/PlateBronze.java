package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class PlateBronze extends ItemBase {

  public static final String MyName = "plateBronze";

  public PlateBronze() {
    super(MyName);
  }


  public static final Item THIS_ITEM = new PlateBronze();
}