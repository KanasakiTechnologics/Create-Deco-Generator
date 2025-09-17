package net.KanasakiTechnologics.DecoBuild.Util;

import net.KanasakiTechnologics.DecoBuild.Item.DecoItems;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;

@EventBusSubscriber
public class DecoFuel {
    @SubscribeEvent
    public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event){
        ItemStack itemStack = event.getItemStack();
        if (itemStack.getItem() == DecoItems.BLAZING_FUEL.get()){
            event.setBurnTime(100);
        }

    }
}
