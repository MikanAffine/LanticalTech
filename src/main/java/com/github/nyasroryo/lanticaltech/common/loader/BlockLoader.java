package com.github.nyasroryo.lanticaltech.common.loader;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.CeramicTile;
import com.github.nyasroryo.lanticaltech.common.block.machine.MachineCasing;
import com.github.nyasroryo.lanticaltech.common.block.ore.Ore;
import com.github.nyasroryo.lanticaltech.common.block.testblock;
import com.github.nyasroryo.lanticaltech.common.packedconsts.BlockList;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.github.nyasroryo.lanticaltech.common.packedconsts.OtherConsts.Colors;

public class BlockLoader extends BlockList {

  public static void BlockReg(FMLPreInitializationEvent event) {
    for (Object o : BlockObject[0]) {
      ForgeRegistries.BLOCKS.register((Block) o);

    }

    for (Object p : BlockObject[1]) {
      ForgeRegistries.ITEMS.register((Item) p);

    }
  }

  @SideOnly(Side.CLIENT)
  public static void SetBlockModel() {
    for (int number = 0; number < BlockObject[0].length; number++) {
      ModelLoader.setCustomModelResourceLocation((Item) BlockObject[1][number], 0, new ModelResourceLocation(((Item) BlockObject[1][number]).getRegistryName(), "inventory"));
    }

    for (int i = 0; i < Colors.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          CeramicTile.THIS_ITEMBLOCK, i, new ModelResourceLocation(
              "lanticaltech:" + "ceramictile" + Colors[i],"inventory"));
    }

    for (int i = 0; i < MachineCasing.MachineLevels.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          MachineCasing.THIS_ITEMBLOCK, i, new ModelResourceLocation(
              "lanticaltech:" + "machinecasing" + MachineCasing.MachineLevels[i],"inventory"));
    }

    for (int i = 0; i < Ore.ORE_VARIANT.length; i++) {
      ModelLoader.setCustomModelResourceLocation(
          Ore.THIS_ITEMBLOCK, i, new ModelResourceLocation(
              "lanticaltech:" + "ore" + Ore.ORE_VARIANT[i],"inventory"));
    }
  }

}
