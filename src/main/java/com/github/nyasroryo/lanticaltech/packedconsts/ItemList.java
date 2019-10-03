package com.github.nyasroryo.lanticaltech.packedconsts;

import com.github.nyasroryo.lanticaltech.common.item.*;
import com.github.nyasroryo.lanticaltech.common.item.tool.ToolHammer;
import com.github.nyasroryo.lanticaltech.common.item.tool.ToolWrench;
import net.minecraft.item.Item;

public abstract class ItemList {

  public static final Item[] ItemObject = {
      //Meta-hack过的物品集合
      Ingot.THIS_ITEM,
      Plate.THIS_ITEM,
      Dust.THIS_ITEM,
      Fuel.THIS_ITEM,
      Gem.THIS_ITEM,

      //工具
      ToolHammer.THIS_ITEM,
      ToolWrench.THIS_ITEM,
  };
}