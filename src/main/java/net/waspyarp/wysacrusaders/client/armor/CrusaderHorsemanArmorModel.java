package net.waspyarp.wysacrusaders.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.waspyarp.wysacrusaders.item.custom.armor.CrusaderHorsemanArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class CrusaderHorsemanArmorModel extends DefaultedItemGeoModel<CrusaderHorsemanArmorItem> {

    public CrusaderHorsemanArmorModel() {
        super(new ResourceLocation(WYsArmorsCrusaders.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(CrusaderHorsemanArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID,"geo/crusader_horseman_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrusaderHorsemanArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "textures/armor/crusader_horseman_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrusaderHorsemanArmorItem animatable) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "animations/armor_idle_animation.json");
    }
}