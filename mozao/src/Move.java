
public class Move {
  // MARK: Fields
  private String name;
  private String desc;
  private String type;
  private int power;
  private int accuracy;

  // MARK: Constructor
  Move(String name, String desc, String type, int power, int accuracy) {
    setName(name);
    setDesc(desc);
    setType(type);
    setPower(power);
    setAccuracy(accuracy);
  }

  // MARK: Getter and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    name = name.trim();
    if (name.isEmpty())
      throw new IllegalArgumentException("[MOVE]: The name cannot be empyt");

    this.name = name;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    desc = desc.trim();
    if (desc.isEmpty())
      throw new IllegalArgumentException("[MOVE]: The description cannot be empyt");

    this.desc = desc;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    type = type.trim();
    if (type.isEmpty())
      throw new IllegalArgumentException("[MOVE]: The type cannot be empyt");

    this.type = type;
  }

  public int getPower() {
    return this.power;
  }

  public void setPower(int power) {
    if (power < 0)
      throw new IllegalArgumentException("[MOVE]: The move power cannot be negative cannot be negative");

    this.power = power;
  }

  public int getAccuracy() {
    return this.accuracy;
  }

  public void setAccuracy(int accuracy) {
    if (accuracy < 0)
      throw new IllegalArgumentException("[MOVE]: The move accuracy cannot be negative cannot be negative");

    this.accuracy = accuracy;
  }

  // MARK: To String Method
  public String toString() {
    return "{ Name: " + name + "\n" + "Desc: " + desc + "\n" + "Type: " + type + "\n" + "Power: " + power + "\n"
        + "Accuracy: " + accuracy + " }\n";
  }

}
