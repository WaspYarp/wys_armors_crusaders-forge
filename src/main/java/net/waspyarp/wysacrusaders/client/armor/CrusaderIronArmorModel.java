package net.waspyarp.wysacrusaders.client.armor;

import software.bernie.geckolib.model.DefaultedItemGeoModel;
import net.waspyarp.wysacrusaders.item.custom.armor.CrusaderIronArmorItem;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.minecraft.resources.ResourceLocation;

public class CrusaderIronArmorModel extends DefaultedItemGeoModel<CrusaderIronArmorItem> {

    public CrusaderIronArmorModel() {
        super(new ResourceLocation(WYsArmorsCrusaders.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(CrusaderIronArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID,"geo/crusader_iron_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrusaderIronArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "textures/armor/crusader_iron_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrusaderIronArmorItem animatable) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "animations/armor_idle_animation.json");
    }
}