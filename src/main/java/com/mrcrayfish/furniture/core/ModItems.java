package com.mrcrayfish.furniture.core;

import com.mrcrayfish.furniture.FurnitureAddon;
import com.mrcrayfish.furniture.util.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.registry.Registry;

/**
 * Author: MrCrayfish
 */
public class ModItems {
    public static final Item SPATULA = register(Names.Item.SPATULA, new SwordItem(ItemTier.IRON, 3, -1.4F, new Item.Properties().group(FurnitureAddon.GROUP)));

    private static Item register(String name, Item item) {
        Registry.register(Registry.ITEM, name, item);
        return item;
    }

    public static void register() {
    }
}
