package com.mrcrayfish.furniture.core;

import com.mrcrayfish.furniture.item.crafting.FreezerSolidifyRecipe;
import com.mrcrayfish.furniture.item.crafting.GrillCookingRecipe;
import net.minecraft.item.crafting.CookingHack;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.registry.Registry;

/**
 * Author: MrCrayfish
 */
public class ModRecipeSerializers {
    public static final CookingRecipeSerializer<GrillCookingRecipe> GRILL_COOKING = register("cfm:grill_cooking", CookingHack.createCookingSerializer(GrillCookingRecipe::new, 100));
    public static final CookingRecipeSerializer<FreezerSolidifyRecipe> FREEZER_SOLIDIFY = register("cfm:freezer_solidify", CookingHack.createCookingSerializer(FreezerSolidifyRecipe::new, 100));

    private static <T extends IRecipeSerializer<? extends IRecipe<?>>> T register(String name, T t) {
        Registry.register(Registry.RECIPE_SERIALIZER, name, t);
        return t;
    }

    public static void register() {
    }
}
