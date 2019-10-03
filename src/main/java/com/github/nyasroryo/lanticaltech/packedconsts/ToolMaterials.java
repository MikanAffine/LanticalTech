package com.github.nyasroryo.lanticaltech.packedconsts;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public abstract class ToolMaterials {

  public static final Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial
      ("BRONZE", 2, 230, 7.0F, 2.0F, 17);
  public static final Item.ToolMaterial STEEL = EnumHelper.addToolMaterial
      ("STEEL", 3, 550, 8.0F, 5.0F, 14);

}

/*
        WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
*/