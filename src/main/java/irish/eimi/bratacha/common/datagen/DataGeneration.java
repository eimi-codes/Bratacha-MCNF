package irish.eimi.bratacha.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGeneration {

    public static void generate(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        gen.addProvider(event.includeClient(),new BratchaItemModels(packOutput, event.getExistingFileHelper()));
        gen.addProvider(event.includeClient(),new BratachaEnglishLanguage(packOutput,"en_us"));
        gen.addProvider(event.includeClient(),new BratachaGaeilgeLanguage(packOutput,"ga_ie"));
    }
}
