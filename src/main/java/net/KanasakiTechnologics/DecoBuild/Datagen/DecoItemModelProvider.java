package net.KanasakiTechnologics.DecoBuild.Datagen;

import net.KanasakiTechnologics.DecoBuild.DecoBuild;
import net.KanasakiTechnologics.DecoBuild.Item.DecoItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class DecoItemModelProvider extends ItemModelProvider {
    public DecoItemModelProvider(PackOutput output,ExistingFileHelper existingFileHelper) {
        super(output, DecoBuild.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(DecoItems.BLAZING_FUEL.get());
    }
}
