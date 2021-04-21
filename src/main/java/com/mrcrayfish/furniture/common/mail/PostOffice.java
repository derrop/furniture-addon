package com.mrcrayfish.furniture.common.mail;

import com.mrcrayfish.furniture.Reference;
import com.mrcrayfish.furniture.util.NbtTagNumbers;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.WorldSavedData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Author: MrCrayfish
 */
public class PostOffice extends WorldSavedData {
    private static final String DATA_NAME = Reference.MOD_ID + "_post_office";

    private Map<UUID, Map<UUID, MailBox>> playerMailboxMap = new HashMap<>();

    public PostOffice() {
        super(DATA_NAME);
    }

    public PostOffice(String name) {
        super(name);
    }

    public static void registerMailBox(ServerPlayerEntity playerEntity, UUID mailBoxId, String name, BlockPos pos) {
        PostOffice office = get(playerEntity.server);
        Map<UUID, MailBox> mailBoxMap = office.playerMailboxMap.computeIfAbsent(playerEntity.getUniqueID(), uuid -> new HashMap<>());
        mailBoxMap.put(mailBoxId, new MailBox(mailBoxId, name, playerEntity.getUniqueID(), playerEntity.getName().getString(), pos, playerEntity.world.getDimensionKey()));
        office.markDirty();
    }

    public static void unregisterMailBox(UUID playerId, UUID mailBoxId) {
    }

    public static List<MailBox> getMailBoxes(ServerPlayerEntity playerEntity) {
        PostOffice office = get(playerEntity.server);
        return office.playerMailboxMap.values().stream().flatMap(map -> map.values().stream()).collect(Collectors.toList());
    }

    public static boolean sendMailToPlayer(UUID playerId, UUID mailBoxId, Mail mail) {
        return false;
    }

    /**
     * Gets a supplier which provides mail for the specified mail box. Every time you call
     * {@link Supplier#get} it will remove mail from the queue. You should also not store this
     * supplier as it contains a MinecraftServer instance.
     *
     * @param playerId
     * @param mailBoxId
     * @return
     */
    public static Supplier<Mail> getMailForPlayerMailBox(UUID playerId, UUID mailBoxId) {
        return () -> null;
    }

    public static boolean setMailBoxName(UUID playerId, UUID mailBoxId, String name) {
        return false;
    }

    private static PostOffice get(MinecraftServer server) {
        ServerWorld world = server.getWorld(World.OVERWORLD);
        return world.getSavedData().getOrCreate(PostOffice::new, DATA_NAME);
    }

    @Override
    public void read(CompoundNBT compound) {
        playerMailboxMap.clear();
        if (compound.contains("PlayerMailBoxes", NbtTagNumbers.TAG_LIST)) {
            ListNBT playerMailBoxesList = compound.getList("PlayerMailBoxes", NbtTagNumbers.TAG_COMPOUND);
            playerMailBoxesList.forEach(nbt ->
            {
                CompoundNBT playerMailBoxesCompound = (CompoundNBT) nbt;
                UUID playerId = playerMailBoxesCompound.getUniqueId("PlayerUUID");

                if (playerMailBoxesCompound.contains("MailBoxes", NbtTagNumbers.TAG_LIST)) {
                    Map<UUID, MailBox> mailBoxMap = new HashMap<>();
                    ListNBT mailBoxList = playerMailBoxesCompound.getList("MailBoxes", NbtTagNumbers.TAG_COMPOUND);
                    mailBoxList.forEach(nbt2 ->
                    {
                        CompoundNBT mailBoxCompound = (CompoundNBT) nbt2;
                        UUID mailBoxId = mailBoxCompound.getUniqueId("MailBoxUUID");
                        MailBox mailBox = new MailBox(mailBoxCompound.getCompound("MailBox"));
                        mailBoxMap.put(mailBoxId, mailBox);
                    });
                    playerMailboxMap.put(playerId, mailBoxMap);
                }
            });
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        ListNBT playerMailBoxesList = new ListNBT();
        this.playerMailboxMap.forEach((playerId, mailStorage) ->
        {
            if (!mailStorage.isEmpty()) {
                CompoundNBT playerMailBoxesCompound = new CompoundNBT();
                playerMailBoxesCompound.putUniqueId("PlayerUUID", playerId);

                ListNBT mailBoxList = new ListNBT();
                mailStorage.forEach((mailBoxId, mailBox) ->
                {
                    CompoundNBT mailBoxCompound = new CompoundNBT();
                    mailBoxCompound.putUniqueId("MailBoxUUID", mailBoxId);
                    mailBoxCompound.put("MailBox", mailBox.serializeNBT());
                    mailBoxList.add(mailBoxCompound);
                });
                playerMailBoxesCompound.put("MailBoxes", mailBoxList);

                playerMailBoxesList.add(playerMailBoxesCompound);
            }
        });
        compound.put("PlayerMailBoxes", playerMailBoxesList);
        return compound;
    }
}
