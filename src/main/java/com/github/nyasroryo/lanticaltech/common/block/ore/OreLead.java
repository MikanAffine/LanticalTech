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

public class OreLead extends BlockBase {

  private static final String NAME = "OreLead";
  private static final Object[] DATA = BlockData.blockBaseData.get(NAME);
  public static final Block THIS_BLOCK = new OreLead();
  public static final Item THIS_ITEMBLOCK = new ItemBlock(THIS_BLOCK).setRegistryName(NAME);

  private OreLead() {
    super(NAME);
  }

  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return THIS_ITEMBLOCK;
  }

  @Override
  public int quantityDropped(Random random) {
    return 1;
  }

  @Override
  public int quantityDroppedWithBonus(int fortune, Random random) {
    return 1;
  }

  @Override
  public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    return 0;
  }

  @Override
  public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
    return new ItemStack(this);
  }
}