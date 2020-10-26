import java.util.ArrayList;

public class Utils {
  // MARK: Methods
  static String chooseType() {
    String msg;
    msg = "Choose a type: \n" + World.listAllTypes();
    int option;
    option = View.getInt(msg, "POKEDEX");
    if (option <= 0 || option > World.getTypes().length)
      throw new IllegalArgumentException("[TYPES]: The type doesn't exists");
    return World.getTypes()[option - 1];
  }

  static Pokemon choosePokemonByName(String name, ArrayList<Pokemon> pokemons) {
    for (Pokemon pokemon : pokemons) {
      if (pokemon.getName().equals(name)) {
        return pokemon;
      }
    }
    throw new IllegalArgumentException("[POKEMON]: A pokemon with this name doesn't exists");
  }

  static Ability chooseAbilityByName(String name, ArrayList<Ability> abilities) {
    for (Ability ability : abilities) {
      if (ability.getName().equals(name)) {
        return ability;
      }
    }
    throw new IllegalArgumentException("[ABILITY]: A Ability with this name doesn't exists");
  }

  static Move chooseMoveByName(String name, ArrayList<Move> moves) {
    for (Move move : moves) {
      if (move.getName().equals(name)) {
        return move;
      }
    }
    throw new IllegalArgumentException("[MOVE]: A Move with this name doesn't exists");
  }
}
