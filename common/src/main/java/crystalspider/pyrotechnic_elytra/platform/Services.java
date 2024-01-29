package crystalspider.pyrotechnic_elytra.platform;

import crystalspider.pyrotechnic_elytra.Constants;
import crystalspider.pyrotechnic_elytra.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

/**
 * Service loaders are a built-in Java feature that allow us to locate implementations of an interface that vary from one environment to another.
 * In the context of MultiLoader we use this feature to access a mock API in the common code that is swapped out for the platform specific implementation at runtime.
 */
public class Services {
  /**
   * Provides information about what platform the mod is running on.
   */
  public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

  /**
   * Load a service for the current environment.
   * Service implementation must be defined manually by including a text file in META-INF/services named with the fully qualified class name of the service.
   * Inside the file you should write the fully qualified class name of the implementation to load for the platform.
   *
   * @param clazz Class to load.
   * @return The loaded service.
   * @param <T> class type.
   */
  public static <T> T load(Class<T> clazz) {
    final T loadedService = ServiceLoader.load(clazz).findFirst().orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
    Constants.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
    return loadedService;
  }
}
