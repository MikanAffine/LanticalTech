package com.github.nyasroryo.lanticaltech;

import com.github.nyasroryo.lanticaltech.common.CommonProxy;

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
public class LanticalTech
{
    public static final String MODID = "lanticaltech";
    public static final String NAME = "LanticalTech";
    public static final String VERSION = "Beta 1.0.2 b59";
    public static final String MCVERSION = "1.12.2";

    @Instance(MODID)
    public static LanticalTech instance;

    private static Logger logger;

    private Logger getLogger() {
        return logger;
    }

    @SidedProxy(clientSide = "com.github.nyasroryo.lanticaltech.client.ClientProxy", serverSide = "com.github.nyasroryo.lanticaltech.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        LanticalTech.instance.getLogger().info("LanticalTech will initialization soon.");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LanticalTech.instance.getLogger().info("LanticalTech is in initialization now.");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LanticalTech.instance.getLogger().info("LanticalTech successful initializationed.");
        proxy.postInit(event);
    }


}