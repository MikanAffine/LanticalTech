package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.WeaponSword;
import com.github.nyasroryo.lanticaltech.common.packedconsts.ToolMaterials;
import net.minecraft.item.Item;

public class SwordBronze extends WeaponSword {

  public static final String MyName = "swordBronze";
  public static final Item THIS_ITEM = new SwordBronze();

  public SwordBronze() {
    super(ToolMaterials.BRONZE, MyName);
  }

}
