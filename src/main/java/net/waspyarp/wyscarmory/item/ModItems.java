package net.waspyarp.wyscarmory.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.waspyarp.wyscarmory.WYsCustomArmory;
import net.waspyarp.wyscarmory.item.custom.ModCustomCrownItem;
import net.waspyarp.wyscarmory.item.custom.ModCustomTemplateItem;
import net.waspyarp.wyscarmory.item.custom.armor.crusader.*;
import net.waspyarp.wyscarmory.item.custom.armor.spartan.*;
import net.waspyarp.wyscarmory.item.custom.weapon.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WYsCustomArmory.MOD_ID);

//General Items
    public static final RegistryObject<Item> LOST_CROWN = ITEMS.register("lost_crown",
            () -> new ModCustomCrownItem(new Item.Properties().durability(4)));
    public static final RegistryObject<Item> KING_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("king_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));
    //just for keep the suspence for future updates
    public static final RegistryObject<Item> UNKNOWN_TEMPLATE = ITEMS.register("unknown_template",
            () -> new Item(new Item.Properties()));

//Crusader Items

    public static final RegistryObject<Item> CRUSADER_TEMPLATE = ITEMS.register("crusader_template",
        () -> new ModCustomTemplateItem(new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_DIAMOND_LONGSWORD = ITEMS.register("crusader_diamond_longsword",
            () -> new ModCustomCrusaderDLongsword(Tiers.DIAMOND, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_LONGSWORD = ITEMS.register("crusader_netherite_longsword",
            () -> new ModCustomCrusaderNLongsword(Tiers.NETHERITE, 4, -2.8F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CRUSADER_CHAIN_HELMET = ITEMS.register("crusader_chain_helmet",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_CHAIN_CHESTPLATE = ITEMS.register("crusader_chain_chestplate",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_CHAIN_LEGGINGS = ITEMS.register("crusader_chain_leggings",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_CHAIN_BOOTS = ITEMS.register("crusader_chain_boots",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_IRON_HELMET = ITEMS.register("crusader_iron_helmet",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_CHESTPLATE = ITEMS.register("crusader_iron_chestplate",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_LEGGINGS = ITEMS.register("crusader_iron_leggings",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_BOOTS = ITEMS.register("crusader_iron_boots",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_DIAMOND_HELMET = ITEMS.register("crusader_diamond_helmet",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_CHESTPLATE = ITEMS.register("crusader_diamond_chestplate",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_LEGGINGS = ITEMS.register("crusader_diamond_leggings",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_BOOTS = ITEMS.register("crusader_diamond_boots",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_NETHERITE_HELMET = ITEMS.register("crusader_netherite_helmet",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_CHESTPLATE = ITEMS.register("crusader_netherite_chestplate",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_LEGGINGS = ITEMS.register("crusader_netherite_leggings",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_BOOTS = ITEMS.register("crusader_netherite_boots",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    //Spartan Items
    public static final RegistryObject<Item> SPARTAN_TEMPLATE = ITEMS.register("spartan_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_CHAIN_HELMET = ITEMS.register("spartan_chain_helmet",
            () -> new ModCustomSpartanCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_CHAIN_CHESTPLATE = ITEMS.register("spartan_chain_chestplate",
            () -> new ModCustomSpartanCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_CHAIN_LEGGINGS = ITEMS.register("spartan_chain_leggings",
            () -> new ModCustomSpartanCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_CHAIN_BOOTS = ITEMS.register("spartan_chain_boots",
            () -> new ModCustomSpartanCArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_IRON_HELMET = ITEMS.register("spartan_iron_helmet",
            () -> new ModCustomSpartanIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_IRON_CHESTPLATE = ITEMS.register("spartan_iron_chestplate",
            () -> new ModCustomSpartanIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_IRON_LEGGINGS = ITEMS.register("spartan_iron_leggings",
            () -> new ModCustomSpartanIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_IRON_BOOTS = ITEMS.register("spartan_iron_boots",
            () -> new ModCustomSpartanIArmorItem(ModArmorMaterials.WYS_IRON_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_DIAMOND_HELMET = ITEMS.register("spartan_diamond_helmet",
            () -> new ModCustomSpartanDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_DIAMOND_CHESTPLATE = ITEMS.register("spartan_diamond_chestplate",
            () -> new ModCustomSpartanDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_DIAMOND_LEGGINGS = ITEMS.register("spartan_diamond_leggings",
            () -> new ModCustomSpartanDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_DIAMOND_BOOTS = ITEMS.register("spartan_diamond_boots",
            () -> new ModCustomSpartanDArmorItem(ModArmorMaterials.WYS_DIAMOND_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SPARTAN_NETHERITE_HELMET = ITEMS.register("spartan_netherite_helmet",
            () -> new ModCustomSpartanNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SPARTAN_NETHERITE_CHESTPLATE = ITEMS.register("spartan_netherite_chestplate",
            () -> new ModCustomSpartanNArmorItem(ModArmorMaterials.WYS_NETHERITE_TIER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SPARTAN_NETHERITE_LEGGINGS = ITEMS.register("spartan_netherite_leggings",
            () -> new ModCustomSpartanNArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SPARTAN_NETHERITE_BOOTS = ITEMS.register("spartan_netherite_boots",
            () -> new ModCustomSpartanNArmorItem(ModArmorMaterials.WYS_CHAIN_TIER_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));



    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
