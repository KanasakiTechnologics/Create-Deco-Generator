package net.KanasakiTechnologics.DecoBuild.mixins;

import com.simibubi.create.content.processing.burner.BlazeBurnerBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(BlazeBurnerBlockEntity.class)
public interface BlazeBurnerAccessor {

    @Accessor("activeFuel")
    void setActiveFuel(BlazeBurnerBlockEntity.FuelType fuelType);

    @Accessor("remainingBurnTime")
    void setRemainingBurnTime(int burnTime);
}
