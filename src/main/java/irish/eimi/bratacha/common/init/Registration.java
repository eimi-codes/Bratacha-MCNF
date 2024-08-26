package irish.eimi.bratacha.common.init;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.blocks.FlagBlock;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.MOD_ID;

public class Registration {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BratachaMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BratachaMod.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BratachaMod.MODID);

    public static final DeferredBlock<FlagBlock> FLAG_BLOCK = BLOCKS.register("flag", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "flag"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_BLOCK_ITEM = ITEMS.register("flag", () -> new BlockItem(FLAG_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<FlagBlock> FLAG_TEST_BLOCK = BLOCKS.register("flag_test", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "flag_test"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_TEST_BLOCK_ITEM = ITEMS.register("flag_test", () -> new BlockItem(FLAG_TEST_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TOGO_BLOCK = BLOCKS.register("flag_country_tg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TOGO_BLOCK_ITEM = ITEMS.register("flag_country_tg", () -> new BlockItem(FLAG_COUNTRY_TOGO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MONTENEGRO_BLOCK = BLOCKS.register("flag_country_me", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/me"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MONTENEGRO_BLOCK_ITEM = ITEMS.register("flag_country_me", () -> new BlockItem(FLAG_COUNTRY_MONTENEGRO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC_BLOCK = BLOCKS.register("flag_country_la", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/la"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC_BLOCK_ITEM = ITEMS.register("flag_country_la", () -> new BlockItem(FLAG_COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MAURITANIA_BLOCK = BLOCKS.register("flag_country_mr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MAURITANIA_BLOCK_ITEM = ITEMS.register("flag_country_mr", () -> new BlockItem(FLAG_COUNTRY_MAURITANIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NICARAGUA_BLOCK = BLOCKS.register("flag_country_ni", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ni"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NICARAGUA_BLOCK_ITEM = ITEMS.register("flag_country_ni", () -> new BlockItem(FLAG_COUNTRY_NICARAGUA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LATVIA_BLOCK = BLOCKS.register("flag_country_lv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LATVIA_BLOCK_ITEM = ITEMS.register("flag_country_lv", () -> new BlockItem(FLAG_COUNTRY_LATVIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_OMAN_BLOCK = BLOCKS.register("flag_country_om", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/om"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_OMAN_BLOCK_ITEM = ITEMS.register("flag_country_om", () -> new BlockItem(FLAG_COUNTRY_OMAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_AFGHANISTAN_BLOCK = BLOCKS.register("flag_country_af", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/af"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_AFGHANISTAN_BLOCK_ITEM = ITEMS.register("flag_country_af", () -> new BlockItem(FLAG_COUNTRY_AFGHANISTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CYPRUS_BLOCK = BLOCKS.register("flag_country_cy", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cy"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CYPRUS_BLOCK_ITEM = ITEMS.register("flag_country_cy", () -> new BlockItem(FLAG_COUNTRY_CYPRUS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BENIN_BLOCK = BLOCKS.register("flag_country_bj", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bj"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BENIN_BLOCK_ITEM = ITEMS.register("flag_country_bj", () -> new BlockItem(FLAG_COUNTRY_BENIN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ANTARCTICA_BLOCK = BLOCKS.register("flag_country_aq", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/aq"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ANTARCTICA_BLOCK_ITEM = ITEMS.register("flag_country_aq", () -> new BlockItem(FLAG_COUNTRY_ANTARCTICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CHINA_BLOCK = BLOCKS.register("flag_country_cn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CHINA_BLOCK_ITEM = ITEMS.register("flag_country_cn", () -> new BlockItem(FLAG_COUNTRY_CHINA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_COLOMBIA_BLOCK = BLOCKS.register("flag_country_co", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/co"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_COLOMBIA_BLOCK_ITEM = ITEMS.register("flag_country_co", () -> new BlockItem(FLAG_COUNTRY_COLOMBIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CHRISTMAS_ISLAND_BLOCK = BLOCKS.register("flag_country_cx", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cx"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CHRISTMAS_ISLAND_BLOCK_ITEM = ITEMS.register("flag_country_cx", () -> new BlockItem(FLAG_COUNTRY_CHRISTMAS_ISLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ANTIGUA_AND_BARBUDA_BLOCK = BLOCKS.register("flag_country_ag", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ag"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ANTIGUA_AND_BARBUDA_BLOCK_ITEM = ITEMS.register("flag_country_ag", () -> new BlockItem(FLAG_COUNTRY_ANTIGUA_AND_BARBUDA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MONTSERRAT_BLOCK = BLOCKS.register("flag_country_ms", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ms"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MONTSERRAT_BLOCK_ITEM = ITEMS.register("flag_country_ms", () -> new BlockItem(FLAG_COUNTRY_MONTSERRAT_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MOLDOVA_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_md", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/md"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MOLDOVA_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_md", () -> new BlockItem(FLAG_COUNTRY_MOLDOVA_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ZAMBIA_BLOCK = BLOCKS.register("flag_country_zm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/zm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ZAMBIA_BLOCK_ITEM = ITEMS.register("flag_country_zm", () -> new BlockItem(FLAG_COUNTRY_ZAMBIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_VIET_NAM_BLOCK = BLOCKS.register("flag_country_vn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/vn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_VIET_NAM_BLOCK_ITEM = ITEMS.register("flag_country_vn", () -> new BlockItem(FLAG_COUNTRY_VIET_NAM_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FRENCH_SOUTHERN_TERRITORIES_BLOCK = BLOCKS.register("flag_country_tf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FRENCH_SOUTHERN_TERRITORIES_BLOCK_ITEM = ITEMS.register("flag_country_tf", () -> new BlockItem(FLAG_COUNTRY_FRENCH_SOUTHERN_TERRITORIES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CHAD_BLOCK = BLOCKS.register("flag_country_td", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/td"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CHAD_BLOCK_ITEM = ITEMS.register("flag_country_td", () -> new BlockItem(FLAG_COUNTRY_CHAD_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MAYOTTE_BLOCK = BLOCKS.register("flag_country_yt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/yt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MAYOTTE_BLOCK_ITEM = ITEMS.register("flag_country_yt", () -> new BlockItem(FLAG_COUNTRY_MAYOTTE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LEBANON_BLOCK = BLOCKS.register("flag_country_lb", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lb"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LEBANON_BLOCK_ITEM = ITEMS.register("flag_country_lb", () -> new BlockItem(FLAG_COUNTRY_LEBANON_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_MARTIN_FRENCH_PART_BLOCK = BLOCKS.register("flag_country_mf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_MARTIN_FRENCH_PART_BLOCK_ITEM = ITEMS.register("flag_country_mf", () -> new BlockItem(FLAG_COUNTRY_SAINT_MARTIN_FRENCH_PART_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LUXEMBOURG_BLOCK = BLOCKS.register("flag_country_lu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LUXEMBOURG_BLOCK_ITEM = ITEMS.register("flag_country_lu", () -> new BlockItem(FLAG_COUNTRY_LUXEMBOURG_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MARTINIQUE_BLOCK = BLOCKS.register("flag_country_mq", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mq"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MARTINIQUE_BLOCK_ITEM = ITEMS.register("flag_country_mq", () -> new BlockItem(FLAG_COUNTRY_MARTINIQUE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CZECHIA_BLOCK = BLOCKS.register("flag_country_cz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CZECHIA_BLOCK_ITEM = ITEMS.register("flag_country_cz", () -> new BlockItem(FLAG_COUNTRY_CZECHIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UNITED_ARAB_EMIRATES_BLOCK = BLOCKS.register("flag_country_ae", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ae"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UNITED_ARAB_EMIRATES_BLOCK_ITEM = ITEMS.register("flag_country_ae", () -> new BlockItem(FLAG_COUNTRY_UNITED_ARAB_EMIRATES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CAMEROON_BLOCK = BLOCKS.register("flag_country_cm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CAMEROON_BLOCK_ITEM = ITEMS.register("flag_country_cm", () -> new BlockItem(FLAG_COUNTRY_CAMEROON_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BURUNDI_BLOCK = BLOCKS.register("flag_country_bi", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bi"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BURUNDI_BLOCK_ITEM = ITEMS.register("flag_country_bi", () -> new BlockItem(FLAG_COUNTRY_BURUNDI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ARGENTINA_BLOCK = BLOCKS.register("flag_country_ar", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ar"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ARGENTINA_BLOCK_ITEM = ITEMS.register("flag_country_ar", () -> new BlockItem(FLAG_COUNTRY_ARGENTINA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_AMERICAN_SAMOA_BLOCK = BLOCKS.register("flag_country_as", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/as"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_AMERICAN_SAMOA_BLOCK_ITEM = ITEMS.register("flag_country_as", () -> new BlockItem(FLAG_COUNTRY_AMERICAN_SAMOA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BAHRAIN_BLOCK = BLOCKS.register("flag_country_bh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BAHRAIN_BLOCK_ITEM = ITEMS.register("flag_country_bh", () -> new BlockItem(FLAG_COUNTRY_BAHRAIN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CHILE_BLOCK = BLOCKS.register("flag_country_cl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CHILE_BLOCK_ITEM = ITEMS.register("flag_country_cl", () -> new BlockItem(FLAG_COUNTRY_CHILE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ANDORRA_BLOCK = BLOCKS.register("flag_country_ad", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ad"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ANDORRA_BLOCK_ITEM = ITEMS.register("flag_country_ad", () -> new BlockItem(FLAG_COUNTRY_ANDORRA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NORTHERN_MARIANA_ISLANDS_BLOCK = BLOCKS.register("flag_country_mp", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mp"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NORTHERN_MARIANA_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_mp", () -> new BlockItem(FLAG_COUNTRY_NORTHERN_MARIANA_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LITHUANIA_BLOCK = BLOCKS.register("flag_country_lt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LITHUANIA_BLOCK_ITEM = ITEMS.register("flag_country_lt", () -> new BlockItem(FLAG_COUNTRY_LITHUANIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MADAGASCAR_BLOCK = BLOCKS.register("flag_country_mg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MADAGASCAR_BLOCK_ITEM = ITEMS.register("flag_country_mg", () -> new BlockItem(FLAG_COUNTRY_MADAGASCAR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_LUCIA_BLOCK = BLOCKS.register("flag_country_lc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_LUCIA_BLOCK_ITEM = ITEMS.register("flag_country_lc", () -> new BlockItem(FLAG_COUNTRY_SAINT_LUCIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TRKIYE_BLOCK = BLOCKS.register("flag_country_tr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TRKIYE_BLOCK_ITEM = ITEMS.register("flag_country_tr", () -> new BlockItem(FLAG_COUNTRY_TRKIYE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UKRAINE_BLOCK = BLOCKS.register("flag_country_ua", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ua"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UKRAINE_BLOCK_ITEM = ITEMS.register("flag_country_ua", () -> new BlockItem(FLAG_COUNTRY_UKRAINE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TUVALU_BLOCK = BLOCKS.register("flag_country_tv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TUVALU_BLOCK_ITEM = ITEMS.register("flag_country_tv", () -> new BlockItem(FLAG_COUNTRY_TUVALU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_VIRGIN_ISLANDS_US_BLOCK = BLOCKS.register("flag_country_vi", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/vi"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_VIRGIN_ISLANDS_US_BLOCK_ITEM = ITEMS.register("flag_country_vi", () -> new BlockItem(FLAG_COUNTRY_VIRGIN_ISLANDS_US_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MALTA_BLOCK = BLOCKS.register("flag_country_mt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MALTA_BLOCK_ITEM = ITEMS.register("flag_country_mt", () -> new BlockItem(FLAG_COUNTRY_MALTA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NORWAY_BLOCK = BLOCKS.register("flag_country_no", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/no"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NORWAY_BLOCK_ITEM = ITEMS.register("flag_country_no", () -> new BlockItem(FLAG_COUNTRY_NORWAY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MONACO_BLOCK = BLOCKS.register("flag_country_mc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MONACO_BLOCK_ITEM = ITEMS.register("flag_country_mc", () -> new BlockItem(FLAG_COUNTRY_MONACO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SWITZERLAND_BLOCK = BLOCKS.register("flag_country_ch", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ch"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SWITZERLAND_BLOCK_ITEM = ITEMS.register("flag_country_ch", () -> new BlockItem(FLAG_COUNTRY_SWITZERLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_BARTHLEMY_BLOCK = BLOCKS.register("flag_country_bl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_BARTHLEMY_BLOCK_ITEM = ITEMS.register("flag_country_bl", () -> new BlockItem(FLAG_COUNTRY_SAINT_BARTHLEMY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ARUBA_BLOCK = BLOCKS.register("flag_country_aw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/aw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ARUBA_BLOCK_ITEM = ITEMS.register("flag_country_aw", () -> new BlockItem(FLAG_COUNTRY_ARUBA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BELIZE_BLOCK = BLOCKS.register("flag_country_bz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BELIZE_BLOCK_ITEM = ITEMS.register("flag_country_bz", () -> new BlockItem(FLAG_COUNTRY_BELIZE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BERMUDA_BLOCK = BLOCKS.register("flag_country_bm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BERMUDA_BLOCK_ITEM = ITEMS.register("flag_country_bm", () -> new BlockItem(FLAG_COUNTRY_BERMUDA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CTE_DIVOIRE_BLOCK = BLOCKS.register("flag_country_ci", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ci"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CTE_DIVOIRE_BLOCK_ITEM = ITEMS.register("flag_country_ci", () -> new BlockItem(FLAG_COUNTRY_CTE_DIVOIRE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MAURITIUS_BLOCK = BLOCKS.register("flag_country_mu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MAURITIUS_BLOCK_ITEM = ITEMS.register("flag_country_mu", () -> new BlockItem(FLAG_COUNTRY_MAURITIUS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UNITED_STATES_OF_AMERICA_BLOCK = BLOCKS.register("flag_country_us", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/us"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UNITED_STATES_OF_AMERICA_BLOCK_ITEM = ITEMS.register("flag_country_us", () -> new BlockItem(FLAG_COUNTRY_UNITED_STATES_OF_AMERICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TAIWAN_BLOCK = BLOCKS.register("flag_country_tw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TAIWAN_BLOCK_ITEM = ITEMS.register("flag_country_tw", () -> new BlockItem(FLAG_COUNTRY_TAIWAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_YEMEN_BLOCK = BLOCKS.register("flag_country_ye", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ye"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_YEMEN_BLOCK_ITEM = ITEMS.register("flag_country_ye", () -> new BlockItem(FLAG_COUNTRY_YEMEN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MALAWI_BLOCK = BLOCKS.register("flag_country_mw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MALAWI_BLOCK_ITEM = ITEMS.register("flag_country_mw", () -> new BlockItem(FLAG_COUNTRY_MALAWI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NETHERLANDS_BLOCK = BLOCKS.register("flag_country_nl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NETHERLANDS_BLOCK_ITEM = ITEMS.register("flag_country_nl", () -> new BlockItem(FLAG_COUNTRY_NETHERLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LESOTHO_BLOCK = BLOCKS.register("flag_country_ls", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ls"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LESOTHO_BLOCK_ITEM = ITEMS.register("flag_country_ls", () -> new BlockItem(FLAG_COUNTRY_LESOTHO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BOLIVIA_PLURINATIONAL_STATE_OF_BLOCK = BLOCKS.register("flag_country_bo", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bo"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BOLIVIA_PLURINATIONAL_STATE_OF_BLOCK_ITEM = ITEMS.register("flag_country_bo", () -> new BlockItem(FLAG_COUNTRY_BOLIVIA_PLURINATIONAL_STATE_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_AUSTRIA_BLOCK = BLOCKS.register("flag_country_at", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/at"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_AUSTRIA_BLOCK_ITEM = ITEMS.register("flag_country_at", () -> new BlockItem(FLAG_COUNTRY_AUSTRIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_COOK_ISLANDS_BLOCK = BLOCKS.register("flag_country_ck", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ck"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_COOK_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_ck", () -> new BlockItem(FLAG_COUNTRY_COOK_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BELARUS_BLOCK = BLOCKS.register("flag_country_by", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/by"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BELARUS_BLOCK_ITEM = ITEMS.register("flag_country_by", () -> new BlockItem(FLAG_COUNTRY_BELARUS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_AUSTRALIA_BLOCK = BLOCKS.register("flag_country_au", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/au"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_AUSTRALIA_BLOCK_ITEM = ITEMS.register("flag_country_au", () -> new BlockItem(FLAG_COUNTRY_AUSTRALIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BRUNEI_DARUSSALAM_BLOCK = BLOCKS.register("flag_country_bn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BRUNEI_DARUSSALAM_BLOCK_ITEM = ITEMS.register("flag_country_bn", () -> new BlockItem(FLAG_COUNTRY_BRUNEI_DARUSSALAM_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MOROCCO_BLOCK = BLOCKS.register("flag_country_ma", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ma"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MOROCCO_BLOCK_ITEM = ITEMS.register("flag_country_ma", () -> new BlockItem(FLAG_COUNTRY_MOROCCO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NEW_ZEALAND_BLOCK = BLOCKS.register("flag_country_nz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NEW_ZEALAND_BLOCK_ITEM = ITEMS.register("flag_country_nz", () -> new BlockItem(FLAG_COUNTRY_NEW_ZEALAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LIBERIA_BLOCK = BLOCKS.register("flag_country_lr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LIBERIA_BLOCK_ITEM = ITEMS.register("flag_country_lr", () -> new BlockItem(FLAG_COUNTRY_LIBERIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MALDIVES_BLOCK = BLOCKS.register("flag_country_mv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MALDIVES_BLOCK_ITEM = ITEMS.register("flag_country_mv", () -> new BlockItem(FLAG_COUNTRY_MALDIVES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TURKS_AND_CAICOS_ISLANDS_BLOCK = BLOCKS.register("flag_country_tc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TURKS_AND_CAICOS_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_tc", () -> new BlockItem(FLAG_COUNTRY_TURKS_AND_CAICOS_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UGANDA_BLOCK = BLOCKS.register("flag_country_ug", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ug"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UGANDA_BLOCK_ITEM = ITEMS.register("flag_country_ug", () -> new BlockItem(FLAG_COUNTRY_UGANDA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TRINIDAD_AND_TOBAGO_BLOCK = BLOCKS.register("flag_country_tt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TRINIDAD_AND_TOBAGO_BLOCK_ITEM = ITEMS.register("flag_country_tt", () -> new BlockItem(FLAG_COUNTRY_TRINIDAD_AND_TOBAGO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_POLAND_BLOCK = BLOCKS.register("flag_country_pl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_POLAND_BLOCK_ITEM = ITEMS.register("flag_country_pl", () -> new BlockItem(FLAG_COUNTRY_POLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SERBIA_BLOCK = BLOCKS.register("flag_country_rs", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/rs"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SERBIA_BLOCK_ITEM = ITEMS.register("flag_country_rs", () -> new BlockItem(FLAG_COUNTRY_SERBIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_INDIA_BLOCK = BLOCKS.register("flag_country_in", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/in"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_INDIA_BLOCK_ITEM = ITEMS.register("flag_country_in", () -> new BlockItem(FLAG_COUNTRY_INDIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GEORGIA_BLOCK = BLOCKS.register("flag_country_ge", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ge"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GEORGIA_BLOCK_ITEM = ITEMS.register("flag_country_ge", () -> new BlockItem(FLAG_COUNTRY_GEORGIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GREECE_BLOCK = BLOCKS.register("flag_country_gr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GREECE_BLOCK_ITEM = ITEMS.register("flag_country_gr", () -> new BlockItem(FLAG_COUNTRY_GREECE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS_BLOCK = BLOCKS.register("flag_country_gs", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gs"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_gs", () -> new BlockItem(FLAG_COUNTRY_SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GRENADA_BLOCK = BLOCKS.register("flag_country_gd", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gd"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GRENADA_BLOCK_ITEM = ITEMS.register("flag_country_gd", () -> new BlockItem(FLAG_COUNTRY_GRENADA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY_BLOCK = BLOCKS.register("flag_country_io", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/io"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY_BLOCK_ITEM = ITEMS.register("flag_country_io", () -> new BlockItem(FLAG_COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HONG_KONG_BLOCK = BLOCKS.register("flag_country_hk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/hk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HONG_KONG_BLOCK_ITEM = ITEMS.register("flag_country_hk", () -> new BlockItem(FLAG_COUNTRY_HONG_KONG_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_kp", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kp"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_kp", () -> new BlockItem(FLAG_COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KYRGYZSTAN_BLOCK = BLOCKS.register("flag_country_kg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KYRGYZSTAN_BLOCK_ITEM = ITEMS.register("flag_country_kg", () -> new BlockItem(FLAG_COUNTRY_KYRGYZSTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_PIERRE_AND_MIQUELON_BLOCK = BLOCKS.register("flag_country_pm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_PIERRE_AND_MIQUELON_BLOCK_ITEM = ITEMS.register("flag_country_pm", () -> new BlockItem(FLAG_COUNTRY_SAINT_PIERRE_AND_MIQUELON_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_EL_SALVADOR_BLOCK = BLOCKS.register("flag_country_sv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_EL_SALVADOR_BLOCK_ITEM = ITEMS.register("flag_country_sv", () -> new BlockItem(FLAG_COUNTRY_EL_SALVADOR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_RUNION_BLOCK = BLOCKS.register("flag_country_re", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/re"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_RUNION_BLOCK_ITEM = ITEMS.register("flag_country_re", () -> new BlockItem(FLAG_COUNTRY_RUNION_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAUDI_ARABIA_BLOCK = BLOCKS.register("flag_country_sa", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sa"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAUDI_ARABIA_BLOCK_ITEM = ITEMS.register("flag_country_sa", () -> new BlockItem(FLAG_COUNTRY_SAUDI_ARABIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SEYCHELLES_BLOCK = BLOCKS.register("flag_country_sc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SEYCHELLES_BLOCK_ITEM = ITEMS.register("flag_country_sc", () -> new BlockItem(FLAG_COUNTRY_SEYCHELLES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAO_TOME_AND_PRINCIPE_BLOCK = BLOCKS.register("flag_country_st", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/st"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAO_TOME_AND_PRINCIPE_BLOCK_ITEM = ITEMS.register("flag_country_st", () -> new BlockItem(FLAG_COUNTRY_SAO_TOME_AND_PRINCIPE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KENYA_BLOCK = BLOCKS.register("flag_country_ke", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ke"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KENYA_BLOCK_ITEM = ITEMS.register("flag_country_ke", () -> new BlockItem(FLAG_COUNTRY_KENYA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ISLE_OF_MAN_BLOCK = BLOCKS.register("flag_country_im", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/im"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ISLE_OF_MAN_BLOCK_ITEM = ITEMS.register("flag_country_im", () -> new BlockItem(FLAG_COUNTRY_ISLE_OF_MAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KOREA_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_kr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KOREA_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_kr", () -> new BlockItem(FLAG_COUNTRY_KOREA_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FRENCH_GUIANA_BLOCK = BLOCKS.register("flag_country_gf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FRENCH_GUIANA_BLOCK_ITEM = ITEMS.register("flag_country_gf", () -> new BlockItem(FLAG_COUNTRY_FRENCH_GUIANA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_DJIBOUTI_BLOCK = BLOCKS.register("flag_country_dj", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/dj"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_DJIBOUTI_BLOCK_ITEM = ITEMS.register("flag_country_dj", () -> new BlockItem(FLAG_COUNTRY_DJIBOUTI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_EQUATORIAL_GUINEA_BLOCK = BLOCKS.register("flag_country_gq", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gq"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_EQUATORIAL_GUINEA_BLOCK_ITEM = ITEMS.register("flag_country_gq", () -> new BlockItem(FLAG_COUNTRY_EQUATORIAL_GUINEA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUADELOUPE_BLOCK = BLOCKS.register("flag_country_gp", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gp"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUADELOUPE_BLOCK_ITEM = ITEMS.register("flag_country_gp", () -> new BlockItem(FLAG_COUNTRY_GUADELOUPE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_DENMARK_BLOCK = BLOCKS.register("flag_country_dk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/dk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_DENMARK_BLOCK_ITEM = ITEMS.register("flag_country_dk", () -> new BlockItem(FLAG_COUNTRY_DENMARK_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUERNSEY_BLOCK = BLOCKS.register("flag_country_gg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUERNSEY_BLOCK_ITEM = ITEMS.register("flag_country_gg", () -> new BlockItem(FLAG_COUNTRY_GUERNSEY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ISRAEL_BLOCK = BLOCKS.register("flag_country_il", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/il"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ISRAEL_BLOCK_ITEM = ITEMS.register("flag_country_il", () -> new BlockItem(FLAG_COUNTRY_ISRAEL_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PITCAIRN_BLOCK = BLOCKS.register("flag_country_pn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PITCAIRN_BLOCK_ITEM = ITEMS.register("flag_country_pn", () -> new BlockItem(FLAG_COUNTRY_PITCAIRN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SOLOMON_ISLANDS_BLOCK = BLOCKS.register("flag_country_sb", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sb"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SOLOMON_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_sb", () -> new BlockItem(FLAG_COUNTRY_SOLOMON_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PARAGUAY_BLOCK = BLOCKS.register("flag_country_py", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/py"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PARAGUAY_BLOCK_ITEM = ITEMS.register("flag_country_py", () -> new BlockItem(FLAG_COUNTRY_PARAGUAY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_RUSSIAN_FEDERATION_BLOCK = BLOCKS.register("flag_country_ru", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ru"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_RUSSIAN_FEDERATION_BLOCK_ITEM = ITEMS.register("flag_country_ru", () -> new BlockItem(FLAG_COUNTRY_RUSSIAN_FEDERATION_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KUWAIT_BLOCK = BLOCKS.register("flag_country_kw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KUWAIT_BLOCK_ITEM = ITEMS.register("flag_country_kw", () -> new BlockItem(FLAG_COUNTRY_KUWAIT_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_DOMINICAN_REPUBLIC_BLOCK = BLOCKS.register("flag_country_do", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/do"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_DOMINICAN_REPUBLIC_BLOCK_ITEM = ITEMS.register("flag_country_do", () -> new BlockItem(FLAG_COUNTRY_DOMINICAN_REPUBLIC_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUATEMALA_BLOCK = BLOCKS.register("flag_country_gt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUATEMALA_BLOCK_ITEM = ITEMS.register("flag_country_gt", () -> new BlockItem(FLAG_COUNTRY_GUATEMALA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_BLOCK = BLOCKS.register("flag_country_gb", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gb"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_BLOCK_ITEM = ITEMS.register("flag_country_gb", () -> new BlockItem(FLAG_COUNTRY_UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUAM_BLOCK = BLOCKS.register("flag_country_gu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUAM_BLOCK_ITEM = ITEMS.register("flag_country_gu", () -> new BlockItem(FLAG_COUNTRY_GUAM_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_JERSEY_BLOCK = BLOCKS.register("flag_country_je", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/je"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_JERSEY_BLOCK_ITEM = ITEMS.register("flag_country_je", () -> new BlockItem(FLAG_COUNTRY_JERSEY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS_BLOCK = BLOCKS.register("flag_country_hm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/hm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_hm", () -> new BlockItem(FLAG_COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SINGAPORE_BLOCK = BLOCKS.register("flag_country_sg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SINGAPORE_BLOCK_ITEM = ITEMS.register("flag_country_sg", () -> new BlockItem(FLAG_COUNTRY_SINGAPORE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PAKISTAN_BLOCK = BLOCKS.register("flag_country_pk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PAKISTAN_BLOCK_ITEM = ITEMS.register("flag_country_pk", () -> new BlockItem(FLAG_COUNTRY_PAKISTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SURINAME_BLOCK = BLOCKS.register("flag_country_sr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SURINAME_BLOCK_ITEM = ITEMS.register("flag_country_sr", () -> new BlockItem(FLAG_COUNTRY_SURINAME_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SWEDEN_BLOCK = BLOCKS.register("flag_country_se", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/se"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SWEDEN_BLOCK_ITEM = ITEMS.register("flag_country_se", () -> new BlockItem(FLAG_COUNTRY_SWEDEN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_JAPAN_BLOCK = BLOCKS.register("flag_country_jp", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/jp"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_JAPAN_BLOCK_ITEM = ITEMS.register("flag_country_jp", () -> new BlockItem(FLAG_COUNTRY_JAPAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUINEABISSAU_BLOCK = BLOCKS.register("flag_country_gw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUINEABISSAU_BLOCK_ITEM = ITEMS.register("flag_country_gw", () -> new BlockItem(FLAG_COUNTRY_GUINEABISSAU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_WESTERN_SAHARA_BLOCK = BLOCKS.register("flag_country_eh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/eh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_WESTERN_SAHARA_BLOCK_ITEM = ITEMS.register("flag_country_eh", () -> new BlockItem(FLAG_COUNTRY_WESTERN_SAHARA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ALGERIA_BLOCK = BLOCKS.register("flag_country_dz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/dz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ALGERIA_BLOCK_ITEM = ITEMS.register("flag_country_dz", () -> new BlockItem(FLAG_COUNTRY_ALGERIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GABON_BLOCK = BLOCKS.register("flag_country_ga", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ga"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GABON_BLOCK_ITEM = ITEMS.register("flag_country_ga", () -> new BlockItem(FLAG_COUNTRY_GABON_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FRANCE_BLOCK = BLOCKS.register("flag_country_fr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FRANCE_BLOCK_ITEM = ITEMS.register("flag_country_fr", () -> new BlockItem(FLAG_COUNTRY_FRANCE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_DOMINICA_BLOCK = BLOCKS.register("flag_country_dm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/dm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_DOMINICA_BLOCK_ITEM = ITEMS.register("flag_country_dm", () -> new BlockItem(FLAG_COUNTRY_DOMINICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HONDURAS_BLOCK = BLOCKS.register("flag_country_hn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/hn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HONDURAS_BLOCK_ITEM = ITEMS.register("flag_country_hn", () -> new BlockItem(FLAG_COUNTRY_HONDURAS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SUDAN_BLOCK = BLOCKS.register("flag_country_sd", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sd"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SUDAN_BLOCK_ITEM = ITEMS.register("flag_country_sd", () -> new BlockItem(FLAG_COUNTRY_SUDAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_RWANDA_BLOCK = BLOCKS.register("flag_country_rw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/rw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_RWANDA_BLOCK_ITEM = ITEMS.register("flag_country_rw", () -> new BlockItem(FLAG_COUNTRY_RWANDA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PHILIPPINES_BLOCK = BLOCKS.register("flag_country_ph", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ph"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PHILIPPINES_BLOCK_ITEM = ITEMS.register("flag_country_ph", () -> new BlockItem(FLAG_COUNTRY_PHILIPPINES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SOUTH_SUDAN_BLOCK = BLOCKS.register("flag_country_ss", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ss"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SOUTH_SUDAN_BLOCK_ITEM = ITEMS.register("flag_country_ss", () -> new BlockItem(FLAG_COUNTRY_SOUTH_SUDAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_QATAR_BLOCK = BLOCKS.register("flag_country_qa", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/qa"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_QATAR_BLOCK_ITEM = ITEMS.register("flag_country_qa", () -> new BlockItem(FLAG_COUNTRY_QATAR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PERU_BLOCK = BLOCKS.register("flag_country_pe", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pe"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PERU_BLOCK_ITEM = ITEMS.register("flag_country_pe", () -> new BlockItem(FLAG_COUNTRY_PERU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PUERTO_RICO_BLOCK = BLOCKS.register("flag_country_pr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PUERTO_RICO_BLOCK_ITEM = ITEMS.register("flag_country_pr", () -> new BlockItem(FLAG_COUNTRY_PUERTO_RICO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SLOVENIA_BLOCK = BLOCKS.register("flag_country_si", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/si"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SLOVENIA_BLOCK_ITEM = ITEMS.register("flag_country_si", () -> new BlockItem(FLAG_COUNTRY_SLOVENIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HAITI_BLOCK = BLOCKS.register("flag_country_ht", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ht"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HAITI_BLOCK_ITEM = ITEMS.register("flag_country_ht", () -> new BlockItem(FLAG_COUNTRY_HAITI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SPAIN_BLOCK = BLOCKS.register("flag_country_es", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/es"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SPAIN_BLOCK_ITEM = ITEMS.register("flag_country_es", () -> new BlockItem(FLAG_COUNTRY_SPAIN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GREENLAND_BLOCK = BLOCKS.register("flag_country_gl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GREENLAND_BLOCK_ITEM = ITEMS.register("flag_country_gl", () -> new BlockItem(FLAG_COUNTRY_GREENLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GAMBIA_BLOCK = BLOCKS.register("flag_country_gm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GAMBIA_BLOCK_ITEM = ITEMS.register("flag_country_gm", () -> new BlockItem(FLAG_COUNTRY_GAMBIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ERITREA_BLOCK = BLOCKS.register("flag_country_er", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/er"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ERITREA_BLOCK_ITEM = ITEMS.register("flag_country_er", () -> new BlockItem(FLAG_COUNTRY_ERITREA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FINLAND_BLOCK = BLOCKS.register("flag_country_fi", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fi"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FINLAND_BLOCK_ITEM = ITEMS.register("flag_country_fi", () -> new BlockItem(FLAG_COUNTRY_FINLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ESTONIA_BLOCK = BLOCKS.register("flag_country_ee", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ee"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ESTONIA_BLOCK_ITEM = ITEMS.register("flag_country_ee", () -> new BlockItem(FLAG_COUNTRY_ESTONIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_KITTS_AND_NEVIS_BLOCK = BLOCKS.register("flag_country_kn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_KITTS_AND_NEVIS_BLOCK_ITEM = ITEMS.register("flag_country_kn", () -> new BlockItem(FLAG_COUNTRY_SAINT_KITTS_AND_NEVIS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HUNGARY_BLOCK = BLOCKS.register("flag_country_hu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/hu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HUNGARY_BLOCK_ITEM = ITEMS.register("flag_country_hu", () -> new BlockItem(FLAG_COUNTRY_HUNGARY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_IRAQ_BLOCK = BLOCKS.register("flag_country_iq", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/iq"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_IRAQ_BLOCK_ITEM = ITEMS.register("flag_country_iq", () -> new BlockItem(FLAG_COUNTRY_IRAQ_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CAYMAN_ISLANDS_BLOCK = BLOCKS.register("flag_country_ky", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ky"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CAYMAN_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_ky", () -> new BlockItem(FLAG_COUNTRY_CAYMAN_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA_BLOCK = BLOCKS.register("flag_country_sh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA_BLOCK_ITEM = ITEMS.register("flag_country_sh", () -> new BlockItem(FLAG_COUNTRY_SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PALESTINE_BLOCK = BLOCKS.register("flag_country_ps", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ps"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PALESTINE_BLOCK_ITEM = ITEMS.register("flag_country_ps", () -> new BlockItem(FLAG_COUNTRY_PALESTINE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FRENCH_POLYNESIA_BLOCK = BLOCKS.register("flag_country_pf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FRENCH_POLYNESIA_BLOCK_ITEM = ITEMS.register("flag_country_pf", () -> new BlockItem(FLAG_COUNTRY_FRENCH_POLYNESIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SVALBARD_AND_JAN_MAYEN_BLOCK = BLOCKS.register("flag_country_sj", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sj"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SVALBARD_AND_JAN_MAYEN_BLOCK_ITEM = ITEMS.register("flag_country_sj", () -> new BlockItem(FLAG_COUNTRY_SVALBARD_AND_JAN_MAYEN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_INDONESIA_BLOCK = BLOCKS.register("flag_country_id", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/id"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_INDONESIA_BLOCK_ITEM = ITEMS.register("flag_country_id", () -> new BlockItem(FLAG_COUNTRY_INDONESIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ICELAND_BLOCK = BLOCKS.register("flag_country_is", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/is"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ICELAND_BLOCK_ITEM = ITEMS.register("flag_country_is", () -> new BlockItem(FLAG_COUNTRY_ICELAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_EGYPT_BLOCK = BLOCKS.register("flag_country_eg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/eg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_EGYPT_BLOCK_ITEM = ITEMS.register("flag_country_eg", () -> new BlockItem(FLAG_COUNTRY_EGYPT_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FALKLAND_ISLANDS_MALVINAS_BLOCK = BLOCKS.register("flag_country_fk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FALKLAND_ISLANDS_MALVINAS_BLOCK_ITEM = ITEMS.register("flag_country_fk", () -> new BlockItem(FLAG_COUNTRY_FALKLAND_ISLANDS_MALVINAS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FIJI_BLOCK = BLOCKS.register("flag_country_fj", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fj"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FIJI_BLOCK_ITEM = ITEMS.register("flag_country_fj", () -> new BlockItem(FLAG_COUNTRY_FIJI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUINEA_BLOCK = BLOCKS.register("flag_country_gn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUINEA_BLOCK_ITEM = ITEMS.register("flag_country_gn", () -> new BlockItem(FLAG_COUNTRY_GUINEA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GUYANA_BLOCK = BLOCKS.register("flag_country_gy", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gy"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GUYANA_BLOCK_ITEM = ITEMS.register("flag_country_gy", () -> new BlockItem(FLAG_COUNTRY_GUYANA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_ir", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ir"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_ir", () -> new BlockItem(FLAG_COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_COMOROS_BLOCK = BLOCKS.register("flag_country_km", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/km"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_COMOROS_BLOCK_ITEM = ITEMS.register("flag_country_km", () -> new BlockItem(FLAG_COUNTRY_COMOROS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_IRELAND_BLOCK = BLOCKS.register("flag_country_ie", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ie"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_IRELAND_BLOCK_ITEM = ITEMS.register("flag_country_ie", () -> new BlockItem(FLAG_COUNTRY_IRELAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KAZAKHSTAN_BLOCK = BLOCKS.register("flag_country_kz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KAZAKHSTAN_BLOCK_ITEM = ITEMS.register("flag_country_kz", () -> new BlockItem(FLAG_COUNTRY_KAZAKHSTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ROMANIA_BLOCK = BLOCKS.register("flag_country_ro", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ro"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ROMANIA_BLOCK_ITEM = ITEMS.register("flag_country_ro", () -> new BlockItem(FLAG_COUNTRY_ROMANIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SLOVAKIA_BLOCK = BLOCKS.register("flag_country_sk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SLOVAKIA_BLOCK_ITEM = ITEMS.register("flag_country_sk", () -> new BlockItem(FLAG_COUNTRY_SLOVAKIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PAPUA_NEW_GUINEA_BLOCK = BLOCKS.register("flag_country_pg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PAPUA_NEW_GUINEA_BLOCK_ITEM = ITEMS.register("flag_country_pg", () -> new BlockItem(FLAG_COUNTRY_PAPUA_NEW_GUINEA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PORTUGAL_BLOCK = BLOCKS.register("flag_country_pt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PORTUGAL_BLOCK_ITEM = ITEMS.register("flag_country_pt", () -> new BlockItem(FLAG_COUNTRY_PORTUGAL_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SOMALIA_BLOCK = BLOCKS.register("flag_country_so", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/so"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SOMALIA_BLOCK_ITEM = ITEMS.register("flag_country_so", () -> new BlockItem(FLAG_COUNTRY_SOMALIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SINT_MAARTEN_DUTCH_PART_BLOCK = BLOCKS.register("flag_country_sx", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sx"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SINT_MAARTEN_DUTCH_PART_BLOCK_ITEM = ITEMS.register("flag_country_sx", () -> new BlockItem(FLAG_COUNTRY_SINT_MAARTEN_DUTCH_PART_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CROATIA_BLOCK = BLOCKS.register("flag_country_hr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/hr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CROATIA_BLOCK_ITEM = ITEMS.register("flag_country_hr", () -> new BlockItem(FLAG_COUNTRY_CROATIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KIRIBATI_BLOCK = BLOCKS.register("flag_country_ki", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ki"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KIRIBATI_BLOCK_ITEM = ITEMS.register("flag_country_ki", () -> new BlockItem(FLAG_COUNTRY_KIRIBATI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_JAMAICA_BLOCK = BLOCKS.register("flag_country_jm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/jm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_JAMAICA_BLOCK_ITEM = ITEMS.register("flag_country_jm", () -> new BlockItem(FLAG_COUNTRY_JAMAICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ECUADOR_BLOCK = BLOCKS.register("flag_country_ec", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ec"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ECUADOR_BLOCK_ITEM = ITEMS.register("flag_country_ec", () -> new BlockItem(FLAG_COUNTRY_ECUADOR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ETHIOPIA_BLOCK = BLOCKS.register("flag_country_et", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/et"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ETHIOPIA_BLOCK_ITEM = ITEMS.register("flag_country_et", () -> new BlockItem(FLAG_COUNTRY_ETHIOPIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_FAROE_ISLANDS_BLOCK = BLOCKS.register("flag_country_fo", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fo"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_FAROE_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_fo", () -> new BlockItem(FLAG_COUNTRY_FAROE_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CAMBODIA_BLOCK = BLOCKS.register("flag_country_kh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/kh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CAMBODIA_BLOCK_ITEM = ITEMS.register("flag_country_kh", () -> new BlockItem(FLAG_COUNTRY_CAMBODIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SYRIAN_ARAB_REPUBLIC_BLOCK = BLOCKS.register("flag_country_sy", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sy"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SYRIAN_ARAB_REPUBLIC_BLOCK_ITEM = ITEMS.register("flag_country_sy", () -> new BlockItem(FLAG_COUNTRY_SYRIAN_ARAB_REPUBLIC_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SENEGAL_BLOCK = BLOCKS.register("flag_country_sn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SENEGAL_BLOCK_ITEM = ITEMS.register("flag_country_sn", () -> new BlockItem(FLAG_COUNTRY_SENEGAL_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PALAU_BLOCK = BLOCKS.register("flag_country_pw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PALAU_BLOCK_ITEM = ITEMS.register("flag_country_pw", () -> new BlockItem(FLAG_COUNTRY_PALAU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SIERRA_LEONE_BLOCK = BLOCKS.register("flag_country_sl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SIERRA_LEONE_BLOCK_ITEM = ITEMS.register("flag_country_sl", () -> new BlockItem(FLAG_COUNTRY_SIERRA_LEONE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MICRONESIA_FEDERATED_STATES_OF_BLOCK = BLOCKS.register("flag_country_fm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/fm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MICRONESIA_FEDERATED_STATES_OF_BLOCK_ITEM = ITEMS.register("flag_country_fm", () -> new BlockItem(FLAG_COUNTRY_MICRONESIA_FEDERATED_STATES_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GIBRALTAR_BLOCK = BLOCKS.register("flag_country_gi", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gi"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GIBRALTAR_BLOCK_ITEM = ITEMS.register("flag_country_gi", () -> new BlockItem(FLAG_COUNTRY_GIBRALTAR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GERMANY_BLOCK = BLOCKS.register("flag_country_de", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/de"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GERMANY_BLOCK_ITEM = ITEMS.register("flag_country_de", () -> new BlockItem(FLAG_COUNTRY_GERMANY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_GHANA_BLOCK = BLOCKS.register("flag_country_gh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/gh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_GHANA_BLOCK_ITEM = ITEMS.register("flag_country_gh", () -> new BlockItem(FLAG_COUNTRY_GHANA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_JORDAN_BLOCK = BLOCKS.register("flag_country_jo", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/jo"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_JORDAN_BLOCK_ITEM = ITEMS.register("flag_country_jo", () -> new BlockItem(FLAG_COUNTRY_JORDAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ITALY_BLOCK = BLOCKS.register("flag_country_it", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/it"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ITALY_BLOCK_ITEM = ITEMS.register("flag_country_it", () -> new BlockItem(FLAG_COUNTRY_ITALY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_PANAMA_BLOCK = BLOCKS.register("flag_country_pa", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/pa"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_PANAMA_BLOCK_ITEM = ITEMS.register("flag_country_pa", () -> new BlockItem(FLAG_COUNTRY_PANAMA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ESWATINI_BLOCK = BLOCKS.register("flag_country_sz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ESWATINI_BLOCK_ITEM = ITEMS.register("flag_country_sz", () -> new BlockItem(FLAG_COUNTRY_ESWATINI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAN_MARINO_BLOCK = BLOCKS.register("flag_country_sm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/sm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAN_MARINO_BLOCK_ITEM = ITEMS.register("flag_country_sm", () -> new BlockItem(FLAG_COUNTRY_SAN_MARINO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TUNISIA_BLOCK = BLOCKS.register("flag_country_tn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TUNISIA_BLOCK_ITEM = ITEMS.register("flag_country_tn", () -> new BlockItem(FLAG_COUNTRY_TUNISIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MALI_BLOCK = BLOCKS.register("flag_country_ml", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ml"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MALI_BLOCK_ITEM = ITEMS.register("flag_country_ml", () -> new BlockItem(FLAG_COUNTRY_MALI_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CONGO_BLOCK = BLOCKS.register("flag_country_cg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CONGO_BLOCK_ITEM = ITEMS.register("flag_country_cg", () -> new BlockItem(FLAG_COUNTRY_CONGO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LAND_ISLANDS_BLOCK = BLOCKS.register("flag_country_ax", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ax"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LAND_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_ax", () -> new BlockItem(FLAG_COUNTRY_LAND_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ANGOLA_BLOCK = BLOCKS.register("flag_country_ao", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ao"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ANGOLA_BLOCK_ITEM = ITEMS.register("flag_country_ao", () -> new BlockItem(FLAG_COUNTRY_ANGOLA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BHUTAN_BLOCK = BLOCKS.register("flag_country_bt", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bt"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BHUTAN_BLOCK_ITEM = ITEMS.register("flag_country_bt", () -> new BlockItem(FLAG_COUNTRY_BHUTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BARBADOS_BLOCK = BLOCKS.register("flag_country_bb", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bb"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BARBADOS_BLOCK_ITEM = ITEMS.register("flag_country_bb", () -> new BlockItem(FLAG_COUNTRY_BARBADOS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CENTRAL_AFRICAN_REPUBLIC_BLOCK = BLOCKS.register("flag_country_cf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CENTRAL_AFRICAN_REPUBLIC_BLOCK_ITEM = ITEMS.register("flag_country_cf", () -> new BlockItem(FLAG_COUNTRY_CENTRAL_AFRICAN_REPUBLIC_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MYANMAR_BLOCK = BLOCKS.register("flag_country_mm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MYANMAR_BLOCK_ITEM = ITEMS.register("flag_country_mm", () -> new BlockItem(FLAG_COUNTRY_MYANMAR_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LIECHTENSTEIN_BLOCK = BLOCKS.register("flag_country_li", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/li"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LIECHTENSTEIN_BLOCK_ITEM = ITEMS.register("flag_country_li", () -> new BlockItem(FLAG_COUNTRY_LIECHTENSTEIN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NAMIBIA_BLOCK = BLOCKS.register("flag_country_na", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/na"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NAMIBIA_BLOCK_ITEM = ITEMS.register("flag_country_na", () -> new BlockItem(FLAG_COUNTRY_NAMIBIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MOZAMBIQUE_BLOCK = BLOCKS.register("flag_country_mz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MOZAMBIQUE_BLOCK_ITEM = ITEMS.register("flag_country_mz", () -> new BlockItem(FLAG_COUNTRY_MOZAMBIQUE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TONGA_BLOCK = BLOCKS.register("flag_country_to", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/to"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TONGA_BLOCK_ITEM = ITEMS.register("flag_country_to", () -> new BlockItem(FLAG_COUNTRY_TONGA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_VIRGIN_ISLANDS_BRITISH_BLOCK = BLOCKS.register("flag_country_vg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/vg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_VIRGIN_ISLANDS_BRITISH_BLOCK_ITEM = ITEMS.register("flag_country_vg", () -> new BlockItem(FLAG_COUNTRY_VIRGIN_ISLANDS_BRITISH_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_VENEZUELA_BOLIVARIAN_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_ve", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ve"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_VENEZUELA_BOLIVARIAN_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_ve", () -> new BlockItem(FLAG_COUNTRY_VENEZUELA_BOLIVARIAN_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TANZANIA_UNITED_REPUBLIC_OF_BLOCK = BLOCKS.register("flag_country_tz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TANZANIA_UNITED_REPUBLIC_OF_BLOCK_ITEM = ITEMS.register("flag_country_tz", () -> new BlockItem(FLAG_COUNTRY_TANZANIA_UNITED_REPUBLIC_OF_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TURKMENISTAN_BLOCK = BLOCKS.register("flag_country_tm", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tm"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TURKMENISTAN_BLOCK_ITEM = ITEMS.register("flag_country_tm", () -> new BlockItem(FLAG_COUNTRY_TURKMENISTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MEXICO_BLOCK = BLOCKS.register("flag_country_mx", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mx"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MEXICO_BLOCK_ITEM = ITEMS.register("flag_country_mx", () -> new BlockItem(FLAG_COUNTRY_MEXICO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NEW_CALEDONIA_BLOCK = BLOCKS.register("flag_country_nc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NEW_CALEDONIA_BLOCK_ITEM = ITEMS.register("flag_country_nc", () -> new BlockItem(FLAG_COUNTRY_NEW_CALEDONIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MACAO_BLOCK = BLOCKS.register("flag_country_mo", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mo"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MACAO_BLOCK_ITEM = ITEMS.register("flag_country_mo", () -> new BlockItem(FLAG_COUNTRY_MACAO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SRI_LANKA_BLOCK = BLOCKS.register("flag_country_lk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/lk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SRI_LANKA_BLOCK_ITEM = ITEMS.register("flag_country_lk", () -> new BlockItem(FLAG_COUNTRY_SRI_LANKA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CONGO_DEMOCRATIC_REPUBLIC_OF_THE_BLOCK = BLOCKS.register("flag_country_cd", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cd"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CONGO_DEMOCRATIC_REPUBLIC_OF_THE_BLOCK_ITEM = ITEMS.register("flag_country_cd", () -> new BlockItem(FLAG_COUNTRY_CONGO_DEMOCRATIC_REPUBLIC_OF_THE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ALBANIA_BLOCK = BLOCKS.register("flag_country_al", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/al"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ALBANIA_BLOCK_ITEM = ITEMS.register("flag_country_al", () -> new BlockItem(FLAG_COUNTRY_ALBANIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BOTSWANA_BLOCK = BLOCKS.register("flag_country_bw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BOTSWANA_BLOCK_ITEM = ITEMS.register("flag_country_bw", () -> new BlockItem(FLAG_COUNTRY_BOTSWANA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_COSTA_RICA_BLOCK = BLOCKS.register("flag_country_cr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_COSTA_RICA_BLOCK_ITEM = ITEMS.register("flag_country_cr", () -> new BlockItem(FLAG_COUNTRY_COSTA_RICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BOUVET_ISLAND_BLOCK = BLOCKS.register("flag_country_bv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BOUVET_ISLAND_BLOCK_ITEM = ITEMS.register("flag_country_bv", () -> new BlockItem(FLAG_COUNTRY_BOUVET_ISLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ARMENIA_BLOCK = BLOCKS.register("flag_country_am", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/am"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ARMENIA_BLOCK_ITEM = ITEMS.register("flag_country_am", () -> new BlockItem(FLAG_COUNTRY_ARMENIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_AZERBAIJAN_BLOCK = BLOCKS.register("flag_country_az", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/az"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_AZERBAIJAN_BLOCK_ITEM = ITEMS.register("flag_country_az", () -> new BlockItem(FLAG_COUNTRY_AZERBAIJAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BOSNIA_AND_HERZEGOVINA_BLOCK = BLOCKS.register("flag_country_ba", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ba"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BOSNIA_AND_HERZEGOVINA_BLOCK_ITEM = ITEMS.register("flag_country_ba", () -> new BlockItem(FLAG_COUNTRY_BOSNIA_AND_HERZEGOVINA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MONGOLIA_BLOCK = BLOCKS.register("flag_country_mn", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mn"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MONGOLIA_BLOCK_ITEM = ITEMS.register("flag_country_mn", () -> new BlockItem(FLAG_COUNTRY_MONGOLIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NIUE_BLOCK = BLOCKS.register("flag_country_nu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NIUE_BLOCK_ITEM = ITEMS.register("flag_country_nu", () -> new BlockItem(FLAG_COUNTRY_NIUE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MALAYSIA_BLOCK = BLOCKS.register("flag_country_my", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/my"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MALAYSIA_BLOCK_ITEM = ITEMS.register("flag_country_my", () -> new BlockItem(FLAG_COUNTRY_MALAYSIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TIMORLESTE_BLOCK = BLOCKS.register("flag_country_tl", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tl"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TIMORLESTE_BLOCK_ITEM = ITEMS.register("flag_country_tl", () -> new BlockItem(FLAG_COUNTRY_TIMORLESTE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAMOA_BLOCK = BLOCKS.register("flag_country_ws", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ws"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAMOA_BLOCK_ITEM = ITEMS.register("flag_country_ws", () -> new BlockItem(FLAG_COUNTRY_SAMOA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_THAILAND_BLOCK = BLOCKS.register("flag_country_th", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/th"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_THAILAND_BLOCK_ITEM = ITEMS.register("flag_country_th", () -> new BlockItem(FLAG_COUNTRY_THAILAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_KOSOVO_BLOCK = BLOCKS.register("flag_country_xk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/xk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_KOSOVO_BLOCK_ITEM = ITEMS.register("flag_country_xk", () -> new BlockItem(FLAG_COUNTRY_KOSOVO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NORFOLK_ISLAND_BLOCK = BLOCKS.register("flag_country_nf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NORFOLK_ISLAND_BLOCK_ITEM = ITEMS.register("flag_country_nf", () -> new BlockItem(FLAG_COUNTRY_NORFOLK_ISLAND_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_LIBYA_BLOCK = BLOCKS.register("flag_country_ly", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ly"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_LIBYA_BLOCK_ITEM = ITEMS.register("flag_country_ly", () -> new BlockItem(FLAG_COUNTRY_LIBYA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ANGUILLA_BLOCK = BLOCKS.register("flag_country_ai", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ai"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ANGUILLA_BLOCK_ITEM = ITEMS.register("flag_country_ai", () -> new BlockItem(FLAG_COUNTRY_ANGUILLA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BRAZIL_BLOCK = BLOCKS.register("flag_country_br", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/br"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BRAZIL_BLOCK_ITEM = ITEMS.register("flag_country_br", () -> new BlockItem(FLAG_COUNTRY_BRAZIL_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CABO_VERDE_BLOCK = BLOCKS.register("flag_country_cv", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cv"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CABO_VERDE_BLOCK_ITEM = ITEMS.register("flag_country_cv", () -> new BlockItem(FLAG_COUNTRY_CABO_VERDE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BELGIUM_BLOCK = BLOCKS.register("flag_country_be", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/be"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BELGIUM_BLOCK_ITEM = ITEMS.register("flag_country_be", () -> new BlockItem(FLAG_COUNTRY_BELGIUM_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CANADA_BLOCK = BLOCKS.register("flag_country_ca", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ca"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CANADA_BLOCK_ITEM = ITEMS.register("flag_country_ca", () -> new BlockItem(FLAG_COUNTRY_CANADA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BANGLADESH_BLOCK = BLOCKS.register("flag_country_bd", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bd"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BANGLADESH_BLOCK_ITEM = ITEMS.register("flag_country_bd", () -> new BlockItem(FLAG_COUNTRY_BANGLADESH_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CURAAO_BLOCK = BLOCKS.register("flag_country_cw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CURAAO_BLOCK_ITEM = ITEMS.register("flag_country_cw", () -> new BlockItem(FLAG_COUNTRY_CURAAO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BAHAMAS_BLOCK = BLOCKS.register("flag_country_bs", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bs"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BAHAMAS_BLOCK_ITEM = ITEMS.register("flag_country_bs", () -> new BlockItem(FLAG_COUNTRY_BAHAMAS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NIGERIA_BLOCK = BLOCKS.register("flag_country_ng", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ng"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NIGERIA_BLOCK_ITEM = ITEMS.register("flag_country_ng", () -> new BlockItem(FLAG_COUNTRY_NIGERIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NORTH_MACEDONIA_BLOCK = BLOCKS.register("flag_country_mk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NORTH_MACEDONIA_BLOCK_ITEM = ITEMS.register("flag_country_mk", () -> new BlockItem(FLAG_COUNTRY_NORTH_MACEDONIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NEPAL_BLOCK = BLOCKS.register("flag_country_np", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/np"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NEPAL_BLOCK_ITEM = ITEMS.register("flag_country_np", () -> new BlockItem(FLAG_COUNTRY_NEPAL_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_HOLY_SEE_BLOCK = BLOCKS.register("flag_country_va", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/va"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_HOLY_SEE_BLOCK_ITEM = ITEMS.register("flag_country_va", () -> new BlockItem(FLAG_COUNTRY_HOLY_SEE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UZBEKISTAN_BLOCK = BLOCKS.register("flag_country_uz", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/uz"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UZBEKISTAN_BLOCK_ITEM = ITEMS.register("flag_country_uz", () -> new BlockItem(FLAG_COUNTRY_UZBEKISTAN_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_UNITED_STATES_MINOR_OUTLYING_ISLANDS_BLOCK = BLOCKS.register("flag_country_um", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/um"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_UNITED_STATES_MINOR_OUTLYING_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_um", () -> new BlockItem(FLAG_COUNTRY_UNITED_STATES_MINOR_OUTLYING_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TOKELAU_BLOCK = BLOCKS.register("flag_country_tk", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tk"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TOKELAU_BLOCK_ITEM = ITEMS.register("flag_country_tk", () -> new BlockItem(FLAG_COUNTRY_TOKELAU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SAINT_VINCENT_AND_THE_GRENADINES_BLOCK = BLOCKS.register("flag_country_vc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/vc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SAINT_VINCENT_AND_THE_GRENADINES_BLOCK_ITEM = ITEMS.register("flag_country_vc", () -> new BlockItem(FLAG_COUNTRY_SAINT_VINCENT_AND_THE_GRENADINES_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_ZIMBABWE_BLOCK = BLOCKS.register("flag_country_zw", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/zw"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_ZIMBABWE_BLOCK_ITEM = ITEMS.register("flag_country_zw", () -> new BlockItem(FLAG_COUNTRY_ZIMBABWE_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NAURU_BLOCK = BLOCKS.register("flag_country_nr", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/nr"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NAURU_BLOCK_ITEM = ITEMS.register("flag_country_nr", () -> new BlockItem(FLAG_COUNTRY_NAURU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_NIGER_BLOCK = BLOCKS.register("flag_country_ne", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/ne"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_NIGER_BLOCK_ITEM = ITEMS.register("flag_country_ne", () -> new BlockItem(FLAG_COUNTRY_NIGER_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_CUBA_BLOCK = BLOCKS.register("flag_country_cu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_CUBA_BLOCK_ITEM = ITEMS.register("flag_country_cu", () -> new BlockItem(FLAG_COUNTRY_CUBA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BONAIRE_SINT_EUSTATIUS_AND_SABA_BLOCK = BLOCKS.register("flag_country_bq", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bq"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BONAIRE_SINT_EUSTATIUS_AND_SABA_BLOCK_ITEM = ITEMS.register("flag_country_bq", () -> new BlockItem(FLAG_COUNTRY_BONAIRE_SINT_EUSTATIUS_AND_SABA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BURKINA_FASO_BLOCK = BLOCKS.register("flag_country_bf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BURKINA_FASO_BLOCK_ITEM = ITEMS.register("flag_country_bf", () -> new BlockItem(FLAG_COUNTRY_BURKINA_FASO_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_BULGARIA_BLOCK = BLOCKS.register("flag_country_bg", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/bg"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_BULGARIA_BLOCK_ITEM = ITEMS.register("flag_country_bg", () -> new BlockItem(FLAG_COUNTRY_BULGARIA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_COCOS_KEELING_ISLANDS_BLOCK = BLOCKS.register("flag_country_cc", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/cc"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_COCOS_KEELING_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_cc", () -> new BlockItem(FLAG_COUNTRY_COCOS_KEELING_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_MARSHALL_ISLANDS_BLOCK = BLOCKS.register("flag_country_mh", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/mh"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_MARSHALL_ISLANDS_BLOCK_ITEM = ITEMS.register("flag_country_mh", () -> new BlockItem(FLAG_COUNTRY_MARSHALL_ISLANDS_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_SOUTH_AFRICA_BLOCK = BLOCKS.register("flag_country_za", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/za"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_SOUTH_AFRICA_BLOCK_ITEM = ITEMS.register("flag_country_za", () -> new BlockItem(FLAG_COUNTRY_SOUTH_AFRICA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_URUGUAY_BLOCK = BLOCKS.register("flag_country_uy", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/uy"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_URUGUAY_BLOCK_ITEM = ITEMS.register("flag_country_uy", () -> new BlockItem(FLAG_COUNTRY_URUGUAY_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_WALLIS_AND_FUTUNA_BLOCK = BLOCKS.register("flag_country_wf", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/wf"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_WALLIS_AND_FUTUNA_BLOCK_ITEM = ITEMS.register("flag_country_wf", () -> new BlockItem(FLAG_COUNTRY_WALLIS_AND_FUTUNA_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_VANUATU_BLOCK = BLOCKS.register("flag_country_vu", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/vu"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_VANUATU_BLOCK_ITEM = ITEMS.register("flag_country_vu", () -> new BlockItem(FLAG_COUNTRY_VANUATU_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<FlagBlock> FLAG_COUNTRY_TAJIKISTAN_BLOCK = BLOCKS.register("flag_country_tj", () -> new FlagBlock(ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID, "countries/tj"), BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_COUNTRY_TAJIKISTAN_BLOCK_ITEM = ITEMS.register("flag_country_tj", () -> new BlockItem(FLAG_COUNTRY_TAJIKISTAN_BLOCK.get(), new Item.Properties()));


    public static final Supplier<BlockEntityType<FlagBlockEntity>> FLAG_BLOCK_ENTITY = BLOCK_ENTITIES.register("flag",
            () -> BlockEntityType.Builder.of(FlagBlockEntity::new,
                    FLAG_BLOCK.get(),
                    FLAG_TEST_BLOCK.get(),
                    FLAG_COUNTRY_TOGO_BLOCK.get(),
                    FLAG_COUNTRY_MONTENEGRO_BLOCK.get(),
                    FLAG_COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC_BLOCK.get(),
                    FLAG_COUNTRY_MAURITANIA_BLOCK.get(),
                    FLAG_COUNTRY_NICARAGUA_BLOCK.get(),
                    FLAG_COUNTRY_LATVIA_BLOCK.get(),
                    FLAG_COUNTRY_OMAN_BLOCK.get(),
                    FLAG_COUNTRY_AFGHANISTAN_BLOCK.get(),
                    FLAG_COUNTRY_CYPRUS_BLOCK.get(),
                    FLAG_COUNTRY_BENIN_BLOCK.get(),
                    FLAG_COUNTRY_ANTARCTICA_BLOCK.get(),
                    FLAG_COUNTRY_CHINA_BLOCK.get(),
                    FLAG_COUNTRY_COLOMBIA_BLOCK.get(),
                    FLAG_COUNTRY_CHRISTMAS_ISLAND_BLOCK.get(),
                    FLAG_COUNTRY_ANTIGUA_AND_BARBUDA_BLOCK.get(),
                    FLAG_COUNTRY_MONTSERRAT_BLOCK.get(),
                    FLAG_COUNTRY_MOLDOVA_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_ZAMBIA_BLOCK.get(),
                    FLAG_COUNTRY_VIET_NAM_BLOCK.get(),
                    FLAG_COUNTRY_FRENCH_SOUTHERN_TERRITORIES_BLOCK.get(),
                    FLAG_COUNTRY_CHAD_BLOCK.get(),
                    FLAG_COUNTRY_MAYOTTE_BLOCK.get(),
                    FLAG_COUNTRY_LEBANON_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_MARTIN_FRENCH_PART_BLOCK.get(),
                    FLAG_COUNTRY_LUXEMBOURG_BLOCK.get(),
                    FLAG_COUNTRY_MARTINIQUE_BLOCK.get(),
                    FLAG_COUNTRY_CZECHIA_BLOCK.get(),
                    FLAG_COUNTRY_UNITED_ARAB_EMIRATES_BLOCK.get(),
                    FLAG_COUNTRY_CAMEROON_BLOCK.get(),
                    FLAG_COUNTRY_BURUNDI_BLOCK.get(),
                    FLAG_COUNTRY_ARGENTINA_BLOCK.get(),
                    FLAG_COUNTRY_AMERICAN_SAMOA_BLOCK.get(),
                    FLAG_COUNTRY_BAHRAIN_BLOCK.get(),
                    FLAG_COUNTRY_CHILE_BLOCK.get(),
                    FLAG_COUNTRY_ANDORRA_BLOCK.get(),
                    FLAG_COUNTRY_NORTHERN_MARIANA_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_LITHUANIA_BLOCK.get(),
                    FLAG_COUNTRY_MADAGASCAR_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_LUCIA_BLOCK.get(),
                    FLAG_COUNTRY_TRKIYE_BLOCK.get(),
                    FLAG_COUNTRY_UKRAINE_BLOCK.get(),
                    FLAG_COUNTRY_TUVALU_BLOCK.get(),
                    FLAG_COUNTRY_VIRGIN_ISLANDS_US_BLOCK.get(),
                    FLAG_COUNTRY_MALTA_BLOCK.get(),
                    FLAG_COUNTRY_NORWAY_BLOCK.get(),
                    FLAG_COUNTRY_MONACO_BLOCK.get(),
                    FLAG_COUNTRY_SWITZERLAND_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_BARTHLEMY_BLOCK.get(),
                    FLAG_COUNTRY_ARUBA_BLOCK.get(),
                    FLAG_COUNTRY_BELIZE_BLOCK.get(),
                    FLAG_COUNTRY_BERMUDA_BLOCK.get(),
                    FLAG_COUNTRY_CTE_DIVOIRE_BLOCK.get(),
                    FLAG_COUNTRY_MAURITIUS_BLOCK.get(),
                    FLAG_COUNTRY_UNITED_STATES_OF_AMERICA_BLOCK.get(),
                    FLAG_COUNTRY_TAIWAN_BLOCK.get(),
                    FLAG_COUNTRY_YEMEN_BLOCK.get(),
                    FLAG_COUNTRY_MALAWI_BLOCK.get(),
                    FLAG_COUNTRY_NETHERLANDS_BLOCK.get(),
                    FLAG_COUNTRY_LESOTHO_BLOCK.get(),
                    FLAG_COUNTRY_BOLIVIA_PLURINATIONAL_STATE_OF_BLOCK.get(),
                    FLAG_COUNTRY_AUSTRIA_BLOCK.get(),
                    FLAG_COUNTRY_COOK_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_BELARUS_BLOCK.get(),
                    FLAG_COUNTRY_AUSTRALIA_BLOCK.get(),
                    FLAG_COUNTRY_BRUNEI_DARUSSALAM_BLOCK.get(),
                    FLAG_COUNTRY_MOROCCO_BLOCK.get(),
                    FLAG_COUNTRY_NEW_ZEALAND_BLOCK.get(),
                    FLAG_COUNTRY_LIBERIA_BLOCK.get(),
                    FLAG_COUNTRY_MALDIVES_BLOCK.get(),
                    FLAG_COUNTRY_TURKS_AND_CAICOS_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_UGANDA_BLOCK.get(),
                    FLAG_COUNTRY_TRINIDAD_AND_TOBAGO_BLOCK.get(),
                    FLAG_COUNTRY_POLAND_BLOCK.get(),
                    FLAG_COUNTRY_SERBIA_BLOCK.get(),
                    FLAG_COUNTRY_INDIA_BLOCK.get(),
                    FLAG_COUNTRY_GEORGIA_BLOCK.get(),
                    FLAG_COUNTRY_GREECE_BLOCK.get(),
                    FLAG_COUNTRY_SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_GRENADA_BLOCK.get(),
                    FLAG_COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY_BLOCK.get(),
                    FLAG_COUNTRY_HONG_KONG_BLOCK.get(),
                    FLAG_COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_KYRGYZSTAN_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_PIERRE_AND_MIQUELON_BLOCK.get(),
                    FLAG_COUNTRY_EL_SALVADOR_BLOCK.get(),
                    FLAG_COUNTRY_RUNION_BLOCK.get(),
                    FLAG_COUNTRY_SAUDI_ARABIA_BLOCK.get(),
                    FLAG_COUNTRY_SEYCHELLES_BLOCK.get(),
                    FLAG_COUNTRY_SAO_TOME_AND_PRINCIPE_BLOCK.get(),
                    FLAG_COUNTRY_KENYA_BLOCK.get(),
                    FLAG_COUNTRY_ISLE_OF_MAN_BLOCK.get(),
                    FLAG_COUNTRY_KOREA_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_FRENCH_GUIANA_BLOCK.get(),
                    FLAG_COUNTRY_DJIBOUTI_BLOCK.get(),
                    FLAG_COUNTRY_EQUATORIAL_GUINEA_BLOCK.get(),
                    FLAG_COUNTRY_GUADELOUPE_BLOCK.get(),
                    FLAG_COUNTRY_DENMARK_BLOCK.get(),
                    FLAG_COUNTRY_GUERNSEY_BLOCK.get(),
                    FLAG_COUNTRY_ISRAEL_BLOCK.get(),
                    FLAG_COUNTRY_PITCAIRN_BLOCK.get(),
                    FLAG_COUNTRY_SOLOMON_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_PARAGUAY_BLOCK.get(),
                    FLAG_COUNTRY_RUSSIAN_FEDERATION_BLOCK.get(),
                    FLAG_COUNTRY_KUWAIT_BLOCK.get(),
                    FLAG_COUNTRY_DOMINICAN_REPUBLIC_BLOCK.get(),
                    FLAG_COUNTRY_GUATEMALA_BLOCK.get(),
                    FLAG_COUNTRY_UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_BLOCK.get(),
                    FLAG_COUNTRY_GUAM_BLOCK.get(),
                    FLAG_COUNTRY_JERSEY_BLOCK.get(),
                    FLAG_COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_SINGAPORE_BLOCK.get(),
                    FLAG_COUNTRY_PAKISTAN_BLOCK.get(),
                    FLAG_COUNTRY_SURINAME_BLOCK.get(),
                    FLAG_COUNTRY_SWEDEN_BLOCK.get(),
                    FLAG_COUNTRY_JAPAN_BLOCK.get(),
                    FLAG_COUNTRY_GUINEABISSAU_BLOCK.get(),
                    FLAG_COUNTRY_WESTERN_SAHARA_BLOCK.get(),
                    FLAG_COUNTRY_ALGERIA_BLOCK.get(),
                    FLAG_COUNTRY_GABON_BLOCK.get(),
                    FLAG_COUNTRY_FRANCE_BLOCK.get(),
                    FLAG_COUNTRY_DOMINICA_BLOCK.get(),
                    FLAG_COUNTRY_HONDURAS_BLOCK.get(),
                    FLAG_COUNTRY_SUDAN_BLOCK.get(),
                    FLAG_COUNTRY_RWANDA_BLOCK.get(),
                    FLAG_COUNTRY_PHILIPPINES_BLOCK.get(),
                    FLAG_COUNTRY_SOUTH_SUDAN_BLOCK.get(),
                    FLAG_COUNTRY_QATAR_BLOCK.get(),
                    FLAG_COUNTRY_PERU_BLOCK.get(),
                    FLAG_COUNTRY_PUERTO_RICO_BLOCK.get(),
                    FLAG_COUNTRY_SLOVENIA_BLOCK.get(),
                    FLAG_COUNTRY_HAITI_BLOCK.get(),
                    FLAG_COUNTRY_SPAIN_BLOCK.get(),
                    FLAG_COUNTRY_GREENLAND_BLOCK.get(),
                    FLAG_COUNTRY_GAMBIA_BLOCK.get(),
                    FLAG_COUNTRY_ERITREA_BLOCK.get(),
                    FLAG_COUNTRY_FINLAND_BLOCK.get(),
                    FLAG_COUNTRY_ESTONIA_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_KITTS_AND_NEVIS_BLOCK.get(),
                    FLAG_COUNTRY_HUNGARY_BLOCK.get(),
                    FLAG_COUNTRY_IRAQ_BLOCK.get(),
                    FLAG_COUNTRY_CAYMAN_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA_BLOCK.get(),
                    FLAG_COUNTRY_PALESTINE_BLOCK.get(),
                    FLAG_COUNTRY_FRENCH_POLYNESIA_BLOCK.get(),
                    FLAG_COUNTRY_SVALBARD_AND_JAN_MAYEN_BLOCK.get(),
                    FLAG_COUNTRY_INDONESIA_BLOCK.get(),
                    FLAG_COUNTRY_ICELAND_BLOCK.get(),
                    FLAG_COUNTRY_EGYPT_BLOCK.get(),
                    FLAG_COUNTRY_FALKLAND_ISLANDS_MALVINAS_BLOCK.get(),
                    FLAG_COUNTRY_FIJI_BLOCK.get(),
                    FLAG_COUNTRY_GUINEA_BLOCK.get(),
                    FLAG_COUNTRY_GUYANA_BLOCK.get(),
                    FLAG_COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_COMOROS_BLOCK.get(),
                    FLAG_COUNTRY_IRELAND_BLOCK.get(),
                    FLAG_COUNTRY_KAZAKHSTAN_BLOCK.get(),
                    FLAG_COUNTRY_ROMANIA_BLOCK.get(),
                    FLAG_COUNTRY_SLOVAKIA_BLOCK.get(),
                    FLAG_COUNTRY_PAPUA_NEW_GUINEA_BLOCK.get(),
                    FLAG_COUNTRY_PORTUGAL_BLOCK.get(),
                    FLAG_COUNTRY_SOMALIA_BLOCK.get(),
                    FLAG_COUNTRY_SINT_MAARTEN_DUTCH_PART_BLOCK.get(),
                    FLAG_COUNTRY_CROATIA_BLOCK.get(),
                    FLAG_COUNTRY_KIRIBATI_BLOCK.get(),
                    FLAG_COUNTRY_JAMAICA_BLOCK.get(),
                    FLAG_COUNTRY_ECUADOR_BLOCK.get(),
                    FLAG_COUNTRY_ETHIOPIA_BLOCK.get(),
                    FLAG_COUNTRY_FAROE_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_CAMBODIA_BLOCK.get(),
                    FLAG_COUNTRY_SYRIAN_ARAB_REPUBLIC_BLOCK.get(),
                    FLAG_COUNTRY_SENEGAL_BLOCK.get(),
                    FLAG_COUNTRY_PALAU_BLOCK.get(),
                    FLAG_COUNTRY_SIERRA_LEONE_BLOCK.get(),
                    FLAG_COUNTRY_MICRONESIA_FEDERATED_STATES_OF_BLOCK.get(),
                    FLAG_COUNTRY_GIBRALTAR_BLOCK.get(),
                    FLAG_COUNTRY_GERMANY_BLOCK.get(),
                    FLAG_COUNTRY_GHANA_BLOCK.get(),
                    FLAG_COUNTRY_JORDAN_BLOCK.get(),
                    FLAG_COUNTRY_ITALY_BLOCK.get(),
                    FLAG_COUNTRY_PANAMA_BLOCK.get(),
                    FLAG_COUNTRY_ESWATINI_BLOCK.get(),
                    FLAG_COUNTRY_SAN_MARINO_BLOCK.get(),
                    FLAG_COUNTRY_TUNISIA_BLOCK.get(),
                    FLAG_COUNTRY_MALI_BLOCK.get(),
                    FLAG_COUNTRY_CONGO_BLOCK.get(),
                    FLAG_COUNTRY_LAND_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_ANGOLA_BLOCK.get(),
                    FLAG_COUNTRY_BHUTAN_BLOCK.get(),
                    FLAG_COUNTRY_BARBADOS_BLOCK.get(),
                    FLAG_COUNTRY_CENTRAL_AFRICAN_REPUBLIC_BLOCK.get(),
                    FLAG_COUNTRY_MYANMAR_BLOCK.get(),
                    FLAG_COUNTRY_LIECHTENSTEIN_BLOCK.get(),
                    FLAG_COUNTRY_NAMIBIA_BLOCK.get(),
                    FLAG_COUNTRY_MOZAMBIQUE_BLOCK.get(),
                    FLAG_COUNTRY_TONGA_BLOCK.get(),
                    FLAG_COUNTRY_VIRGIN_ISLANDS_BRITISH_BLOCK.get(),
                    FLAG_COUNTRY_VENEZUELA_BOLIVARIAN_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_TANZANIA_UNITED_REPUBLIC_OF_BLOCK.get(),
                    FLAG_COUNTRY_TURKMENISTAN_BLOCK.get(),
                    FLAG_COUNTRY_MEXICO_BLOCK.get(),
                    FLAG_COUNTRY_NEW_CALEDONIA_BLOCK.get(),
                    FLAG_COUNTRY_MACAO_BLOCK.get(),
                    FLAG_COUNTRY_SRI_LANKA_BLOCK.get(),
                    FLAG_COUNTRY_CONGO_DEMOCRATIC_REPUBLIC_OF_THE_BLOCK.get(),
                    FLAG_COUNTRY_ALBANIA_BLOCK.get(),
                    FLAG_COUNTRY_BOTSWANA_BLOCK.get(),
                    FLAG_COUNTRY_COSTA_RICA_BLOCK.get(),
                    FLAG_COUNTRY_BOUVET_ISLAND_BLOCK.get(),
                    FLAG_COUNTRY_ARMENIA_BLOCK.get(),
                    FLAG_COUNTRY_AZERBAIJAN_BLOCK.get(),
                    FLAG_COUNTRY_BOSNIA_AND_HERZEGOVINA_BLOCK.get(),
                    FLAG_COUNTRY_MONGOLIA_BLOCK.get(),
                    FLAG_COUNTRY_NIUE_BLOCK.get(),
                    FLAG_COUNTRY_MALAYSIA_BLOCK.get(),
                    FLAG_COUNTRY_TIMORLESTE_BLOCK.get(),
                    FLAG_COUNTRY_SAMOA_BLOCK.get(),
                    FLAG_COUNTRY_THAILAND_BLOCK.get(),
                    FLAG_COUNTRY_KOSOVO_BLOCK.get(),
                    FLAG_COUNTRY_NORFOLK_ISLAND_BLOCK.get(),
                    FLAG_COUNTRY_LIBYA_BLOCK.get(),
                    FLAG_COUNTRY_ANGUILLA_BLOCK.get(),
                    FLAG_COUNTRY_BRAZIL_BLOCK.get(),
                    FLAG_COUNTRY_CABO_VERDE_BLOCK.get(),
                    FLAG_COUNTRY_BELGIUM_BLOCK.get(),
                    FLAG_COUNTRY_CANADA_BLOCK.get(),
                    FLAG_COUNTRY_BANGLADESH_BLOCK.get(),
                    FLAG_COUNTRY_CURAAO_BLOCK.get(),
                    FLAG_COUNTRY_BAHAMAS_BLOCK.get(),
                    FLAG_COUNTRY_NIGERIA_BLOCK.get(),
                    FLAG_COUNTRY_NORTH_MACEDONIA_BLOCK.get(),
                    FLAG_COUNTRY_NEPAL_BLOCK.get(),
                    FLAG_COUNTRY_HOLY_SEE_BLOCK.get(),
                    FLAG_COUNTRY_UZBEKISTAN_BLOCK.get(),
                    FLAG_COUNTRY_UNITED_STATES_MINOR_OUTLYING_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_TOKELAU_BLOCK.get(),
                    FLAG_COUNTRY_SAINT_VINCENT_AND_THE_GRENADINES_BLOCK.get(),
                    FLAG_COUNTRY_ZIMBABWE_BLOCK.get(),
                    FLAG_COUNTRY_NAURU_BLOCK.get(),
                    FLAG_COUNTRY_NIGER_BLOCK.get(),
                    FLAG_COUNTRY_CUBA_BLOCK.get(),
                    FLAG_COUNTRY_BONAIRE_SINT_EUSTATIUS_AND_SABA_BLOCK.get(),
                    FLAG_COUNTRY_BURKINA_FASO_BLOCK.get(),
                    FLAG_COUNTRY_BULGARIA_BLOCK.get(),
                    FLAG_COUNTRY_COCOS_KEELING_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_MARSHALL_ISLANDS_BLOCK.get(),
                    FLAG_COUNTRY_SOUTH_AFRICA_BLOCK.get(),
                    FLAG_COUNTRY_URUGUAY_BLOCK.get(),
                    FLAG_COUNTRY_WALLIS_AND_FUTUNA_BLOCK.get(),
                    FLAG_COUNTRY_VANUATU_BLOCK.get(),
                    FLAG_COUNTRY_TAJIKISTAN_BLOCK.get()
            ).build(null));

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
    }
}
