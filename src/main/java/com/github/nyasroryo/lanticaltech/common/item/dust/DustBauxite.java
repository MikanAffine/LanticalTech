package com.github.nyasroryo.lanticaltech.common.item.dust;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class DustBauxite extends ItemBase {

  public static final String MyName = "dustBauxite";

  public DustBauxite() {
    super(MyName);
  }

  public static final Item ME = new DustBauxite();
}