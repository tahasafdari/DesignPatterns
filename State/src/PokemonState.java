// State
public abstract class PokemonState {
	
	public void attack(Pokemon pokemon) {
	}

	public void dodge(Pokemon pokemon) {
	}

	public void move(Pokemon pokemon) {
	}
	
	public void skip(Pokemon pokemon) {
		System.out.println("\nSkipped a turn... Nothing happened.\n");
	}

	public void evolve(Pokemon pokemon, PokemonState pokemonState) {
		pokemon.evolve(pokemonState);
	}
}