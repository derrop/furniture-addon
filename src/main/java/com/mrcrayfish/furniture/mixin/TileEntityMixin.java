package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.core.ModTileEntities;
import net.minecraft.tileentity.TileEntityType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TileEntityType.class)
public class TileEntityMixin {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void register(CallbackInfo info) {
        ModTileEntities.register();
    }

}
