package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class IngotTin extends ItemBase {

  public static final String MyName = "ingotTin";

  public IngotTin() {
    super(MyName);
  }

  public static final Item ME = new IngotTin();
}