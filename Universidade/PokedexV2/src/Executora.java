public class Executora {

	public static void main(String[] args) {
		World world = new World();

		worldMenu(world);
	}

	static void worldMenu(World world) {
		int option = 0;
		String msg, name, desc, type;
		int power, accuracy;

		do {
			try {
				option = View.getInt("Choose an option: \n" + "1 - Region Menu\n" + "2 - Create new Region \n"
						+ "3 - Create new Move\n" + "4 - Create new Ability\n" + "5 - List all Abilities\n" + "6 - List all Moves\n"
						+ "7 - List all Pokemons\n" + "0 - Exit  \n", "POKEDEX");

				switch (option) {
					case 1:

						msg = "Choose an option: \n";
						msg += world.listAllRegions();
						regionMenu(world.getRegionByIndex(View.getInt(msg, "POKEDEX")));
						break;

					case 2:
						world.createRegion(View.getString("Enter an name for the new region", "POKEDEX"));
						break;

					case 3:
						name = View.getString("Enter an name for the new Move", "POKEDEX");
						desc = View.getString("Enter an description for the new Move", "POKEDEX");
						type = Utils.chooseType();
						power = View.getInt("Enter the power value for the new Move", "POKEDEX");
						accuracy = View.getInt("Enter the accuracy value the new Move", "POKEDEX");
						world.createMove(name, desc, type, power, accuracy);
						break;

					case 4:
						name = View.getString("Enter an name for the new Ability", "POKEDEX");
						desc = View.getString("Enter an description for the new Ability", "POKEDEX");
						world.createAbility(name, desc);
						break;

					case 5:
						World.listAllAbilities();
						break;

					case 6:
						World.listAllMoves();
						break;

					case 7:
						world.listAllPokemons();
						break;

					default:
						break;

				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	static void regionMenu(Region region) {
		int option = 0;
		int isDual;
		String name;
		String[] types;

		do {
			try {
				option = View.getInt("Choose an option: \n" + "1 - Pokemon Menu\n" + "2 - Create new Pokemon \n"
						+ "3 - List all Regions Pokemon\n" + "0 - Exit  \n", "POKEDEX");
				switch (option) {
					case 1:
						name = View.getString("What's the name of the pokemon?", "POKEDEX");
						pokemonMenu(Utils.choosePokemonByName(name, region.getPokemons()));
						break;

					case 2:
						isDual = View.getInt("The pokemon have two types? \n 1 - Yes \n 0 - No", "POKEDEX");
						if (isDual == 1) {
							types = new String[] { Utils.chooseType(), Utils.chooseType() };
						} else {
							types = new String[] { Utils.chooseType() };
						}

						name = View.getString("Enter the name of the new pokemon", "POKEDEX");

						region.createPokemon(name, types);

						break;

					case 3:
						region.listAllPokemons();
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

	static void pokemonMenu(Pokemon pokemon) {
		int option = 0;
		String name;
		Ability ability = null;
		Move move = null;

		do {
			try {
				option = View.getInt("Choose an option:\n" + "1 - Pokemon Information\n" + "2 - Add new Ability\n"
						+ "3 - Add new Move\n" + "0 - Exit \n", pokemon.getName());
				switch (option) {
					case 1:
						View.showMsg(pokemon.toString(), "POKEDEX");
						break;

					case 2:
						name = View.getString("Entre the Ability name that you want to add to the pokemon", "POKEDEX");
						ability = Utils.chooseAbilityByName(name, World.getAbilities());
						pokemon.addNewAbility(ability);
						break;

					case 3:
						name = View.getString("Entre the Move name that you want to add to the pokemon", "POKEDEX");
						move = Utils.chooseMoveByName(name, World.getMoves());
						pokemon.addNewMove(move);
						break;

					default:
						break;
				}

			} catch (Exception e) {
				View.showError(e.getMessage(), "ERROR");
			}
		} while (option != 0);
	}

}