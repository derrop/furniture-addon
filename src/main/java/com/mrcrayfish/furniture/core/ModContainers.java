package com.mrcrayfish.furniture.core;

import com.mrcrayfish.furniture.inventory.container.CrateContainer;
import com.mrcrayfish.furniture.inventory.container.FreezerContainer;
import com.mrcrayfish.furniture.inventory.container.MailBoxContainer;
import com.mrcrayfish.furniture.inventory.container.PostBoxContainer;
import com.mrcrayfish.furniture.tileentity.CrateTileEntity;
import com.mrcrayfish.furniture.tileentity.FreezerTileEntity;
import com.mrcrayfish.furniture.tileentity.MailBoxTileEntity;
import com.mrcrayfish.furniture.util.Names;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Author: MrCrayfish
 */
public class ModContainers {
    @SuppressWarnings("ConstantConditions")
    public static final ContainerType<CrateContainer> CRATE = register(Names.Container.CRATE, (windowId, playerInventory) -> {
        return new CrateContainer(windowId, playerInventory, null, false);
    });

    public static final ContainerType<PostBoxContainer> POST_BOX = register(Names.Container.POST_BOX, PostBoxContainer::new);

    public static final ContainerType<MailBoxContainer> MAIL_BOX = register(Names.Container.MAIL_BOX, (windowId, playerInventory) -> {
        return new MailBoxContainer(windowId, playerInventory, null);
    });

    public static final ContainerType<FreezerContainer> FREEZER = register(Names.Container.FREEZER, (windowId, playerInventory) -> {
        return new FreezerContainer(windowId, playerInventory, null);
    });

    private static <T extends Container> ContainerType<T> register(String key, ContainerFactory factory) {
        Constructor<?> constructor = ContainerType.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object targetFactory = makeFactory(constructor.getParameterTypes()[0], factory);

        ContainerType<T> type;
        try {
            type = (ContainerType<T>) constructor.newInstance(targetFactory);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            throw new IllegalStateException(exception);
        }

        Registry.register(Registry.MENU, key, type);

        return type;
    }

    private static Object makeFactory(Class<?> target, ContainerFactory factory) {
        return Proxy.newProxyInstance(ModContainers.class.getClassLoader(), new Class[]{target}, (proxy, method, args) -> {
            if (method.getDeclaringClass().equals(target)) {
                return factory.create((int) args[0], (PlayerInventory) args[1]);
            }
            return method.invoke(factory, args);
        });
    }

    private interface ContainerFactory {
        Container create(int windowId, PlayerInventory inventory);
    }

    public static void register() {
    }
}
