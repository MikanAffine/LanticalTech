package com.github.nyasroryo.lanticaltech.common.item.gem;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class GemCyrolite extends ItemBase {

  public static final String MyName = "gemCyrolite";

  public GemCyrolite() {
    super(MyName);
  }

  public static final Item ME = new GemCyrolite();
}