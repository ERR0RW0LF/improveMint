// language: java
package com.err0rw0lf.imint.mixin;

import com.err0rw0lf.imint.Imint;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CoralBlockBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CoralBlockBlock.class)
public abstract class CoralBlockBlockMixin extends Block {
    // language: java
    @Final
    @Shadow private Block deadCoralBlock;
    @Shadow protected abstract boolean isInWater(BlockView world, BlockPos pos);


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
        Imint.LOGGER.info("Spawned Bubbles at {}", pos);
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

    // Perform the same "die if not in water" logic on random tick
    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.isInWater(world, pos)) {
            world.setBlockState(pos, this.deadCoralBlock.getDefaultState(), Block.NOTIFY_LISTENERS);
        } else if (random.nextFloat() < 1.0f) {
            world.spawnParticles(
                    ParticleTypes.BUBBLE,
                    pos.getX() + 0.5,
                    pos.getY() + 0.7,
                    pos.getZ() + 0.5,
                    20,
                    0.2, 0.3, 0.2,
                    0.01
            );
            Imint.LOGGER.info("Spawned Bubbles at {}", pos);
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