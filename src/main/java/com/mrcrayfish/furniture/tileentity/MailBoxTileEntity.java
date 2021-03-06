package com.mrcrayfish.furniture.tileentity;

import com.mrcrayfish.furniture.core.ModTileEntities;
import com.mrcrayfish.furniture.inventory.container.MailBoxContainer;
import com.mrcrayfish.furniture.util.NbtTagNumbers;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.UUID;

/**
 * Author: MrCrayfish
 */
public class MailBoxTileEntity extends BasicLootTileEntity implements ITickableTileEntity {
    private UUID id;
    private String name;
    private String ownerName;
    private UUID ownerId;

    public MailBoxTileEntity() {
        super(ModTileEntities.MAIL_BOX);
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        if (this.id == null) {
            this.id = id;
        }
    }

    public String getMailBoxName() {
        return name;
    }

    public void setMailBoxName(String name) {
        this.name = name;
    }

    public void setOwner(ServerPlayerEntity entity) {
        this.ownerId = entity.getUniqueID();
        this.ownerName = entity.getName().getString();
    }

    public UUID getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void tick() {
    }

    @Override
    public int getSizeInventory() {
        return 18;
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.cfm.mail_box", this.ownerName, this.name);
    }

    @Override
    protected Container createMenu(int windowId, PlayerInventory playerInventory) {
        return new MailBoxContainer(windowId, playerInventory, this);
    }

    @Override
    public void read(BlockState blockState, CompoundNBT compound) {
        super.read(blockState, compound);
        this.readData(compound);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        this.writeData(compound);
        return super.write(compound);
    }

    @Override
    public CompoundNBT getUpdateTag() {
        return this.writeData(new CompoundNBT());
    }

    @Nullable
    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        return new SUpdateTileEntityPacket(this.pos, 0, this.getUpdateTag());
    }

    private void readData(CompoundNBT compound) {
        if (compound.hasUniqueId("MailBoxUUID")) {
            this.id = compound.getUniqueId("MailBoxUUID");
        }
        if (compound.contains("MailBoxName", NbtTagNumbers.TAG_STRING)) {
            this.name = compound.getString("MailBoxName");
        }
        if (compound.contains("OwnerName", NbtTagNumbers.TAG_STRING)) {
            this.ownerName = compound.getString("OwnerName");
        }
        if (compound.hasUniqueId("OwnerUUID")) {
            this.ownerId = compound.getUniqueId("OwnerUUID");
        }
    }

    private CompoundNBT writeData(CompoundNBT compound) {
        if (this.id != null) {
            compound.putUniqueId("MailBoxUUID", this.id);
        }
        if (this.name != null) {
            compound.putString("MailBoxName", this.name);
        }
        if (this.ownerName != null && this.ownerId != null) {
            compound.putString("OwnerName", this.ownerName);
            compound.putUniqueId("OwnerUUID", this.ownerId);
        }
        return compound;
    }
}
