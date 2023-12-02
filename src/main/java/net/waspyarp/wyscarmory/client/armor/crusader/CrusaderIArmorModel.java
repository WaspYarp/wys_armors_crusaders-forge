package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCustomArmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomCrusaderIArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CrusaderIArmorModel extends GeoModel<ModCustomCrusaderIArmorItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomCrusaderIArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "geo/crusader_armor_iron.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomCrusaderIArmorItem animatable) {
        return new ResourceLocation(WYsCustomArmory.MOD_ID, "textures/armor/crusader_armor_iron.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomCrusaderIArmorItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
