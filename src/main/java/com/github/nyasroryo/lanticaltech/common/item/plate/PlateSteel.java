package com.github.nyasroryo.lanticaltech.common.item.plate;

import com.github.nyasroryo.lanticaltech.common.item.ItemBase;
import net.minecraft.item.Item;

public class PlateSteel extends ItemBase {

    public static final String MyName = "plateSteel";

    public PlateSteel() {
        super(MyName);
    }


    public static final Item ME = new PlateSteel();
}