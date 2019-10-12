package com.github.nyasroryo.lanticaltech.common.item.tool.supers;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import javax.annotation.Nullable;

public abstract class WeaponSword extends ItemSword {

  private ToolMaterial material;
  private Float attackDamage;

  public static final String toolClass = "sword";

  public WeaponSword(ToolMaterial material, int durability, float damage, String name) {
    super(material);
    this.material = material;
    this.attackDamage = damage;
    setMaxDamage(durability - 1);
    setMaxStackSize(1);
    this.setCreativeTab(CreativeTab.TAB_ITEMS);
    this.setTranslationKey(name);
    this.setRegistryName(name);

  }

  public WeaponSword(ToolMaterial material, float damage, String name) {
    this(material, material.getMaxUses(), damage, name);
  }

  public WeaponSword(ToolMaterial material, String name) {
    this(material, material.getAttackDamage(), name);
  }



  @Override
  public float getAttackDamage()
  {
    return attackDamage;
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
  public int getMaxDamage(ItemStack stack) {
    return material.getMaxUses();
  }

}
