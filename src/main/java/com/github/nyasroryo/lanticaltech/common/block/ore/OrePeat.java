package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OrePeat extends BlockBase {

    private static final String MyName = "orePeat";

    public OrePeat() {
        super(Material.GROUND, MyName, SoundType.GROUND, 0.5f, 2.0f, "shovel", 0);
    }

    public static final Block ME = new OrePeat();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}