package com.mrcrayfish.furniture.block;

import com.mrcrayfish.furniture.tileentity.CrateTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ISidedInventoryProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Author: MrCrayfish
 */
public class CrateBlock extends FurnitureHorizontalBlock implements IPortableInventory, ISidedInventoryProvider, ITileEntityProvider {
    public static final BooleanProperty OPEN = BooleanProperty.create("open");

    public CrateBlock(Properties properties) {
        super(properties);
        this.setDefaultState(this.getStateContainer().getBaseState().with(OPEN, false).with(DIRECTION, Direction.NORTH));
    }

    @Override
    public float getPlayerRelativeBlockHardness(BlockState blockState, PlayerEntity playerEntity, IBlockReader reader, BlockPos pos) {
        TileEntity tileEntity = reader.getTileEntity(pos);
        if (tileEntity instanceof CrateTileEntity) {
            CrateTileEntity crateTileEntity = (CrateTileEntity) tileEntity;
            if (crateTileEntity.isLocked() && !playerEntity.getUniqueID().equals(crateTileEntity.getOwner())) {
                return 0.0005F;
            }
        }
        return super.getPlayerRelativeBlockHardness(blockState, playerEntity, reader, pos);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult result) {
        return ActionResultType.SUCCESS;
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof CrateTileEntity) {
            ((CrateTileEntity) tileEntity).onScheduledTick();
        }
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (entity != null && tileEntity instanceof CrateTileEntity) {
            ((CrateTileEntity) tileEntity).setOwner(entity.getUniqueID());
        }
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader world) {
        return new CrateTileEntity();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(OPEN);
    }

    @Override
    public ISidedInventory createInventory(BlockState state, IWorld world, BlockPos pos) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof CrateTileEntity) {
            if (!((CrateTileEntity) tileEntity).isLocked()) {
                return (CrateTileEntity) tileEntity;
            }
        }
        return null;
    }
}
