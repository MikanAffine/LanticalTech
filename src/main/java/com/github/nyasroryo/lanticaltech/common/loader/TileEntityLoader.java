package com.github.nyasroryo.lanticaltech.common.loader;

import com.github.nyasroryo.lanticaltech.common.tileentity.TileEntityEnergyStorage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityLoader {
  public static void LoadTileEntity(){
    GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, new ResourceLocation("lanticaltech","TileEntityEnergyStorage"));
  }
}
