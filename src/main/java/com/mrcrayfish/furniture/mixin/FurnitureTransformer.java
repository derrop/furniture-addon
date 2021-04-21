package com.mrcrayfish.furniture.mixin;

import net.labymod.addon.AddonTransformer;
import net.labymod.api.TransformerType;

public class FurnitureTransformer extends AddonTransformer {
    @Override
    public void registerTransformers() {
        registerTransformer(TransformerType.ALL, "furnituremod.mixins.json");
    }
}
