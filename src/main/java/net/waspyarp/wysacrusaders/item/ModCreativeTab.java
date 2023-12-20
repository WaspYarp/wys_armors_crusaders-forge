package net.waspyarp.wysacrusaders.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WYsArmorsCrusaders.MOD_ID);

    public static final RegistryObject<CreativeModeTab> A_CRUSADERS_TAB = CREATIVE_MODE_TAB.register("wysacrusders_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUSADER_TEMPLATE.get()))
                    .title(Component.literal("WY's Crusaders"))
                    .displayItems((pParameters, pOutput) -> {

                        //general
                        pOutput.accept(ModItems.CRUSADER_TEMPLATE.get());

                        pOutput.accept(ModItems.IRON_LONGSWORD.get());//remove
                        pOutput.accept(ModItems.CRUSADER_DIAMOND_LONGSWORD.get());
                        pOutput.accept(ModItems.CRUSADER_NETHERITE_LONGSWORD.get());

//                        pOutput.accept(ModItems.CRUSADER_HORSE_ARMOR.get());
                        //ARMORS

                        pOutput.accept(ModItems.CRUSADER_ARCHER_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_ARCHER_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_ARCHER_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_ARCHER_BOOTS.get());

                        pOutput.accept(ModItems.CRUSADER_HORSEMAN_HELMET.get());
                        pOutput.accept(ModItems.CRUSADER_HORSEMAN_CHESTPLATE.get());
                        pOutput.accept(ModItems.CRUSADER_HORSEMAN_LEGGINGS.get());
                        pOutput.accept(ModItems.CRUSADER_HORSEMAN_BOOTS.get());

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
                        /*if (ModList.get().isLoaded("depperdarker"))
                            for (RegistryObject<Item> item : DeeperAndDarkerCompat.ITEMS.getEntries())
                                if (item.get() instanceof Item)
                                    pOutput.accept(item.get());*/
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}