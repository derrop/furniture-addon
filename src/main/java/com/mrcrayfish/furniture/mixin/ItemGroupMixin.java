package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.Reference;
import net.minecraft.item.ItemGroup;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;

@Mixin(ItemGroup.class)
public class ItemGroupMixin {

    @Shadow
    @Mutable
    public static ItemGroup[] GROUPS;

    @Shadow
    @Final
    private String tabLabel;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void modifyGroupsSize(CallbackInfo callback) {
        GROUPS = Arrays.copyOfRange(GROUPS, 0, GROUPS.length + 1);
    }

    @Inject(method = "isOnTopRow", at = @At("HEAD"), cancellable = true)
    private void isOnTopRow(CallbackInfoReturnable<Boolean> callback) {
        if (this.tabLabel.equals(Reference.MOD_ID)) {
            callback.setReturnValue(true);
        }
    }

    @Inject(method = "getColumn", at = @At("HEAD"), cancellable = true)
    private void getColumn(CallbackInfoReturnable<Integer> callback) {
        if (this.tabLabel.equals(Reference.MOD_ID)) {
            callback.setReturnValue(4);
        }
    }

}
