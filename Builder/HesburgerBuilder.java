package tehtävä14;

// Concrete Builder, StringBuilder
public class HesburgerBuilder implements IBurgerBuilder {

	private StringBuilder doubleBurger;
	
	@Override
	public void createNewBurger() {
		doubleBurger = new StringBuilder();
	}

	@Override
	public void buildBun() {
		doubleBurger.append("Sesame Seed bun\n");
	}

	@Override
	public void buildPatty() {
		doubleBurger.append("Ground beef patty\n");
	}

	@Override
	public void buildCheese() {
		doubleBurger.append("Cheddar cheese\n");
	}

	@Override
	public void buildLettuce() {
		doubleBurger.append("Romaine lettuce\n");
	}

	@Override
	public void buildOnion() {
		doubleBurger.append("Shallot onion\n");
	}

	@Override
	public void buildTomato() {
		doubleBurger.append("Pink Caspian tomato\n");
	}

	@Override
	public StringBuilder getBurger() {
		return doubleBurger;
	}
}