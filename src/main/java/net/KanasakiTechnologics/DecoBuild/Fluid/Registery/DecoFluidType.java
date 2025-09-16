package net.KanasakiTechnologics.DecoBuild.Fluid.Registery;

import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class DecoFluidType {
    public static final DeferredRegister<FluidType> FLUID_TYPE = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, DecoBuild.MOD_ID);

    public static final DeferredHolder<FluidType, FluidType> MOLTEN_IRON_TYPE = FLUID_TYPE.register("molten_iron_type",
            ()-> new MoltenIronType(FluidType.Properties.create().lightLevel(10).temperature(1300).viscosity(4000).density(3000).canDrown(true).supportsBoating(false)));
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_GOLD_TYPE = FLUID_TYPE.register("molten_gold_type",
            ()-> new MoltenGoldType(FluidType.Properties.create().lightLevel(10).temperature(1300).viscosity(4000).density(3000).canDrown(true).supportsBoating(false)));
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_COPPER_TYPE = FLUID_TYPE.register("molten_copper_type",
            ()-> new MoltenCopperType(FluidType.Properties.create().lightLevel(10).temperature(1300).viscosity(4000).density(3000).canDrown(true).supportsBoating(false)));
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_ZINC_TYPE = FLUID_TYPE.register("molten_zinc_type",
            ()-> new MoltenZincType(FluidType.Properties.create().lightLevel(10).temperature(1300).viscosity(4000).density(3000).canDrown(true).supportsBoating(false)));
    public static final DeferredHolder<FluidType, FluidType> MOLTEN_STONE_MIXTURE_TYPE = FLUID_TYPE.register("molten_stone_mixture_type",
            ()-> new MoltenStoneMixtureType(FluidType.Properties.create().lightLevel(10).temperature(1300).viscosity(4000).density(3000).canDrown(true).supportsBoating(false)));
    public static void register(IEventBus eventBus)
    {
        FLUID_TYPE.register(eventBus);
    }
}
