package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreTin extends BlockBase {

    private static final String MyName = "oreTin";

    public OreTin() {
        super(Material.ROCK, MyName, SoundType.STONE, 2.5f, 10.0f, "pickaxe", 1);
    }

    public static final Block ME = new OreTin();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}