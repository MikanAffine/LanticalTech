package com.github.nyasroryo.lanticaltech.common.block;

import com.github.nyasroryo.lanticaltech.common.block.ore.*;
import com.github.nyasroryo.lanticaltech.common.block.machine.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public abstract class BlockList{

    public static final Block[] BlockObject = {
            OreCopper.ME,
            OreTin.ME,
            OreLead.ME,
            OreBauxite.ME,
            OreCyrolite.ME,
            OreSalt.ME,
            OreAnthracite.ME,
            OreLignite.ME,
            OrePeat.ME,
            MachineCasingLv1.ME,
            MachineCasingLv2.ME,
            MachineCasingLv3.ME
            };

    public static final Item[] ItemBlockObject = {
            OreCopper.BROTHER,
            OreTin.BROTHER,
            OreLead.BROTHER,
            OreBauxite.BROTHER,
            OreCyrolite.BROTHER,
            OreSalt.BROTHER,
            OreAnthracite.BROTHER,
            OreLignite.BROTHER,
            OrePeat.BROTHER,
            MachineCasingLv1.BROTHER,
            MachineCasingLv2.BROTHER,
            MachineCasingLv3.BROTHER
    };
}