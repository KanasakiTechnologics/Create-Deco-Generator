package net.KanasakiTechnologics.DecoBuild.mixins;

import com.simibubi.create.content.processing.burner.BlazeBurnerBlockEntity;
import net.KanasakiTechnologics.DecoBuild.Item.DecoItems;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlazeBurnerBlockEntity.class)
public class BlazeBurnerBlockEntityMixin {
    @Inject(method = "tryUpdateFuel", at = @At("HEAD"), cancellable = true)
    private void injectCustomFuel(ItemStack itemStack, boolean forceOverflow, boolean simulate, CallbackInfoReturnable<Boolean> cir){
        if (!itemStack.is(DecoItems.BLAZING_FUEL.get())){
            return;
        }
        BlazeBurnerBlockEntity self = (BlazeBurnerBlockEntity) (Object) this;

        // Use accessor interface to modify protected fields
        BlazeBurnerAccessor accessor = (BlazeBurnerAccessor) self;

        if (!simulate) {
            accessor.setActiveFuel(BlazeBurnerBlockEntity.FuelType.SPECIAL); // SEETHING heat
            accessor.setRemainingBurnTime(300);
            self.updateBlockState();
        }

        cir.setReturnValue(true);
    }
}
