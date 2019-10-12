package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.item.tool.supers.ToolCustom;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashSet;

public class ToolHammer extends ToolCustom {

  public static final String MyName = "toolHammer";
  public static final Item THIS_ITEM = new ToolHammer();
  public static final String toolClass = "hammer";

  public ToolHammer() {
    super(MyName, new HashSet<>(), Item.ToolMaterial.IRON);
    setMaxStackSize(1);
    setMaxDamage(59);
    setNoRepair();
    setContainerItem(this);

  }

  @Override
  public boolean hasContainerItem(ItemStack stack)
  {
    return true;
  }

  @Override
  public ItemStack getContainerItem(ItemStack itemStack)
  {
    return itemStack.getItemDamage() < itemStack.getMaxDamage() ?
        new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;

  }

}
