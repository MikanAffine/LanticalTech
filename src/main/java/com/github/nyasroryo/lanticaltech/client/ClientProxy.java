package com.github.nyasroryo.lanticaltech.client;

import com.github.nyasroryo.lanticaltech.common.CommonProxy;
import com.github.nyasroryo.lanticaltech.common.loader.BlockLoader;
import com.github.nyasroryo.lanticaltech.common.loader.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy extends CommonProxy {
  @Override
  public void preInit(FMLPreInitializationEvent event) {
    super.preInit(event);
    BlockLoader.SetBlockModel();
    ItemLoader.SetItemModel();
  }

  @Override
  public void init(FMLInitializationEvent event) {
    super.init(event);
  }

  @Override
  public void postInit(FMLPostInitializationEvent event) {
    super.postInit(event);
  }
}