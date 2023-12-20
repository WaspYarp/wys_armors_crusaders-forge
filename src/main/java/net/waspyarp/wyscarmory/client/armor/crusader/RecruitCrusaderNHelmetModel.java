package net.waspyarp.wyscarmory.client.armor.crusader;

import net.minecraft.resources.ResourceLocation;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.ModCustomRecruitCrusaderNHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class RecruitCrusaderNHelmetModel extends GeoModel<ModCustomRecruitCrusaderNHelmetItem> {
    @Override
    public ResourceLocation getModelResource(ModCustomRecruitCrusaderNHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "geo/recruit_crusader_helmet_diamond.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ModCustomRecruitCrusaderNHelmetItem animatable) {
        return new ResourceLocation(WYsCarmory.MOD_ID, "textures/armor/recruit_crusader_helmet_netherite.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ModCustomRecruitCrusaderNHelmetItem animatable) {
        return null;
        //return new ResourceLocation(WYsCustomArmory.MOD_ID, "animations/i_crusader_armor.json");
    }
}
