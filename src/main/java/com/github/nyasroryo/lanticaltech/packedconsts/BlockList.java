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
          Ore.THIS_BLOCK,

          //机器
          MachineCasing.THIS_BLOCK,

          //建筑材料
          CeramicTile.THIS_BLOCK,

      },
      //方块对应物品对象
      {
          //矿石
          Ore.THIS_ITEMBLOCK,

          //机器
          MachineCasing.THIS_ITEMBLOCK,

          //建筑材料
          CeramicTile.THIS_ITEMBLOCK,

      }

  };


  public static final String[] BlockNames = {
          Ore.NAME,
          MachineCasing.NAME,
          CeramicTile.NAME,
  };

  public static final HashSet<Block> MachineSet = Sets.newHashSet(
      MachineCasing.THIS_BLOCK
  );
}