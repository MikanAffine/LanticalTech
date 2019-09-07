package com.github.nyasroryo.lanticaltech.common.block;

import com.github.nyasroryo.lanticaltech.common.block.machine.*;
import com.github.nyasroryo.lanticaltech.common.block.ore.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public abstract class BlockList {

  public static final Block[] BlockObject = {
	  
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
      MachineCasingLv1.THIS_BLOCK,
      MachineCasingLv2.THIS_BLOCK,
      MachineCasingLv3.THIS_BLOCK
  };

  public static final Item[] ItemBlockObject = {
	  
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
      MachineCasingLv1.THIS_ITEMBLOCK,
      MachineCasingLv2.THIS_ITEMBLOCK,
      MachineCasingLv3.THIS_ITEMBLOCK
  };
  
}