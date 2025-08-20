package com.err0rw0lf.imint.block;

import com.err0rw0lf.imint.Imint;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    // Dead Coral
    public static final Block SMALL_DEAD_TUBE_CORAL = register(
            "small_dead_tube_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block SMALL_DEAD_BRAIN_CORAL = register(
            "small_dead_brain_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block SMALL_DEAD_BUBBLE_CORAL = register(
            "small_dead_bubble_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block SMALL_DEAD_FIRE_CORAL = register(
            "small_dead_fire_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block SMALL_DEAD_HORN_CORAL = register(
            "small_dead_horn_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block MEDIUM_DEAD_TUBE_CORAL = register(
            "medium_dead_tube_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block MEDIUM_DEAD_BRAIN_CORAL = register(
            "medium_dead_brain_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block MEDIUM_DEAD_BUBBLE_CORAL = register(
            "medium_dead_bubble_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block MEDIUM_DEAD_FIRE_CORAL = register(
            "medium_dead_fire_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block MEDIUM_DEAD_HORN_CORAL = register(
            "medium_dead_horn_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block LARGE_DEAD_TUBE_CORAL = register(
            "large_dead_tube_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block LARGE_DEAD_BRAIN_CORAL = register(
            "large_dead_brain_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block LARGE_DEAD_BUBBLE_CORAL = register(
            "large_dead_bubble_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block LARGE_DEAD_FIRE_CORAL = register(
            "large_dead_fire_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);
    public static final Block LARGE_DEAD_HORN_CORAL = register(
            "large_dead_horn_coral", DeadCoralBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            true);

    // Coral
    public static final Block SMALL_TUBE_CORAL = register("small_tube_coral",
            settings -> new CoralBlock(SMALL_DEAD_TUBE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block SMALL_BRAIN_CORAL = register("small_brain_coral",
            settings -> new CoralBlock(SMALL_DEAD_BRAIN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block SMALL_BUBBLE_CORAL = register("small_bubble_coral",
            settings -> new CoralBlock(SMALL_DEAD_BUBBLE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block SMALL_FIRE_CORAL = register("small_fire_coral",
            settings -> new CoralBlock(SMALL_DEAD_FIRE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block SMALL_HORN_CORAL = register("small_horn_coral",
            settings -> new CoralBlock(SMALL_DEAD_HORN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block MEDIUM_TUBE_CORAL = register("medium_tube_coral",
            settings -> new CoralBlock(MEDIUM_DEAD_TUBE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block MEDIUM_BRAIN_CORAL = register("medium_brain_coral",
            settings -> new CoralBlock(MEDIUM_DEAD_BRAIN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block MEDIUM_BUBBLE_CORAL = register("medium_bubble_coral",
            settings -> new CoralBlock(MEDIUM_DEAD_BUBBLE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block MEDIUM_FIRE_CORAL = register("medium_fire_coral",
            settings -> new CoralBlock(MEDIUM_DEAD_FIRE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block MEDIUM_HORN_CORAL = register("medium_horn_coral",
            settings -> new CoralBlock(MEDIUM_DEAD_HORN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block LARGE_TUBE_CORAL = register("large_tube_coral",
            settings -> new CoralBlock(LARGE_DEAD_TUBE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block LARGE_BRAIN_CORAL = register("large_brain_coral",
            settings -> new CoralBlock(LARGE_DEAD_BRAIN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block LARGE_BUBBLE_CORAL = register("large_bubble_coral",
            settings -> new CoralBlock(LARGE_DEAD_BUBBLE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block LARGE_FIRE_CORAL = register("large_fire_coral",
            settings -> new CoralBlock(LARGE_DEAD_FIRE_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);
    public static final Block LARGE_HORN_CORAL = register("large_horn_coral",
            settings -> new CoralBlock(LARGE_DEAD_HORN_CORAL, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            true);

    public static final Block SMALL_DEAD_TUBE_CORAL_FAN = register(
            "small_dead_tube_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_BRAIN_CORAL_FAN = register("small_dead_brain_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_BUBBLE_CORAL_FAN = register("small_dead_bubble_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_FIRE_CORAL_FAN = register(
            "small_dead_fire_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_HORN_CORAL_FAN = register(
            "small_dead_horn_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_TUBE_CORAL_FAN = register("small_tube_coral_fan",
            settings -> new CoralFanBlock(SMALL_DEAD_TUBE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_BRAIN_CORAL_FAN = register("small_brain_coral_fan",
            settings -> new CoralFanBlock(SMALL_DEAD_BRAIN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_BUBBLE_CORAL_FAN = register("small_bubble_coral_fan",
            settings -> new CoralFanBlock(SMALL_DEAD_BUBBLE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_FIRE_CORAL_FAN = register("small_fire_coral_fan",
            settings -> new CoralFanBlock(SMALL_DEAD_FIRE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_HORN_CORAL_FAN = register("small_horn_coral_fan",
            settings -> new CoralFanBlock(SMALL_DEAD_HORN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_DEAD_TUBE_CORAL_FAN = register("medium_dead_tube_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_BRAIN_CORAL_FAN = register("medium_dead_brain_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_BUBBLE_CORAL_FAN = register("medium_dead_bubble_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_FIRE_CORAL_FAN = register("medium_dead_fire_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_HORN_CORAL_FAN = register("medium_dead_horn_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_TUBE_CORAL_FAN = register("medium_tube_coral_fan",
            settings -> new CoralFanBlock(MEDIUM_DEAD_TUBE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_BRAIN_CORAL_FAN = register("medium_brain_coral_fan",
            settings -> new CoralFanBlock(MEDIUM_DEAD_BRAIN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_BUBBLE_CORAL_FAN = register("medium_bubble_coral_fan",
            settings -> new CoralFanBlock(MEDIUM_DEAD_BUBBLE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_FIRE_CORAL_FAN = register("medium_fire_coral_fan",
            settings -> new CoralFanBlock(MEDIUM_DEAD_FIRE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_HORN_CORAL_FAN = register("medium_horn_coral_fan",
            settings -> new CoralFanBlock(MEDIUM_DEAD_HORN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_DEAD_TUBE_CORAL_FAN = register(
            "large_dead_tube_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_BRAIN_CORAL_FAN = register("large_dead_brain_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_BUBBLE_CORAL_FAN = register("large_dead_bubble_coral_fan",
            DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_FIRE_CORAL_FAN = register(
            "large_dead_fire_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_HORN_CORAL_FAN = register(
            "large_dead_horn_coral_fan", DeadCoralFanBlock::new, AbstractBlock.Settings.create().mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_TUBE_CORAL_FAN = register("large_tube_coral_fan",
            settings -> new CoralFanBlock(LARGE_DEAD_TUBE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_BRAIN_CORAL_FAN = register("large_brain_coral_fan",
            settings -> new CoralFanBlock(LARGE_DEAD_BRAIN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_BUBBLE_CORAL_FAN = register("large_bubble_coral_fan",
            settings -> new CoralFanBlock(LARGE_DEAD_BUBBLE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_FIRE_CORAL_FAN = register("large_fire_coral_fan",
            settings -> new CoralFanBlock(LARGE_DEAD_FIRE_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_HORN_CORAL_FAN = register("large_horn_coral_fan",
            settings -> new CoralFanBlock(LARGE_DEAD_HORN_CORAL_FAN, settings),
            AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);

    public static final Block SMALL_DEAD_TUBE_CORAL_WALL_FAN = register("small_dead_tube_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(SMALL_DEAD_TUBE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_BRAIN_CORAL_WALL_FAN = register("small_dead_brain_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(SMALL_DEAD_BRAIN_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_BUBBLE_CORAL_WALL_FAN = register("small_dead_bubble_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(SMALL_DEAD_BUBBLE_CORAL_FAN, false).mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_FIRE_CORAL_WALL_FAN = register("small_dead_fire_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(SMALL_DEAD_FIRE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_DEAD_HORN_CORAL_WALL_FAN = register("small_dead_horn_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(SMALL_DEAD_HORN_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block SMALL_TUBE_CORAL_WALL_FAN = register("small_tube_coral_wall_fan",
            settings -> new CoralWallFanBlock(SMALL_DEAD_TUBE_CORAL_WALL_FAN, settings),
            copyLootTable(SMALL_TUBE_CORAL_FAN, false).mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_BRAIN_CORAL_WALL_FAN = register("small_brain_coral_wall_fan",
            settings -> new CoralWallFanBlock(SMALL_DEAD_BRAIN_CORAL_WALL_FAN, settings),
            copyLootTable(SMALL_BRAIN_CORAL_FAN, false).mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_BUBBLE_CORAL_WALL_FAN = register("small_bubble_coral_wall_fan",
            settings -> new CoralWallFanBlock(SMALL_DEAD_BUBBLE_CORAL_WALL_FAN, settings),
            copyLootTable(SMALL_BUBBLE_CORAL_FAN, false).mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_FIRE_CORAL_WALL_FAN = register("small_fire_coral_wall_fan",
            settings -> new CoralWallFanBlock(SMALL_DEAD_FIRE_CORAL_WALL_FAN, settings),
            copyLootTable(SMALL_FIRE_CORAL_FAN, false).mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block SMALL_HORN_CORAL_WALL_FAN = register("small_horn_coral_wall_fan",
            settings -> new CoralWallFanBlock(SMALL_DEAD_HORN_CORAL_WALL_FAN, settings),
            copyLootTable(SMALL_HORN_CORAL_FAN, false).mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_DEAD_TUBE_CORAL_WALL_FAN = register("medium_dead_tube_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(MEDIUM_DEAD_TUBE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_BRAIN_CORAL_WALL_FAN = register("medium_dead_brain_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(MEDIUM_DEAD_BRAIN_CORAL_FAN, false).mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_BUBBLE_CORAL_WALL_FAN = register("medium_dead_bubble_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(MEDIUM_DEAD_BUBBLE_CORAL_FAN, false).mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_FIRE_CORAL_WALL_FAN = register("medium_dead_fire_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(MEDIUM_DEAD_FIRE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_DEAD_HORN_CORAL_WALL_FAN = register("medium_dead_horn_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(MEDIUM_DEAD_HORN_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block MEDIUM_TUBE_CORAL_WALL_FAN = register("medium_tube_coral_wall_fan",
            settings -> new CoralWallFanBlock(MEDIUM_DEAD_TUBE_CORAL_WALL_FAN, settings),
            copyLootTable(MEDIUM_TUBE_CORAL_FAN, false).mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_BRAIN_CORAL_WALL_FAN = register("medium_brain_coral_wall_fan",
            settings -> new CoralWallFanBlock(MEDIUM_DEAD_BRAIN_CORAL_WALL_FAN, settings),
            copyLootTable(MEDIUM_BRAIN_CORAL_FAN, false).mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_BUBBLE_CORAL_WALL_FAN = register("medium_bubble_coral_wall_fan",
            settings -> new CoralWallFanBlock(MEDIUM_DEAD_BUBBLE_CORAL_WALL_FAN, settings),
            copyLootTable(MEDIUM_BUBBLE_CORAL_FAN, false).mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_FIRE_CORAL_WALL_FAN = register("medium_fire_coral_wall_fan",
            settings -> new CoralWallFanBlock(MEDIUM_DEAD_FIRE_CORAL_WALL_FAN, settings),
            copyLootTable(MEDIUM_FIRE_CORAL_FAN, false).mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block MEDIUM_HORN_CORAL_WALL_FAN = register("medium_horn_coral_wall_fan",
            settings -> new CoralWallFanBlock(MEDIUM_DEAD_HORN_CORAL_WALL_FAN, settings),
            copyLootTable(MEDIUM_HORN_CORAL_FAN, false).mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_DEAD_TUBE_CORAL_WALL_FAN = register("large_dead_tube_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(LARGE_DEAD_TUBE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_BRAIN_CORAL_WALL_FAN = register("large_dead_brain_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(LARGE_DEAD_BRAIN_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_BUBBLE_CORAL_WALL_FAN = register("large_dead_bubble_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(LARGE_DEAD_BUBBLE_CORAL_FAN, false).mapColor(MapColor.GRAY)
                    .solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_FIRE_CORAL_WALL_FAN = register("large_dead_fire_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(LARGE_DEAD_FIRE_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_DEAD_HORN_CORAL_WALL_FAN = register("large_dead_horn_coral_wall_fan",
            DeadCoralWallFanBlock::new, copyLootTable(LARGE_DEAD_HORN_CORAL_FAN, false).mapColor(MapColor.GRAY).solid()
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().breakInstantly(),
            false);
    public static final Block LARGE_TUBE_CORAL_WALL_FAN = register("large_tube_coral_wall_fan",
            settings -> new CoralWallFanBlock(LARGE_DEAD_TUBE_CORAL_WALL_FAN, settings),
            copyLootTable(LARGE_TUBE_CORAL_FAN, false).mapColor(MapColor.BLUE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_BRAIN_CORAL_WALL_FAN = register("large_brain_coral_wall_fan",
            settings -> new CoralWallFanBlock(LARGE_DEAD_BRAIN_CORAL_WALL_FAN, settings),
            copyLootTable(LARGE_BRAIN_CORAL_FAN, false).mapColor(MapColor.PINK).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_BUBBLE_CORAL_WALL_FAN = register("large_bubble_coral_wall_fan",
            settings -> new CoralWallFanBlock(LARGE_DEAD_BUBBLE_CORAL_WALL_FAN, settings),
            copyLootTable(LARGE_BUBBLE_CORAL_FAN, false).mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_FIRE_CORAL_WALL_FAN = register("large_fire_coral_wall_fan",
            settings -> new CoralWallFanBlock(LARGE_DEAD_FIRE_CORAL_WALL_FAN, settings),
            copyLootTable(LARGE_FIRE_CORAL_FAN, false).mapColor(MapColor.RED).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);
    public static final Block LARGE_HORN_CORAL_WALL_FAN = register("large_horn_coral_wall_fan",
            settings -> new CoralWallFanBlock(LARGE_DEAD_HORN_CORAL_WALL_FAN, settings),
            copyLootTable(LARGE_HORN_CORAL_FAN, false).mapColor(MapColor.YELLOW).noCollision().breakInstantly()
                    .sounds(BlockSoundGroup.WET_GRASS).pistonBehavior(PistonBehavior.DESTROY),
            false);



    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Imint.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Imint.MOD_ID, name));
    }


    private static AbstractBlock.Settings copyLootTable(Block block, boolean copyTranslationKey) {
        AbstractBlock.Settings settings = block.getSettings();
        AbstractBlock.Settings settings2 = AbstractBlock.Settings.create().lootTable(block.getLootTableKey());
        if (copyTranslationKey) {
            settings2 = settings2.overrideTranslationKey(block.getTranslationKey());
        }

        return settings2;
    }

    public static void registerModBlocks() {

    }
}
