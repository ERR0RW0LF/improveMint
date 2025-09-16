// language: java
package com.err0rw0lf.imint.mixin;


import com.err0rw0lf.imint.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.err0rw0lf.imint.Imint.*;

@Mixin(CoralBlockBlock.class)
public abstract class CoralBlockBlockMixin extends Block {
    // language: java
    @Final
    @Shadow private Block deadCoralBlock;
    @Shadow protected abstract boolean isInWater(BlockView world, BlockPos pos);

    private static final Direction[] DIRECTIONS = Direction.values();

    @ModifyArg(
            method = "<init>(Lnet/minecraft/block/Block;Lnet/minecraft/block/AbstractBlock$Settings;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/block/Block;<init>(Lnet/minecraft/block/AbstractBlock$Settings;)V"
            ),
            index = 0
    )
    private static AbstractBlock.Settings makeCoralRandomTick(AbstractBlock.Settings settings) {
        return settings.ticksRandomly();
    }

    // Fire when a scheduled tick happens (only scheduled when coral is not in water).
    @Inject(
            method = "scheduledTick",
            at = @At("HEAD")
    )
    private void onScheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        world.spawnParticles(
                ParticleTypes.BUBBLE,
                pos.getX() + 0.5,
                pos.getY() + 0.7,
                pos.getZ() + 0.5,
                20,
                0.5, 0.5, 0.5,
                0.01
        );
        //LOGGER.info("Spawned Bubbles at {}", pos);
    }

    // Mixin classes must declare a matching super constructor
    private CoralBlockBlockMixin(AbstractBlock.Settings settings) {
        super(settings);
    }

    // Make this block randomly tick
    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Unique
    private static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }

    // Perform the same "die if not in water" logic on random tick
    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.isInWater(world, pos)) {
            world.setBlockState(pos, this.deadCoralBlock.getDefaultState(), Block.NOTIFY_LISTENERS);
        }
        world.spawnParticles(
                ParticleTypes.BUBBLE,
                pos.getX() + 0.5,
                pos.getY() + 0.7,
                pos.getZ() + 0.5,
                20,
                0.2, 0.3, 0.2,
                0.01
        );
        //LOGGER.info("Spawned Bubbles at {}", pos);

        // Growing Amethyst for now TODO: Replace latter
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (direction != Direction.DOWN) {
                if (canGrowIn(blockState)) {
                    if (direction == Direction.UP) {
                        int type = random.nextInt(10);
                        if (type == 0) {
                            block = ModBlocks.SMALL_BRAIN_CORAL;
                        } else if (type == 1) {
                            block = ModBlocks.SMALL_BUBBLE_CORAL;
                        } else if (type == 2) {
                            block = ModBlocks.SMALL_FIRE_CORAL;
                        } else if (type == 3) {
                            block = ModBlocks.SMALL_HORN_CORAL;
                        } else if (type == 4) {
                            block = ModBlocks.SMALL_TUBE_CORAL;
                        } else if (type == 5) {
                            block = ModBlocks.SMALL_BRAIN_CORAL_FAN;
                        } else if (type == 6) {
                            block = ModBlocks.SMALL_BUBBLE_CORAL_FAN;
                        } else if (type == 7) {
                            block = ModBlocks.SMALL_FIRE_CORAL_FAN;
                        } else if (type == 8) {
                            block = ModBlocks.SMALL_HORN_CORAL_FAN;
                        } else if (type == 9) {
                            block = ModBlocks.SMALL_TUBE_CORAL_FAN;
                        }
                    } else {
                        //block = Blocks.SMALL_AMETHYST_BUD;
                        int type = random.nextInt(5);
                        if (type == 0) {
                            block = ModBlocks.SMALL_BRAIN_CORAL_WALL_FAN;
                        } else if (type == 1) {
                            block = ModBlocks.SMALL_BUBBLE_CORAL_WALL_FAN;
                        } else if (type == 2) {
                            block = ModBlocks.SMALL_FIRE_CORAL_WALL_FAN;
                        } else if (type == 3) {
                            block = ModBlocks.SMALL_HORN_CORAL_WALL_FAN;
                        } else if (type == 4) {
                            block = ModBlocks.SMALL_TUBE_CORAL_WALL_FAN;
                        }
                    }
                    //LOGGER.info("Random Type: " + type);
                    LOGGER.info("Direction: " + direction);
                } else if (blockState.isOf(Blocks.SMALL_AMETHYST_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                    block = Blocks.MEDIUM_AMETHYST_BUD;
                } else if (blockState.isOf(Blocks.MEDIUM_AMETHYST_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                    block = Blocks.LARGE_AMETHYST_BUD;
                } else if (blockState.isOf(Blocks.LARGE_AMETHYST_BUD) && blockState.get(AmethystClusterBlock.FACING) == direction) {
                    block = Blocks.AMETHYST_CLUSTER;
                } else if (blockState.isOf(ModBlocks.SMALL_BRAIN_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_BRAIN_CORAL;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BRAIN_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_BRAIN_CORAL;
                } else if (blockState.isOf(ModBlocks.LARGE_BRAIN_CORAL) && direction == Direction.UP) {
                    block = Blocks.BRAIN_CORAL;
                } else if (blockState.isOf(ModBlocks.SMALL_BUBBLE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_BUBBLE_CORAL;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BUBBLE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_BUBBLE_CORAL;
                } else if (blockState.isOf(ModBlocks.LARGE_BUBBLE_CORAL) && direction == Direction.UP) {
                    block = Blocks.BUBBLE_CORAL;
                } else if (blockState.isOf(ModBlocks.SMALL_TUBE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_TUBE_CORAL;
                } else if (blockState.isOf(ModBlocks.MEDIUM_TUBE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_TUBE_CORAL;
                } else if (blockState.isOf(ModBlocks.LARGE_TUBE_CORAL) && direction == Direction.UP) {
                    block = Blocks.TUBE_CORAL;
                } else if (blockState.isOf(ModBlocks.SMALL_FIRE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_FIRE_CORAL;
                } else if (blockState.isOf(ModBlocks.MEDIUM_FIRE_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_FIRE_CORAL;
                } else if (blockState.isOf(ModBlocks.LARGE_FIRE_CORAL) && direction == Direction.UP) {
                    block = Blocks.FIRE_CORAL;
                } else if (blockState.isOf(ModBlocks.SMALL_HORN_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_HORN_CORAL;
                } else if (blockState.isOf(ModBlocks.MEDIUM_HORN_CORAL) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_HORN_CORAL;
                } else if (blockState.isOf(ModBlocks.LARGE_HORN_CORAL) && direction == Direction.UP) {
                    block = Blocks.HORN_CORAL; // TODO
                } else if (blockState.isOf(ModBlocks.SMALL_BRAIN_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_BRAIN_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BRAIN_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_BRAIN_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_BRAIN_CORAL_FAN) && direction == Direction.UP) {
                    block = Blocks.BRAIN_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_BUBBLE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_BUBBLE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BUBBLE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_BUBBLE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_BUBBLE_CORAL_FAN) && direction == Direction.UP) {
                    block = Blocks.BUBBLE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_TUBE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_TUBE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_TUBE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_TUBE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_TUBE_CORAL_FAN) && direction == Direction.UP) {
                    block = Blocks.TUBE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_FIRE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_FIRE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_FIRE_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_FIRE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_FIRE_CORAL_FAN) && direction == Direction.UP) {
                    block = Blocks.FIRE_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_HORN_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.MEDIUM_HORN_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_HORN_CORAL_FAN) && direction == Direction.UP) {
                    block = ModBlocks.LARGE_HORN_CORAL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_HORN_CORAL_FAN) && direction == Direction.UP) {
                    block = Blocks.HORN_CORAL_FAN; // TODO
                } else if (blockState.isOf(ModBlocks.SMALL_BRAIN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.MEDIUM_BRAIN_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BRAIN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.LARGE_BRAIN_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_BRAIN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = Blocks.BRAIN_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_BUBBLE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.MEDIUM_BUBBLE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_BUBBLE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.LARGE_BUBBLE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_BUBBLE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = Blocks.BUBBLE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_TUBE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.MEDIUM_TUBE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_TUBE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.LARGE_TUBE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_TUBE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = Blocks.TUBE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_FIRE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.MEDIUM_FIRE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_FIRE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.LARGE_FIRE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_FIRE_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = Blocks.FIRE_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.SMALL_HORN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.MEDIUM_HORN_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.MEDIUM_HORN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = ModBlocks.LARGE_HORN_CORAL_WALL_FAN;
                } else if (blockState.isOf(ModBlocks.LARGE_HORN_CORAL_WALL_FAN) && blockState.get(CoralWallFanBlock.FACING) == direction) {
                    block = Blocks.HORN_CORAL_WALL_FAN;
                } 
            }

            if (block != null) {
                if (block.getClass() == AmethystClusterBlock.class) {
                    BlockState blockState2 = block.getDefaultState()
                            .with(AmethystClusterBlock.FACING, direction)
                            .with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                    world.setBlockState(blockPos, blockState2);
                } else if (block.getClass() == CoralBlock.class) {
                    BlockState blockState2 = block.getDefaultState()
                            .with(CoralBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                    world.setBlockState(blockPos, blockState2);
                } else if (block.getClass() == CoralFanBlock.class) {
                    BlockState blockState2 = block.getDefaultState()
                            .with(CoralFanBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                    world.setBlockState(blockPos, blockState2);
                } else if (block.getClass() == CoralWallFanBlock.class) {
                    BlockState blockState2 = block.getDefaultState()
                            .with(CoralWallFanBlock.FACING, direction)
                            .with(CoralWallFanBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                    world.setBlockState(blockPos, blockState2);
                }
            }
        }
    }

    // Spawn particles all the time
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (world.isWater(pos.add(0,1,0))) {
            double x = pos.getX() + random.nextFloat() - 0.5;
            double y = pos.getY() + random.nextFloat()*0.4 + 0.8;
            double z = pos.getZ() + random.nextFloat() - 0.5;

            double velocityX = random.nextFloat() - 0.5;
            double velocityY = random.nextFloat() + 0.2;
            double velocityZ = random.nextFloat() - 0.5;

            world.addParticle(
                    ParticleTypes.BUBBLE,
                    x,
                    y,
                    z,
                    velocityX, velocityY, velocityZ
            );
        }
    }

    // Rebuild per-state caches so hasRandomTicks() is picked up
    @Inject(method = "<init>", at = @At("TAIL"))
    private void reinitStateCaches(Block deadCoralBlock, AbstractBlock.Settings settings, CallbackInfo ci) {
        for (BlockState s : this.getStateManager().getStates()) {
            s.initShapeCache();
        }
    }
}