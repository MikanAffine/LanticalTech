package com.github.nyasroryo.lanticaltech.common.item.tool.supers;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import java.util.HashSet;
import java.util.Set;

public abstract class ToolCustom extends ItemTool {


  public ToolCustom(String name, Set<Block> effectiveBlocks, Item.ToolMaterial material) {
    super(2 , 1, material, effectiveBlocks);
    this.setCreativeTab(CreativeTab.TAB_ITEMS);
    this.setTranslationKey(name);
    this.setRegistryName(name);
  }

  public ToolCustom(String name, Item.ToolMaterial material) {
    this(name, new HashSet<>(), material);
  }

}