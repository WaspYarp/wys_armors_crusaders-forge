package net.waspyarp.wysacrusaders.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.waspyarp.wysacrusaders.WYsArmorsCrusaders;
import net.waspyarp.wysacrusaders.item.custom.TemplateItem;
import net.waspyarp.wysacrusaders.item.custom.armor.*;
import net.waspyarp.wysacrusaders.item.custom.weapon.CrusaderDiamondLongsword;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WYsArmorsCrusaders.MOD_ID);
/*
    public static final RegistryObject<Item> ROMAN_TEMPLATE = ITEMS.register("roman_template",
            () -> new ModCustomTemplateItem(new Item.Properties()));
    public static final RegistryObject<Item> SPARTAN_TEMPLATE = ITEMS.register("spartan_template",
            () -> new ModCustomTemplateItem(new Item.Properties()));
    public static final RegistryObject<Item> VIKING_TEMPLATE = ITEMS.register("viking_template",
            () -> new ModCustomTemplateItem(new Item.Properties()));
    public static final RegistryObject<Item> SAMURAI_TEMPLATE = ITEMS.register("samurai_template",
            () -> new ModCustomTemplateItem(new Item.Properties()));*/

//General Items
    public static final RegistryObject<Item> CRUSADER_TEMPLATE = ITEMS.register("crusader_template", () -> new TemplateItem(new Item.Properties()));

    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register("iron_longsword", () -> new SwordItem(Tiers.IRON, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_LONGSWORD = ITEMS.register("crusader_diamond_longsword", () -> new SwordItem(Tiers.DIAMOND, 4, -2.6f , new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_LONGSWORD = ITEMS.register("crusader_netherite_longsword", () -> new SwordItem(Tiers.NETHERITE, 4, -2.6f, new Item.Properties().fireResistant()));

    //Armor Items

   /* public static final RegistryObject<Item> CRUSADER_HORSE_ARMOR = ITEMS.register("crusader_horse_armor",
            () -> new HorseArmorItem(5,"crusader", (new Item.Properties())));*/

    public static final RegistryObject<Item> CRUSADER_ARCHER_HELMET = ITEMS.register("crusader_archer_helmet", () -> new CrusaderArcherArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_ARCHER_CHESTPLATE = ITEMS.register("crusader_archer_chestplate", () -> new CrusaderArcherArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_ARCHER_LEGGINGS = ITEMS.register("crusader_archer_leggings", () -> new CrusaderArcherArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_ARCHER_BOOTS = ITEMS.register("crusader_archer_boots", () -> new CrusaderArcherArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_HORSEMAN_HELMET = ITEMS.register("crusader_horseman_helmet", () -> new CrusaderHorsemanArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_HORSEMAN_CHESTPLATE = ITEMS.register("crusader_horseman_chestplate", () -> new CrusaderHorsemanArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_HORSEMAN_LEGGINGS = ITEMS.register("crusader_horseman_leggings", () -> new CrusaderHorsemanArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_HORSEMAN_BOOTS = ITEMS.register("crusader_horseman_boots", () -> new CrusaderHorsemanArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_IRON_HELMET = ITEMS.register("crusader_iron_helmet", () -> new CrusaderIronArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_CHESTPLATE = ITEMS.register("crusader_iron_chestplate", () -> new CrusaderIronArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_LEGGINGS = ITEMS.register("crusader_iron_leggings", () -> new CrusaderIronArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_IRON_BOOTS = ITEMS.register("crusader_iron_boots", () -> new CrusaderIronArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_DIAMOND_HELMET = ITEMS.register("crusader_diamond_helmet", () -> new CrusaderDiamondArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_CHESTPLATE = ITEMS.register("crusader_diamond_chestplate", () -> new CrusaderDiamondArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_LEGGINGS = ITEMS.register("crusader_diamond_leggings", () -> new CrusaderDiamondArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_BOOTS = ITEMS.register("crusader_diamond_boots", () -> new CrusaderDiamondArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_NETHERITE_HELMET = ITEMS.register("crusader_netherite_helmet", () -> new CrusaderNetheriteArmorItem(ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_CHESTPLATE = ITEMS.register("crusader_netherite_chestplate", () -> new CrusaderNetheriteArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_LEGGINGS = ITEMS.register("crusader_netherite_leggings", () -> new CrusaderNetheriteArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_BOOTS = ITEMS.register("crusader_netherite_boots", () -> new CrusaderNetheriteArmorItem(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
/*
    public static final RegistryObject<Item> CRUSADER_KING_NETHERITE_HELMET = ITEMS.register("crusader_king_netherite_helmet", () -> new ModCrusaderArmorNetheriteItem(ModArmorMaterials.WYS_ARMOR_KING_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_KING_NETHERITE_CHESTPLATE = ITEMS.register("crusader_king_netherite_chestplate", () -> new ModCrusaderArmorNetheriteItem(ModArmorMaterials.WYS_ARMOR_KING_NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_KING_NETHERITE_LEGGINGS = ITEMS.register("crusader_king_netherite_leggings", () -> new ModCrusaderArmorNetheriteItem(ModArmorMaterials.WYS_ARMOR_KING_NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_KING_NETHERITE_BOOTS = ITEMS.register("crusader_king_netherite_boots", () -> new ModCrusaderArmorNetheriteItem(ModArmorMaterials.WYS_ARMOR_KING_NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));*/

    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
