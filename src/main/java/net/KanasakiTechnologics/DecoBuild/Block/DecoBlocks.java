package net.KanasakiTechnologics.DecoBuild.Block;

import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Fluid.Registery.DecoFluid;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.FlowingFluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.registerBlock;

public class DecoBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DecoBuild.MOD_ID);

    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_STONE_MIXTURE = BLOCKS.register("molten_stone_mixture",
            () -> new MoltenLiquid((FlowingFluid) DecoFluid.MOLTEN_STONE_MIXTURE.get()));
    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_GOLD = BLOCKS.register("molten_gold",
            () -> new MoltenLiquid((FlowingFluid) DecoFluid.MOLTEN_GOLD.get()));
    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_COPPER = BLOCKS.register("molten_copper",
            () -> new MoltenLiquid((FlowingFluid) DecoFluid.MOLTEN_COPPER.get()));
    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_IRON = BLOCKS.register("molten_iron",
            () -> new MoltenLiquid((FlowingFluid) DecoFluid.MOLTEN_IRON.get()));
    public static final DeferredHolder<Block, LiquidBlock> MOLTEN_ZINC = BLOCKS.register("molten_zinc",
            () -> new MoltenLiquid((FlowingFluid) DecoFluid.MOLTEN_ZINC.get()));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
