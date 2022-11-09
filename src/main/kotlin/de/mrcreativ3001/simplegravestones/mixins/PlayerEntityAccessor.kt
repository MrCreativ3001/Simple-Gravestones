package de.mrcreativ3001.simplegravestones.mixins

import net.minecraft.entity.player.PlayerEntity
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.gen.Invoker

@Mixin(PlayerEntity::class)
interface PlayerEntityAccessor {
    @Invoker("vanishCursedItems")
    fun invokeVanishCursedItems()
}