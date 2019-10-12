package com.github.nyasroryo.lanticaltech.common.item.tool.supers;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import com.github.nyasroryo.lanticaltech.common.block.buildmaterial.CeramicTile;
import com.github.nyasroryo.lanticaltech.common.block.machine.MachineCasing;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Set;

public abstract class ToolPickaxe extends ItemPickaxe {
  public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);
  public static final Set<Block> EFFECTIVE_ON_CUSTOM = Sets.newHashSet(MachineCasing.THIS_BLOCK, CeramicTile.THIS_BLOCK);

  private Item.ToolMaterial material;

  public static final String toolClass = "pickaxe";

  public ToolPickaxe(Item.ToolMaterial material, int durability, String name) {
    super(material);
    this.material = material;
    setMaxDamage(durability - 1);
    setMaxStackSize(1);
    this.setCreativeTab(CreativeTab.TAB_ITEMS);
    this.setTranslationKey(name);
    this.setRegistryName(name);

  }

  public ToolPickaxe(Item.ToolMaterial material, String name) {
    this(material, material.getMaxUses(), name);
  }

  @Override
  public int getItemEnchantability(ItemStack stack) {
    return material.getEnchantability();
  }

  @Override
  public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
    return material.getHarvestLevel();
  }


  @Override
  public boolean canHarvestBlock(IBlockState block) {
    return super.canHarvestBlock(block) || (EFFECTIVE_ON.contains(block.getBlock()) || EFFECTIVE_ON_CUSTOM.contains(block.getBlock()));
  }

  @Override
  public int getMaxDamage(ItemStack stack) {
    return material.getMaxUses();
  }


  @Override
  public float getDestroySpeed(ItemStack stack, IBlockState state) {
    return ((EFFECTIVE_ON.contains(state.getBlock())) || (EFFECTIVE_ON_CUSTOM.contains(state.getBlock())))
        ? material.getEfficiency()
        : material.getEfficiency() * 1.6F;
  }
}