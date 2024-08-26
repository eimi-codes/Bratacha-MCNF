package irish.eimi.bratacha.client;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.client.init.RegistrationClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = BratachaMod.MODID, dist = Dist.CLIENT)
public class BratachaModClient {

    public BratachaModClient(IEventBus modBus) {
        modBus.addListener(RegistrationClient::registerRenders);
    }
}
