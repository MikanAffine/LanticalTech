/*package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Ingot extends ItemBase {

  public static final String MyName = "ingot";
  public static final Item THIS_ITEM = new Ingot();

  public Ingot() {
    super(MyName);
    setHasSubtypes(true);
    setMaxDamage(0);
    setNoRepair();
  }

  @Override
  public void getSubItems(CreativeTabs tab, List<ItemStack> list) {
    for (int i=0; i < 7; i++){
      list.add(new ItemStack(item, 1, i));
    }
  }
}*/