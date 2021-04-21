package com.mrcrayfish.furniture.block;

import com.mrcrayfish.furniture.tileentity.FridgeTileEntity;
import com.mrcrayfish.furniture.util.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Author: MrCrayfish
 */
public class FridgeBlock extends FurnitureHorizontalBlock implements ITileEntityProvider {
    public static final BooleanProperty OPEN = BooleanProperty.create("open");

    public final Map<BlockState, VoxelShape> SHAPES = new HashMap<>();
    private final Supplier<Block> freezer;

    public FridgeBlock(Properties properties, Supplier<Block> freezer) {
        super(properties);
        this.freezer = freezer;
        this.setDefaultState(this.getStateContainer().getBaseState().with(DIRECTION, Direction.NORTH).with(OPEN, false));
    }

    private VoxelShape getShape(BlockState state) {
        return SHAPES.computeIfAbsent(state, state1 -> {
            Direction direction = state1.get(DIRECTION);
            boolean open = state1.get(OPEN);
            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(Block.makeCuboidShape(0, -16, 0, 16, 0, 16));
            if (open) {
                final VoxelShape[] BASE = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(0, 0, 0, 16, 16, 13), Direction.SOUTH));
                final VoxelShape[] DOOR = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(13, 0, 29, 16, 16, 13), Direction.SOUTH));
                shapes.add(BASE[direction.getHorizontalIndex()]);
                shapes.add(DOOR[direction.getHorizontalIndex()]);
            } else {
                shapes.add(Block.makeCuboidShape(0, 0, 0, 16, 16, 16));
            }
            return VoxelShapeHelper.combineAll(shapes);
        });
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        return this.getShape(state);
    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos) {
        return this.getShape(state);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader reader, BlockPos pos) {
        return reader.getBlockState(pos.up()).isAir();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        if (state.get(DIRECTION).getOpposite() == result.getFace()) {
            if (!world.isRemote()) {
                TileEntity tileEntity = world.getTileEntity(pos);
                if (tileEntity instanceof INamedContainerProvider) {
                    playerEntity.openContainer((INamedContainerProvider) tileEntity);
                }
            }
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof FridgeTileEntity) {
            ((FridgeTileEntity) tileEntity).onScheduledTick();
        }
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new FridgeTileEntity();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(OPEN);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        worldIn.setBlockState(pos, this.freezer.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));
        worldIn.setBlockState(pos.up(), this.getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockState upState = worldIn.getBlockState(pos.down());
        if (upState.getBlock() instanceof FreezerBlock) {
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }
}
