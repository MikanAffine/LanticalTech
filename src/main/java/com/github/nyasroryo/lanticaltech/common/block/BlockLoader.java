package com.github.nyasroryo.lanticaltech.common.block;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader extends BlockList {

  public static void BlockReg(FMLPreInitializationEvent event) {
    for (int number = 0; number < BlockObject.length; number++) {
        ForgeRegistries.BLOCKS.register(BlockObject[number]);
        ForgeRegistries.ITEMS.register(ItemBlockObject[number]);
    }
  }


  @SideOnly(Side.CLIENT)
  public static void SetBlockModel() {
    for (int number = 0; number < BlockObject.length; number++) {
        ModelLoader.setCustomModelResourceLocation(ItemBlockObject[number], 0, new ModelResourceLocation(ItemBlockObject[number].getRegistryName(), "inventory"));
    }
  }
}
