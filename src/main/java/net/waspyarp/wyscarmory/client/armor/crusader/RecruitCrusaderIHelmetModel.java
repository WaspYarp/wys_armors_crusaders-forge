package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomRecruitCrusaderIHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class RecruitCrusaderIHelmetModel extends GeoModel<ModCustomRecruitCrusaderIHelmetItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomRecruitCrusaderIHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "geo/recruit_crusader_helmet_iron.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomRecruitCrusaderIHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "textures/armor/recruit_crusader_helmet_iron.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomRecruitCrusaderIHelmetItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
