package tehtävä14;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		McDonaldsBuilder macDonalds = new McDonaldsBuilder();
		HesburgerBuilder hesburger = new HesburgerBuilder();
		
		// McDonalds
		waiter.setBuilder(macDonalds);
		waiter.constructBurger();
		
		ArrayList<Object> bigMac = macDonalds.getBurger();
		System.out.println("BigMac ingredients:");
		
		for (Object o : bigMac) {
			System.out.println(o);
		}
		
		// Hesburger
		waiter.setBuilder(hesburger);
		waiter.constructBurger();
		
		StringBuilder doubleBurger = hesburger.getBurger();
		System.out.println("\nDouble burger ingredients:");
		System.out.println(doubleBurger);
		
	}

}