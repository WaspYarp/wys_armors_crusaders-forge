package net.waspyarp.wysacrusaders.client.armor;

import software.bernie.geckolib.model.DefaultedItemGeoModel;
import net.waspyarp.wysacrusaders.item.custom.armor.CrusaderArcherArmorItem;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.minecraft.resources.ResourceLocation;

public class CrusaderArcherArmorModel extends DefaultedItemGeoModel<CrusaderArcherArmorItem> {

    public CrusaderArcherArmorModel() {
        super(new ResourceLocation(WYsArmorsCrusaders.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(CrusaderArcherArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID,"geo/crusader_archer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrusaderArcherArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "textures/armor/crusader_archer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrusaderArcherArmorItem animatable) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "animations/armor_idle_animation.json");
    }
}