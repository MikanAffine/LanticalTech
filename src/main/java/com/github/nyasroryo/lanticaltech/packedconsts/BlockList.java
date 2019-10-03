package com.github.nyasroryo.lanticaltech.packedconsts;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.*;
import com.github.nyasroryo.lanticaltech.common.block.machine.*;
import com.github.nyasroryo.lanticaltech.common.block.ore.*;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;

import java.util.HashSet;

public abstract class BlockList {

  public static final Object[][] BlockObject = {
      //方块对象
      {
          //矿石
          OreCopper.THIS_BLOCK,
          OreTin.THIS_BLOCK,
          OreLead.THIS_BLOCK,
          OreBauxite.THIS_BLOCK,
          OreCyrolite.THIS_BLOCK,
          OreSalt.THIS_BLOCK,
          OreAnthracite.THIS_BLOCK,
          OreLignite.THIS_BLOCK,
          OrePeat.THIS_BLOCK,

          //机器
          MachineCasing.THIS_BLOCK,

          //建筑材料
          CeramicTile.THIS_BLOCK,

      },
      //方块对应物品对象
      {
          //矿石
          OreCopper.THIS_ITEMBLOCK,
          OreTin.THIS_ITEMBLOCK,
          OreLead.THIS_ITEMBLOCK,
          OreBauxite.THIS_ITEMBLOCK,
          OreCyrolite.THIS_ITEMBLOCK,
          OreSalt.THIS_ITEMBLOCK,
          OreAnthracite.THIS_ITEMBLOCK,
          OreLignite.THIS_ITEMBLOCK,
          OrePeat.THIS_ITEMBLOCK,

          //机器
          MachineCasing.THIS_ITEMBLOCK,

          //建筑材料
          CeramicTile.THIS_ITEMBLOCK,

      }

  };


  public static final String[] BlockNames = {
          OreCopper.NAME,
          OreTin.NAME,
          OreLead.NAME,
          OreBauxite.NAME,
          OreCyrolite.NAME,
          OreSalt.NAME,
          OreAnthracite.NAME,
          OreLignite.NAME,
          OrePeat.NAME,
          CeramicTile.NAME,
  };

  public static final HashSet<Block> MachineSet = Sets.newHashSet(
      MachineCasing.THIS_BLOCK
  );
}