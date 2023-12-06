package net.waspyarp.wyscarmory.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyscarmory.compat.RecruitsCompat;
import net.waspyarp.wyscarmory.WYsCarmory;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WYsCarmory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_ARMORY_TAB = CREATIVE_MODE_TAB.register("wyscarmory_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUSADER_DIAMOND_HELMET.get()))
                    .title(Component.literal("WY´s Carmory"))
                    .displayItems((pParameters, pOutput) -> {

                        //general
                       // pOutput.accept(ModItems.LOST_CROWN.get());
                        //pOutput.accept(ModItems.KING_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.CRUSADER_TEMPLATE.get());
                        //pOutput.accept(ModItems.SPARTAN_TEMPLATE.get()); Coming Out in 2.0

                        pOutput.accept(ModItems.UNKNOWN_TEMPLATE.get()); //just for suspense

                        //crusader
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_LONGSWORD.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_LONGSWORD.get());

                        pOutput.accept(ModItems.CRUSADER_CHAIN_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_CHAIN_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_CHAIN_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_CHAIN_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_IRON_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_IRON_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_IRON_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_IRON_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_DIAMOND_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_NETHERITE_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_BOOTS.get());


//soon
                        if (ModList.get().isLoaded("recruits"))
                            for (RegistryObject<Item> item : RecruitsCompat.ITEMS.getEntries())
                                if (item.get() instanceof Item)
                                    pOutput.accept(item.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}