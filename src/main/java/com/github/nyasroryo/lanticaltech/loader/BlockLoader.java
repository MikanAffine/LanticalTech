package com.github.nyasroryo.lanticaltech.loader;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.*;
import com.github.nyasroryo.lanticaltech.packedconsts.BlockList;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader extends BlockList {

  public static void BlockReg(FMLPreInitializationEvent event) {
    for (int number = 0; number < BlockObject[0].length; number++) {
      ForgeRegistries.BLOCKS.register((Block) BlockObject[0][number]);
      ForgeRegistries.ITEMS.register((Item) BlockObject[1][number]);
    }
  }


  @SideOnly(Side.CLIENT)
  public static void SetBlockModel() {
    for (int number = 0; number < BlockObject[0].length; number++) {
      ModelLoader.setCustomModelResourceLocation((Item) BlockObject[1][number], 0, new ModelResourceLocation(((Item) BlockObject[1][number]).getRegistryName(), "inventory"));
    }

    for (int i = 0; i < 16; i++) {
      ModelLoader.setCustomModelResourceLocation(CeramicTile.THIS_ITEMBLOCK, i, new ModelResourceLocation("ceramictile","inventory"));
    }
  }


}
