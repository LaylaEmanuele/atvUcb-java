import java.util.ArrayList;

public class World {
	// MARK: Fields
	private ArrayList<Region> regions = new ArrayList<Region>();
	private static ArrayList<Ability> abilities = new ArrayList<Ability>();
	private static ArrayList<Move> moves = new ArrayList<Move>();
	private static String[] types = { "Fire", "Water", "Grass", "Bug", "Normal", "Fighting", "Flying", "Poison", "Ground",
			"Rock", "Ghost", "Steel", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy" };

	// MARK: Constructor
	World() {
		String[] regions = { "Kanto", "Johto", "Hoenn", "Sinnoh", "Unova", "Kalos", "Alola", "Galar" };

		for (String name : regions) {
			getRegions().add(new Region(name, (this.regions.size() + 1)));

		}
	}

	// MARK: Methods
	public void createRegion(String name) {
		ArrayList<Region> regions = getRegions();
		regions.add(new Region(name, (regions.size() + 1)));
	}

	public void createMove(String name, String desc, String type, int power, int accuracy) {
		getMoves().add(new Move(name, desc, type, power, accuracy));
	}

	public void createAbility(String name, String desc) {
		getAbilities().add(new Ability(name, desc));
	}

	public void listAllPokemons() {
		int i = 0;
		String msg = "";
		for (Region region : getRegions()) {
			for (Pokemon pokemon : region.getPokemons()) {
				i++;
				msg += "Pokemon: " + pokemon.getName() + "\n" + "Number: " + "#" + i + "\n";
				if (i % 10 == 0) {
					View.showMsg(msg, "POKEDEX");
					msg = "";
				}
			}
		}
		msg += "END OF LIST";
		View.showMsg(msg, "POKEDEX");
	}

	public String listAllRegions() {
		int i = 0;
		String msg = "";
		for (Region region : getRegions()) {
			i++;
			msg += i + " - " + region.getName() + "\n";
		}

		return msg;
	}

	static String listAllTypes() {
		int i = 0;
		String msg = "";
		for (String t : World.getTypes()) {
			i++;
			msg += i + " - " + t + "\n";
		}

		return msg;
	}

	static void listAllAbilities() {
		for (Ability ability : World.getAbilities()) {
			View.showMsg(ability.toString(), "POKEDEX");
		}
	}

	static void listAllMoves() {
		for (Move move : World.getMoves()) {
			View.showMsg(move.toString(), "POKEDEX");
		}
	}

	public Region getRegionByIndex(int index) {
		if (index <= 0 || index > getRegions().size()) {
			throw new IllegalArgumentException("[REGION]: Choose an region that exists!");
		}

		return getRegions().get(index - 1);
	}

	// MARK: Getter and Setters
	public ArrayList<Region> getRegions() {
		return this.regions;
	}

	public static ArrayList<Ability> getAbilities() {
		return abilities;
	}

	public static ArrayList<Move> getMoves() {
		return moves;
	}

	public static String[] getTypes() {
		return types;
	}
}
