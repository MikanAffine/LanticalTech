package com.github.nyasroryo.lanticaltech.common.item;

import com.github.nyasroryo.lanticaltech.common.item.dust.*;
import com.github.nyasroryo.lanticaltech.common.item.fuel.*;
import com.github.nyasroryo.lanticaltech.common.item.gem.GemCyrolite;
import com.github.nyasroryo.lanticaltech.common.item.ingot.*;
import com.github.nyasroryo.lanticaltech.common.item.plate.*;
import net.minecraft.item.Item;

public abstract class ItemList {

  public static final Item[][] ItemObject = {{
      IngotSteel.ME,
      IngotTin.ME,
      IngotCopper.ME,
      IngotBronze.ME,
      IngotLead.ME,
      IngotAluminium.ME
  }, {
      PlateSteel.ME,
      PlateTin.ME,
      PlateCopper.ME,
      PlateBronze.ME,
      PlateLead.ME,
      PlateAluminium.ME,
      PlateIron.ME
  }, {
      FuelAnthracite.ME,
      FuelLignite.ME,
      FuelPeat.ME,
      FuelCoke.ME
  }, {
      DustBauxite.ME,
      DustSalt.ME
  }, {
      GemCyrolite.ME
  }};
}