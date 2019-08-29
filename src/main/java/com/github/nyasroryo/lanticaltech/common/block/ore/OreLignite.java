package com.github.nyasroryo.lanticaltech.common.block.ore;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class OreLignite extends BlockBase {

    private static final String MyName = "oreLignite";

    public OreLignite() {
        super(Material.ROCK, MyName, SoundType.STONE, 1.5f, 8.0f, "pickaxe", 0);
    }

    public static final Block ME = new OreLignite();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}