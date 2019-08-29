package com.github.nyasroryo.lanticaltech.common.item.ingot;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class IngotBronze extends ItemBase {

    public static final String MyName = "ingotBronze";

    public IngotBronze() {
        super(MyName);
    }

    public static final Item ME = new IngotBronze();
}