
public abstract class Tayte implements Pizza {

	private Pizza pizza;

	public Tayte(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String tayta() {
		return pizza.tayta();
	}

	@Override
	public double hinta() {
		return pizza.hinta();
	}
}
