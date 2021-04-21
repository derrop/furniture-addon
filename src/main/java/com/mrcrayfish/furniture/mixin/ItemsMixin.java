package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.core.ModBlocks;
import com.mrcrayfish.furniture.core.ModItems;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Items.class)
public class ItemsMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void register(CallbackInfo info) {
        ModItems.register();
        ModBlocks.registerItems();
    }

}
