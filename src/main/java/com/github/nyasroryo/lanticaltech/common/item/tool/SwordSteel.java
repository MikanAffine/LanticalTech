package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.WeaponSword;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class SwordSteel extends WeaponSword {

  public static final String MyName = "swordSteel";
  public static final Item THIS_ITEM = new SwordSteel();

  public SwordSteel() {
    super(ToolMaterials.STEEL, MyName);
  }

}
