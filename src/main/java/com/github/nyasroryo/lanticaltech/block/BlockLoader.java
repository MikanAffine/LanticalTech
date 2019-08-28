package com.github.nyasroryo.lanticaltech.item;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class BlockLoader extends BlockList {

    //物品注册
    public static void BlockReg(FMLPreInitializationEvent event) {
        int number;
        for (number = 0; number < BlockObject.length; number++) {
            ForgeRegistries.ITEMS.register(ItemObject[number].setRegistryName(BlockName[number]));
        }
    }


    @SideOnly(Side.CLIENT)
    public static void SetItemModel() {
        int number;
        for (number = 0; number < BlockObject.length; number++) {
            ModelLoader.setCustomModelResourceLocation(BlcokObject[number], 0, new ModelResourceLocation(BlockObject[number].getRegistryName(), "inventory"));
        }
    }
}