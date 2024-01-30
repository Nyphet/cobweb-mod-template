package crystalnest.cobweb_mod_template.platform;

import crystalnest.cobweb_mod_template.platform.services.PlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

/**
 * Fabric platform helper.
 */
public class FabricPlatformHelper implements PlatformHelper {
  @Override
  public String getPlatformName() {
    return "Fabric";
  }

  @Override
  public boolean isModLoaded(String modId) {
    return FabricLoader.getInstance().isModLoaded(modId);
  }

  @Override
  public boolean isDevEnv() {
    return FabricLoader.getInstance().isDevelopmentEnvironment();
  }
}
