package crystalnest.cobweb_mod_template.platform.model;

/**
 * Environment.
 */
public enum Environment {
  DEV("development"),
  PROD("production");

  /**
   * Platform name.
   */
  private final String name;

  /**
   * @param name This {@link #name}.
   */
  Environment(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
