package net.KanasakiTechnologics.DecoBuild.Datagen;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FlowingFluid;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public final class DecoCreateCompactingProvider extends CompactingRecipeGen {
    public DecoCreateCompactingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, DecoBuild.MOD_ID);
    }

    GeneratedRecipe

    IRON_INGOT = create("iron_ingot", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_IRON.get(),90)
            .output(Items.IRON_INGOT)
    ),
    GOLD_INGOT = create("gold_ingot", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_GOLD.get(),90)
            .output(Items.GOLD_INGOT)
    ),
    COPPER_INGOT = create("copper_ingot", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_COPPER.get(),90)
            .output(Items.COPPER_INGOT)
    ),
    ZINC_INGOT = create("zinc_ingot", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_ZINC.get(),90)
            .output(AllItems.ZINC_INGOT)
    ),

    IRON_NUGGET = create("iron_nugget", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_IRON.get(),10)
            .output(Items.IRON_NUGGET)
    ),

    GOLD_NUGGET = create("gold_nugget", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_GOLD.get(),10)
            .output(Items.GOLD_NUGGET)
    ),
    COPPER_NUGGET = create("copper_nugget", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_COPPER.get(),10)
            .output(AllItems.COPPER_NUGGET)
    ),
    ZINC_NUGGET = create("zinc_nugget", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_ZINC.get(),10)
            .output(AllItems.ZINC_NUGGET)
    ),

    IRON_BLOCK = create("iron_block", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_IRON.get(),800)
            .output(Blocks.IRON_BLOCK)
    ),
    GOLD_BLOCK = create("gold_block", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_GOLD.get(),800)
            .output(Blocks.GOLD_BLOCK)
    ),
    COPPER_BLOCK = create("copper_block", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_COPPER.get(),800)
            .output(Blocks.COPPER_BLOCK)
    ),
    ZINC_BLOCK = create("zinc_block", b -> b
            .require((FlowingFluid) DecoFluid.MOLTEN_ZINC.get(),800)
            .output(AllBlocks.ZINC_BLOCK)
    ),

    ICE = create("ice_block", b -> b
            .require(Items.SNOW_BLOCK)
            .require(Items.SNOW_BLOCK)
            .require(Items.SNOW_BLOCK)
            .require(Items.SNOW_BLOCK)
            .output(Blocks.ICE)
    );
}
