package com.github.nyasroryo.lanticaltech.common.item;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.item.Item;

public abstract class ItemBase extends Item {

  public ItemBase
      (
          String Name
      ) {
    super();
    this.setCreativeTab(CreativeTab.TAB_ITEMS);
    this.setTranslationKey(Name);
    this.setRegistryName(Name);
  }
}
