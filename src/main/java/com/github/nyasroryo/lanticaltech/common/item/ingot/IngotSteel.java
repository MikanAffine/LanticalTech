package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class IngotSteel extends ItemBase {

  public static final String MyName = "ingotSteel";

  public IngotSteel() {
    super(MyName);
  }

  public static final Item ME = new IngotSteel();
}