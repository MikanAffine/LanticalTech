package com.github.nyasroryo.lanticaltech.common.item.fuel;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class FuelCoke extends ItemBase {

  public static final String MyName = "fuelCoke";

  public FuelCoke() {
    super(MyName);
  }

  public static final Item ME = new FuelCoke();
}