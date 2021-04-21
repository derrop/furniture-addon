package com.mrcrayfish.furniture.protocol;

import io.netty.buffer.Unpooled;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.events.network.PayloadMessageEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.CCustomPayloadPacket;
import net.minecraft.util.ResourceLocation;

public class ProtocolInitHandler {

    @Subscribe
    public void handleChannel(PayloadMessageEvent event) {
        if (!event.getChannelName().equalsIgnoreCase("cb:init")) {
            return;
        }

        String key = event.getPacketBuffer().readString();
        if (key.equals("StartHandshake")) {
            PacketBuffer buffer = new PacketBuffer(Unpooled.buffer());
            buffer.writeString("{\"protocol\":1}");
            Minecraft.getInstance().getConnection().sendPacket(new CCustomPayloadPacket(new ResourceLocation("cb:init"), buffer));
        }
    }

}
