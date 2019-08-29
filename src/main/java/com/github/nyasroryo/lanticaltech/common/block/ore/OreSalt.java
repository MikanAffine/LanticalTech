package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreSalt extends BlockBase {

    private static final String MyName = "oreSalt";

    public OreSalt() {
        super(Material.ROCK, MyName, SoundType.STONE, 2.0f, 8.0f, "pickaxe", 0);
    }

    public static final Block ME = new OreSalt();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}