package it.crystalnest.cobweb_mod_template.mixin;

import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import it.crystalnest.cobweb_mod_template.Constants;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.WorldStem;
import net.minecraft.server.level.progress.ChunkProgressListenerFactory;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.server.players.GameProfileCache;
import net.minecraft.world.level.storage.LevelStorageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.net.Proxy;

/**
 * Example mixin class.
 */
@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
  /**
   * Injects at the end of the base constructor to print an example message.
   *
   * @param thread
   * @param levelStorageAccess
   * @param packRepository
   * @param worldStem
   * @param proxy
   * @param dataFixer
   * @param minecraftSessionService
   * @param gameProfileRepository
   * @param gameProfileCache
   * @param chunkProgressListenerFactory
   * @param ci
   */
  @Inject(method = "<init>", at = @At(value = "TAIL"))
  private void onInit(Thread thread, LevelStorageSource.LevelStorageAccess levelStorageAccess, PackRepository packRepository, WorldStem worldStem, Proxy proxy, DataFixer dataFixer, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, GameProfileCache gameProfileCache, ChunkProgressListenerFactory chunkProgressListenerFactory, CallbackInfo ci) {
    Constants.LOGGER.info("Example mixin from Forge");
  }
}
