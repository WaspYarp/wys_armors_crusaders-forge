package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomRecruitCrusaderCHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class RecruitCrusaderCHelmetModel extends GeoModel<ModCustomRecruitCrusaderCHelmetItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomRecruitCrusaderCHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "geo/recruit_crusader_helmet_chain.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomRecruitCrusaderCHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "textures/armor/recruit_crusader_helmet_chain.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomRecruitCrusaderCHelmetItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
