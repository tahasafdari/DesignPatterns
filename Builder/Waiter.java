package tehtävä14;

// Director
public class Waiter {
	private IBurgerBuilder builder;
	
	public void setBuilder(IBurgerBuilder builder) {
		this.builder = builder;
	}
	
	public void constructBurger() {
		this.builder.createNewBurger();
		this.builder.buildBun();
		this.builder.buildPatty();
		this.builder.buildCheese();
		this.builder.buildLettuce();
		this.builder.buildOnion();
		this.builder.buildTomato();
	}
}