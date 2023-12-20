package net.waspyarp.wysacrusaders.util.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.waspyarp.wysacrusaders.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WYsArmorsCrusaders.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.CRUSADER_TEMPLATE);
//the weapons are special items, so i dont add them here
        //CRUSADER ARMORS

        simpleItem(ModItems.CRUSADER_ARCHER_HELMET);
        simpleItem(ModItems.CRUSADER_ARCHER_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_ARCHER_LEGGINGS);
        simpleItem(ModItems.CRUSADER_ARCHER_BOOTS);

        simpleItem(ModItems.CRUSADER_HORSEMAN_HELMET);
        simpleItem(ModItems.CRUSADER_HORSEMAN_CHESTPLATE);
        simpleItem(ModItems.CRUSADER_HORSEMAN_LEGGINGS);
        simpleItem(ModItems.CRUSADER_HORSEMAN_BOOTS);

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

        //COMPAT ITEMS

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WYsArmorsCrusaders.MOD_ID,"item/" + item.getId().getPath()));
    }

}
