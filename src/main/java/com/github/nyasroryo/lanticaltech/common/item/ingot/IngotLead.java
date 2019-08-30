package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.template.ItemBase;
import net.minecraft.item.Item;

public class IngotLead extends ItemBase {

  public static final String MyName = "ingotLead";

  public IngotLead() {
    super(MyName);
  }

  public static final Item ME = new IngotLead();
}