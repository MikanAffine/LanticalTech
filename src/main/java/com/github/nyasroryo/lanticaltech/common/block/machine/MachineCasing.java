package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import com.github.nyasroryo.lanticaltech.common.item.tool.ToolWrench;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Objects;

public class MachineCasing extends BlockBase {

  public static final String[] MachineLevels = {
      "Makeshift",
      "Engineering",
      "Industrial",
      "Precision",
      "SpaceLevel",
      "Nano",
      "Peak",
  };
  /*
  机器外壳材料对照表:
    Lv1 Makeshift - 铁
    Lv2 Engineering - 钢
    Lv3 Industrial - 铝
    Lv4 Precision - 不锈钢
    Lv5 SpaceLevel - 镀钨钛
    Lv6 Nano - 碳板
    Lv7 Peak - 石墨烯, 碳纳米管, 铱
  */

  public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, MachineLevels.length - 1);
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
  public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
    if ((getMetaFromState(state) == 3) && !(player.getHeldItemMainhand().getItem() instanceof ToolWrench)){
      return;
    }
    this.dropBlockAsItem(worldIn, pos, state, 1);
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
  public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
    float[] hardness = new float[]{
        3.0F,
        5.0F,
        2.5F,

    };
    return hardness[getMetaFromState(state)];

  }

  @Override
  public float getExplosionResistance(World world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
    float[] hardness = new float[]{
        22.0F,
        37.0F,
        16.0F,

    };
    return hardness[getMetaFromState(world.getBlockState(pos))];
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
