package net.waspyarp.wysacrusaders.client.armor;

import software.bernie.geckolib.model.DefaultedItemGeoModel;
import net.waspyarp.wysacrusaders.item.custom.armor.CrusaderDiamondArmorItem;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.minecraft.resources.ResourceLocation;

public class CrusaderDiamondArmorModel extends DefaultedItemGeoModel<CrusaderDiamondArmorItem> {

    public CrusaderDiamondArmorModel() {
        super(new ResourceLocation(WYsArmorsCrusaders.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(CrusaderDiamondArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "geo/crusader_diamond_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrusaderDiamondArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "textures/armor/crusader_diamond_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrusaderDiamondArmorItem animatable) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "animations/armor_idle_animation.json");
    }
}