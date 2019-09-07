package com.github.nyasroryo.lanticaltech.common.item.fuel;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class FuelPeat extends ItemBase {

  public static final String MyName = "fuelPeat";

  public FuelPeat() {
    super(MyName);
  }

  public static final Item THIS_ITEM = new FuelPeat();
}