package com.mrcrayfish.furniture.proxy;

import com.mrcrayfish.furniture.core.ModBlocks;
import com.mrcrayfish.furniture.tileentity.GrillTileEntity;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColors;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Author: MrCrayfish
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void onSetupClient() {
        super.onSetupClient();

        Map<Block, RenderType> blockTypes;
        try {
            Field field = RenderTypeLookup.class.getDeclaredFields()[0];
            field.setAccessible(true);
            blockTypes = (Map<Block, RenderType>) field.get(null);
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
            return;
        }

        blockTypes.put(ModBlocks.HEDGE_OAK, RenderType.getCutoutMipped());
        blockTypes.put(ModBlocks.HEDGE_SPRUCE, RenderType.getCutoutMipped());
        blockTypes.put(ModBlocks.HEDGE_BIRCH, RenderType.getCutoutMipped());
        blockTypes.put(ModBlocks.HEDGE_JUNGLE, RenderType.getCutoutMipped());
        blockTypes.put(ModBlocks.HEDGE_ACACIA, RenderType.getCutoutMipped());
        blockTypes.put(ModBlocks.HEDGE_DARK_OAK, RenderType.getCutoutMipped());

        blockTypes.put(ModBlocks.TRAMPOLINE_WHITE, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_ORANGE, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_MAGENTA, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_LIGHT_BLUE, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_YELLOW, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_LIME, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_PINK, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_GRAY, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_LIGHT_GRAY, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_CYAN, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_PURPLE, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_BLUE, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_BROWN, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_GREEN, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_RED, RenderType.getCutout());
        blockTypes.put(ModBlocks.TRAMPOLINE_BLACK, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_WHITE, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_ORANGE, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_MAGENTA, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_LIGHT_BLUE, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_YELLOW, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_LIME, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_PINK, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_GRAY, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_LIGHT_GRAY, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_CYAN, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_PURPLE, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_BLUE, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_BROWN, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_GREEN, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_RED, RenderType.getCutout());
        blockTypes.put(ModBlocks.GRILL_BLACK, RenderType.getCutout());
        blockTypes.put(ModBlocks.POST_BOX, RenderType.getCutout());

        this.registerColors();
    }

    private void registerColors() {
        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xCCCCCC : 0,
                ModBlocks.PICKET_FENCE_WHITE,
                ModBlocks.PICKET_FENCE_ORANGE,
                ModBlocks.PICKET_FENCE_MAGENTA,
                ModBlocks.PICKET_FENCE_LIGHT_BLUE,
                ModBlocks.PICKET_FENCE_YELLOW,
                ModBlocks.PICKET_FENCE_LIME,
                ModBlocks.PICKET_FENCE_PINK,
                ModBlocks.PICKET_FENCE_GRAY,
                ModBlocks.PICKET_FENCE_LIGHT_GRAY,
                ModBlocks.PICKET_FENCE_CYAN,
                ModBlocks.PICKET_FENCE_PURPLE,
                ModBlocks.PICKET_FENCE_BLUE,
                ModBlocks.PICKET_FENCE_BROWN,
                ModBlocks.PICKET_FENCE_GREEN,
                ModBlocks.PICKET_FENCE_RED,
                ModBlocks.PICKET_FENCE_BLACK,
                ModBlocks.PICKET_GATE_WHITE,
                ModBlocks.PICKET_GATE_ORANGE,
                ModBlocks.PICKET_GATE_MAGENTA,
                ModBlocks.PICKET_GATE_LIGHT_BLUE,
                ModBlocks.PICKET_GATE_YELLOW,
                ModBlocks.PICKET_GATE_LIME,
                ModBlocks.PICKET_GATE_PINK,
                ModBlocks.PICKET_GATE_GRAY,
                ModBlocks.PICKET_GATE_LIGHT_GRAY,
                ModBlocks.PICKET_GATE_CYAN,
                ModBlocks.PICKET_GATE_PURPLE,
                ModBlocks.PICKET_GATE_BLUE,
                ModBlocks.PICKET_GATE_BROWN,
                ModBlocks.PICKET_GATE_GREEN,
                ModBlocks.PICKET_GATE_RED,
                ModBlocks.PICKET_GATE_BLACK,
                ModBlocks.POST_BOX
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xCCCCCC : 0,
                ModBlocks.PICKET_FENCE_WHITE,
                ModBlocks.PICKET_FENCE_ORANGE,
                ModBlocks.PICKET_FENCE_MAGENTA,
                ModBlocks.PICKET_FENCE_LIGHT_BLUE,
                ModBlocks.PICKET_FENCE_YELLOW,
                ModBlocks.PICKET_FENCE_LIME,
                ModBlocks.PICKET_FENCE_PINK,
                ModBlocks.PICKET_FENCE_GRAY,
                ModBlocks.PICKET_FENCE_LIGHT_GRAY,
                ModBlocks.PICKET_FENCE_CYAN,
                ModBlocks.PICKET_FENCE_PURPLE,
                ModBlocks.PICKET_FENCE_BLUE,
                ModBlocks.PICKET_FENCE_BROWN,
                ModBlocks.PICKET_FENCE_GREEN,
                ModBlocks.PICKET_FENCE_RED,
                ModBlocks.PICKET_FENCE_BLACK,
                ModBlocks.PICKET_GATE_WHITE,
                ModBlocks.PICKET_GATE_ORANGE,
                ModBlocks.PICKET_GATE_MAGENTA,
                ModBlocks.PICKET_GATE_LIGHT_BLUE,
                ModBlocks.PICKET_GATE_YELLOW,
                ModBlocks.PICKET_GATE_LIME,
                ModBlocks.PICKET_GATE_PINK,
                ModBlocks.PICKET_GATE_GRAY,
                ModBlocks.PICKET_GATE_LIGHT_GRAY,
                ModBlocks.PICKET_GATE_CYAN,
                ModBlocks.PICKET_GATE_PURPLE,
                ModBlocks.PICKET_GATE_BLUE,
                ModBlocks.PICKET_GATE_BROWN,
                ModBlocks.PICKET_GATE_GREEN,
                ModBlocks.PICKET_GATE_RED,
                ModBlocks.PICKET_GATE_BLACK,
                ModBlocks.POST_BOX
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xBBBBBB : 0,
                ModBlocks.CRATE_STRIPPED_OAK,
                ModBlocks.CRATE_STRIPPED_SPRUCE,
                ModBlocks.CRATE_STRIPPED_BIRCH,
                ModBlocks.CRATE_STRIPPED_JUNGLE,
                ModBlocks.CRATE_STRIPPED_ACACIA,
                ModBlocks.CRATE_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_OAK,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_OAK,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_OAK,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_OAK,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_DARK_OAK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xBBBBBB : 0,
                ModBlocks.CRATE_STRIPPED_OAK,
                ModBlocks.CRATE_STRIPPED_SPRUCE,
                ModBlocks.CRATE_STRIPPED_BIRCH,
                ModBlocks.CRATE_STRIPPED_JUNGLE,
                ModBlocks.CRATE_STRIPPED_ACACIA,
                ModBlocks.CRATE_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_OAK,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_COUNTER_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_OAK,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_DRAWER_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_OAK,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_SINK_LIGHT_STRIPPED_DARK_OAK,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_OAK,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_SPRUCE,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_BIRCH,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_JUNGLE,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_ACACIA,
                ModBlocks.KITCHEN_SINK_DARK_STRIPPED_DARK_OAK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0x999999 : 0,
                ModBlocks.PARK_BENCH_STRIPPED_OAK,
                ModBlocks.PARK_BENCH_STRIPPED_SPRUCE,
                ModBlocks.PARK_BENCH_STRIPPED_BIRCH,
                ModBlocks.PARK_BENCH_STRIPPED_JUNGLE,
                ModBlocks.PARK_BENCH_STRIPPED_ACACIA,
                ModBlocks.PARK_BENCH_STRIPPED_DARK_OAK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0x999999 : 0,
                ModBlocks.PARK_BENCH_STRIPPED_OAK,
                ModBlocks.PARK_BENCH_STRIPPED_SPRUCE,
                ModBlocks.PARK_BENCH_STRIPPED_BIRCH,
                ModBlocks.PARK_BENCH_STRIPPED_JUNGLE,
                ModBlocks.PARK_BENCH_STRIPPED_ACACIA,
                ModBlocks.PARK_BENCH_STRIPPED_DARK_OAK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xCCCCCC : 0,
                ModBlocks.FRIDGE_LIGHT,
                ModBlocks.FRIDGE_DARK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> i == 1 ? 0xCCCCCC : 0,
                ModBlocks.FRIDGE_LIGHT,
                ModBlocks.FRIDGE_DARK
        );

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> FoliageColors.getSpruce(),
                ModBlocks.HEDGE_SPRUCE);

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> FoliageColors.getBirch(),
                ModBlocks.HEDGE_BIRCH);

        Minecraft.getInstance().getBlockColors().register((state, reader, pos, i) -> reader != null && pos != null ? BiomeColors.getFoliageColor(reader, pos) : FoliageColors.getDefault(),
                ModBlocks.HEDGE_OAK,
                ModBlocks.HEDGE_JUNGLE,
                ModBlocks.HEDGE_ACACIA,
                ModBlocks.HEDGE_DARK_OAK);

        Minecraft.getInstance().getBlockColors().register(
                (state, reader, pos, i) -> Minecraft.getInstance().getBlockColors().getColor(state, null, null, i),
                ModBlocks.HEDGE_OAK, ModBlocks.HEDGE_SPRUCE, ModBlocks.HEDGE_BIRCH, ModBlocks.HEDGE_JUNGLE, ModBlocks.HEDGE_ACACIA, ModBlocks.HEDGE_DARK_OAK);
    }

    @Override
    public void updateMailBoxes(CompoundNBT compound) {
    }

    @Override
    public boolean useFancyGraphics() {
        Minecraft mc = Minecraft.getInstance();
        return mc.gameSettings.graphicFanciness.func_238162_a_() > 0;
    }

    @Override
    public void setGrillFlipping(BlockPos pos, int position) {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft.world != null) {
            TileEntity tileEntity = minecraft.world.getTileEntity(pos);
            if (tileEntity instanceof GrillTileEntity) {
                ((GrillTileEntity) tileEntity).setFlipping(position);
            }
        }
    }

    @Override
    public void showDoorMatScreen(World world, BlockPos pos) {
    }
}
