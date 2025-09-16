package net.KanasakiTechnologics.DecoBuild.Fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class MoltenCopperType extends FluidType {
    private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath("decobuild", "block/molten_copper_still");
    private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath("decobuild", "block/molten_copper_flow");

    public MoltenCopperType(Properties properties) {
        super(properties
                .lightLevel(10)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY));
    }

    @Override
    public void initializeClient(@NotNull Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING;
            }
        });
    }

    public void animateTick(Level level, BlockPos pos, FluidState state, RandomSource random) {
        if (random.nextFloat() < 0.25F) { // 25% chance each tick
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + 1.0;
            double z = pos.getZ() + random.nextDouble();

            level.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, 0.0D, 0.02D, 0.0D);
        }
    }
}
