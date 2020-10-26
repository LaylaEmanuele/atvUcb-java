import java.util.ArrayList;

public class Region {
  // MARK: Fields
  private String name;
  private ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
  private int id;

  // MARK: Constructor
  Region(String name, int id) {
    setName(name);
    this.id = id;
  }

  // MARK: Methods
  public void createPokemon(String name, String[] types) {
    pokemons.add(new Pokemon(name, types, Integer.toString(getPokemons().size() + 1), getName().charAt(0)));
  }

  public void listAllPokemons() {
    String msg = "";
    int i = 0;
    for (Pokemon pokemon : getPokemons()) {
      msg += msg + "Pokemon: " + pokemon.getName() + "\n" + pokemon.getRegionDexNum() + "\n";
      if (i % 10 == 0) {
        View.showMsg(msg, "POKEDEX");
        msg = "";
      }
    }
    msg += msg + "END OF LIST";
    View.showMsg(msg, "POKEDEX");
  }

  // MARK: Getter and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    name = name.trim();
    if (name.isEmpty())
      throw new IllegalArgumentException("[REGION]: The name cannot be empyt");

    this.name = name;
  }

  public ArrayList<Pokemon> getPokemons() {
    return this.pokemons;
  }

  public int getId() {
    return id;
  }

  // MARK: To String Method
  public String toString() {
    return "{" + " name='" + name + "'" + ", pokemons='" + pokemons + "'" + ", id='" + id + "'" + "}";
  }

}
