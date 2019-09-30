package com.github.nyasroryo.lanticaltech.client.creativetab;

import com.github.nyasroryo.lanticaltech.common.block.machine.MachineCasingLv1;
import com.github.nyasroryo.lanticaltech.common.item.Ingot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab {
  public static final CreativeTabs TAB_ITEMS = new CreativeTabs("tabItems") {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(Ingot.THIS_ITEM, 1, 5);
    }
  };

  public static final CreativeTabs TAB_BLOCKS = new CreativeTabs("tabBlocks") {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(MachineCasingLv1.THIS_BLOCK);
    }
  };

}