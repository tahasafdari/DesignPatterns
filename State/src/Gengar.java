//ConcreteState
public class Gengar extends PokemonState {
	
	private static Gengar instance = null;

	private Gengar() {
	}

	public static Gengar getInstance() {
		if (instance == null) {
			instance = new Gengar();
		}
		return instance;
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println("\nGengar used Curse attack!\n");
		pokemon.setEXP(pokemon.getEXP() + 40);
	}
	
	@Override
	public void dodge(Pokemon pokemon) {
		System.out.println("\nGreat moves! Gengar dodged the attack by summoning a thick fog.\n");
		pokemon.setEXP(pokemon.getEXP() + 20);
	}
	
	@Override
	public void move(Pokemon pokemon) {
		System.out.println("\nGengar is trampeling around.\n");
		pokemon.setEXP(pokemon.getEXP() + 15);
	}
}