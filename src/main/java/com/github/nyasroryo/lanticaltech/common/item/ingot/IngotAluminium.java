package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class IngotAluminium extends ItemBase {

    public static final String MyName = "ingotAluminium";

    public IngotAluminium() {
        super(MyName);
    }

    public static final Item ME = new IngotAluminium();
}