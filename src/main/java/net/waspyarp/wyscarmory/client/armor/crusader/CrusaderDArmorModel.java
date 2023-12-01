package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCustomArmory;
import net.waspyarp.wyscarmory.item.custom.crusader.ModCustomCrusaderDArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CrusaderDArmorModel extends GeoModel<ModCustomCrusaderDArmorItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomCrusaderDArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "geo/crusader_armor_diamond.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomCrusaderDArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "textures/armor/crusader_armor_diamond_layer_1.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomCrusaderDArmorItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
