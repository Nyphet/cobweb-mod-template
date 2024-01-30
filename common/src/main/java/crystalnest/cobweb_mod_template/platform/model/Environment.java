package crystalnest.cobweb_mod_template.platform.model;

public enum Environment {
  DEV("development"),
  PROD("production");

  private final String name;

  Platform(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
