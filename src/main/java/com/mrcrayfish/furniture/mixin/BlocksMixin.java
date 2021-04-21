package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.core.ModBlocks;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Blocks.class)
public class BlocksMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void register(CallbackInfo info) {
        ModBlocks.register();
    }

}
