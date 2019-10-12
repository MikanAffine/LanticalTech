package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.common.item.Dust;
import com.github.nyasroryo.lanticaltech.common.item.Fuel;
import com.github.nyasroryo.lanticaltech.common.item.Gem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Random;

public class Ore extends BlockBase {


  public static final String[] ORE_VARIANT = {
      "copper",
      "tin",
      "lead",
      "bauxite",
      "cyrolite",
      "anthracite",
      "lignite",
      "peat",
      "magnetite",
      "hematite",

  };

  public static final PropertyInteger VARIANT = PropertyInteger.create("orevariant", 0, ORE_VARIANT.length - 1);
  public static final String NAME = "Ore";
  public static final Block THIS_BLOCK = new Ore();
  public static final Item THIS_ITEMBLOCK = new ItemMultiTexture(THIS_BLOCK, THIS_BLOCK, input -> (ORE_VARIANT[input.getItemDamage()])).setRegistryName(NAME).setHasSubtypes(true);

  public Ore() {
    super(NAME);
    this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, 0));
    this.createBlockState();
  }


  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, VARIANT);
  }

  @Override
  public IBlockState getStateFromMeta(int metadata) {
    return this.getDefaultState().withProperty(VARIANT, metadata);
  }

  @Override
  public int getMetaFromState(IBlockState state) {
    return state.getValue(VARIANT);
  }

  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    Item[] dropItem = new Item[]{
        Ore.THIS_ITEMBLOCK,
        Ore.THIS_ITEMBLOCK,
        Ore.THIS_ITEMBLOCK,
        Dust.THIS_ITEM,
        Gem.THIS_ITEM,
        Fuel.THIS_ITEM,
        Fuel.THIS_ITEM,
        Fuel.THIS_ITEM,
        Ore.THIS_ITEMBLOCK,
        Ore.THIS_ITEMBLOCK,

    };

    return dropItem[getMetaFromState(state)];
  }

  @Override
  public int damageDropped(IBlockState state) {
    int[] dropDamage = new int[]{
        0,
        1,
        2,
        9,
        0,
        0,
        1,
        2,
        8,
        9,

    };
    return dropDamage[getMetaFromState(state)];
  }

  @Override
  public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
  {
    for (int i = 0; i < ORE_VARIANT.length; i++) {
      items.add(new ItemStack(this, 1, i));
    }
  }

  @Override
  public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
    float[] hardness = new float[]{
        2.5F,
        2.5F,
        2.5F,
        2.5F,
        3.5F,
        2.0F,
        1.5F,
        0.6F,
        2.5F,
        2.5F,

    };
    return hardness[getMetaFromState(state)];
    }

  @Override
  public float getExplosionResistance(World world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
    float[] resistance = new float[]{
        10.0F,
        10.0F,
        10.0F,
        10.0F,
        14.0F,
        8.0F,
        6.5F,
        2.0F,
        10.0F,
        10.0F,

    };
    return resistance[getMetaFromState(world.getBlockState(pos))];
  }

  @Override
  public Material getMaterial(IBlockState state) {
    return getMetaFromState(state) == 6 ? Material.GROUND : Material.ROCK;
  }

  @Override
  public String getHarvestTool(IBlockState state) {
    return getMetaFromState(state) == 7 ? "pickaxe" : "shovel";
  }

  @Override
  public boolean isToolEffective(String type, IBlockState state) {
    return getMetaFromState(state) == 7
        ? Objects.equals(type, "shovel") : Objects.equals(type, "pickaxe");
  }

  @Override
  public int getHarvestLevel(IBlockState state) {
    int[] harvestLevel = new int[]{
        1,
        1,
        1,
        2,
        2,
        1,
        0,
        0,
        1,
        1,

    };

    return harvestLevel[getMetaFromState(state)];
  }

}