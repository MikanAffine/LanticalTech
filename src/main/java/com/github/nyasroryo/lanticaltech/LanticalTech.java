package com.github.nyasroryo.lanticaltech;

import com.github.nyasroryo.lanticaltech.common.CommonProxy;
import com.github.nyasroryo.lanticaltech.util.LoggerPlus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * @author NyasRoryo
 */
@Mod(modid = LanticalTech.MODID, name = LanticalTech.NAME, version = LanticalTech.VERSION, acceptedMinecraftVersions = LanticalTech.MCVERSION)
public class LanticalTech {
  public static final String MODID = "lanticaltech";
  public static final String NAME = "LanticalTech";
  public static final String VERSION = "Beta 1.2.5 build 9";
  public static final String MCVERSION = "1.12.2";

  @Instance(MODID)
  public static LanticalTech instance;

  @SidedProxy(clientSide = "com.github.nyasroryo.lanticaltech.client.ClientProxy", serverSide = "com.github.nyasroryo.lanticaltech.common.CommonProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    LoggerPlus.setLogger(event.getModLog());
    LoggerPlus.logInfo("LanticalTech will initialization soon.");
    proxy.preInit(event);
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    LoggerPlus.logInfo("LanticalTech is in initialization now.");
    proxy.init(event);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    LoggerPlus.logInfo("LanticalTech successful initializationed.");
    proxy.postInit(event);
  }


}