package irish.eimi.bratacha.common.init;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.blocks.FlagBlock;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Registration {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BratachaMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BratachaMod.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BratachaMod.MODID);

    public static final DeferredBlock<FlagBlock> FLAG_BLOCK = BLOCKS.register("flag", () -> new FlagBlock(BlockBehaviour.Properties.of().strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).noOcclusion()));
    public static final DeferredItem<Item> FLAG_BLOCK_ITEM = ITEMS.register("flag", () -> new BlockItem(FLAG_BLOCK.get(), new Item.Properties()));
    public static final Supplier<BlockEntityType<FlagBlockEntity>> FLAG_BLOCK_ENTITY = BLOCK_ENTITIES.register("flag",
            () -> BlockEntityType.Builder.of(FlagBlockEntity::new, FLAG_BLOCK.get()).build(null));

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
    }

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(FLAG_BLOCK_ITEM);
        }
    }
}
