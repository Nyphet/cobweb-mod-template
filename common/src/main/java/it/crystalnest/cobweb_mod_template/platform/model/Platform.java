package it.crystalnest.cobweb_mod_template.platform.model;

/**
 * Platform.
 */
public enum Platform {
  /**
   * Fabric loader identifier.
   */
  FABRIC,
  /**
   * Fabric loader identifier.
   */
  FORGE,
  /**
   * Fabric loader identifier.
   */
  NEOFORGE;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }
}
