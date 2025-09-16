package net.KanasakiTechnologics.DecoBuild.Util;

import com.simibubi.create.AllBlocks;
import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Item.DecoItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DecoCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DecoBuild.MOD_ID);

    public static final Supplier<CreativeModeTab> MOLTEN_LIQUID = CREATIVE_MODE_TAB.register("molten_liquid",
            ()->CreativeModeTab.builder().icon(()->new ItemStack(AllBlocks.MECHANICAL_MIXER))
                    .title(Component.translatable("creativetab.decobuild.molten_liquid"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(DecoItems.MOLTEN_STONE_MIXTURE_BUCKET);
                        output.accept(DecoItems.MOLTEN_IRON_BUCKET);
                        output.accept(DecoItems.MOLTEN_GOLD_BUCKET);
                        output.accept(DecoItems.MOLTEN_COPPER_BUCKET);
                        output.accept(DecoItems.MOLTEN_ZINC_BUCKET);
                        output.accept(DecoItems.BLAZING_FUEL);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
