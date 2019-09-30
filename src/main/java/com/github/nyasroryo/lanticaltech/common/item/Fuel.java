package com.github.nyasroryo.lanticaltech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Fuel extends ItemBase {

  public static final String MyName = "fuel";
  public static final Item THIS_ITEM = new Fuel();

  public static final String[] FUEL_VARIANTS = {
      "anthracite",
      "lignite",
      "peat",
      "coke"

  };

  public Fuel() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }


  public String getTranslationKey(ItemStack stack)
  {
    return this.getTranslationKey() + "." + FUEL_VARIANTS[stack.getMetadata()];
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < FUEL_VARIANTS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }
}