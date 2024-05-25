package it.crystalnest.cobweb_mod_template;

import it.crystalnest.cobweb_mod_template.config.ModConfig;

/**
 * Common mod loader.
 */
public final class CommonModLoader {
  private CommonModLoader() {}

  /**
   * Initialize common operations across loaders.
   */
  public static void init() {
    ModConfig.CONFIG.register();
  }
}
