package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv3 extends BlockBase {

    private static final String MyName = "machineCasingLv3";

    public MachineCasingLv3() {
        super(Material.IRON, MyName, SoundType.METAL, 2.0f, 16.0f, "pickaxe", 2);
    }

    public static final Block ME = new MachineCasingLv3();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}