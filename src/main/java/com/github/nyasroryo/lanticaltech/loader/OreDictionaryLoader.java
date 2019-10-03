package com.github.nyasroryo.lanticaltech.loader;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.CeramicTile;
import com.github.nyasroryo.lanticaltech.common.block.machine.MachineCasing;
import com.github.nyasroryo.lanticaltech.common.block.ore.Ore;
import com.github.nyasroryo.lanticaltech.common.item.*;
import com.github.nyasroryo.lanticaltech.packedconsts.BlockList;
import com.github.nyasroryo.lanticaltech.packedconsts.OtherConsts;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class OreDictionaryLoader {
  public static void regOreDict(){

    //Registry Items
    for (int i = 0; i < Dust.DUST_VARIANTS.length; i++) {
      OreDictionary.registerOre("dust" + toOneUpperCase(Dust.DUST_VARIANTS[i]), new ItemStack(Dust.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Ingot.INGOT_VARIANTS.length; i++) {
      OreDictionary.registerOre("ingot" + toOneUpperCase(Ingot.INGOT_VARIANTS[i]), new ItemStack(Ingot.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Plate.PLATE_VARIANTS.length; i++) {
      OreDictionary.registerOre("plate" + toOneUpperCase(Plate.PLATE_VARIANTS[i]), new ItemStack(Plate.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Fuel.FUEL_VARIANTS.length; i++) {
      OreDictionary.registerOre("fuel" + toOneUpperCase(Fuel.FUEL_VARIANTS[i]), new ItemStack(Fuel.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Gem.GEM_VARIANTS.length; i++) {
      OreDictionary.registerOre("gem" + toOneUpperCase(Gem.GEM_VARIANTS[i]), new ItemStack(Gem.THIS_ITEM, 1, i));
    }

    //Registry Blocks

    for (int i = 0; i < OtherConsts.Colors.length; i++) {
      OreDictionary.registerOre("ceramicTile" + toOneUpperCase(OtherConsts.Colors[i]), new ItemStack(CeramicTile.THIS_BLOCK, 1, i));
    }

    for (int i = 0; i < MachineCasing.MachineLevels.length; i++) {
      OreDictionary.registerOre("machineCasing" + toOneUpperCase(MachineCasing.MachineLevels[i]), new ItemStack(MachineCasing.THIS_BLOCK, 1, i));
    }

    for (int i = 0; i < Ore.ORE_VARIANT.length; i++) {
      OreDictionary.registerOre("ore" + toOneUpperCase(Ore.ORE_VARIANT[i]), new ItemStack(Ore.THIS_BLOCK, 1, i));
    }

  }

  private static String toOneUpperCase(String s){
    return ( s.substring(0,1).toUpperCase() ) + ( s.substring(1) );
  }

  private static String toOneLowerCase(String s){
    return ( s.substring(0,1).toLowerCase() ) + ( s.substring(1) );
  }
}
