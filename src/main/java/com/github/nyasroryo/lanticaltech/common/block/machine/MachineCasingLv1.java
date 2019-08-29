package com.github.nyasroryo.lanticaltech.common.block.machine;

import com.github.nyasroryo.lanticaltech.common.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MachineCasingLv1 extends BlockBase {

    private static final String MyName = "machineCasingLv1";

    public MachineCasingLv1() {
        super(Material.IRON, MyName, SoundType.METAL, 3.0f, 14.0f, "pickaxe", 1);
    }

    public static final Block ME = new MachineCasingLv1();
    public static final Item BROTHER = new ItemBlock(ME).setRegistryName(MyName);
}