package irish.eimi.bratacha.common.datagen;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.init.Registration;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class BratachaGaeilgeLanguage extends LanguageProvider {
    public BratachaGaeilgeLanguage(PackOutput output, String locale) {
        super(output, BratachaMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Registration.FLAG_BLOCK.get(),"Bratach na hÉireann");
        add(Registration.FLAG_COUNTRY_ANDORRA_BLOCK.get(),"Bratach Andóra");
    }
}
