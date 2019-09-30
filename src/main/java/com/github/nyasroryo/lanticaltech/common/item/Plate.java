package com.github.nyasroryo.lanticaltech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Plate extends ItemBase {

  public static final String MyName = "plate";
  public static final Item THIS_ITEM = new Plate();

  public static final String[] PLATE_VARIANTS = {
      "copper",
      "tin",
      "lead",
      "bronze",
      "aluminium",
      "steel",
      "iron",
      "gold"

  };

  public Plate() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }

  @Override
  public String getTranslationKey(ItemStack stack)
  {
    return this.getTranslationKey() + "." + PLATE_VARIANTS[stack.getMetadata()];
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < PLATE_VARIANTS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }
}