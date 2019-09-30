package com.github.nyasroryo.lanticaltech.loader;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.CeramicTile;
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
      OreDictionary.registerOre("ingot" + toOneUpperCase(Ingot.INGOT_VARIANTS[i]), new ItemStack(Dust.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Plate.PLATE_VARIANTS.length; i++) {
      OreDictionary.registerOre("plate" + toOneUpperCase(Plate.PLATE_VARIANTS[i]), new ItemStack(Dust.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Fuel.FUEL_VARIANTS.length; i++) {
      OreDictionary.registerOre("fuel" + toOneUpperCase(Fuel.FUEL_VARIANTS[i]), new ItemStack(Dust.THIS_ITEM, 1, i));
    }

    for (int i = 0; i < Gem.GEM_VARIANTS.length; i++) {
      OreDictionary.registerOre("gem" + toOneUpperCase(Gem.GEM_VARIANTS[i]), new ItemStack(Dust.THIS_ITEM, 1, i));
    }

    //Registry Blocksst.
    for (int i = 0; i < BlockList.BlockObject.length; i++) {
      OreDictionary.registerOre(toOneLowerCase(BlockList.BlockNames[i]) , (Block) BlockList.BlockObject[0][i]);
    }

    for (int i = 1; i < OtherConsts.Colors.length; i++) {
      OreDictionary.registerOre("ceramicTile" , new ItemStack(CeramicTile.THIS_BLOCK, 1, i));
      OreDictionary.registerOre("ceramicTile" + OtherConsts.Colors[0] , new ItemStack(CeramicTile.THIS_BLOCK, 1, 0));
      OreDictionary.registerOre("ceramicTile" + OtherConsts.Colors[i] , new ItemStack(CeramicTile.THIS_BLOCK, 1, i));
    }

  }

  private static String toOneUpperCase(String s){
    return ( s.substring(0,1).toUpperCase() ) + ( s.substring(1) );
  }

  private static String toOneLowerCase(String s){
    return ( s.substring(0,1).toLowerCase() ) + ( s.substring(1) );
  }
}
