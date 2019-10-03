package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
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

import static com.github.nyasroryo.lanticaltech.packedconsts.OtherConsts.MachineLevels;

public class MachineCasing extends BlockBase {

  public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 2);
  public static final String NAME = "MachineCasing";
  public static final Block THIS_BLOCK = new MachineCasing();
  public static final Item THIS_ITEMBLOCK = new ItemMultiTexture(THIS_BLOCK, THIS_BLOCK, input -> (MachineLevels[input.getItemDamage()])).setRegistryName(NAME).setHasSubtypes(true);

  public MachineCasing() {
    super(NAME);
    this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0));
    this.createBlockState();
  }


  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, LEVEL);
  }

  @Override
  public IBlockState getStateFromMeta(int metadata) {
    return this.getDefaultState().withProperty(LEVEL, metadata);
  }

  @Override
  public int getMetaFromState(IBlockState state) {
    return state.getValue(LEVEL);
  }

  @Override
  public int damageDropped(IBlockState state) {
    return getMetaFromState(state);
  }

  @Override
  public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
  {
    for (int i = 0; i < MachineLevels.length; i++) {
      items.add(new ItemStack(this, 1, i));
    }
  }

  @Override
  public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
    switch (getMetaFromState(blockState)){
      case 0:
        return 3.0F;
      case 1:
        return 5.0F;
      case 2:
        return 2.5F;
      default:
        return 0F;
    }

  }

  @Override
  public float getExplosionResistance(World world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
    switch (getMetaFromState(world.getBlockState(pos))){
      case 0:
        return 22.0F;
      case 1:
        return 37.0F;
      case 2:
        return 16.0F;
      default:
        return 0F;
    }
  }

  @Override
  public String getHarvestTool(IBlockState state) {
    return "wrench";
  }

  @Override
  public boolean isToolEffective(String type, IBlockState state) {
    return Objects.equals(type, "wrench");
  }

}
