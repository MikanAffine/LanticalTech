package com.github.nyasroryo.lanticaltech.common.item.fuel;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class FuelAnthracite extends ItemBase {

  public static final String MyName = "fuelAnthracite";

  public FuelAnthracite() {
    super(MyName);
  }

  public static final Item ME = new FuelAnthracite();
}