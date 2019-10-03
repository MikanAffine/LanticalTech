package com.github.nyasroryo.lanticaltech.packedconsts;

import com.github.nyasroryo.lanticaltech.common.item.Dust;
import com.github.nyasroryo.lanticaltech.common.item.Fuel;
import com.github.nyasroryo.lanticaltech.common.item.Gem;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.HashMap;

//定义了方块的数据
//我怀疑省略掉的比增加的代码少。。
//总之算它封装了吧!

public abstract class BlockData {

  public static final HashMap<String, Object[]> blockBaseData = new HashMap<String, Object[]>() {
    {
      /*
      Template

        put("Key",new Object[] {
          Name,
          Material,
          WalkSound,
          Hardness,
          Resistance,
          HarvestTool,
          HarvestLevel
          });
        }
      */

      //Ores
      put("Ore", new Object[]{
          "ore",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          1,
      });

      //Machines
      put("MachineCasing", new Object[]{
          "machineCasing",
          Material.IRON,
          SoundType.METAL,
          3.0f,
          20.0f,
          "wrench",
          2,
      });

      //Build Materials
      put("CeramicTile", new Object[]{
          "ceramicTile",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          1
      });

    }
  };
}