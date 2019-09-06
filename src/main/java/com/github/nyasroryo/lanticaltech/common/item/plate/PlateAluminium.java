package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class PlateAluminium extends ItemBase {

  public static final String MyName = "plateAluminium";

  public PlateAluminium() {
    super(MyName);
  }

  public static final Item ME = new PlateAluminium();
}