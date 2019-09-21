package com.github.nyasroryo.lanticaltech.common.block.buildmaterial;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.translation.I18n;

public class CeramicTile extends BlockBase {

  public static final PropertyInteger COLOR = PropertyInteger.create("color", 0, 15);
  private static final String NAME = "CeramicTile";
  public static final Block THIS_BLOCK = new CeramicTile();
  public static final Item THIS_ITEMBLOCK = new ItemMultiTexture(THIS_BLOCK, THIS_BLOCK, input -> (EnumDyeColor.values()[input.getItemDamage()].getTranslationKey())).setRegistryName(NAME).setHasSubtypes(true);

  public CeramicTile() {
    super(NAME);
    this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, Integer.valueOf(0)));
    this.createBlockState();
  }


  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, new IProperty[]{COLOR});
  }


  @Override
  public IBlockState getStateFromMeta(int metadata) {
    return this.getDefaultState().withProperty(COLOR, metadata);
  }

  @Override
  public int getMetaFromState(IBlockState state) {
    return state.getValue(COLOR);
  }

  @Override
  public int damageDropped(IBlockState state) {
    return getMetaFromState(state);
  }

  public String getLocalizedName() {
    return I18n.translateToLocal(this.getTranslationKey() + "." + EnumDyeColor.WHITE.getTranslationKey() + ".name");
  }

  @Override
  public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
  {
    for (int i = 0; i < 16; i++) {
      items.add(new ItemStack(this, 1, i));
    }
  }

}