package com.github.nyasroryo.lanticaltech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Gem extends ItemBase {

  public static final String MyName = "gem";
  public static final Item THIS_ITEM = new Gem();

  public static final String[] GEM_VARIANTS = {
      "cyrolite"

  };

  public Gem() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }


  public String getTranslationKey(ItemStack stack)
  {
    return this.getTranslationKey() + "." + GEM_VARIANTS[stack.getMetadata()];
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < GEM_VARIANTS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }
}