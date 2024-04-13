package it.crystalnest.cobweb_mod_template.platform.model;

/**
 * Platform.
 */
public enum Platform {
  /**
   * Fabric loader identifier.
   */
  FABRIC("fabric"),
  /**
   * Fabric loader identifier.
   */
  FORGE("forge");

  /**
   * Platform name.
   */
  private final String name;

  /**
   * @param name This {@link #name}.
   */
  Platform(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
