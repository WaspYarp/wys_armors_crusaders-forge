package net.waspyarp.wysacrusaders.item.custom.armor;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.waspyarp.wysacrusaders.client.armor.CrusaderDiamondArmorModel;
import net.waspyarp.wysmoreweapons.util.armor.ExtendedArmorItem;
import net.waspyarp.wysmoreweapons.util.armor.ExtendedArmorMaterials;
import net.waspyarp.wysmoreweapons.util.armor.GenericCustomArmorRenderer;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.List;

public class CrusaderDiamondArmorItem extends ExtendedArmorItem {
    public CrusaderDiamondArmorItem(Type type, Properties settings) {
        super(ExtendedArmorMaterials.WYS_DIAMOND_ARMOR, type, settings);
    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new CrusaderDiamondArmorModel());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.wysmoreweapons.diamond_tier").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}