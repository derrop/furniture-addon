package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.core.ModSounds;
import net.minecraft.util.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundEvents.class)
public class SoundEventsMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void register(CallbackInfo info) {
        ModSounds.register();
    }

}
