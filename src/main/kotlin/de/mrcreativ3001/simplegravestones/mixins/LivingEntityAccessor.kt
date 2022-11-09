package de.mrcreativ3001.simplegravestones.mixins

import net.minecraft.entity.LivingEntity
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.gen.Invoker

@Mixin(LivingEntity::class)
interface LivingEntityAccessor {
    @Invoker("dropXp")
    fun invokeDropXp()
}