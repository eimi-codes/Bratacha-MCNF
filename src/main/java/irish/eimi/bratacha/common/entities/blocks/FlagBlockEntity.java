package irish.eimi.bratacha.common.entities.blocks;

import irish.eimi.bratacha.common.init.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class FlagBlockEntity extends BlockEntity implements GeoBlockEntity {
    protected static final RawAnimation DEPLOY_ANIM = RawAnimation.begin().thenLoop("animation.flag-base.wave");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public FlagBlockEntity(BlockPos pos, BlockState blockState) {
        super(Registration.FLAG_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<GeoAnimatable>(this,this::deployAnimController));
    }

    private PlayState deployAnimController(AnimationState<GeoAnimatable> geoAnimatableAnimationState) {
        return geoAnimatableAnimationState.setAndContinue(DEPLOY_ANIM);
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
