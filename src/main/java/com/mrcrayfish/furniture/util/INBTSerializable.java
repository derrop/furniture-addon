package com.mrcrayfish.furniture.util;

import net.minecraft.nbt.INBT;

public interface INBTSerializable<T extends INBT> {

    T serializeNBT();

    void deserializeNBT(T compound);

}
