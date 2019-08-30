package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class PlateIron extends ItemBase {

  public static final String MyName = "plateIron";

  public PlateIron() {
    super(MyName);
  }


  public static final Item ME = new PlateIron();
}