package com.mrcrayfish.furniture.block;

import com.mrcrayfish.furniture.tileentity.KitchenSinkTileEntity;
import com.mrcrayfish.furniture.util.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: MrCrayfish
 */
public class KitchenSinkBlock extends FurnitureHorizontalBlock implements ITileEntityProvider {
    public final Map<BlockState, VoxelShape> SHAPES = new HashMap<>();
    private boolean bigSink;

    public KitchenSinkBlock(Properties properties, boolean bigSink) {
        super(properties);
        this.bigSink = bigSink;
    }

    private VoxelShape getShape(BlockState state) {
        if (SHAPES.containsKey(state)) {
            return SHAPES.get(state);
        }

        List<VoxelShape> shapes = new ArrayList<>();
        Direction direction = state.get(DIRECTION);
        if (this.bigSink) {
            shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 15.0), Direction.SOUTH))[direction.getHorizontalIndex()]);
            shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(0.0, 9.0, 0.0, 16.0, 16.0, 16.0), Direction.SOUTH))[direction.getHorizontalIndex()]);
        } else {
            shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 13.0, 15.0), Direction.SOUTH))[direction.getHorizontalIndex()]);
            shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.makeCuboidShape(0.0, 13.0, 0.0, 16.0, 16.0, 16.0), Direction.SOUTH))[direction.getHorizontalIndex()]);
        }

        VoxelShape shape = VoxelShapeHelper.combineAll(shapes);
        SHAPES.put(state, shape);
        return shape;
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
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        return ActionResultType.SUCCESS;
    }

    private boolean isWaterSource(World world, BlockPos pos) {
        return world.getFluidState(pos).getFluid() == Fluids.WATER;
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new KitchenSinkTileEntity();
    }
}

