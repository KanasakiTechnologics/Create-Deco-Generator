package net.KanasakiTechnologics.DecoBuild.Datagen;

import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public final class DecoCreateFillingProvider extends FillingRecipeGen {
    public DecoCreateFillingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, DecoBuild.MOD_ID);
    }

    GeneratedRecipe

    GOLDEN_CARROT = create("golden_carrot", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_GOLD.get(),500)
            .require(Items.CARROT)
            .output(Items.GOLDEN_CARROT)
    ),

    GOLDEN_APPLE = create("golden_apple", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_GOLD.get(),500)
            .require(Items.APPLE)
            .output(Items.GOLDEN_APPLE)
    );
}
