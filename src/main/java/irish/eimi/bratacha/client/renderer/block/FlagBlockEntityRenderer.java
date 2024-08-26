package irish.eimi.bratacha.client.renderer.block;

import irish.eimi.bratacha.client.models.FlagModel;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class FlagBlockEntityRenderer extends GeoBlockRenderer<FlagBlockEntity> {
    public FlagBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        super(new FlagModel());
    }
}
