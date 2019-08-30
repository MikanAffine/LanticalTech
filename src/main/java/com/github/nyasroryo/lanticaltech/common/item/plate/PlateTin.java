package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class PlateTin extends ItemBase {

  public static final String MyName = "plateTin";

  public PlateTin() {
    super(MyName);
  }


  public static final Item ME = new PlateTin();
}