package com.mrcrayfish.furniture.core;

import com.mrcrayfish.furniture.FurnitureAddon;
import com.mrcrayfish.furniture.block.BedsideCabinetBlock;
import com.mrcrayfish.furniture.block.BlindsBlock;
import com.mrcrayfish.furniture.block.CabinetBlock;
import com.mrcrayfish.furniture.block.ChairBlock;
import com.mrcrayfish.furniture.block.CoffeeTableBlock;
import com.mrcrayfish.furniture.block.CoolerBlock;
import com.mrcrayfish.furniture.block.CrateBlock;
import com.mrcrayfish.furniture.block.DeskBlock;
import com.mrcrayfish.furniture.block.DeskCabinetBlock;
import com.mrcrayfish.furniture.block.DivingBoardBlock;
import com.mrcrayfish.furniture.block.DoorMatBlock;
import com.mrcrayfish.furniture.block.FreezerBlock;
import com.mrcrayfish.furniture.block.FridgeBlock;
import com.mrcrayfish.furniture.block.GrillBlock;
import com.mrcrayfish.furniture.block.HedgeBlock;
import com.mrcrayfish.furniture.block.KitchenCounterBlock;
import com.mrcrayfish.furniture.block.KitchenDrawerBlock;
import com.mrcrayfish.furniture.block.KitchenSinkBlock;
import com.mrcrayfish.furniture.block.MailBoxBlock;
import com.mrcrayfish.furniture.block.ParkBenchBlock;
import com.mrcrayfish.furniture.block.PostBoxBlock;
import com.mrcrayfish.furniture.block.RockPath;
import com.mrcrayfish.furniture.block.SofaBlock;
import com.mrcrayfish.furniture.block.TableBlock;
import com.mrcrayfish.furniture.block.TrampolineBlock;
import com.mrcrayfish.furniture.block.UpgradedFenceBlock;
import com.mrcrayfish.furniture.block.UpgradedGateBlock;
import com.mrcrayfish.furniture.item.DoorMatItem;
import com.mrcrayfish.furniture.util.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Author: MrCrayfish
 */
public class ModBlocks {
    private static final List<FurnitureBlock> BLOCKS = new ArrayList<>();

    private static final Material WOOD = Material.WOOD;
    private static final Material STONE = Material.ROCK;
    private static final Material WOOL = Material.WOOL;

    public static final Block TABLE_OAK = register(Names.Block.TABLE_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_SPRUCE = register(Names.Block.TABLE_SPRUCE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_BIRCH = register(Names.Block.TABLE_BIRCH, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_JUNGLE = register(Names.Block.TABLE_JUNGLE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_ACACIA = register(Names.Block.TABLE_ACACIA, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_DARK_OAK = register(Names.Block.TABLE_DARK_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STONE = register(Names.Block.TABLE_STONE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block TABLE_GRANITE = register(Names.Block.TABLE_GRANITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block TABLE_DIORITE = register(Names.Block.TABLE_DIORITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block TABLE_ANDESITE = register(Names.Block.TABLE_ANDESITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block TABLE_STRIPPED_OAK = register(Names.Block.TABLE_STRIPPED_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STRIPPED_SPRUCE = register(Names.Block.TABLE_STRIPPED_SPRUCE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STRIPPED_BIRCH = register(Names.Block.TABLE_STRIPPED_BIRCH, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STRIPPED_JUNGLE = register(Names.Block.TABLE_STRIPPED_JUNGLE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STRIPPED_ACACIA = register(Names.Block.TABLE_STRIPPED_ACACIA, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block TABLE_STRIPPED_DARK_OAK = register(Names.Block.TABLE_STRIPPED_DARK_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_OAK = register(Names.Block.CHAIR_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_SPRUCE = register(Names.Block.CHAIR_SPRUCE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_BIRCH = register(Names.Block.CHAIR_BIRCH, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_JUNGLE = register(Names.Block.CHAIR_JUNGLE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_ACACIA = register(Names.Block.CHAIR_ACACIA, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_DARK_OAK = register(Names.Block.CHAIR_DARK_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STONE = register(Names.Block.CHAIR_STONE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CHAIR_GRANITE = register(Names.Block.CHAIR_GRANITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CHAIR_DIORITE = register(Names.Block.CHAIR_DIORITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CHAIR_ANDESITE = register(Names.Block.CHAIR_ANDESITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CHAIR_STRIPPED_OAK = register(Names.Block.CHAIR_STRIPPED_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STRIPPED_SPRUCE = register(Names.Block.CHAIR_STRIPPED_SPRUCE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STRIPPED_BIRCH = register(Names.Block.CHAIR_STRIPPED_BIRCH, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STRIPPED_JUNGLE = register(Names.Block.CHAIR_STRIPPED_JUNGLE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STRIPPED_ACACIA = register(Names.Block.CHAIR_STRIPPED_ACACIA, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CHAIR_STRIPPED_DARK_OAK = register(Names.Block.CHAIR_STRIPPED_DARK_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_OAK = register(Names.Block.COFFEE_TABLE_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_SPRUCE = register(Names.Block.COFFEE_TABLE_SPRUCE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_BIRCH = register(Names.Block.COFFEE_TABLE_BIRCH, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_JUNGLE = register(Names.Block.COFFEE_TABLE_JUNGLE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_ACACIA = register(Names.Block.COFFEE_TABLE_ACACIA, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_DARK_OAK = register(Names.Block.COFFEE_TABLE_DARK_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STONE = register(Names.Block.COFFEE_TABLE_STONE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block COFFEE_TABLE_GRANITE = register(Names.Block.COFFEE_TABLE_GRANITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block COFFEE_TABLE_DIORITE = register(Names.Block.COFFEE_TABLE_DIORITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block COFFEE_TABLE_ANDESITE = register(Names.Block.COFFEE_TABLE_ANDESITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block COFFEE_TABLE_STRIPPED_OAK = register(Names.Block.COFFEE_TABLE_STRIPPED_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STRIPPED_SPRUCE = register(Names.Block.COFFEE_TABLE_STRIPPED_SPRUCE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STRIPPED_BIRCH = register(Names.Block.COFFEE_TABLE_STRIPPED_BIRCH, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STRIPPED_JUNGLE = register(Names.Block.COFFEE_TABLE_STRIPPED_JUNGLE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STRIPPED_ACACIA = register(Names.Block.COFFEE_TABLE_STRIPPED_ACACIA, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block COFFEE_TABLE_STRIPPED_DARK_OAK = register(Names.Block.COFFEE_TABLE_STRIPPED_DARK_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CABINET_OAK = register(Names.Block.CABINET_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_SPRUCE = register(Names.Block.CABINET_SPRUCE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_BIRCH = register(Names.Block.CABINET_BIRCH, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_JUNGLE = register(Names.Block.CABINET_JUNGLE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_ACACIA = register(Names.Block.CABINET_ACACIA, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_DARK_OAK = register(Names.Block.CABINET_DARK_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STONE = register(Names.Block.CABINET_STONE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CABINET_GRANITE = register(Names.Block.CABINET_GRANITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CABINET_DIORITE = register(Names.Block.CABINET_DIORITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CABINET_ANDESITE = register(Names.Block.CABINET_ANDESITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block CABINET_STRIPPED_OAK = register(Names.Block.CABINET_STRIPPED_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STRIPPED_SPRUCE = register(Names.Block.CABINET_STRIPPED_SPRUCE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STRIPPED_BIRCH = register(Names.Block.CABINET_STRIPPED_BIRCH, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STRIPPED_JUNGLE = register(Names.Block.CABINET_STRIPPED_JUNGLE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STRIPPED_ACACIA = register(Names.Block.CABINET_STRIPPED_ACACIA, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block CABINET_STRIPPED_DARK_OAK = register(Names.Block.CABINET_STRIPPED_DARK_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_OAK = register(Names.Block.BEDSIDE_CABINET_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_SPRUCE = register(Names.Block.BEDSIDE_CABINET_SPRUCE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_BIRCH = register(Names.Block.BEDSIDE_CABINET_BIRCH, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_JUNGLE = register(Names.Block.BEDSIDE_CABINET_JUNGLE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_ACACIA = register(Names.Block.BEDSIDE_CABINET_ACACIA, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_DARK_OAK = register(Names.Block.BEDSIDE_CABINET_DARK_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STONE = register(Names.Block.BEDSIDE_CABINET_STONE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block BEDSIDE_CABINET_GRANITE = register(Names.Block.BEDSIDE_CABINET_GRANITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block BEDSIDE_CABINET_DIORITE = register(Names.Block.BEDSIDE_CABINET_DIORITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block BEDSIDE_CABINET_ANDESITE = register(Names.Block.BEDSIDE_CABINET_ANDESITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
    public static final Block BEDSIDE_CABINET_STRIPPED_OAK = register(Names.Block.BEDSIDE_CABINET_STRIPPED_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STRIPPED_SPRUCE = register(Names.Block.BEDSIDE_CABINET_STRIPPED_SPRUCE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STRIPPED_BIRCH = register(Names.Block.BEDSIDE_CABINET_STRIPPED_BIRCH, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STRIPPED_JUNGLE = register(Names.Block.BEDSIDE_CABINET_STRIPPED_JUNGLE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STRIPPED_ACACIA = register(Names.Block.BEDSIDE_CABINET_STRIPPED_ACACIA, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block BEDSIDE_CABINET_STRIPPED_DARK_OAK = register(Names.Block.BEDSIDE_CABINET_STRIPPED_DARK_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final Block DESK_OAK = register(Names.Block.DESK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.OAK));
    public static final Block DESK_SPRUCE = register(Names.Block.DESK_SPRUCE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.BIRCH));
    public static final Block DESK_BIRCH = register(Names.Block.DESK_BIRCH, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.SPRUCE));
    public static final Block DESK_JUNGLE = register(Names.Block.DESK_JUNGLE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.JUNGLE));
    public static final Block DESK_ACACIA = register(Names.Block.DESK_ACACIA, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.ACACIA));
    public static final Block DESK_DARK_OAK = register(Names.Block.DESK_DARK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.DARK_OAK));
    public static final Block DESK_STONE = register(Names.Block.DESK_STONE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.STONE));
    public static final Block DESK_GRANITE = register(Names.Block.DESK_GRANITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.GRANITE));
    public static final Block DESK_DIORITE = register(Names.Block.DESK_DIORITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.DIORITE));
    public static final Block DESK_ANDESITE = register(Names.Block.DESK_ANDESITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.ANDESITE));
    public static final Block DESK_STRIPPED_OAK = register(Names.Block.DESK_STRIPPED_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final Block DESK_STRIPPED_SPRUCE = register(Names.Block.DESK_STRIPPED_SPRUCE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_BIRCH));
    public static final Block DESK_STRIPPED_BIRCH = register(Names.Block.DESK_STRIPPED_BIRCH, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_SPRUCE));
    public static final Block DESK_STRIPPED_JUNGLE = register(Names.Block.DESK_STRIPPED_JUNGLE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_JUNGLE));
    public static final Block DESK_STRIPPED_ACACIA = register(Names.Block.DESK_STRIPPED_ACACIA, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_ACACIA));
    public static final Block DESK_STRIPPED_DARK_OAK = register(Names.Block.DESK_STRIPPED_DARK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_DARK_OAK));
    public static final Block DESK_CABINET_OAK = register(Names.Block.DESK_CABINET_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.OAK));
    public static final Block DESK_CABINET_SPRUCE = register(Names.Block.DESK_CABINET_SPRUCE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.BIRCH));
    public static final Block DESK_CABINET_BIRCH = register(Names.Block.DESK_CABINET_BIRCH, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.SPRUCE));
    public static final Block DESK_CABINET_JUNGLE = register(Names.Block.DESK_CABINET_JUNGLE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.JUNGLE));
    public static final Block DESK_CABINET_ACACIA = register(Names.Block.DESK_CABINET_ACACIA, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.ACACIA));
    public static final Block DESK_CABINET_DARK_OAK = register(Names.Block.DESK_CABINET_DARK_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.DARK_OAK));
    public static final Block DESK_CABINET_STONE = register(Names.Block.DESK_CABINET_STONE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.STONE));
    public static final Block DESK_CABINET_GRANITE = register(Names.Block.DESK_CABINET_GRANITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.GRANITE));
    public static final Block DESK_CABINET_DIORITE = register(Names.Block.DESK_CABINET_DIORITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.DIORITE));
    public static final Block DESK_CABINET_ANDESITE = register(Names.Block.DESK_CABINET_ANDESITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.ANDESITE));
    public static final Block DESK_CABINET_STRIPPED_OAK = register(Names.Block.DESK_CABINET_STRIPPED_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_OAK));
    public static final Block DESK_CABINET_STRIPPED_SPRUCE = register(Names.Block.DESK_CABINET_STRIPPED_SPRUCE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_BIRCH));
    public static final Block DESK_CABINET_STRIPPED_BIRCH = register(Names.Block.DESK_CABINET_STRIPPED_BIRCH, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_SPRUCE));
    public static final Block DESK_CABINET_STRIPPED_JUNGLE = register(Names.Block.DESK_CABINET_STRIPPED_JUNGLE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_JUNGLE));
    public static final Block DESK_CABINET_STRIPPED_ACACIA = register(Names.Block.DESK_CABINET_STRIPPED_ACACIA, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_ACACIA));
    public static final Block DESK_CABINET_STRIPPED_DARK_OAK = register(Names.Block.DESK_CABINET_STRIPPED_DARK_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_DARK_OAK));
    public static final Block SOFA_WHITE = register(Names.Block.SOFA_WHITE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_ORANGE = register(Names.Block.SOFA_ORANGE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.ADOBE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_MAGENTA = register(Names.Block.SOFA_MAGENTA, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.MAGENTA).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_LIGHT_BLUE = register(Names.Block.SOFA_LIGHT_BLUE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_YELLOW = register(Names.Block.SOFA_YELLOW, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_LIME = register(Names.Block.SOFA_LIME, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIME).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_PINK = register(Names.Block.SOFA_PINK, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_GRAY = register(Names.Block.SOFA_GRAY, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_LIGHT_GRAY = register(Names.Block.SOFA_LIGHT_GRAY, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_CYAN = register(Names.Block.SOFA_CYAN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.CYAN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_PURPLE = register(Names.Block.SOFA_PURPLE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.PURPLE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_BLUE = register(Names.Block.SOFA_BLUE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_BROWN = register(Names.Block.SOFA_BROWN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_GREEN = register(Names.Block.SOFA_GREEN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_RED = register(Names.Block.SOFA_RED, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.RED).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_BLACK = register(Names.Block.SOFA_BLACK, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BLACK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block SOFA_RAINBOW = register(Names.Block.SOFA_RAINBOW, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_OAK = register(Names.Block.BLINDS_OAK, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_SPRUCE = register(Names.Block.BLINDS_SPRUCE, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_BIRCH = register(Names.Block.BLINDS_BIRCH, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_JUNGLE = register(Names.Block.BLINDS_JUNGLE, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_ACACIA = register(Names.Block.BLINDS_ACACIA, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_DARK_OAK = register(Names.Block.BLINDS_DARK_OAK, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_OAK = register(Names.Block.BLINDS_STRIPPED_OAK, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_SPRUCE = register(Names.Block.BLINDS_STRIPPED_SPRUCE, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_BIRCH = register(Names.Block.BLINDS_STRIPPED_BIRCH, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_JUNGLE = register(Names.Block.BLINDS_STRIPPED_JUNGLE, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_ACACIA = register(Names.Block.BLINDS_STRIPPED_ACACIA, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block BLINDS_STRIPPED_DARK_OAK = register(Names.Block.BLINDS_STRIPPED_DARK_OAK, new BlindsBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_OAK = register(Names.Block.UPGRADED_FENCE_OAK, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_SPRUCE = register(Names.Block.UPGRADED_FENCE_SPRUCE, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_BIRCH = register(Names.Block.UPGRADED_FENCE_BIRCH, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_JUNGLE = register(Names.Block.UPGRADED_FENCE_JUNGLE, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_ACACIA = register(Names.Block.UPGRADED_FENCE_ACACIA, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_DARK_OAK = register(Names.Block.UPGRADED_FENCE_DARK_OAK, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_OAK = register(Names.Block.UPGRADED_FENCE_STRIPPED_OAK, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_SPRUCE = register(Names.Block.UPGRADED_FENCE_STRIPPED_SPRUCE, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_BIRCH = register(Names.Block.UPGRADED_FENCE_STRIPPED_BIRCH, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_JUNGLE = register(Names.Block.UPGRADED_FENCE_STRIPPED_JUNGLE, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_ACACIA = register(Names.Block.UPGRADED_FENCE_STRIPPED_ACACIA, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_FENCE_STRIPPED_DARK_OAK = register(Names.Block.UPGRADED_FENCE_STRIPPED_DARK_OAK, new UpgradedFenceBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_OAK = register(Names.Block.UPGRADED_GATE_OAK, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_SPRUCE = register(Names.Block.UPGRADED_GATE_SPRUCE, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_BIRCH = register(Names.Block.UPGRADED_GATE_BIRCH, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_JUNGLE = register(Names.Block.UPGRADED_GATE_JUNGLE, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_ACACIA = register(Names.Block.UPGRADED_GATE_ACACIA, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_DARK_OAK = register(Names.Block.UPGRADED_GATE_DARK_OAK, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_OAK = register(Names.Block.UPGRADED_GATE_STRIPPED_OAK, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_SPRUCE = register(Names.Block.UPGRADED_GATE_STRIPPED_SPRUCE, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_BIRCH = register(Names.Block.UPGRADED_GATE_STRIPPED_BIRCH, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_JUNGLE = register(Names.Block.UPGRADED_GATE_STRIPPED_JUNGLE, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_ACACIA = register(Names.Block.UPGRADED_GATE_STRIPPED_ACACIA, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block UPGRADED_GATE_STRIPPED_DARK_OAK = register(Names.Block.UPGRADED_GATE_STRIPPED_DARK_OAK, new UpgradedGateBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_WHITE = register(Names.Block.PICKET_FENCE_WHITE, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_ORANGE = register(Names.Block.PICKET_FENCE_ORANGE, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.ADOBE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_MAGENTA = register(Names.Block.PICKET_FENCE_MAGENTA, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.MAGENTA).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_LIGHT_BLUE = register(Names.Block.PICKET_FENCE_LIGHT_BLUE, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_YELLOW = register(Names.Block.PICKET_FENCE_YELLOW, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_LIME = register(Names.Block.PICKET_FENCE_LIME, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.LIME).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_PINK = register(Names.Block.PICKET_FENCE_PINK, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_GRAY = register(Names.Block.PICKET_FENCE_GRAY, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_LIGHT_GRAY = register(Names.Block.PICKET_FENCE_LIGHT_GRAY, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_CYAN = register(Names.Block.PICKET_FENCE_CYAN, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.CYAN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_PURPLE = register(Names.Block.PICKET_FENCE_PURPLE, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.PURPLE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_BLUE = register(Names.Block.PICKET_FENCE_BLUE, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_BROWN = register(Names.Block.PICKET_FENCE_BROWN, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_GREEN = register(Names.Block.PICKET_FENCE_GREEN, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_RED = register(Names.Block.PICKET_FENCE_RED, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.RED).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_FENCE_BLACK = register(Names.Block.PICKET_FENCE_BLACK, new UpgradedFenceBlock(Block.Properties.create(WOOD, MaterialColor.BLACK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_WHITE = register(Names.Block.PICKET_GATE_WHITE, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_ORANGE = register(Names.Block.PICKET_GATE_ORANGE, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.ADOBE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_MAGENTA = register(Names.Block.PICKET_GATE_MAGENTA, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.MAGENTA).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_LIGHT_BLUE = register(Names.Block.PICKET_GATE_LIGHT_BLUE, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_YELLOW = register(Names.Block.PICKET_GATE_YELLOW, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_LIME = register(Names.Block.PICKET_GATE_LIME, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.LIME).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_PINK = register(Names.Block.PICKET_GATE_PINK, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_GRAY = register(Names.Block.PICKET_GATE_GRAY, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_LIGHT_GRAY = register(Names.Block.PICKET_GATE_LIGHT_GRAY, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_CYAN = register(Names.Block.PICKET_GATE_CYAN, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.CYAN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_PURPLE = register(Names.Block.PICKET_GATE_PURPLE, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.PURPLE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_BLUE = register(Names.Block.PICKET_GATE_BLUE, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_BROWN = register(Names.Block.PICKET_GATE_BROWN, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_GREEN = register(Names.Block.PICKET_GATE_GREEN, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_RED = register(Names.Block.PICKET_GATE_RED, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.RED).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block PICKET_GATE_BLACK = register(Names.Block.PICKET_GATE_BLACK, new UpgradedGateBlock(Block.Properties.create(WOOD, MaterialColor.BLACK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final Block CRATE_OAK = register(Names.Block.CRATE_OAK, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_SPRUCE = register(Names.Block.CRATE_SPRUCE, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_BIRCH = register(Names.Block.CRATE_BIRCH, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_JUNGLE = register(Names.Block.CRATE_JUNGLE, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_ACACIA = register(Names.Block.CRATE_ACACIA, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_DARK_OAK = register(Names.Block.CRATE_DARK_OAK, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_OAK = register(Names.Block.CRATE_STRIPPED_OAK, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_SPRUCE = register(Names.Block.CRATE_STRIPPED_SPRUCE, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_BIRCH = register(Names.Block.CRATE_STRIPPED_BIRCH, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_JUNGLE = register(Names.Block.CRATE_STRIPPED_JUNGLE, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_ACACIA = register(Names.Block.CRATE_STRIPPED_ACACIA, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block CRATE_STRIPPED_DARK_OAK = register(Names.Block.CRATE_STRIPPED_DARK_OAK, new CrateBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_OAK = register(Names.Block.OAK_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_SPRUCE = register(Names.Block.SPRUCE_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_BIRCH = register(Names.Block.BIRCH_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_JUNGLE = register(Names.Block.JUNGLE_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_ACACIA = register(Names.Block.ACACIA_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_DARK_OAK = register(Names.Block.DARK_OAK_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_OAK = register(Names.Block.STRIPPED_OAK_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_SPRUCE = register(Names.Block.STRIPPED_SPRUCE_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_BIRCH = register(Names.Block.STRIPPED_BIRCH_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_JUNGLE = register(Names.Block.STRIPPED_JUNGLE_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_ACACIA = register(Names.Block.STRIPPED_ACACIA_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block PARK_BENCH_STRIPPED_DARK_OAK = register(Names.Block.STRIPPED_DARK_OAK_PARK_BENCH, new ParkBenchBlock(Block.Properties.create(WOOD).hardnessAndResistance(2.0F, 10.0F).sound(SoundType.WOOD)));
    public static final Block POST_BOX = register(Names.Block.POST_BOX, new PostBoxBlock(Block.Properties.from(Blocks.ANVIL)));
    public static final Block MAIL_BOX_OAK = register(Names.Block.MAIL_BOX_OAK, new MailBoxBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block MAIL_BOX_SPRUCE = register(Names.Block.MAIL_BOX_SPRUCE, new MailBoxBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS)));
    public static final Block MAIL_BOX_BIRCH = register(Names.Block.MAIL_BOX_BIRCH, new MailBoxBlock(Block.Properties.from(Blocks.BIRCH_PLANKS)));
    public static final Block MAIL_BOX_JUNGLE = register(Names.Block.MAIL_BOX_JUNGLE, new MailBoxBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS)));
    public static final Block MAIL_BOX_ACACIA = register(Names.Block.MAIL_BOX_ACACIA, new MailBoxBlock(Block.Properties.from(Blocks.ACACIA_PLANKS)));
    public static final Block MAIL_BOX_DARK_OAK = register(Names.Block.MAIL_BOX_DARK_OAK, new MailBoxBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_OAK = register(Names.Block.MAIL_BOX_STRIPPED_OAK, new MailBoxBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_SPRUCE = register(Names.Block.MAIL_BOX_STRIPPED_SPRUCE, new MailBoxBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_BIRCH = register(Names.Block.MAIL_BOX_STRIPPED_BIRCH, new MailBoxBlock(Block.Properties.from(Blocks.BIRCH_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_JUNGLE = register(Names.Block.MAIL_BOX_STRIPPED_JUNGLE, new MailBoxBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_ACACIA = register(Names.Block.MAIL_BOX_STRIPPED_ACACIA, new MailBoxBlock(Block.Properties.from(Blocks.ACACIA_PLANKS)));
    public static final Block MAIL_BOX_STRIPPED_DARK_OAK = register(Names.Block.MAIL_BOX_STRIPPED_DARK_OAK, new MailBoxBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS)));
    public static final Block HEDGE_OAK = register(Names.Block.HEDGE_OAK, new HedgeBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final Block HEDGE_SPRUCE = register(Names.Block.HEDGE_SPRUCE, new HedgeBlock(Block.Properties.from(Blocks.SPRUCE_LEAVES)));
    public static final Block HEDGE_BIRCH = register(Names.Block.HEDGE_BIRCH, new HedgeBlock(Block.Properties.from(Blocks.BIRCH_LEAVES)));
    public static final Block HEDGE_JUNGLE = register(Names.Block.HEDGE_JUNGLE, new HedgeBlock(Block.Properties.from(Blocks.JUNGLE_LEAVES)));
    public static final Block HEDGE_ACACIA = register(Names.Block.HEDGE_ACACIA, new HedgeBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
    public static final Block HEDGE_DARK_OAK = register(Names.Block.HEDGE_DARK_OAK, new HedgeBlock(Block.Properties.from(Blocks.DARK_OAK_LEAVES)));
    public static final Block ROCK_PATH = register(Names.Block.ROCK_PATH, new RockPath(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_WHITE = register(Names.Block.TRAMPOLINE_WHITE, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_ORANGE = register(Names.Block.TRAMPOLINE_ORANGE, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_MAGENTA = register(Names.Block.TRAMPOLINE_MAGENTA, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_LIGHT_BLUE = register(Names.Block.TRAMPOLINE_LIGHT_BLUE, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_YELLOW = register(Names.Block.TRAMPOLINE_YELLOW, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_LIME = register(Names.Block.TRAMPOLINE_LIME, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_PINK = register(Names.Block.TRAMPOLINE_PINK, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_GRAY = register(Names.Block.TRAMPOLINE_GRAY, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_LIGHT_GRAY = register(Names.Block.TRAMPOLINE_LIGHT_GRAY, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_CYAN = register(Names.Block.TRAMPOLINE_CYAN, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_PURPLE = register(Names.Block.TRAMPOLINE_PURPLE, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_BLUE = register(Names.Block.TRAMPOLINE_BLUE, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_BROWN = register(Names.Block.TRAMPOLINE_BROWN, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_GREEN = register(Names.Block.TRAMPOLINE_GREEN, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_RED = register(Names.Block.TRAMPOLINE_RED, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block TRAMPOLINE_BLACK = register(Names.Block.TRAMPOLINE_BLACK, new TrampolineBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block COOLER_WHITE = register(Names.Block.COOLER_WHITE, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_ORANGE = register(Names.Block.COOLER_ORANGE, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_MAGENTA = register(Names.Block.COOLER_MAGENTA, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_LIGHT_BLUE = register(Names.Block.COOLER_LIGHT_BLUE, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_YELLOW = register(Names.Block.COOLER_YELLOW, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_LIME = register(Names.Block.COOLER_LIME, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_PINK = register(Names.Block.COOLER_PINK, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_GRAY = register(Names.Block.COOLER_GRAY, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_LIGHT_GRAY = register(Names.Block.COOLER_LIGHT_GRAY, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_CYAN = register(Names.Block.COOLER_CYAN, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_PURPLE = register(Names.Block.COOLER_PURPLE, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_BLUE = register(Names.Block.COOLER_BLUE, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_BROWN = register(Names.Block.COOLER_BROWN, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_GREEN = register(Names.Block.COOLER_GREEN, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_RED = register(Names.Block.COOLER_RED, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block COOLER_BLACK = register(Names.Block.COOLER_BLACK, new CoolerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block GRILL_WHITE = register(Names.Block.GRILL_WHITE, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_ORANGE = register(Names.Block.GRILL_ORANGE, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_MAGENTA = register(Names.Block.GRILL_MAGENTA, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_LIGHT_BLUE = register(Names.Block.GRILL_LIGHT_BLUE, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_YELLOW = register(Names.Block.GRILL_YELLOW, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_LIME = register(Names.Block.GRILL_LIME, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_PINK = register(Names.Block.GRILL_PINK, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_GRAY = register(Names.Block.GRILL_GRAY, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_LIGHT_GRAY = register(Names.Block.GRILL_LIGHT_GRAY, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_CYAN = register(Names.Block.GRILL_CYAN, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_PURPLE = register(Names.Block.GRILL_PURPLE, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_BLUE = register(Names.Block.GRILL_BLUE, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_BROWN = register(Names.Block.GRILL_BROWN, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_GREEN = register(Names.Block.GRILL_GREEN, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_RED = register(Names.Block.GRILL_RED, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block GRILL_BLACK = register(Names.Block.GRILL_BLACK, new GrillBlock(Block.Properties.from(Blocks.STONE)));
    public static final Block DOOR_MAT = register(Names.Block.DOOR_MAT, new DoorMatBlock(Block.Properties.from(Blocks.WHITE_WOOL)), block -> new DoorMatItem(block, defaultProperties()));
    public static final Block DIVING_BOARD = register(Names.Block.DIVING_BOARD, new DivingBoardBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_OAK = register(Names.Block.KITCHEN_COUNTER_OAK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_SPRUCE = register(Names.Block.KITCHEN_COUNTER_SPRUCE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_BIRCH = register(Names.Block.KITCHEN_COUNTER_BIRCH, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_JUNGLE = register(Names.Block.KITCHEN_COUNTER_JUNGLE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_ACACIA = register(Names.Block.KITCHEN_COUNTER_ACACIA, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_DARK_OAK = register(Names.Block.KITCHEN_COUNTER_DARK_OAK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_OAK = register(Names.Block.KITCHEN_COUNTER_STRIPPED_OAK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_SPRUCE = register(Names.Block.KITCHEN_COUNTER_STRIPPED_SPRUCE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_BIRCH = register(Names.Block.KITCHEN_COUNTER_STRIPPED_BIRCH, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_JUNGLE = register(Names.Block.KITCHEN_COUNTER_STRIPPED_JUNGLE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_ACACIA = register(Names.Block.KITCHEN_COUNTER_STRIPPED_ACACIA, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_STRIPPED_DARK_OAK = register(Names.Block.KITCHEN_COUNTER_STRIPPED_DARK_OAK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_WHITE = register(Names.Block.KITCHEN_COUNTER_WHITE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_ORANGE = register(Names.Block.KITCHEN_COUNTER_ORANGE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_MAGENTA = register(Names.Block.KITCHEN_COUNTER_MAGENTA, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_LIGHT_BLUE = register(Names.Block.KITCHEN_COUNTER_LIGHT_BLUE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_YELLOW = register(Names.Block.KITCHEN_COUNTER_YELLOW, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_LIME = register(Names.Block.KITCHEN_COUNTER_LIME, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_PINK = register(Names.Block.KITCHEN_COUNTER_PINK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_GRAY = register(Names.Block.KITCHEN_COUNTER_GRAY, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_LIGHT_GRAY = register(Names.Block.KITCHEN_COUNTER_LIGHT_GRAY, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_CYAN = register(Names.Block.KITCHEN_COUNTER_CYAN, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_PURPLE = register(Names.Block.KITCHEN_COUNTER_PURPLE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_BLUE = register(Names.Block.KITCHEN_COUNTER_BLUE, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_BROWN = register(Names.Block.KITCHEN_COUNTER_BROWN, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_GREEN = register(Names.Block.KITCHEN_COUNTER_GREEN, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_RED = register(Names.Block.KITCHEN_COUNTER_RED, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_COUNTER_BLACK = register(Names.Block.KITCHEN_COUNTER_BLACK, new KitchenCounterBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_OAK = register(Names.Block.KITCHEN_DRAWER_OAK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_SPRUCE = register(Names.Block.KITCHEN_DRAWER_SPRUCE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_BIRCH = register(Names.Block.KITCHEN_DRAWER_BIRCH, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_JUNGLE = register(Names.Block.KITCHEN_DRAWER_JUNGLE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_ACACIA = register(Names.Block.KITCHEN_DRAWER_ACACIA, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_DARK_OAK = register(Names.Block.KITCHEN_DRAWER_DARK_OAK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_OAK = register(Names.Block.KITCHEN_DRAWER_STRIPPED_OAK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_SPRUCE = register(Names.Block.KITCHEN_DRAWER_STRIPPED_SPRUCE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_BIRCH = register(Names.Block.KITCHEN_DRAWER_STRIPPED_BIRCH, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_JUNGLE = register(Names.Block.KITCHEN_DRAWER_STRIPPED_JUNGLE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_ACACIA = register(Names.Block.KITCHEN_DRAWER_STRIPPED_ACACIA, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_STRIPPED_DARK_OAK = register(Names.Block.KITCHEN_DRAWER_STRIPPED_DARK_OAK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_WHITE = register(Names.Block.KITCHEN_DRAWER_WHITE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_ORANGE = register(Names.Block.KITCHEN_DRAWER_ORANGE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_MAGENTA = register(Names.Block.KITCHEN_DRAWER_MAGENTA, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_LIGHT_BLUE = register(Names.Block.KITCHEN_DRAWER_LIGHT_BLUE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_YELLOW = register(Names.Block.KITCHEN_DRAWER_YELLOW, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_LIME = register(Names.Block.KITCHEN_DRAWER_LIME, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_PINK = register(Names.Block.KITCHEN_DRAWER_PINK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_GRAY = register(Names.Block.KITCHEN_DRAWER_GRAY, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_LIGHT_GRAY = register(Names.Block.KITCHEN_DRAWER_LIGHT_GRAY, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_CYAN = register(Names.Block.KITCHEN_DRAWER_CYAN, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_PURPLE = register(Names.Block.KITCHEN_DRAWER_PURPLE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_BLUE = register(Names.Block.KITCHEN_DRAWER_BLUE, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_BROWN = register(Names.Block.KITCHEN_DRAWER_BROWN, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_GREEN = register(Names.Block.KITCHEN_DRAWER_GREEN, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_RED = register(Names.Block.KITCHEN_DRAWER_RED, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_DRAWER_BLACK = register(Names.Block.KITCHEN_DRAWER_BLACK, new KitchenDrawerBlock(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final Block KITCHEN_SINK_LIGHT_OAK = register(Names.Block.KITCHEN_SINK_LIGHT_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_SPRUCE = register(Names.Block.KITCHEN_SINK_LIGHT_SPRUCE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_BIRCH = register(Names.Block.KITCHEN_SINK_LIGHT_BIRCH, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_JUNGLE = register(Names.Block.KITCHEN_SINK_LIGHT_JUNGLE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_ACACIA = register(Names.Block.KITCHEN_SINK_LIGHT_ACACIA, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_DARK_OAK = register(Names.Block.KITCHEN_SINK_LIGHT_DARK_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_OAK = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_SPRUCE = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_SPRUCE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_BIRCH = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_BIRCH, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_JUNGLE = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_JUNGLE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_ACACIA = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_ACACIA, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_LIGHT_STRIPPED_DARK_OAK = register(Names.Block.KITCHEN_SINK_LIGHT_STRIPPED_DARK_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_OAK = register(Names.Block.KITCHEN_SINK_DARK_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_SPRUCE = register(Names.Block.KITCHEN_SINK_DARK_SPRUCE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_BIRCH = register(Names.Block.KITCHEN_SINK_DARK_BIRCH, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_JUNGLE = register(Names.Block.KITCHEN_SINK_DARK_JUNGLE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_ACACIA = register(Names.Block.KITCHEN_SINK_DARK_ACACIA, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_DARK_OAK = register(Names.Block.KITCHEN_SINK_DARK_DARK_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_OAK = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_SPRUCE = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_SPRUCE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_BIRCH = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_BIRCH, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_JUNGLE = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_JUNGLE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_ACACIA = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_ACACIA, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_DARK_STRIPPED_DARK_OAK = register(Names.Block.KITCHEN_SINK_DARK_STRIPPED_DARK_OAK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), true));
    public static final Block KITCHEN_SINK_WHITE = register(Names.Block.KITCHEN_SINK_WHITE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_ORANGE = register(Names.Block.KITCHEN_SINK_ORANGE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_MAGENTA = register(Names.Block.KITCHEN_SINK_MAGENTA, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_LIGHT_BLUE = register(Names.Block.KITCHEN_SINK_LIGHT_BLUE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_YELLOW = register(Names.Block.KITCHEN_SINK_YELLOW, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_LIME = register(Names.Block.KITCHEN_SINK_LIME, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_PINK = register(Names.Block.KITCHEN_SINK_PINK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_GRAY = register(Names.Block.KITCHEN_SINK_GRAY, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_LIGHT_GRAY = register(Names.Block.KITCHEN_SINK_LIGHT_GRAY, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_CYAN = register(Names.Block.KITCHEN_SINK_CYAN, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_PURPLE = register(Names.Block.KITCHEN_SINK_PURPLE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_BLUE = register(Names.Block.KITCHEN_SINK_BLUE, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_BROWN = register(Names.Block.KITCHEN_SINK_BROWN, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_GREEN = register(Names.Block.KITCHEN_SINK_GREEN, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_RED = register(Names.Block.KITCHEN_SINK_RED, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));
    public static final Block KITCHEN_SINK_BLACK = register(Names.Block.KITCHEN_SINK_BLACK, new KitchenSinkBlock(Block.Properties.from(Blocks.OAK_PLANKS), false));

    public static final Block FRIDGE_LIGHT = register(Names.Block.FRIDGE_LIGHT, new FridgeBlock(Block.Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(5.0F, 6.0F),
            () -> ModBlocks.FREEZER_LIGHT
    ));

    public static final Block FREEZER_LIGHT = register(Names.Block.FREEZER_LIGHT, new FreezerBlock(
                    Block.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .hardnessAndResistance(5.0F, 6.0F),
                    FRIDGE_LIGHT),
            false);

    public static final Block FRIDGE_DARK = register(Names.Block.FRIDGE_DARK, new FridgeBlock(
            Block.Properties.create(Material.IRON)
                    .sound(SoundType.METAL)
                    .hardnessAndResistance(5.0F, 6.0F),
            () -> ModBlocks.FREEZER_DARK));

    public static final Block FREEZER_DARK = register(Names.Block.FRIDGE_DARK, new FreezerBlock(
                    Block.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .hardnessAndResistance(5.0F, 6.0F), FRIDGE_DARK),
            false);

    private static Block register(String name, Block block) {
        return register(name, block, true);
    }

    private static Block register(String name, Block block, Function<Block, Item> itemProvider) {
        return register(name, block, true, itemProvider);
    }

    private static Block register(String name, Block block, boolean item) {
        return register(name, block, item, null);
    }

    private static Block register(String name, Block block, boolean item, Function<Block, Item> itemProvider) {
        BLOCKS.add(new FurnitureBlock(name, block, item, itemProvider));
        return block;
    }

    private static Item.Properties defaultProperties() {
        return new Item.Properties().group(FurnitureAddon.GROUP);
    }

    public static List<FurnitureBlock> getFurnitureBlocks() {
        return BLOCKS;
    }

    public static class FurnitureBlock {
        private final String location;
        private final Block block;
        private final boolean item;
        private final Function<Block, Item> itemProvider;

        public FurnitureBlock(String location, Block block, boolean item, Function<Block, Item> itemProvider) {
            this.location = location;
            this.block = block;
            this.item = item;
            this.itemProvider = itemProvider;
        }

        public String getLocation() {
            return this.location;
        }

        public Block getBlock() {
            return this.block;
        }

        public boolean hasItem() {
            return this.item;
        }

        public Function<Block, Item> getItemProvider() {
            return this.itemProvider;
        }
    }

    public static void registerItems() {
        for (FurnitureBlock block : getFurnitureBlocks()) {
            if (!block.hasItem()) {
                continue;
            }

            Item item;
            if (block.getItemProvider() != null) {
                item = block.getItemProvider().apply(block.getBlock());
            } else {
                item = new BlockItem(block.getBlock(), defaultProperties());
                Item.BLOCK_TO_ITEM.put(block.getBlock(), item);
            }

            Registry.register(Registry.ITEM, block.getLocation(), item);
        }
    }

    public static void register() {
        for (FurnitureBlock block : getFurnitureBlocks()) {
            Registry.register(Registry.BLOCK, block.getLocation(), block.getBlock());
        }

        for (FurnitureBlock block : getFurnitureBlocks()) {
            for (BlockState state : block.getBlock().getStateContainer().getValidStates()) {
                Block.BLOCK_STATE_IDS.add(state);
            }
            block.getBlock().getLootTable();
        }
    }
}
