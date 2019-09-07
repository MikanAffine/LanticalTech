package com.github.nyasroryo.lanticaltech.common.item;

import com.github.nyasroryo.lanticaltech.common.item.dust.*;
import com.github.nyasroryo.lanticaltech.common.item.fuel.*;
import com.github.nyasroryo.lanticaltech.common.item.gem.GemCyrolite;
import com.github.nyasroryo.lanticaltech.common.item.ingot.*;
import com.github.nyasroryo.lanticaltech.common.item.plate.*;
import net.minecraft.item.Item;

public abstract class ItemList {

  public static final Item[] ItemObject = {
      //锭
      IngotSteel.THIS_ITEM,
      IngotTin.THIS_ITEM,
      IngotCopper.THIS_ITEM,
      IngotBronze.THIS_ITEM,
      IngotLead.THIS_ITEM,
      IngotAluminium.THIS_ITEM,

      //板
      PlateSteel.THIS_ITEM,
      PlateTin.THIS_ITEM,
      PlateCopper.THIS_ITEM,
      PlateBronze.THIS_ITEM,
      PlateLead.THIS_ITEM,
      PlateAluminium.THIS_ITEM,
      PlateIron.THIS_ITEM,

      //燃料
      FuelAnthracite.THIS_ITEM,
      FuelLignite.THIS_ITEM,
      FuelPeat.THIS_ITEM,
      FuelCoke.THIS_ITEM,

      //粉
      DustBauxite.THIS_ITEM,
      DustSalt.THIS_ITEM,

      //宝石
      GemCyrolite.THIS_ITEM
  };
}