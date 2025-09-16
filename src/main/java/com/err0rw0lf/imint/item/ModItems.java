package com.err0rw0lf.imint.item;

import com.err0rw0lf.imint.Imint;
import com.err0rw0lf.imint.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ModItems {
    public static final Item MINT_LEAVE = register("mint_leave", Item::new, new Item.Settings());

    public static final Item SMALL_TUBE_CORAL_FAN = register(ModBlocks.SMALL_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_BRAIN_CORAL_FAN = register(ModBlocks.SMALL_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_BUBBLE_CORAL_FAN = register(ModBlocks.SMALL_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_FIRE_CORAL_FAN = register(ModBlocks.SMALL_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_HORN_CORAL_FAN = register(ModBlocks.SMALL_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_DEAD_TUBE_CORAL_FAN = register(ModBlocks.SMALL_DEAD_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_DEAD_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_DEAD_BRAIN_CORAL_FAN = register(ModBlocks.SMALL_DEAD_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_DEAD_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_DEAD_BUBBLE_CORAL_FAN = register(ModBlocks.SMALL_DEAD_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_DEAD_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_DEAD_FIRE_CORAL_FAN = register(ModBlocks.SMALL_DEAD_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_DEAD_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item SMALL_DEAD_HORN_CORAL_FAN = register(ModBlocks.SMALL_DEAD_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.SMALL_DEAD_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));


    public static final Item MEDIUM_TUBE_CORAL_FAN = register(ModBlocks.MEDIUM_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_BRAIN_CORAL_FAN = register(ModBlocks.MEDIUM_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_BUBBLE_CORAL_FAN = register(ModBlocks.MEDIUM_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_FIRE_CORAL_FAN = register(ModBlocks.MEDIUM_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_HORN_CORAL_FAN = register(ModBlocks.MEDIUM_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_DEAD_TUBE_CORAL_FAN = register(ModBlocks.MEDIUM_DEAD_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_DEAD_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_DEAD_BRAIN_CORAL_FAN = register(ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_DEAD_BUBBLE_CORAL_FAN = register(ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_DEAD_FIRE_CORAL_FAN = register(ModBlocks.MEDIUM_DEAD_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_DEAD_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item MEDIUM_DEAD_HORN_CORAL_FAN = register(ModBlocks.MEDIUM_DEAD_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.MEDIUM_DEAD_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));

    
    public static final Item LARGE_TUBE_CORAL_FAN = register(ModBlocks.LARGE_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_BRAIN_CORAL_FAN = register(ModBlocks.LARGE_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_BUBBLE_CORAL_FAN = register(ModBlocks.LARGE_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_FIRE_CORAL_FAN = register(ModBlocks.LARGE_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_HORN_CORAL_FAN = register(ModBlocks.LARGE_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_DEAD_TUBE_CORAL_FAN = register(ModBlocks.LARGE_DEAD_TUBE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_DEAD_TUBE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_DEAD_BRAIN_CORAL_FAN = register(ModBlocks.LARGE_DEAD_BRAIN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_DEAD_BRAIN_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_DEAD_BUBBLE_CORAL_FAN = register(ModBlocks.LARGE_DEAD_BUBBLE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_DEAD_BUBBLE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_DEAD_FIRE_CORAL_FAN = register(ModBlocks.LARGE_DEAD_FIRE_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_DEAD_FIRE_CORAL_WALL_FAN, Direction.DOWN, settings)));
    public static final Item LARGE_DEAD_HORN_CORAL_FAN = register(ModBlocks.LARGE_DEAD_HORN_CORAL_FAN,(BiFunction<Block, Item.Settings, Item>)((block, settings) -> new VerticallyAttachableBlockItem(block, ModBlocks.LARGE_DEAD_HORN_CORAL_WALL_FAN, Direction.DOWN, settings)));


    public static final Item SMALL_DEAD_TUBE_CORAL_BLOCK = register(ModBlocks.SMALL_DEAD_TUBE_CORAL_BLOCK);
    public static final Item SMALL_DEAD_BRAIN_CORAL_BLOCK = register(ModBlocks.SMALL_DEAD_BRAIN_CORAL_BLOCK);
    public static final Item SMALL_DEAD_BUBBLE_CORAL_BLOCK = register(ModBlocks.SMALL_DEAD_BUBBLE_CORAL_BLOCK);
    public static final Item SMALL_DEAD_FIRE_CORAL_BLOCK = register(ModBlocks.SMALL_DEAD_FIRE_CORAL_BLOCK);
    public static final Item SMALL_DEAD_HORN_CORAL_BLOCK = register(ModBlocks.SMALL_DEAD_HORN_CORAL_BLOCK);

    public static final Item MEDIUM_DEAD_TUBE_CORAL_BLOCK = register(ModBlocks.MEDIUM_DEAD_TUBE_CORAL_BLOCK);
    public static final Item MEDIUM_DEAD_BRAIN_CORAL_BLOCK = register(ModBlocks.MEDIUM_DEAD_BRAIN_CORAL_BLOCK);
    public static final Item MEDIUM_DEAD_BUBBLE_CORAL_BLOCK = register(ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL_BLOCK);
    public static final Item MEDIUM_DEAD_FIRE_CORAL_BLOCK = register(ModBlocks.MEDIUM_DEAD_FIRE_CORAL_BLOCK);
    public static final Item MEDIUM_DEAD_HORN_CORAL_BLOCK = register(ModBlocks.MEDIUM_DEAD_HORN_CORAL_BLOCK);

    public static final Item LARGE_DEAD_TUBE_CORAL_BLOCK = register(ModBlocks.LARGE_DEAD_TUBE_CORAL_BLOCK);
    public static final Item LARGE_DEAD_BRAIN_CORAL_BLOCK = register(ModBlocks.LARGE_DEAD_BRAIN_CORAL_BLOCK);
    public static final Item LARGE_DEAD_BUBBLE_CORAL_BLOCK = register(ModBlocks.LARGE_DEAD_BUBBLE_CORAL_BLOCK);
    public static final Item LARGE_DEAD_FIRE_CORAL_BLOCK = register(ModBlocks.LARGE_DEAD_FIRE_CORAL_BLOCK);
    public static final Item LARGE_DEAD_HORN_CORAL_BLOCK = register(ModBlocks.LARGE_DEAD_HORN_CORAL_BLOCK);

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));
    }

    private static RegistryKey<Item> keyOf(RegistryKey<Block> blockKey) {
        return RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
    }
    
    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory) {
        return register(block, factory, new Item.Settings());
    }

    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory, Item.Settings settings) {
        return register(
                keyOf(block.getRegistryEntry().registryKey()), itemSettings -> (Item)factory.apply(block, itemSettings), settings.useBlockPrefixedTranslationKey()
        );
    }


    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = (Item)factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    public static Item register(Block block) {
        return register(block, BlockItem::new);
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Imint.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }
    public static void registerModItems() {
        Imint.LOGGER.info("Registering Mod Items for " + Imint.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MINT_LEAVE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {


            entries.add(ModBlocks.SMALL_TUBE_CORAL);
            entries.add(ModBlocks.MEDIUM_TUBE_CORAL);
            entries.add(ModBlocks.LARGE_TUBE_CORAL);

            entries.add(ModBlocks.SMALL_BRAIN_CORAL);
            entries.add(ModBlocks.MEDIUM_BRAIN_CORAL);
            entries.add(ModBlocks.LARGE_BRAIN_CORAL);
            
            entries.add(ModBlocks.SMALL_BUBBLE_CORAL);
            entries.add(ModBlocks.MEDIUM_BUBBLE_CORAL);
            entries.add(ModBlocks.LARGE_BUBBLE_CORAL);

            entries.add(ModBlocks.SMALL_FIRE_CORAL);
            entries.add(ModBlocks.MEDIUM_FIRE_CORAL);
            entries.add(ModBlocks.LARGE_FIRE_CORAL);

            entries.add(ModBlocks.SMALL_HORN_CORAL);
            entries.add(ModBlocks.MEDIUM_HORN_CORAL);
            entries.add(ModBlocks.LARGE_HORN_CORAL);

            entries.add(ModBlocks.SMALL_DEAD_TUBE_CORAL);
            entries.add(ModBlocks.MEDIUM_DEAD_TUBE_CORAL);
            entries.add(ModBlocks.LARGE_DEAD_TUBE_CORAL);

            entries.add(ModBlocks.SMALL_DEAD_BRAIN_CORAL);
            entries.add(ModBlocks.MEDIUM_DEAD_BRAIN_CORAL);
            entries.add(ModBlocks.LARGE_DEAD_BRAIN_CORAL);

            entries.add(ModBlocks.SMALL_DEAD_BUBBLE_CORAL);
            entries.add(ModBlocks.MEDIUM_DEAD_BUBBLE_CORAL);
            entries.add(ModBlocks.LARGE_DEAD_BUBBLE_CORAL);

            entries.add(ModBlocks.SMALL_DEAD_FIRE_CORAL);
            entries.add(ModBlocks.MEDIUM_DEAD_FIRE_CORAL);
            entries.add(ModBlocks.LARGE_DEAD_FIRE_CORAL);

            entries.add(ModBlocks.SMALL_DEAD_HORN_CORAL);
            entries.add(ModBlocks.MEDIUM_DEAD_HORN_CORAL);
            entries.add(ModBlocks.LARGE_DEAD_HORN_CORAL);



            entries.add(SMALL_TUBE_CORAL_FAN);
            entries.add(MEDIUM_TUBE_CORAL_FAN);
            entries.add(LARGE_TUBE_CORAL_FAN);

            entries.add(SMALL_BRAIN_CORAL_FAN);
            entries.add(MEDIUM_BRAIN_CORAL_FAN);
            entries.add(LARGE_BRAIN_CORAL_FAN);

            entries.add(SMALL_BUBBLE_CORAL_FAN);
            entries.add(MEDIUM_BUBBLE_CORAL_FAN);
            entries.add(LARGE_BUBBLE_CORAL_FAN);

            entries.add(SMALL_FIRE_CORAL_FAN);
            entries.add(MEDIUM_FIRE_CORAL_FAN);
            entries.add(LARGE_FIRE_CORAL_FAN);

            entries.add(SMALL_HORN_CORAL_FAN);
            entries.add(MEDIUM_HORN_CORAL_FAN);
            entries.add(LARGE_HORN_CORAL_FAN);

            entries.add(SMALL_DEAD_TUBE_CORAL_FAN);
            entries.add(MEDIUM_DEAD_TUBE_CORAL_FAN);
            entries.add(LARGE_DEAD_TUBE_CORAL_FAN);

            entries.add(SMALL_DEAD_BRAIN_CORAL_FAN);
            entries.add(MEDIUM_DEAD_BRAIN_CORAL_FAN);
            entries.add(LARGE_DEAD_BRAIN_CORAL_FAN);

            entries.add(SMALL_DEAD_BUBBLE_CORAL_FAN);
            entries.add(MEDIUM_DEAD_BUBBLE_CORAL_FAN);
            entries.add(LARGE_DEAD_BUBBLE_CORAL_FAN);

            entries.add(SMALL_DEAD_FIRE_CORAL_FAN);
            entries.add(MEDIUM_DEAD_FIRE_CORAL_FAN);
            entries.add(LARGE_DEAD_FIRE_CORAL_FAN);

            entries.add(SMALL_DEAD_HORN_CORAL_FAN);
            entries.add(MEDIUM_DEAD_HORN_CORAL_FAN);
            entries.add(LARGE_DEAD_HORN_CORAL_FAN);

        });
    }
}
