package tehtävä14;

import java.util.ArrayList;

import tehtävä14.ingredients.*;

// Concrete Builder, ArrayList
public class McDonaldsBuilder implements IBurgerBuilder {

	private ArrayList<Object> bigMac;
	
	@Override
	public void createNewBurger() {
		bigMac = new ArrayList<Object>();
	}

	@Override
	public void buildBun() {
		bigMac.add(new Bun("Plain bun"));
	}

	@Override
	public void buildPatty() {
		bigMac.add(new Patty("Vegan patty"));
	}

	@Override
	public void buildCheese() {
		bigMac.add(new Cheese("Monterey Jack cheese"));	
	}

	@Override
	public void buildLettuce() {
		bigMac.add(new Lettuce("Iceberg lettuce"));
	}

	@Override
	public void buildOnion() {
		bigMac.add(new Onion("Yellow onion"));
	}

	@Override
	public void buildTomato() {
		bigMac.add(new Tomato("Beefmaster tomato"));
	}

	@Override
	public ArrayList<Object> getBurger() {
		return bigMac;
	}
}