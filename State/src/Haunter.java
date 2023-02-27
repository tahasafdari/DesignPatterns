//ConcreteState
public class Haunter extends PokemonState {

	private static Haunter instance = null;

	private Haunter() {
	}

	public static Haunter getInstance() {
		if (instance == null) {
			instance = new Haunter();
		}
		return instance;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("\nHaunter used Mean Look attack!\n");
		pokemon.setEXP(pokemon.getEXP() + 30);
		
		printAndEvolve(pokemon);
	}
	
	@Override
	public void dodge(Pokemon pokemon) {
		System.out.println("\nGreat moves! Haunter dodged the attack by vanishing into thin air.\n");
		pokemon.setEXP(pokemon.getEXP() + 15);
		
		printAndEvolve(pokemon);
	}
	
	@Override
	public void move(Pokemon pokemon) {
		System.out.println("\nHaunter is levitating around...\n");
		pokemon.setEXP(pokemon.getEXP() + 10);
		
		printAndEvolve(pokemon);
	}
	
	// Helper method for helping to reduce code repetition.
		private void printAndEvolve(Pokemon pokemon) {
			if (pokemon.getEXP() >= 250) {
				// Printing
				System.out.println(".......");
				System.out.println("\nWhat? Haunter is evolving!");
				System.out.println("\n.......");
				System.out.println("Haunter evolved into Gengar!\n");
				// Evolve
				evolve(pokemon, Gengar.getInstance());
			}
		}
}