package net.KanasakiTechnologics.DecoBuild.Util;

import com.simibubi.create.content.decoration.palettes.AllPaletteStoneTypes;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluidType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.FluidInteractionRegistry;

public class DecoCobbleGen {

    public static void registerFluidInteractions() {

        // Molten Stone Mixture + Molten Iron
        FluidInteractionRegistry.addInteraction(
                DecoFluidType.MOLTEN_STONE_MIXTURE_TYPE.value(),
                new FluidInteractionRegistry.InteractionInformation(
                        DecoFluid.MOLTEN_IRON.get().getFluidType(),
                        fluidState -> getResultBlockState(fluidState, "iron")
                )
        );

        // Molten Stone Mixture + Molten Gold
        FluidInteractionRegistry.addInteraction(
                DecoFluidType.MOLTEN_STONE_MIXTURE_TYPE.value(),
                new FluidInteractionRegistry.InteractionInformation(
                        DecoFluid.MOLTEN_GOLD.get().getFluidType(),
                        fluidState -> getResultBlockState(fluidState, "gold")
                )
        );

        // Molten Stone Mixture + Molten Copper
        FluidInteractionRegistry.addInteraction(
                DecoFluidType.MOLTEN_STONE_MIXTURE_TYPE.value(),
                new FluidInteractionRegistry.InteractionInformation(
                        DecoFluid.MOLTEN_COPPER.get().getFluidType(),
                        fluidState -> getResultBlockState(fluidState, "copper")
                )
        );

        // Molten Stone Mixture + Molten Zinc
        FluidInteractionRegistry.addInteraction(
                DecoFluidType.MOLTEN_STONE_MIXTURE_TYPE.value(),
                new FluidInteractionRegistry.InteractionInformation(
                        DecoFluid.MOLTEN_ZINC.get().getFluidType(),
                        fluidState -> getResultBlockState(fluidState, "zinc")
                )
        );
    }

    private static BlockState getResultBlockState(FluidState fluidState, String metalType) {
        if (fluidState.isSource()) {
            return Blocks.STONE.defaultBlockState(); // Always Stone when source
        }

        switch (metalType) {
            case "iron":
                return AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get().defaultBlockState();
            case "gold":
                return AllPaletteStoneTypes.OCHRUM.getBaseBlock().get().defaultBlockState();
            case "copper":
                return AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get().defaultBlockState();
            case "zinc":
                return AllPaletteStoneTypes.ASURINE.getBaseBlock().get().defaultBlockState();
            default:
                return Blocks.COBBLESTONE.defaultBlockState(); // Fallback
        }
    }

    /**
     * Utility method if you ever need to manually check a fluid state result.
     */
    public static BlockState getLavaInteractionResult(FluidState fluidState, Fluid moltenMetal) {
        Fluid fluid = fluidState.getType();

        if (fluid.isSame(DecoFluid.MOLTEN_IRON.get())) {
            return AllPaletteStoneTypes.CRIMSITE.getBaseBlock().get().defaultBlockState();
        }
        if (fluid.isSame(DecoFluid.MOLTEN_GOLD.get())) {
            return AllPaletteStoneTypes.OCHRUM.getBaseBlock().get().defaultBlockState();
        }
        if (fluid.isSame(DecoFluid.MOLTEN_COPPER.get())) {
            return AllPaletteStoneTypes.VERIDIUM.getBaseBlock().get().defaultBlockState();
        }
        if (fluid.isSame(DecoFluid.MOLTEN_ZINC.get())) {
            return AllPaletteStoneTypes.ASURINE.getBaseBlock().get().defaultBlockState();
        }

        return Blocks.COBBLESTONE.defaultBlockState(); // Default fallback
    }
}
