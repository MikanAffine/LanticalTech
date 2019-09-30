package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.packedconsts.BlockData;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class OreCyrolite extends BlockBase {

  private static final String NAME = "OreCyrolite";
  private static final Object[] DATA = BlockData.blockBaseData.get(NAME);
  private static final Object[] DATA_SPECIAL_ORE = BlockData.oreSpecial.get(NAME);
  public static final Block THIS_BLOCK = new OreCyrolite();
  public static final Item THIS_ITEMBLOCK = new ItemBlock(THIS_BLOCK).setRegistryName(NAME);

  private OreCyrolite() {
    super(NAME);
  }


  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return (Item) DATA_SPECIAL_ORE[0];
  }

  @Override
  public int damageDropped(IBlockState state) {
    return 0;
  }

  @Override
  public int quantityDropped(Random random) {
    return (int) DATA_SPECIAL_ORE[1];
  }

  @Override
  public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    return (int) DATA_SPECIAL_ORE[2];
  }

  @Override
  public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
    return new ItemStack(this);
  }
}