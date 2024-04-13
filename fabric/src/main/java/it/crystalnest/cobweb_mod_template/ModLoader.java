package it.crystalnest.cobweb_mod_template;

import net.fabricmc.api.ModInitializer;

/**
 * Mod loader.
 */
public class ModLoader implements ModInitializer {
  @Override
  public void onInitialize() {
    CommonModLoader.init();
  }
}
