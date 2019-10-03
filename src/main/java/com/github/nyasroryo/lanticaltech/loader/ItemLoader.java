package com.github.nyasroryo.lanticaltech.loader;

import com.github.nyasroryo.lanticaltech.common.item.*;
import com.github.nyasroryo.lanticaltech.packedconsts.ItemList;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader extends ItemList {

  public static void ItemReg(FMLPreInitializationEvent event) {
    for (net.minecraft.item.Item item : ItemObject) {
      ForgeRegistries.ITEMS.register(item);
    }
  }

  @SideOnly(Side.CLIENT)
  public static void SetItemModel() {
    for (net.minecraft.item.Item item : ItemObject) {
      ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    for (int i = 0; i < Dust.DUST_VARIANTS.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Dust.THIS_ITEM, i, new ModelResourceLocation(
              "lanticaltech:" +"dust" + Dust.DUST_VARIANTS[i],"inventory"));
    }

    for (int i = 0; i < Ingot.INGOT_VARIANTS.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Ingot.THIS_ITEM, i, new ModelResourceLocation(
              "lanticaltech:" +"ingot" + Ingot.INGOT_VARIANTS[i],"inventory"));
    }

    for (int i = 0; i < Plate.PLATE_VARIANTS.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Plate.THIS_ITEM, i, new ModelResourceLocation(
              "lanticaltech:" +"plate" + Plate.PLATE_VARIANTS[i],"inventory"));
    }

    for (int i = 0; i < Fuel.FUEL_VARIANTS.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Fuel.THIS_ITEM, i, new ModelResourceLocation(
              "lanticaltech:" +"fuel" + Fuel.FUEL_VARIANTS[i],"inventory"));
    }


    for (int i = 0; i < Gem.GEM_VARIANTS.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Gem.THIS_ITEM, i, new ModelResourceLocation(
              "lanticaltech:" +"gem" + Gem.GEM_VARIANTS[i],"inventory"));
    }

  }
}