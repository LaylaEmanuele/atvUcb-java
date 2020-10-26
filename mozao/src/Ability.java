
public class Ability {
  // MARK: Fields
  private String name;
  private String desc;

  // MARK: Constructor
  Ability(String name, String desc) {
    setDesc(desc);
    setName(name);
  }

  // MARK: Getter and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    name = name.trim();
    if (name.isEmpty())
      throw new IllegalArgumentException("[ABILITY]: The description cannot be empyt");

    this.name = name;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    desc = desc.trim();
    if (desc.isEmpty())
      throw new IllegalArgumentException("[ABILITY]: The name cannot be empyt");

    this.desc = desc;
  }

  // MARK: To String Method
  public String toString() {
    return "{ Name: " + name + "\n" + "Description: " + desc + "}\n";
  }

}
