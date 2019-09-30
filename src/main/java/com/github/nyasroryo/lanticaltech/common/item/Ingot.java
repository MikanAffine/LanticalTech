package com.github.nyasroryo.lanticaltech.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Ingot extends ItemBase {

  public static final String MyName = "ingot";
  public static final Item THIS_ITEM = new Ingot();

  public static final String[] INGOT_VARIANTS = {
      "copper",
      "tin",
      "lead",
      "bronze",
      "aluminium",
      "steel"

  };

  public Ingot() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }


  public String getTranslationKey(ItemStack stack)
  {
    return this.getTranslationKey() + "." + INGOT_VARIANTS[stack.getMetadata()];
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < INGOT_VARIANTS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }
}