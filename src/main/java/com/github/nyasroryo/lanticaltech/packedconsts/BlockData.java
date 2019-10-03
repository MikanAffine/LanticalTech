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
      put("OreCopper", new Object[]{
          "oreCopper",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          1,
      });
      put("OreTin", new Object[]{
          "oreTin",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          1,
      });
      put("OreLead", new Object[]{
          "oreLead",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          1,
      });
      put("OreBauxite", new Object[]{
          "oreBauxite",
          Material.ROCK,
          SoundType.STONE,
          2.5f,
          10.0f,
          "pickaxe",
          2,
      });
      put("OreCyrolite", new Object[]{
          "oreCyrolite",
          Material.ROCK,
          SoundType.STONE,
          3.0f,
          14.0f,
          "pickaxe",
          2,
      });
      put("OreSalt", new Object[]{
          "oreSalt",
          Material.ROCK,
          SoundType.STONE,
          1.5f,
          6.0f,
          "pickaxe",
          0,
      });
      put("OreAnthracite", new Object[]{
          "oreAnthracite",
          Material.ROCK,
          SoundType.STONE,
          2.0f,
          8.0f,
          "pickaxe",
          1,
      });
      put("OreLignite", new Object[]{
          "oreLignite",
          Material.ROCK,
          SoundType.STONE,
          1.5f,
          6.0f,
          "pickaxe",
          0,
      });
      put("OrePeat", new Object[]{
          "orePeat",
          Material.GROUND,
          SoundType.GROUND,
          0.5f,
          2.0f,
          "shovel",
          0,
      });

      //Machines
      put("MachineCasing", new Object[]{
          "machineCasing",
          Material.IRON,
          SoundType.METAL,
          3.0f,
          20.0f,
          "wrench",
          1,
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

  //只在掉落非自身的矿石中起效
  //原因：当调用掉落自身的矿石的 THIS_ITEMBLOCK 时，他还没有初始化。。。
  //真的是个神奇bug
  public static final HashMap<String, Object[]> oreSpecial = new HashMap<String, Object[]>() {
    {
      /*
      Template

        put("Key",new Object[] {
          DropItem,
          DropAmount,
          DropExp,

          TODO ↓
          GenHeightMax,
          GenHeightMin,
          GenFrequency,
          GenAmount
          });
        }
      */

      //Ores
      put("OreBauxite", new Object[]{
          Dust.THIS_ITEM,
          1,
          0
      });
      put("OreCyrolite", new Object[]{
          Gem.THIS_ITEM,
          1,
          9
      });
      put("OreSalt", new Object[]{
          Dust.THIS_ITEM,
          1,
          2
      });
      put("OreAnthracite", new Object[]{
          Fuel.THIS_ITEM,
          1,
          6
      });
      put("OreLignite", new Object[]{
          Fuel.THIS_ITEM,
          1,
          3
      });
      put("OrePeat", new Object[]{
          Fuel.THIS_ITEM,
          1,
          1
      });

    }
  };
}