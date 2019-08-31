package com.github.nyasroryo.lanticaltech.api;

import com.github.nyasroryo.lanticaltech.common.block.BlockList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader extends BlockList {

  public static void BlockReg(FMLPreInitializationEvent event) {
    for (int number1 = 0; number1 < BlockObject.length; number1++) {
      for (int number2 = 0; number2 < BlockObject[number1].length; number2++) {
      ForgeRegistries.BLOCKS.register(BlockObject[number1][number2]);
      ForgeRegistries.ITEMS.register(ItemBlockObject[number1][number2]);
      }
    }
  }


  @SideOnly(Side.CLIENT)
  public static void SetBlockModel() {
    for (int number1 = 0; number1 < BlockObject.length; number1++) {
      for (int number2 = 0; number2 < BlockObject[number1].length; number2++) {
        ModelLoader.setCustomModelResourceLocation(ItemBlockObject[number1][number2], 0, new ModelResourceLocation(ItemBlockObject[number1][number2].getRegistryName(), "inventory"));
      }
    }
  }
}
