package net.waspyarp.wyscarmory.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WYsCarmory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //GENERAL ITEMS
        simpleItem(ModItems.LOST_CROWN);
        //simpleItem(ModItems.KING_UPGRADE_SMITHING_TEMPLATE);

        simpleItem(ModItems.CRUSADER_TEMPLATE);
        simpleItem(ModItems.SPARTAN_TEMPLATE);

        //CRUSADER ARMORS
        simpleItem(ModItems.CRUSADER_CHAIN_HELMET);
        simpleItem(ModItems.CRUSADER_CHAIN_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_CHAIN_LEGGINGS);
        simpleItem(ModItems.CRUSADER_CHAIN_BOOTS);

        simpleItem(ModItems.CRUSADER_IRON_HELMET);
        simpleItem(ModItems.CRUSADER_IRON_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_IRON_LEGGINGS);
        simpleItem(ModItems.CRUSADER_IRON_BOOTS);

        simpleItem(ModItems.CRUSADER_DIAMOND_HELMET);
        simpleItem(ModItems.CRUSADER_DIAMOND_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_DIAMOND_LEGGINGS);
        simpleItem(ModItems.CRUSADER_DIAMOND_BOOTS);

        simpleItem(ModItems.CRUSADER_NETHERITE_HELMET);
        simpleItem(ModItems.CRUSADER_NETHERITE_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_NETHERITE_LEGGINGS);
        simpleItem(ModItems.CRUSADER_NETHERITE_BOOTS);

        //SPARTAN ARMORS

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WYsCarmory.MOD_ID,"item/" + item.getId().getPath()));
    }
}
