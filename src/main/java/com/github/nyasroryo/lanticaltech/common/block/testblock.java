package com.github.nyasroryo.lanticaltech.common.block;

import com.github.nyasroryo.lanticaltech.client.creativetab.CreativeTab;
import com.github.nyasroryo.lanticaltech.common.tileentity.TileEntityEnergyStorage;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class testblock extends Block {

  public static final Block THIS_BLOCK = new testblock();
  public static final Item THIS_ITEMBLOCK = new ItemBlock(THIS_BLOCK).setRegistryName("testblock");

  public testblock() {
    super(Material.ROCK);
    setRegistryName("testblock");

    setSoundType(SoundType.GROUND);
    setHardness(1f);
    setResistance(1f);
    setHarvestLevel("pickaxe", 1);
    setCreativeTab(CreativeTab.TAB_BLOCKS);
    setTranslationKey("testBlock");
  }

  @Nullable
  @Override
  public TileEntity createTileEntity(World world, IBlockState state) {
    return new TileEntityEnergyStorage(10000,100,1000,3137);
  }

  @Override
  public boolean hasTileEntity(IBlockState state) {
    return true;
  }


}
