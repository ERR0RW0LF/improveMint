package com.err0rw0lf.imint.client;

import com.err0rw0lf.imint.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ImintRecipeProvider extends FabricRecipeProvider {
    public ImintRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, Items.BRAIN_CORAL_BLOCK,1)
                        .pattern("ff")
                        .pattern("ff")
                        .input('f', net.minecraft.recipe.Ingredient.ofItems(Items.BRAIN_CORAL, Items.BRAIN_CORAL_FAN))
                        .criterion(hasItem(Items.BRAIN_CORAL), conditionsFromItem(Items.BRAIN_CORAL))
                        .criterion(hasItem(Items.BRAIN_CORAL_FAN), conditionsFromItem(Items.BRAIN_CORAL_FAN))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.BUBBLE_CORAL_BLOCK,1)
                        .pattern("ff")
                        .pattern("ff")
                        .input('f', net.minecraft.recipe.Ingredient.ofItems(Items.BUBBLE_CORAL, Items.BUBBLE_CORAL_FAN))
                        .criterion(hasItem(Items.BUBBLE_CORAL), conditionsFromItem(Items.BUBBLE_CORAL))
                        .criterion(hasItem(Items.BUBBLE_CORAL_FAN), conditionsFromItem(Items.BUBBLE_CORAL_FAN))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.FIRE_CORAL_BLOCK,1)
                        .pattern("ff")
                        .pattern("ff")
                        .input('f', net.minecraft.recipe.Ingredient.ofItems(Items.FIRE_CORAL, Items.FIRE_CORAL_FAN))
                        .criterion(hasItem(Items.FIRE_CORAL), conditionsFromItem(Items.FIRE_CORAL))
                        .criterion(hasItem(Items.FIRE_CORAL_FAN), conditionsFromItem(Items.FIRE_CORAL_FAN))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.TUBE_CORAL_BLOCK,1)
                        .pattern("ff")
                        .pattern("ff")
                        .input('f', net.minecraft.recipe.Ingredient.ofItems(Items.TUBE_CORAL, Items.TUBE_CORAL_FAN))
                        .criterion(hasItem(Items.TUBE_CORAL), conditionsFromItem(Items.TUBE_CORAL))
                        .criterion(hasItem(Items.TUBE_CORAL_FAN), conditionsFromItem(Items.TUBE_CORAL_FAN))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, Items.HORN_CORAL_BLOCK,1)
                        .pattern("ff")
                        .pattern("ff")
                        .input('f', net.minecraft.recipe.Ingredient.ofItems(Items.HORN_CORAL, Items.HORN_CORAL_FAN))
                        .criterion(hasItem(Items.HORN_CORAL), conditionsFromItem(Items.HORN_CORAL))
                        .criterion(hasItem(Items.HORN_CORAL_FAN), conditionsFromItem(Items.HORN_CORAL_FAN))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "ImintRecipeProvider";
    }
}
