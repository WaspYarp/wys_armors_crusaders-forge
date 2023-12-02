package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCustomArmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomCrusaderNArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CrusaderNArmorModel extends GeoModel<ModCustomCrusaderNArmorItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomCrusaderNArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "geo/crusader_armor_diamond.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomCrusaderNArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "textures/armor/crusader_armor_netherite_layer_1.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomCrusaderNArmorItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
