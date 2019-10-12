package com.github.nyasroryo.lanticaltech.common.loader;

import com.github.nyasroryo.lanticaltech.common.worldgen.OreGenerator;
import net.minecraftforge.common.MinecraftForge;

public class WorldGeneratorLoader {
  public static void LoadWorldGenerator(){
    MinecraftForge.ORE_GEN_BUS.register(OreGenerator.class);

  }
}
