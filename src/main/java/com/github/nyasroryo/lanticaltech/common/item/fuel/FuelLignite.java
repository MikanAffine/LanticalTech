package com.github.nyasroryo.lanticaltech.common.item.fuel;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class FuelLignite extends ItemBase {

  public static final String MyName = "fuelLignite";

  public FuelLignite() {
    super(MyName);
  }

  public static final Item ME = new FuelLignite();
}