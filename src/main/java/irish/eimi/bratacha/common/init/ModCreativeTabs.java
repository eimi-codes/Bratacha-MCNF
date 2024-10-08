package irish.eimi.bratacha.common.init;

import irish.eimi.bratacha.BratachaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static irish.eimi.bratacha.common.init.Registration.*;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BratachaMod.MODID);

    public static final Supplier<CreativeModeTab> COUNTRIES_TAB = CREATIVE_MODE_TAB.register("country_flags", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + BratachaMod.MODID + ".country_flags"))
//Set the icon of the tab.
            .icon(() -> new ItemStack(Countries.FLAG_COUNTRY_IRELAND_BLOCK_ITEM.get()))
            .withSearchBar()
            .displayItems((params, event) -> {
                event.accept(Countries.FLAG_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TOGO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MONTENEGRO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MAURITANIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NICARAGUA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LATVIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_OMAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_AFGHANISTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CYPRUS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BENIN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ANTARCTICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CHINA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_COLOMBIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CHRISTMAS_ISLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ANTIGUA_AND_BARBUDA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MONTSERRAT_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MOLDOVA_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ZAMBIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_VIET_NAM_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FRENCH_SOUTHERN_TERRITORIES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CHAD_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MAYOTTE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LEBANON_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_MARTIN_FRENCH_PART_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LUXEMBOURG_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MARTINIQUE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CZECHIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UNITED_ARAB_EMIRATES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CAMEROON_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BURUNDI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ARGENTINA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_AMERICAN_SAMOA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BAHRAIN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CHILE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ANDORRA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NORTHERN_MARIANA_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LITHUANIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MADAGASCAR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_LUCIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TRKIYE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UKRAINE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TUVALU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_VIRGIN_ISLANDS_US_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MALTA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NORWAY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MONACO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SWITZERLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_BARTHLEMY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ARUBA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BELIZE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BERMUDA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CTE_DIVOIRE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MAURITIUS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UNITED_STATES_OF_AMERICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TAIWAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_YEMEN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MALAWI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NETHERLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LESOTHO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BOLIVIA_PLURINATIONAL_STATE_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_AUSTRIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_COOK_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BELARUS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_AUSTRALIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BRUNEI_DARUSSALAM_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MOROCCO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NEW_ZEALAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LIBERIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MALDIVES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TURKS_AND_CAICOS_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UGANDA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TRINIDAD_AND_TOBAGO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_POLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SERBIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_INDIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GEORGIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GREECE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GRENADA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HONG_KONG_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KYRGYZSTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_PIERRE_AND_MIQUELON_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_EL_SALVADOR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_RUNION_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAUDI_ARABIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SEYCHELLES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAO_TOME_AND_PRINCIPE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KENYA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ISLE_OF_MAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KOREA_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FRENCH_GUIANA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_DJIBOUTI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_EQUATORIAL_GUINEA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUADELOUPE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_DENMARK_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUERNSEY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ISRAEL_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PITCAIRN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SOLOMON_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PARAGUAY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_RUSSIAN_FEDERATION_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KUWAIT_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_DOMINICAN_REPUBLIC_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUATEMALA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUAM_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_JERSEY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SINGAPORE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PAKISTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SURINAME_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SWEDEN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_JAPAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUINEABISSAU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_WESTERN_SAHARA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ALGERIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GABON_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FRANCE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_DOMINICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HONDURAS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SUDAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_RWANDA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PHILIPPINES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SOUTH_SUDAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_QATAR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PERU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PUERTO_RICO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SLOVENIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HAITI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SPAIN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GREENLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GAMBIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ERITREA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FINLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ESTONIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_KITTS_AND_NEVIS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HUNGARY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_IRAQ_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CAYMAN_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PALESTINE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FRENCH_POLYNESIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SVALBARD_AND_JAN_MAYEN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_INDONESIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ICELAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_EGYPT_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FALKLAND_ISLANDS_MALVINAS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FIJI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUINEA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GUYANA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_COMOROS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_IRELAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KAZAKHSTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ROMANIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SLOVAKIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PAPUA_NEW_GUINEA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PORTUGAL_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SOMALIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SINT_MAARTEN_DUTCH_PART_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CROATIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KIRIBATI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_JAMAICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ECUADOR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ETHIOPIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_FAROE_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CAMBODIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SYRIAN_ARAB_REPUBLIC_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SENEGAL_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PALAU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SIERRA_LEONE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MICRONESIA_FEDERATED_STATES_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GIBRALTAR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GERMANY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_GHANA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_JORDAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ITALY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_PANAMA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ESWATINI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAN_MARINO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TUNISIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MALI_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CONGO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LAND_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ANGOLA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BHUTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BARBADOS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CENTRAL_AFRICAN_REPUBLIC_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MYANMAR_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LIECHTENSTEIN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NAMIBIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MOZAMBIQUE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TONGA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_VIRGIN_ISLANDS_BRITISH_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_VENEZUELA_BOLIVARIAN_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TANZANIA_UNITED_REPUBLIC_OF_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TURKMENISTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MEXICO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NEW_CALEDONIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MACAO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SRI_LANKA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CONGO_DEMOCRATIC_REPUBLIC_OF_THE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ALBANIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BOTSWANA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_COSTA_RICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BOUVET_ISLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ARMENIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_AZERBAIJAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BOSNIA_AND_HERZEGOVINA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MONGOLIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NIUE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MALAYSIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TIMORLESTE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAMOA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_THAILAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_KOSOVO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NORFOLK_ISLAND_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_LIBYA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ANGUILLA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BRAZIL_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CABO_VERDE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BELGIUM_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CANADA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BANGLADESH_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CURAAO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BAHAMAS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NIGERIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NORTH_MACEDONIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NEPAL_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_HOLY_SEE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UZBEKISTAN_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_UNITED_STATES_MINOR_OUTLYING_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TOKELAU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SAINT_VINCENT_AND_THE_GRENADINES_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_ZIMBABWE_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NAURU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_NIGER_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_CUBA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BONAIRE_SINT_EUSTATIUS_AND_SABA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BURKINA_FASO_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_BULGARIA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_COCOS_KEELING_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_MARSHALL_ISLANDS_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_SOUTH_AFRICA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_URUGUAY_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_WALLIS_AND_FUTUNA_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_VANUATU_BLOCK_ITEM.get());
                event.accept(Countries.FLAG_COUNTRY_TAJIKISTAN_BLOCK_ITEM.get());
            })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
