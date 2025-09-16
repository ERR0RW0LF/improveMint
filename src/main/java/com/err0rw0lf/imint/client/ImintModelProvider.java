package com.err0rw0lf.imint.client;

import com.err0rw0lf.imint.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ImintModelProvider extends FabricModelProvider {
    public ImintModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCoral(ModBlocks.LARGE_BRAIN_CORAL,ModBlocks.LARGE_DEAD_BRAIN_CORAL,ModBlocks.LARGE_BRAIN_CORAL_BLOCK,ModBlocks.LARGE_DEAD_BRAIN_CORAL_BLOCK,ModBlocks.LARGE_BRAIN_CORAL_FAN,ModBlocks.LARGE_DEAD_BRAIN_CORAL_FAN,ModBlocks.LARGE_BRAIN_CORAL_WALL_FAN,ModBlocks.LARGE_DEAD_BRAIN_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.MEDIUM_BRAIN_CORAL,ModBlocks.MEDIUM_DEAD_BRAIN_CORAL,ModBlocks.MEDIUM_BRAIN_CORAL_BLOCK,ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_BLOCK,ModBlocks.MEDIUM_BRAIN_CORAL_FAN,ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_FAN,ModBlocks.MEDIUM_BRAIN_CORAL_WALL_FAN,ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.SMALL_BRAIN_CORAL,ModBlocks.SMALL_DEAD_BRAIN_CORAL,ModBlocks.SMALL_BRAIN_CORAL_BLOCK,ModBlocks.SMALL_DEAD_BRAIN_CORAL_BLOCK,ModBlocks.SMALL_BRAIN_CORAL_FAN,ModBlocks.SMALL_DEAD_BRAIN_CORAL_FAN,ModBlocks.SMALL_BRAIN_CORAL_WALL_FAN,ModBlocks.SMALL_DEAD_BRAIN_CORAL_WALL_FAN);

        blockStateModelGenerator.registerCoral(ModBlocks.LARGE_BUBBLE_CORAL,ModBlocks.LARGE_DEAD_BUBBLE_CORAL,ModBlocks.LARGE_BUBBLE_CORAL_BLOCK,ModBlocks.LARGE_DEAD_BUBBLE_CORAL_BLOCK,ModBlocks.LARGE_BUBBLE_CORAL_FAN,ModBlocks.LARGE_DEAD_BUBBLE_CORAL_FAN,ModBlocks.LARGE_BUBBLE_CORAL_WALL_FAN,ModBlocks.LARGE_DEAD_BUBBLE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.MEDIUM_BUBBLE_CORAL,ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL,ModBlocks.MEDIUM_BUBBLE_CORAL_BLOCK,ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_BLOCK,ModBlocks.MEDIUM_BUBBLE_CORAL_FAN,ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_FAN,ModBlocks.MEDIUM_BUBBLE_CORAL_WALL_FAN,ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.SMALL_BUBBLE_CORAL,ModBlocks.SMALL_DEAD_BUBBLE_CORAL,ModBlocks.SMALL_BUBBLE_CORAL_BLOCK,ModBlocks.SMALL_DEAD_BUBBLE_CORAL_BLOCK,ModBlocks.SMALL_BUBBLE_CORAL_FAN,ModBlocks.SMALL_DEAD_BUBBLE_CORAL_FAN,ModBlocks.SMALL_BUBBLE_CORAL_WALL_FAN,ModBlocks.SMALL_DEAD_BUBBLE_CORAL_WALL_FAN);


        blockStateModelGenerator.registerCoral(ModBlocks.LARGE_FIRE_CORAL,ModBlocks.LARGE_DEAD_FIRE_CORAL,ModBlocks.LARGE_FIRE_CORAL_BLOCK,ModBlocks.LARGE_DEAD_FIRE_CORAL_BLOCK,ModBlocks.LARGE_FIRE_CORAL_FAN,ModBlocks.LARGE_DEAD_FIRE_CORAL_FAN,ModBlocks.LARGE_FIRE_CORAL_WALL_FAN,ModBlocks.LARGE_DEAD_FIRE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.MEDIUM_FIRE_CORAL,ModBlocks.MEDIUM_DEAD_FIRE_CORAL,ModBlocks.MEDIUM_FIRE_CORAL_BLOCK,ModBlocks.MEDIUM_DEAD_FIRE_CORAL_BLOCK,ModBlocks.MEDIUM_FIRE_CORAL_FAN,ModBlocks.MEDIUM_DEAD_FIRE_CORAL_FAN,ModBlocks.MEDIUM_FIRE_CORAL_WALL_FAN,ModBlocks.MEDIUM_DEAD_FIRE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.SMALL_FIRE_CORAL,ModBlocks.SMALL_DEAD_FIRE_CORAL,ModBlocks.SMALL_FIRE_CORAL_BLOCK,ModBlocks.SMALL_DEAD_FIRE_CORAL_BLOCK,ModBlocks.SMALL_FIRE_CORAL_FAN,ModBlocks.SMALL_DEAD_FIRE_CORAL_FAN,ModBlocks.SMALL_FIRE_CORAL_WALL_FAN,ModBlocks.SMALL_DEAD_FIRE_CORAL_WALL_FAN);

        blockStateModelGenerator.registerCoral(ModBlocks.LARGE_HORN_CORAL,ModBlocks.LARGE_DEAD_HORN_CORAL,ModBlocks.LARGE_HORN_CORAL_BLOCK,ModBlocks.LARGE_DEAD_HORN_CORAL_BLOCK,ModBlocks.LARGE_HORN_CORAL_FAN,ModBlocks.LARGE_DEAD_HORN_CORAL_FAN,ModBlocks.LARGE_HORN_CORAL_WALL_FAN,ModBlocks.LARGE_DEAD_HORN_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.MEDIUM_HORN_CORAL,ModBlocks.MEDIUM_DEAD_HORN_CORAL,ModBlocks.MEDIUM_HORN_CORAL_BLOCK,ModBlocks.MEDIUM_DEAD_HORN_CORAL_BLOCK,ModBlocks.MEDIUM_HORN_CORAL_FAN,ModBlocks.MEDIUM_DEAD_HORN_CORAL_FAN,ModBlocks.MEDIUM_HORN_CORAL_WALL_FAN,ModBlocks.MEDIUM_DEAD_HORN_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.SMALL_HORN_CORAL,ModBlocks.SMALL_DEAD_HORN_CORAL,ModBlocks.SMALL_HORN_CORAL_BLOCK,ModBlocks.SMALL_DEAD_HORN_CORAL_BLOCK,ModBlocks.SMALL_HORN_CORAL_FAN,ModBlocks.SMALL_DEAD_HORN_CORAL_FAN,ModBlocks.SMALL_HORN_CORAL_WALL_FAN,ModBlocks.SMALL_DEAD_HORN_CORAL_WALL_FAN);


        
        blockStateModelGenerator.registerCoral(ModBlocks.LARGE_TUBE_CORAL,ModBlocks.LARGE_DEAD_TUBE_CORAL,ModBlocks.LARGE_TUBE_CORAL_BLOCK,ModBlocks.LARGE_DEAD_TUBE_CORAL_BLOCK,ModBlocks.LARGE_TUBE_CORAL_FAN,ModBlocks.LARGE_DEAD_TUBE_CORAL_FAN,ModBlocks.LARGE_TUBE_CORAL_WALL_FAN,ModBlocks.LARGE_DEAD_TUBE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.MEDIUM_TUBE_CORAL,ModBlocks.MEDIUM_DEAD_TUBE_CORAL,ModBlocks.MEDIUM_TUBE_CORAL_BLOCK,ModBlocks.MEDIUM_DEAD_TUBE_CORAL_BLOCK,ModBlocks.MEDIUM_TUBE_CORAL_FAN,ModBlocks.MEDIUM_DEAD_TUBE_CORAL_FAN,ModBlocks.MEDIUM_TUBE_CORAL_WALL_FAN,ModBlocks.MEDIUM_DEAD_TUBE_CORAL_WALL_FAN);
        blockStateModelGenerator.registerCoral(ModBlocks.SMALL_TUBE_CORAL,ModBlocks.SMALL_DEAD_TUBE_CORAL,ModBlocks.SMALL_TUBE_CORAL_BLOCK,ModBlocks.SMALL_DEAD_TUBE_CORAL_BLOCK,ModBlocks.SMALL_TUBE_CORAL_FAN,ModBlocks.SMALL_DEAD_TUBE_CORAL_FAN,ModBlocks.SMALL_TUBE_CORAL_WALL_FAN,ModBlocks.SMALL_DEAD_TUBE_CORAL_WALL_FAN);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    @Override
    public String getName() {
        return "FabricDocsReference Model Provider";
    }
}
