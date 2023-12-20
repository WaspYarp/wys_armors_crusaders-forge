package net.waspyarp.wysacrusaders.item.custom.armor;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.waspyarp.wysacrusaders.client.armor.CrusaderNetheriteArmorModel;
import net.waspyarp.wysmoreweapons.util.armor.ExtendedArmorItem;
import net.waspyarp.wysmoreweapons.util.armor.ExtendedArmorMaterials;
import net.waspyarp.wysmoreweapons.util.armor.GenericCustomArmorRenderer;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.List;

public class CrusaderNetheriteArmorItem extends ExtendedArmorItem /*DyeableFuture*/ {
    public CrusaderNetheriteArmorItem(Type type, Properties settings) {
        super(ExtendedArmorMaterials.WYS_NETHERITE_ARMOR, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new CrusaderNetheriteArmorModel());
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.netherite_tier").withStyle(ChatFormatting.DARK_RED));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}