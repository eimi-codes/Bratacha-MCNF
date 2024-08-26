package irish.eimi.bratacha.client.init;

import irish.eimi.bratacha.client.renderer.block.FlagBlockEntityRenderer;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import irish.eimi.bratacha.common.init.Registration;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public class RegistrationClient {

    public static void registerRenders(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(Registration.FLAG_BLOCK_ENTITY.get(),
                FlagBlockEntityRenderer::new);
    }
}
