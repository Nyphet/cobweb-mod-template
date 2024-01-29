package crystalspider.pyrotechnic_elytra.mixin;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Mixin for {@link FireworkRocketEntity} to prevent firework damage when flying.
 */
@Mixin(FireworkRocketEntity.class)
public class FireworkRocketEntityMixin {
  /**
   * Redirects the call to {@link LivingEntity#hurt(DamageSource, float)} in the method {@link FireworkRocketEntity#dealExplosionDamage()} when checking whether the firework should damage the entity that used it as flying boost.
   * <br>
   * Removes the call to {@code hurt} and prevents the damage.
   *
   * @param shooter Shooter of the firework.
   * @param damageSource Firework damage source.
   * @param damage Damage amount.
   * @return {@code false} because no damage will take place.
   */
  @Redirect(method = "dealExplosionDamage", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z", ordinal = 0))
  private boolean preventHurt(LivingEntity shooter, DamageSource damageSource, float damage) {
    return false;
  }
}
