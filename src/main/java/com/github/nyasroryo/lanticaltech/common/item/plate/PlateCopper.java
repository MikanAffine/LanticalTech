package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class PlateCopper extends ItemBase {

  public static final String MyName = "plateCopper";

  public PlateCopper() {
    super(MyName);
  }


  public static final Item ME = new PlateCopper();
}