package net.waspyarp.wysacrusaders.util.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.waspyarp.wysacrusaders.item.ModItems;
import net.waspyarp.wysmoreweapons.util.datagen.recipes.ArmorsRecipeShapeHandler;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        ArmorsRecipeShapeHandler.templateCrafting(consumer, ModItems.CRUSADER_TEMPLATE.get(), RecipeCategory.MISC, Items.PAPER, Items.BREAD, Items.GLASS_BOTTLE, Items.CHAIN, "crusader_template");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_TEMPLATE.get(), 2, RecipeCategory.MISC, Items.PAPER, ModItems.CRUSADER_TEMPLATE.get(),"crusader_template");

        ArmorsRecipeShapeHandler.longswordCrafting(consumer, ModItems.IRON_LONGSWORD.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, Items.STICK);
        ArmorsRecipeShapeHandler.longswordCrafting(consumer, ModItems.CRUSADER_DIAMOND_LONGSWORD.get(), RecipeCategory.COMBAT, Items.DIAMOND, Items.STICK);
        ArmorsRecipeShapeHandler.modNetheriteSmithing(consumer, ModItems.CRUSADER_NETHERITE_LONGSWORD.get(), RecipeCategory.COMBAT, ModItems.CRUSADER_DIAMOND_LONGSWORD.get());

        ArmorsRecipeShapeHandler.helmetArmorCrafting(consumer, ModItems.CRUSADER_ARCHER_HELMET.get(), RecipeCategory.COMBAT, Items.LEATHER, ModItems.CRUSADER_TEMPLATE.get(), "crusader_archer_helmet");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_ARCHER_HELMET.get(), 1, RecipeCategory.COMBAT, Items.LEATHER_HELMET, ModItems.CRUSADER_TEMPLATE.get(), "crusader_archer_helmet");
        ArmorsRecipeShapeHandler.chestplateArmorCrafting(consumer, ModItems.CRUSADER_ARCHER_CHESTPLATE.get(), RecipeCategory.COMBAT, Items.LEATHER, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_chestplate");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_ARCHER_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, Items.LEATHER_CHESTPLATE, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_chestplate");
        ArmorsRecipeShapeHandler.leggingsArmorCrafting(consumer, ModItems.CRUSADER_ARCHER_LEGGINGS.get(), RecipeCategory.COMBAT, Items.LEATHER, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_leggings");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_ARCHER_LEGGINGS.get(), 1, RecipeCategory.COMBAT, Items.LEATHER_LEGGINGS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_leggings");
        ArmorsRecipeShapeHandler.bootsArmorCrafting(consumer, ModItems.CRUSADER_ARCHER_BOOTS.get(), RecipeCategory.COMBAT, Items.LEATHER, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_boots");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_ARCHER_BOOTS.get(), 1, RecipeCategory.COMBAT, Items.LEATHER_BOOTS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_archer_boots");

        ArmorsRecipeShapeHandler.helmetArmorCrafting(consumer, ModItems.CRUSADER_HORSEMAN_HELMET.get(), RecipeCategory.COMBAT, Items.CHAIN, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_helmet");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_HORSEMAN_HELMET.get(), 1, RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_helmet");
        ArmorsRecipeShapeHandler.chestplateArmorCrafting(consumer, ModItems.CRUSADER_HORSEMAN_CHESTPLATE.get(), RecipeCategory.COMBAT, Items.CHAIN, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_chestplate");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_HORSEMAN_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_chestplate");
        ArmorsRecipeShapeHandler.leggingsArmorCrafting(consumer, ModItems.CRUSADER_HORSEMAN_LEGGINGS.get(), RecipeCategory.COMBAT, Items.CHAIN, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_leggings");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_HORSEMAN_LEGGINGS.get(), 1, RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_leggings");
        ArmorsRecipeShapeHandler.bootsArmorCrafting(consumer, ModItems.CRUSADER_HORSEMAN_BOOTS.get(), RecipeCategory.COMBAT, Items.CHAIN, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_boots");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_HORSEMAN_BOOTS.get(), 1, RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_horseman_boots");

        ArmorsRecipeShapeHandler.helmetArmorCrafting(consumer, ModItems.CRUSADER_IRON_HELMET.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_helmet");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_IRON_HELMET.get(), 1, RecipeCategory.COMBAT, Items.IRON_HELMET, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_helmet");
        ArmorsRecipeShapeHandler.chestplateArmorCrafting(consumer, ModItems.CRUSADER_IRON_CHESTPLATE.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_chestplate");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_IRON_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, Items.IRON_CHESTPLATE, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_chestplate");
        ArmorsRecipeShapeHandler.leggingsArmorCrafting(consumer, ModItems.CRUSADER_IRON_LEGGINGS.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_leggings");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_IRON_LEGGINGS.get(), 1, RecipeCategory.COMBAT, Items.IRON_LEGGINGS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_leggings");
        ArmorsRecipeShapeHandler.bootsArmorCrafting(consumer, ModItems.CRUSADER_IRON_BOOTS.get(), RecipeCategory.COMBAT, Items.IRON_INGOT, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_boots");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_IRON_BOOTS.get(), 1, RecipeCategory.COMBAT, Items.IRON_BOOTS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_iron_boots");

        ArmorsRecipeShapeHandler.helmetArmorCrafting(consumer, ModItems.CRUSADER_DIAMOND_HELMET.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_helmet");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_DIAMOND_HELMET.get(), 1, RecipeCategory.COMBAT, Items.DIAMOND_HELMET, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_helmet");
        ArmorsRecipeShapeHandler.chestplateArmorCrafting(consumer, ModItems.CRUSADER_DIAMOND_CHESTPLATE.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_chestplate");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_DIAMOND_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, Items.DIAMOND_CHESTPLATE, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_chestplate");
        ArmorsRecipeShapeHandler.leggingsArmorCrafting(consumer, ModItems.CRUSADER_DIAMOND_LEGGINGS.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_leggings");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_DIAMOND_LEGGINGS.get(), 1, RecipeCategory.COMBAT, Items.DIAMOND_LEGGINGS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_leggings");
        ArmorsRecipeShapeHandler.bootsArmorCrafting(consumer, ModItems.CRUSADER_DIAMOND_BOOTS.get(), RecipeCategory.COMBAT, Items.DIAMOND, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_boots");
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_DIAMOND_BOOTS.get(), 1, RecipeCategory.COMBAT, Items.DIAMOND_BOOTS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_diamond_boots");

        ArmorsRecipeShapeHandler.modNetheriteSmithing(consumer, ModItems.CRUSADER_NETHERITE_HELMET.get(), RecipeCategory.COMBAT, ModItems.CRUSADER_DIAMOND_HELMET.get());
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_NETHERITE_HELMET.get(), 1, RecipeCategory.COMBAT, Items.NETHERITE_HELMET, ModItems.CRUSADER_TEMPLATE.get(),"crusader_netherite_helmet");
        ArmorsRecipeShapeHandler.modNetheriteSmithing(consumer, ModItems.CRUSADER_NETHERITE_CHESTPLATE.get(), RecipeCategory.COMBAT, ModItems.CRUSADER_DIAMOND_CHESTPLATE.get());
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_NETHERITE_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE, ModItems.CRUSADER_TEMPLATE.get(),"crusader_netherite_chestplate");
        ArmorsRecipeShapeHandler.modNetheriteSmithing(consumer, ModItems.CRUSADER_NETHERITE_LEGGINGS.get(), RecipeCategory.COMBAT, ModItems.CRUSADER_DIAMOND_LEGGINGS.get());
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_NETHERITE_LEGGINGS.get(), 1, RecipeCategory.COMBAT, Items.NETHERITE_LEGGINGS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_netherite_leggings");
        ArmorsRecipeShapeHandler.modNetheriteSmithing(consumer, ModItems.CRUSADER_NETHERITE_BOOTS.get(), RecipeCategory.COMBAT, ModItems.CRUSADER_DIAMOND_BOOTS.get());
        ArmorsRecipeShapeHandler.shapelessConversionCraft(consumer, ModItems.CRUSADER_NETHERITE_BOOTS.get(), 1, RecipeCategory.COMBAT, Items.NETHERITE_BOOTS, ModItems.CRUSADER_TEMPLATE.get(),"crusader_netherite_boots");

        }
}