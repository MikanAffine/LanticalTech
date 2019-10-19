package com.github.nyasroryo.lanticaltech.common.worldgen;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ModuleReplaceIronOre extends WorldGenerator {
  @Override
  public boolean generate(World world, Random rand, BlockPos pos) {
    return true;
  }
}
