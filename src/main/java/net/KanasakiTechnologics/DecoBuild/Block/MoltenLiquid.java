package net.KanasakiTechnologics.DecoBuild.Block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.fluids.FluidType;

public class MoltenLiquid extends LiquidBlock {

    public MoltenLiquid(FlowingFluid fluid) {
        super(fluid, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).lightLevel(p ->15).noCollission().strength(100.00f).noLootTable().replaceable());
    }



    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);

        if (!entity.fireImmune()) {
            entity.igniteForSeconds(10); // Burns for 10 seconds
        }
    }
}
