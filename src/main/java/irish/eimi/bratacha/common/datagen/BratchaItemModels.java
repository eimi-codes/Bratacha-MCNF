package irish.eimi.bratacha.common.datagen;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.init.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BratchaItemModels extends ItemModelProvider {
    public BratchaItemModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, BratachaMod.MODID,existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.FLAG_BLOCK_ITEM.getId().getPath(),mcLoc("item/generated")).texture("layer0","item/flag");
    }
}
