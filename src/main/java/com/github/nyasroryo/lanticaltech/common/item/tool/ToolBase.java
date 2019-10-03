package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import java.util.HashSet;
import java.util.Set;

public abstract class ToolBase extends ItemTool {

  public ToolBase
      (
          String name,
          Set<Block> effectiveBlocks,
          Item.ToolMaterial material
      ) {
    super(6 , 1, material, effectiveBlocks);
    this.setCreativeTab(CreativeTab.TAB_ITEMS);
    this.setTranslationKey(name);
    this.setRegistryName(name);
  }

  public ToolBase
      (
          String name,
          Item.ToolMaterial material
      ) {
    this(name, new HashSet<>(), material);
  }

}