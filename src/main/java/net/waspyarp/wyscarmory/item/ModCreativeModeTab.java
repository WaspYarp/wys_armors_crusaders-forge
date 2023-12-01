package net.waspyarp.wyscarmory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyscarmory.WYsCustomArmory;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WYsCustomArmory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_ARMORY_TAB = CREATIVE_MODE_TAB.register("wyscarmory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUSADER_DIAMOND_HELMET.get()))
                    .title(Component.literal("WY´s Carmory"))
                    .displayItems((pParameters, pOutput) -> {

                        //general
                        pOutput.accept(ModItems.LOST_CROWN.get());
                        pOutput.accept(ModItems.KING_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_TEMPLATE.get());
                        pOutput.accept(ModItems.SPARTAN_TEMPLATE.get());

                        //crusader
                        pOutput.accept(ModItems.DIAMOND_CRUSADER_LONGSWORD.get());
                        pOutput.accept(ModItems.NETHERITE_CRUSADER_LONGSWORD.get());

                        pOutput.accept(ModItems.CHAIN_CRUSADER_HELMET.get());
                        pOutput.accept(ModItems.CHAIN_CRUSADER_CHESTPLATE.get());
                        pOutput.accept(ModItems.CHAIN_CRUSADER_LEGGINGS.get());
                        pOutput.accept(ModItems.CHAIN_CRUSADER_BOOTS.get());

                        pOutput.accept(ModItems.IRON_CRUSADER_HELMET.get());
                        pOutput.accept(ModItems.IRON_CRUSADER_CHESTPLATE.get());
                        pOutput.accept(ModItems.IRON_CRUSADER_LEGGINGS.get());
                        pOutput.accept(ModItems.IRON_CRUSADER_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_DIAMOND_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_NETHERITE_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_BOOTS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
