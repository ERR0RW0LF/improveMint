package com.err0rw0lf.imint.mixin;

import com.err0rw0lf.imint.Imint;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CoralBlockBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

@Mixin(CoralBlockBlock.class)
public abstract class ModdedBlocksMixin {
    // Make coral blocks randomly tick (affects randomTick; not scheduledTick).
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
                0.25, 0.2, 0.25,
                1.0
        );
        Imint.LOGGER.info("Spawned Bubbles at {}", pos);
    }
}