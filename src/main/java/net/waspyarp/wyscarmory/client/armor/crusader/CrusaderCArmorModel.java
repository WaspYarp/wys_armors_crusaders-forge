package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomCrusaderCArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CrusaderCArmorModel extends GeoModel<ModCustomCrusaderCArmorItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomCrusaderCArmorItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "geo/crusader_armor_chain.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomCrusaderCArmorItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "textures/armor/crusader_armor_chain.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomCrusaderCArmorItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
