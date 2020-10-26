import java.util.ArrayList;

public class Pokemon {
  // MARK: Fields
  private String name;
  private String[] types;
  private ArrayList<Ability> abilities = new ArrayList<Ability>();
  private ArrayList<Move> moves = new ArrayList<Move>();
  private String regionDexNum;

  // MARK: Constructor
  Pokemon(String name, String[] types, String number, char r) {
    setName(name);
    setTypes(types);

    this.regionDexNum = r + "#" + number;
  }

  // MARK: Methods
  public void addNewMove(Move move) {
    if (move == null)
      throw new IllegalArgumentException("[POKEMON]: The move is invalid");

    for (Move m : getMoves()) {
      if (m.equals(move))
        throw new IllegalArgumentException("[POKEMON]: The pokemon already has that move");
    }

    getMoves().add(move);
  }

  public void addNewAbility(Ability ability) {
    if (getAbilities().size() >= 3)
      throw new IllegalArgumentException("[POKEMON]: The pokemon cannot have more than 3 abilities");
    else if (ability == null)
      throw new IllegalArgumentException("[POKEMON]: The ability is invalid");

    for (Ability a : getAbilities()) {
      if (a.equals(ability))
        throw new IllegalArgumentException("[POKEMON]: The pokemon already has that ability");
    }

    getAbilities().add(ability);
  }

  // MARK: Getter and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    name = name.trim();
    if (name.isEmpty())
      throw new IllegalArgumentException("[POKEMON]: The name cannot be empyt");

    this.name = name;
  }

  public String[] getTypes() {
    return types;
  }

  public void setTypes(String[] types) {
    if (types.length <= 0)
      throw new IllegalArgumentException("[POKEMON]: The Pokemon need to have at least one type");

    if (types.length > 2)
      throw new IllegalArgumentException("[POKEMON]: The Pokemon need to have at max two type");

    this.types = types;
  }

  public ArrayList<Ability> getAbilities() {
    return this.abilities;
  }

  public ArrayList<Move> getMoves() {
    return this.moves;
  }

  public String getRegionDexNum() {
    return regionDexNum;
  }

  // MARK: To String Method
  public String toString() {
    String types = "[ ";
    for (String type : getTypes()) {
      types += type + " ";
    }
    types += "]";
    return "Name: " + name + "\n" + "Types: " + types + "\n" + "Abilities:\n " + abilities + "\n" + "Moves:\n " + moves
        + "\n" + "RegionDexNum: " + regionDexNum + "\n";
  }
}
