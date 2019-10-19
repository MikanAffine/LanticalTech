package com.github.nyasroryo.lanticaltech.common.worldgen;

import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenerator{

  @SubscribeEvent
  public static void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
  {if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)
  {
    event.setResult(Event.Result.DENY);
  }

  }
}