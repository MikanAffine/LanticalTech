package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv2 extends BlockBase {

    private static final String MyName = "machineCasingLv2";

    public MachineCasingLv2() {
        super(Material.IRON, MyName, SoundType.METAL, 5.0f, 28.0f, "pickaxe", 2);
    }

    public static final Block ME = new MachineCasingLv2();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}