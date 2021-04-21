package com.mrcrayfish.furniture.mixin;

import com.mrcrayfish.furniture.FurnitureAddon;
import net.minecraft.resources.FilePack;
import net.minecraft.resources.IResourcePack;
import net.minecraft.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SimpleReloadableResourceManager.class)
public abstract class ResourceManagerMixin {

    @Shadow
    protected abstract void addResourcePack(IResourcePack resourcePack);

    @Redirect(method = "reloadResources", at = @At(value = "INVOKE", target = "Lnet/minecraft/resources/SimpleReloadableResourceManager;clearResourceNamespaces()V"))
    public void loadFurnitureResourcePack(SimpleReloadableResourceManager resourceManager) {
        resourceManager.close();
        if (FurnitureAddon.getFurniturePackFile() != null) {
            this.addResourcePack(new FilePack(FurnitureAddon.getFurniturePackFile()));
        }
    }

}
