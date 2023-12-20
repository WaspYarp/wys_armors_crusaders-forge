package net.waspyarp.wyscarmory.item.custom.armor.crusader;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.waspyarp.wyscarmory.client.armor.crusader.RecruitCrusaderDHelmetRender;
import net.waspyarp.wyscarmory.item.custom.armor.ModCustomArmorItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModCustomRecruitCrusaderDHelmetItem extends ModCustomArmorItem {

    public ModCustomRecruitCrusaderDHelmetItem(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private RecruitCrusaderDHelmetRender renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                   EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new RecruitCrusaderDHelmetRender();

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.wyscarmory.recruit_helmets_desc_1"));
        pTooltipComponents.add(Component.translatable("tooltip.wyscarmory.recruit_helmets_desc_2"));
        pTooltipComponents.add(Component.translatable("tooltip.wyscarmory.diamond_tier_custom_item"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}