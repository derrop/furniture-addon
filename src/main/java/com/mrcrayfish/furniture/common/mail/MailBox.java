package com.mrcrayfish.furniture.common.mail;

import com.mrcrayfish.furniture.util.INBTSerializable;
import com.mrcrayfish.furniture.util.NbtTagNumbers;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Author: MrCrayfish
 */
public class MailBox implements INBTSerializable<CompoundNBT> {
    private UUID id;
    private String name;
    private UUID ownerId;
    private String ownerName;
    private BlockPos pos;
    private RegistryKey<World> world = World.OVERWORLD;
    private List<Mail> mailStorage = new ArrayList<>();

    public MailBox(UUID id, String name, UUID ownerId, String ownerName, BlockPos pos, RegistryKey<World> world) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.pos = pos;
        this.world = world;
    }

    public MailBox(CompoundNBT compound) {
        this.deserializeNBT(compound);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BlockPos getPos() {
        return this.pos;
    }

    public RegistryKey<World> getWorld() {
        return world;
    }

    public void addMail(Mail mail) {
        this.mailStorage.add(mail);
    }

    public List<Mail> getMailStorage() {
        return this.mailStorage;
    }

    public int getMailCount() {
        return this.mailStorage.size();
    }

    public CompoundNBT serializeDetails() {
        CompoundNBT compound = new CompoundNBT();
        compound.putUniqueId("MailBoxUUID", this.id);
        compound.putString("MailBoxName", this.name);
        compound.putUniqueId("OwnerUUID", this.ownerId);
        compound.putString("OwnerName", this.ownerName);
        return compound;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT compound = new CompoundNBT();
        compound.putUniqueId("MailBoxUUID", this.id);
        compound.putString("MailBoxName", this.name);
        compound.putUniqueId("OwnerUUID", this.ownerId);
        compound.putString("OwnerName", this.ownerName);
        compound.put("Pos", NBTUtil.writeBlockPos(this.pos));
        compound.putString("World", this.world.getLocation().toString());

        if (!this.mailStorage.isEmpty()) {
            ListNBT mailStorageList = new ListNBT();
            this.mailStorage.forEach(mail -> mailStorageList.add(mail.serializeNBT()));
            compound.put("MailStorage", mailStorageList);
        }

        return compound;
    }

    @Override
    public void deserializeNBT(CompoundNBT compound) {
        this.mailStorage = new ArrayList<>();

        this.id = compound.getUniqueId("MailBoxUUID");
        this.name = compound.getString("MailBoxName");
        this.ownerId = compound.getUniqueId("OwnerUUID");
        this.ownerName = compound.getString("OwnerName");
        this.pos = NBTUtil.readBlockPos(compound.getCompound("Pos"));
        this.world = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation(compound.getString("World")));

        if (compound.contains("MailStorage", NbtTagNumbers.TAG_LIST)) {
            ListNBT mailStorageList = compound.getList("MailStorage", NbtTagNumbers.TAG_COMPOUND);
            mailStorageList.forEach(nbt2 ->
            {
                CompoundNBT mailCompound = (CompoundNBT) nbt2;
                this.mailStorage.add(new Mail(mailCompound));
            });
        }
    }
}
