package net.waspyarp.wyscarmory.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.waspyarp.wyscarmory.WYsCustomArmory;
import net.waspyarp.wyscarmory.item.custom.ModCustomTemplateItem;
import net.waspyarp.wyscarmory.item.custom.crusader.*;
import net.waspyarp.wyscarmory.item.custom.spartan.SpartanCArmorItem;
import net.waspyarp.wyscarmory.item.custom.spartan.SpartanIArmorItem;

import java.awt.print.Paper;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WYsCustomArmory.MOD_ID);

//General Items
    public static final RegistryObject<Item> LOST_CROWN = ITEMS.register("lost_crown",
            () -> new Item(new Item.Properties().durability(4).setNoRepair()));
    public static final RegistryObject<Item> KING_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("king_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));

//Crusader Items

    public static final RegistryObject<Item> CRUSADER_TEMPLATE = ITEMS.register("crusader_template",
        () -> new ModCustomTemplateItem(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_CRUSADER_LONGSWORD = ITEMS.register("crusader_diamond_longsword",
            () -> new ModCustomCrusaderDLongsword(Tiers.DIAMOND, 4, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_CRUSADER_LONGSWORD = ITEMS.register("crusader_netherite_longsword",
            () -> new ModCustomCrusaderNLongsword(Tiers.NETHERITE, 4, -2.8F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHAIN_CRUSADER_HELMET = ITEMS.register("crusader_chain_helmet",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.CRUSADER_CHAIN_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_CRUSADER_CHESTPLATE = ITEMS.register("crusader_chain_chestplate",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.CRUSADER_CHAIN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_CRUSADER_LEGGINGS = ITEMS.register("crusader_chain_leggings",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.CRUSADER_CHAIN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_CRUSADER_BOOTS = ITEMS.register("crusader_chain_boots",
            () -> new ModCustomCrusaderCArmorItem(ModArmorMaterials.CRUSADER_CHAIN_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_CRUSADER_HELMET = ITEMS.register("crusader_iron_helmet",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.CRUSADER_IRON_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_CRUSADER_CHESTPLATE = ITEMS.register("crusader_iron_chestplate",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.CRUSADER_IRON_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_CRUSADER_LEGGINGS = ITEMS.register("crusader_iron_leggings",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.CRUSADER_IRON_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_CRUSADER_BOOTS = ITEMS.register("crusader_iron_boots",
            () -> new ModCustomCrusaderIArmorItem(ModArmorMaterials.CRUSADER_IRON_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_DIAMOND_HELMET = ITEMS.register("crusader_diamond_helmet",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.ARMOR_DIAMOND_CRUSADER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_CHESTPLATE = ITEMS.register("crusader_diamond_chestplate",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.ARMOR_DIAMOND_CRUSADER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_LEGGINGS = ITEMS.register("crusader_diamond_leggings",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.ARMOR_DIAMOND_CRUSADER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CRUSADER_DIAMOND_BOOTS = ITEMS.register("crusader_diamond_boots",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.ARMOR_DIAMOND_CRUSADER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CRUSADER_NETHERITE_HELMET = ITEMS.register("crusader_netherite_helmet",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.ARMOR_NETHERITE_CRUSADER, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_CHESTPLATE = ITEMS.register("crusader_netherite_chestplate",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.ARMOR_NETHERITE_CRUSADER, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_LEGGINGS = ITEMS.register("crusader_netherite_leggings",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.ARMOR_NETHERITE_CRUSADER, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CRUSADER_NETHERITE_BOOTS = ITEMS.register("crusader_netherite_boots",
            () -> new ModCustomCrusaderNArmorItem(ModArmorMaterials.ARMOR_NETHERITE_CRUSADER, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    //Spartan Items
    public static final RegistryObject<Item> SPARTAN_TEMPLATE = ITEMS.register("unknown_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHAIN_SPARTAN_HELMET = ITEMS.register("c_spartan_helmet",
            () -> new SpartanCArmorItem(ModArmorMaterials.SPARTAN_CHAIN_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_SPARTAN_CHESTPLATE = ITEMS.register("c_spartan_chestplate",
            () -> new SpartanCArmorItem(ModArmorMaterials.SPARTAN_CHAIN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_SPARTAN_LEGGINGS = ITEMS.register("c_spartan_leggings",
            () -> new SpartanCArmorItem(ModArmorMaterials.SPARTAN_CHAIN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_SPARTAN_BOOTS = ITEMS.register("c_spartan_boots",
            () -> new SpartanCArmorItem(ModArmorMaterials.SPARTAN_CHAIN_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_SPARTAN_HELMET = ITEMS.register("i_spartan_helmet",
            () -> new SpartanIArmorItem(ModArmorMaterials.SPARTAN_IRON_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPARTAN_CHESTPLATE = ITEMS.register("i_spartan_chestplate",
            () -> new SpartanIArmorItem(ModArmorMaterials.SPARTAN_IRON_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPARTAN_LEGGINGS = ITEMS.register("i_spartan_leggings",
            () -> new SpartanIArmorItem(ModArmorMaterials.SPARTAN_IRON_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SPARTAN_BOOTS = ITEMS.register("i_spartan_boots",
            () -> new SpartanIArmorItem(ModArmorMaterials.SPARTAN_IRON_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> DIAMOND_SPARTAN_HELMET = ITEMS.register("d_spartan_helmet",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.SPARTAN_DIAMOND_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPARTAN_CHESTPLATE = ITEMS.register("d_spartan_chestplate",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.SPARTAN_DIAMOND_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPARTAN_LEGGINGS = ITEMS.register("d_spartan_leggings",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.SPARTAN_DIAMOND_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SPARTAN_BOOTS = ITEMS.register("d_spartan_boots",
            () -> new ModCustomCrusaderDArmorItem(ModArmorMaterials.SPARTAN_DIAMOND_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));




    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
