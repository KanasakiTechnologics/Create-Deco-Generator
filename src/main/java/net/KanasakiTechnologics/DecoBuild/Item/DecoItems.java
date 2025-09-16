package net.KanasakiTechnologics.DecoBuild.Item;

import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DecoItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DecoBuild.MOD_ID);

    public static final DeferredItem<Item> MOLTEN_STONE_MIXTURE_BUCKET = ITEMS.register("molten_stone_mixture_bucket",
            () -> new BucketItem(DecoFluid.MOLTEN_STONE_MIXTURE.get(),new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).durability(0)));
    public static final DeferredItem<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(DecoFluid.MOLTEN_IRON.get(),new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).durability(0)));
    public static final DeferredItem<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(DecoFluid.MOLTEN_GOLD.get(),new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).durability(0)));
    public static final DeferredItem<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(DecoFluid.MOLTEN_COPPER.get(),new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).durability(0)));
    public static final DeferredItem<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(DecoFluid.MOLTEN_ZINC.get(),new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).durability(0)));
    public static final DeferredItem<Item> BLAZING_FUEL = ITEMS.register("blazing_fuel",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}
}
