package net.waspyarp.wysacrusaders.client.armor;

import software.bernie.geckolib.model.DefaultedItemGeoModel;
import net.waspyarp.wysacrusaders.item.custom.armor.CrusaderNetheriteArmorItem;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.minecraft.resources.ResourceLocation;

public class CrusaderNetheriteArmorModel extends DefaultedItemGeoModel<CrusaderNetheriteArmorItem> {

    public CrusaderNetheriteArmorModel() {
        super(new ResourceLocation(WYsArmorsCrusaders.MOD_ID, ""));
    }

    @Override
    public ResourceLocation getModelResource(CrusaderNetheriteArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID,"geo/crusader_diamond_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CrusaderNetheriteArmorItem object) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "textures/armor/crusader_netherite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CrusaderNetheriteArmorItem animatable) {
        return new ResourceLocation(WYsArmorsCrusaders.MOD_ID, "animations/armor_idle_animation.json");
    }
}