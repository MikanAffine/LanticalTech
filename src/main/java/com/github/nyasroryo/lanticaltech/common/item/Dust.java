package com.github.nyasroryo.lanticaltech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Dust extends ItemBase {

  public static final String MyName = "dust";
  public static final Item THIS_ITEM = new Dust();

  public static final String[] DUST_VARIANTS = {
      "copper",
      "tin",
      "lead",
      "bronze",
      "aluminium",
      "steel",
      "iron",
      "gold",
      "coal",
      "bauxite",
      "salt",

  };

  public Dust() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }

  @Override
  public String getTranslationKey(ItemStack stack)
  {
    return this.getTranslationKey() + "." + DUST_VARIANTS[stack.getMetadata()];
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < DUST_VARIANTS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }
}