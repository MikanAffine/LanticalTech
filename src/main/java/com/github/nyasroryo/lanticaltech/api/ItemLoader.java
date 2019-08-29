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
        for (net.minecraft.item.Item item : ItemObject) {
            ForgeRegistries.ITEMS.register(item);
        }
    }


    @SideOnly(Side.CLIENT)
    public static void SetItemModel() {
        int number;
        for (number = 0; number < ItemObject.length; number++) {
            ModelLoader.setCustomModelResourceLocation(ItemObject[number], 0, new ModelResourceLocation(ItemObject[number].getRegistryName(), "inventory"));
        }
    }
}