package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomRecruitCrusaderDHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class RecruitCrusaderDHelmetModel extends GeoModel<ModCustomRecruitCrusaderDHelmetItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomRecruitCrusaderDHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "geo/recruit_crusader_helmet_diamond.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomRecruitCrusaderDHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "textures/armor/recruit_crusader_helmet_diamond.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomRecruitCrusaderDHelmetItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
