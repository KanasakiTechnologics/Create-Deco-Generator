package net.KanasakiTechnologics.DecoBuild.Datagen;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class DecoCreateMixingProvider extends MixingRecipeGen {
    public DecoCreateMixingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, DecoBuild.MOD_ID);
    }

    GeneratedRecipe

    // Metal Melting Recipes (Superheated)
    IRON_NUGGET_MELTING = create("iron_nugget_melting", b -> b
            .require(Items.IRON_NUGGET)
            .output(DecoFluid.MOLTEN_IRON.get(), 10) // Replace Fluids.LAVA with your molten iron fluid if available
		.requiresHeat(HeatCondition.SUPERHEATED)),

    IRON_INGOT_MELTING = create("iron_ingot_melting", b -> b
            .require(Items.IRON_INGOT)
            .output(DecoFluid.MOLTEN_IRON.get(), 100)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    IRON_BLOCK_MELTING = create("iron_block_melting", b -> b
            .require(Blocks.IRON_BLOCK)
            .output(DecoFluid.MOLTEN_IRON.get(), 900)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    GOLD_NUGGET_MELTING = create("gold_nugget_melting", b -> b
            .require(Items.GOLD_NUGGET)
            .output(DecoFluid.MOLTEN_GOLD.get(), 10)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    GOLD_INGOT_MELTING = create("gold_ingot_melting", b -> b
            .require(Items.GOLD_INGOT)
            .output(DecoFluid.MOLTEN_GOLD.get(), 100)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    GOLD_BLOCK_MELTING = create("gold_block_melting", b -> b
            .require(Blocks.GOLD_BLOCK)
            .output(DecoFluid.MOLTEN_GOLD.get(), 900)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    COPPER_NUGGET_MELTING = create("copper_nugget_melting", b -> b
            .require(AllItems.COPPER_NUGGET)
            .output(DecoFluid.MOLTEN_COPPER.get(), 10)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    COPPER_INGOT_MELTING = create("copper_ingot_melting", b -> b
            .require(Items.COPPER_INGOT)
            .output(DecoFluid.MOLTEN_COPPER.get(), 100)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    COPPER_BLOCK_MELTING = create("copper_block_melting", b -> b
            .require(Blocks.COPPER_BLOCK)
            .output(DecoFluid.MOLTEN_COPPER.get(), 900)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    ZINC_NUGGET_MELTING = create("zinc_nugget_melting", b -> b
            .require(AllItems.ZINC_NUGGET)
            .output(DecoFluid.MOLTEN_ZINC.get(), 10)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    ZINC_INGOT_MELTING = create("zinc_ingot_melting", b -> b
            .require(AllItems.ZINC_INGOT)
            .output(DecoFluid.MOLTEN_ZINC.get(), 100)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    ZINC_BLOCK_MELTING = create("zinc_block_melting", b -> b
            .require(AllBlocks.ZINC_BLOCK)
            .output(DecoFluid.MOLTEN_ZINC.get(), 900)
		.requiresHeat(HeatCondition.SUPERHEATED)),

    STONE_MIXING_BASE = create("stone_mixing_base",b -> b
            .require(Blocks.GRAVEL)
            .require(Blocks.GRAVEL)
            .require(Blocks.ANDESITE)
            .require(ItemTags.COALS)
            .require(Fluids.LAVA,100)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(DecoFluid.MOLTEN_STONE_MIXTURE.get(),500)
    );


}
