package com.mrcrayfish.furniture;

import com.mrcrayfish.furniture.core.ModBlocks;
import com.mrcrayfish.furniture.protocol.ProtocolInitHandler;
import com.mrcrayfish.furniture.proxy.ClientProxy;
import com.mrcrayfish.furniture.proxy.CommonProxy;
import net.labymod.api.LabyModAddon;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.events.client.TickEvent;
import net.labymod.settings.elements.SettingsElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

public class FurnitureAddon extends LabyModAddon {
    public static final ItemGroup GROUP = new FurnitureGroup(Reference.MOD_ID);
    public static final CommonProxy PROXY = new ClientProxy();

    private static File furniturePackFile;

    private boolean initialized;

    public static File getFurniturePackFile() {
        return furniturePackFile;
    }

    @Subscribe
    public void tick(TickEvent event) {
        if (this.initialized) {
            return;
        }
        this.initialized = true;

        PROXY.onSetupClient();

        for (ModBlocks.FurnitureBlock block : ModBlocks.getFurnitureBlocks()) {
            Minecraft.getInstance().getItemRenderer().getItemModelMesher().register(Item.BLOCK_TO_ITEM.get(block.getBlock()), new ModelResourceLocation(block.getLocation(), "inventory"));
        }
    }

    @Override
    public void onEnable() {
        super.getApi().getEventService().registerListener(new ProtocolInitHandler());

        this.initResourcePack();

        PROXY.onSetupCommon();
    }

    private void initResourcePack() {
        try {
            JarURLConnection connection = (JarURLConnection) getClass().getProtectionDomain().getCodeSource().getLocation().openConnection();
            furniturePackFile = Paths.get(connection.getJarFileURL().toURI()).toFile();
        } catch (IOException | URISyntaxException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void loadConfig() {
    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {
    }
}
