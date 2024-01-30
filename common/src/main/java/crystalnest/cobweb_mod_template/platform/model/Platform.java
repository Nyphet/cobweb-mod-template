package crystalnest.cobweb_mod_template.platform.model;

public enum Platform {
  FABRIC("fabric"),
  FORGE("forge"),
  NEOFORGE("neoforge");

  private final String name;

  Platform(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
