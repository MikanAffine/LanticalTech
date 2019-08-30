package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.item.fuel.FuelPeat;
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
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class OrePeat extends BlockBase {

  private static final String MyName = "orePeat";
  private static final Item ItemDrop = FuelPeat.ME;
  private static final int DropAmount = 1;

  public OrePeat() {
    super(Material.GROUND, MyName, SoundType.GROUND, 0.5f, 2.0f, "shovel", 0);
  }

  public static final Block ME = new OrePeat();
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
    if (fortune > 0) {
      int bonusFactor = Math.max(random.nextInt(fortune) - 1, 0);
      return this.quantityDropped(random) * (bonusFactor + 1);
    } else {
      return this.quantityDropped(random);
    }
  }

  @Override
  public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    Random random = new Random();
    return MathHelper.getInt(random, 3, 7);
  }

  @Override
  public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
    return new ItemStack(this);
  }
}