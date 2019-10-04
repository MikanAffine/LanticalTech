package com.github.nyasroryo.lanticaltech.common.item.tool;

import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.CeramicTile;
import com.github.nyasroryo.lanticaltech.common.block.machine.MachineCasing;
import com.github.nyasroryo.lanticaltech.packedconsts.ToolMaterials;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import javax.annotation.Nullable;

import java.util.Set;

public class ToolPickaxe extends ItemPickaxe {
  public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);
  public static final Set<Block> EFFECTIVE_ON_CUSTOM = Sets.newHashSet(MachineCasing.THIS_BLOCK, CeramicTile.THIS_BLOCK);

  public static final String MyName = "toolPickaxe";
  public static final Item THIS_ITEM = new ToolPickaxe();
  public static final String toolClass = "pickaxe";

  public ToolPickaxe() {
    super(ToolMaterials.BRONZE);
    setHasSubtypes(true);
    setMaxStackSize(1);

  }

  @Override
  public int getItemEnchantability(ItemStack stack) {
    return ToolMaterials.CUSTOM_TOOL_MATERIALS[stack.getMetadata()].getEnchantability();
  }

  @Override
  public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
    return ToolMaterials.CUSTOM_TOOL_MATERIALS[stack.getMetadata()].getHarvestLevel();
  }


  public boolean canHarvestBlock(IBlockState block) {
    return super.canHarvestBlock(block) || (EFFECTIVE_ON.contains(block) || EFFECTIVE_ON_CUSTOM.contains(block));
  }

  @Override
  public int getMaxDamage(ItemStack stack) {
    return ToolMaterials.CUSTOM_TOOL_MATERIALS[stack.getMetadata()].getMaxUses();
  }

  @Override
  public String getTranslationKey(ItemStack stack) {
    if (ToolMaterials.CUSTOM_TOOL_MATERIALS[stack.getMetadata()] == ToolMaterials.BRONZE){
      return this.getTranslationKey() + "." + "bronze";
    } else {
      return this.getTranslationKey() + "." + "steel";
    }
  }

  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
  {
    if (this.isInCreativeTab(tab)) {
      for (int i = 0; i < ToolMaterials.CUSTOM_TOOL_MATERIALS.length; ++i) {
        items.add(new ItemStack(this, 1, i));
      }
    }
  }


  public float getDestroySpeed(ItemStack stack, IBlockState state) {
    return ToolMaterials.CUSTOM_TOOL_MATERIALS[stack.getMetadata()].getEfficiency();
  }
}
