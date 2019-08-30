package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.item.dust.DustBauxite;
import com.github.nyasroryo.lanticaltech.template.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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

public class OreBauxite extends BlockBase {

  private static final String MyName = "oreBauxite";
  private static final Item ItemDrop = DustBauxite.ME;
  private static final int DropAmount = 1;

  public OreBauxite() {
    super(Material.ROCK, MyName, SoundType.STONE, 2.5f, 12.0f, "pickaxe", 2);
  }

  public static final Block ME = new OreBauxite();
  public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);

  @Override
  public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return ItemDrop;
  }

  @Override
  public int quantityDropped(Random random) {
    return DropAmount;
  }

  @Override
  public int quantityDroppedWithBonus(int fortune, Random random) {
      return 1;
  }

  @Override
  public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    return  1;
  }

  @Override
  public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
    return new ItemStack(this);
  }
}