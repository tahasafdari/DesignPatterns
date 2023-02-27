// ConcreteState
public class Ghastly extends PokemonState {

	private static Ghastly instance = null;

	private Ghastly() {
	}

	public static Ghastly getInstance() {
		if (instance == null) {
			instance = new Ghastly();
		}
		return instance;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("\nGhastly used Lick attack!\n");
		pokemon.setEXP(pokemon.getEXP() + 20);
		
		printAndEvolve(pokemon);
	}
	
	@Override
	public void dodge(Pokemon pokemon) {
		System.out.println("\nGreat moves! Ghastly dodged the attack by hiding behind a rock.\n");
		pokemon.setEXP(pokemon.getEXP() + 10);
		
		printAndEvolve(pokemon);
	}
	
	@Override
	public void move(Pokemon pokemon) {
		System.out.println("\nGhastly is flying around...\n");
		pokemon.setEXP(pokemon.getEXP() + 5);
		
		printAndEvolve(pokemon);
	}
	
	// Helper method for helping to reduce code repetition.
	private void printAndEvolve(Pokemon pokemon) {
		if (pokemon.getEXP() >= 100) {
			// Printing
			System.out.println(".......");
			System.out.println("\nWhat? Ghastly is evolving!");
			System.out.println("\n.......");
			System.out.println("Ghastly evolved into Haunter!\n");
			// Evolve
			evolve(pokemon, Haunter.getInstance());
		}
	}
}