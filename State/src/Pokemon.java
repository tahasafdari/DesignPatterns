// Context
public class Pokemon {
	
	private PokemonState state;
	private int exp; // Experience points
	
	public Pokemon() {
		state = Ghastly.getInstance(); // First evolution
		exp = 0;
	}
	
	public void attack() {
		state.attack(this);
	}
	
	public void dodge() {
		state.dodge(this);
	}
	
	public void move() {
		state.move(this);
	}
	
	public void skip() {
		state.skip(this);
	}
	
	protected void evolve(PokemonState pokemonState) {
		state = pokemonState;
	}
	
	public int getEXP() {
		return exp;
	}
	
	public void setEXP(int exp) {
		this.exp = exp;
	}
}