package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.packedconsts.ToolMaterials;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

import static com.github.nyasroryo.lanticaltech.packedconsts.BlockList.MachineSet;

public class ToolWrench extends ToolBase {

  public static final String MyName = "toolWrench";
  public static final Item THIS_ITEM = new ToolWrench();
  public static final String toolClass = "wrench";

  public ToolWrench() {
    super(MyName, MachineSet, ToolMaterials.STEEL);
    setMaxStackSize(1);
    setMaxDamage(59);
    setNoRepair();
    setContainerItem(this);

  }

  @Override
  public float getDestroySpeed(ItemStack stack, IBlockState state) {
    return (MachineSet.contains(state.getBlock())) ? 9.0F : 1.0F;
  }

  @Override
  public boolean hasContainerItem(ItemStack stack) {
    return true;
  }

  @Override
  public ItemStack getContainerItem(ItemStack itemStack) {
    return itemStack.getItemDamage() < itemStack.getMaxDamage() ?
        new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;

  }

  @Override
  public int getItemEnchantability() {
    return 0;
  }

  @Override
  public boolean canHarvestBlock(IBlockState state) {
    return MachineSet.contains(state.getBlock());
  }

  @Override
  public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
    return 2;
  }


}
