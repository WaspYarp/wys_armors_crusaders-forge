package net.waspyarp.wyscarmory.compat;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyscarmory.WYsCarmory;
import net.waspyarp.wyscarmory.item.ModArmorMaterials;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.*;

public class RecruitsCompat {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WYsCarmory.MOD_ID);

    //crusader
    public static final RegistryObject<Item> RECRUITS_CRUSADER_CHAIN_HELMET = ITEMS.register("recruit_crusader_chain_helmet",
            () -> new ModCustomRecruitCrusaderCHelmetItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RECRUITS_CRUSADER_IRON_HELMET = ITEMS.register("recruit_crusader_iron_helmet",
            () -> new ModCustomRecruitCrusaderIHelmetItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RECRUITS_CRUSADER_DIAMOND_HELMET = ITEMS.register("recruit_crusader_diamond_helmet",
            () -> new ModCustomRecruitCrusaderDHelmetItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RECRUITS_CRUSADER_NETHERITE_HELMET = ITEMS.register("recruit_crusader_netherite_helmet",
            () -> new ModCustomRecruitCrusaderNHelmetItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));


    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}