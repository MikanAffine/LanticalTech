package com.github.nyasroryo.lanticaltech.api;

import com.github.nyasroryo.lanticaltech.common.item.ItemList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader extends ItemList {

  public static void ItemReg(FMLPreInitializationEvent event) {
    for (int number1 = 0; number1 < ItemObject.length; number1++) {
      for (int number2 = 0; number2 < ItemObject[number1].length; number2++) {
        ForgeRegistries.ITEMS.register(ItemObject[number1][number2]);
      }
    }
  }

    @SideOnly(Side.CLIENT)
    public static void SetItemModel () {
        for (int number1 = 0; number1 < ItemObject.length; number1++) {
          for (int number2 = 0; number2 < ItemObject[number1].length; number2++) {
            ModelLoader.setCustomModelResourceLocation(ItemObject[number1][number2], 0, new ModelResourceLocation(ItemObject[number1][number2].getRegistryName(), "inventory"));
          }
        }
  }
}