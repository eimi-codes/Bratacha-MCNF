package irish.eimi.bratacha.common.blocks;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FlagBlock extends HorizontalDirectionalBlock implements EntityBlock {

    public static final MapCodec<FlagBlock> CODEC = RecordCodecBuilder.mapCodec((builder) -> {
        return builder.group(
                ResourceLocation.CODEC.fieldOf("flagType").forGetter((get) -> {
                    return get.flagType;
                }), propertiesCodec()).apply(builder, FlagBlock::new);
    });

    protected final VoxelShape[] collisionShapeByIndex;
    private ResourceLocation flagType;
    public FlagBlock(ResourceLocation flag,BlockBehaviour.Properties properties ) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.SOUTH));
        this.flagType = flag;
        this.collisionShapeByIndex = this.makeShapes();
    }

    private VoxelShape[] makeShapes() {
        VoxelShape up = Block.box(0,0,0,16,1,16);
        VoxelShape east = Block.box(6,0,0,9,16,16); // fix
        VoxelShape west = Block.box(7,0,0,10,16,16);

        VoxelShape south = Block.box(0,0,6,16,16,9);
        VoxelShape north = Block.box(0,0,7,16,16,10);

        VoxelShape[] avoxelshape={up,up,north,south,west,east};

        return avoxelshape;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.collisionShapeByIndex[state.getValue(FACING).ordinal()];
    }
    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FlagBlockEntity(blockPos,blockState);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    /**
     * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed blockstate.
     */
    @Override
    protected BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    /**
     * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed blockstate.
     */
    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }


    @Override
    protected MapCodec<? extends FlagBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
       return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public ResourceLocation getFlagType() {
        return flagType;
    }

    public void setFlagType(ResourceLocation flagType) {
        this.flagType = flagType;
    }
}
