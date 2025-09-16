package net.KanasakiTechnologics.DecoBuild.Fluid.Registery;

import net.KanasakiTechnologics.DecoBuild.Block.DecoBlocks;
import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.*;
import net.KanasakiTechnologics.DecoBuild.Item.DecoItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DecoFluid {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, DecoBuild.MOD_ID);

    public static final DeferredHolder<Fluid,Fluid> MOLTEN_IRON = FLUIDS.register("molten_iron",
            ()-> new MoltenIron.Source(getMoltenIronProperties()));
    public static final DeferredHolder<Fluid,Fluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            ()-> new MoltenIron.Flowing(getMoltenIronProperties()));
    public static final DeferredHolder<Fluid,Fluid> MOLTEN_GOLD = FLUIDS.register("molten_gold",
            ()-> new MoltenGold.Source(getMoltenGoldProperties()));
    public static final DeferredHolder<Fluid,Fluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            ()-> new MoltenGold.Flowing(getMoltenGoldProperties()));
    public static final DeferredHolder<Fluid, Fluid> MOLTEN_COPPER = FLUIDS.register("molten_copper",
            () -> new MoltenCopper.Source(getMoltenCopperProperties()));
    public static final DeferredHolder<Fluid, Fluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new MoltenCopper.Flowing(getMoltenCopperProperties()));
    public static final DeferredHolder<Fluid, Fluid> MOLTEN_ZINC = FLUIDS.register("molten_zinc",
            () -> new MoltenZinc.Source(getMoltenZincProperties()));
    public static final DeferredHolder<Fluid, Fluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new MoltenZinc.Flowing(getMoltenZincProperties()));
    public static final DeferredHolder<Fluid, Fluid> MOLTEN_STONE_MIXTURE = FLUIDS.register("molten_stone_mixture",
            () -> new MoltenStoneMixture.Source(getMoltenStoneMixtureProperties()));
    public static final DeferredHolder<Fluid, Fluid> FLOWING_MOLTEN_STONE_MIXTURE = FLUIDS.register("flowing_molten_stone_mixture",
            () -> new MoltenStoneMixture.Flowing(getMoltenStoneMixtureProperties()));

    private static BaseFlowingFluid.Properties getMoltenIronProperties() {
        return new BaseFlowingFluid.Properties(
                () -> DecoFluidType.MOLTEN_IRON_TYPE.get(),
                () -> MOLTEN_IRON.get(),
                () -> FLOWING_MOLTEN_IRON.get()
        )
                .bucket(() -> DecoItems.MOLTEN_IRON_BUCKET.get())
                .block(() -> DecoBlocks.MOLTEN_IRON.get())
                .tickRate(10)
                .levelDecreasePerBlock(2)
                .slopeFindDistance(2)
                .explosionResistance(0f);
    }

    private static BaseFlowingFluid.Properties getMoltenGoldProperties() {
        return new BaseFlowingFluid.Properties(
                () -> DecoFluidType.MOLTEN_GOLD_TYPE.get(),
                () -> MOLTEN_GOLD.get(),
                () -> FLOWING_MOLTEN_GOLD.get()
        )
                .bucket(() -> DecoItems.MOLTEN_GOLD_BUCKET.get())
                .block(() -> DecoBlocks.MOLTEN_GOLD.get())
                .tickRate(10)
                .levelDecreasePerBlock(2)
                .slopeFindDistance(2)
                .explosionResistance(0f);
    }

    private static BaseFlowingFluid.Properties getMoltenCopperProperties() {
        return new BaseFlowingFluid.Properties(
                () -> DecoFluidType.MOLTEN_COPPER_TYPE.get(),
                () -> MOLTEN_COPPER.get(),
                () -> FLOWING_MOLTEN_COPPER.get()
        )
                .bucket(() -> DecoItems.MOLTEN_COPPER_BUCKET.get())
                .block(() -> DecoBlocks.MOLTEN_COPPER.get())
                .tickRate(10)
                .levelDecreasePerBlock(2)
                .slopeFindDistance(2)
                .explosionResistance(0f);
    }

    private static BaseFlowingFluid.Properties getMoltenZincProperties() {
        return new BaseFlowingFluid.Properties(
                () -> DecoFluidType.MOLTEN_ZINC_TYPE.get(),
                () -> MOLTEN_ZINC.get(),
                () -> FLOWING_MOLTEN_ZINC.get()
        )
                .bucket(() -> DecoItems.MOLTEN_ZINC_BUCKET.get())
                .block(() -> DecoBlocks.MOLTEN_ZINC.get())
                .tickRate(10)
                .levelDecreasePerBlock(2)
                .slopeFindDistance(2)
                .explosionResistance(0f);
    }

    private static BaseFlowingFluid.Properties getMoltenStoneMixtureProperties() {
        return new BaseFlowingFluid.Properties(
                () -> DecoFluidType.MOLTEN_STONE_MIXTURE_TYPE.get(),
                () -> MOLTEN_STONE_MIXTURE.get(),
                () -> FLOWING_MOLTEN_STONE_MIXTURE.get()
        )
                .bucket(() -> DecoItems.MOLTEN_STONE_MIXTURE_BUCKET.get())
                .block(() -> DecoBlocks.MOLTEN_STONE_MIXTURE.get())
                .tickRate(10)
                .levelDecreasePerBlock(2)
                .slopeFindDistance(2)
                .explosionResistance(0f);
    }

    public static void register(IEventBus eventBus)
    {
        FLUIDS.register(eventBus);
    }
}
