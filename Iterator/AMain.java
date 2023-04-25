package tehtävä20;

import java.util.Iterator;

public class AMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * A: Iteroidaan kokoelma kahdella säikeellä yhtä aikaa, kun molemmilla on oma
		 * iteraattori.
		 * 
		 * Tulos: Molemmat säikeet tulostavat kaikki luvut omaan tahtiin järjestyksessä.
		 * Säie 1 tulostaa luvut 1-20 järjestyksessä ja säie 2 tulostavaa luvut 1-20
		 * järjestyksessä.
		 */
		
		System.out.println("A: 2 säiettä, molemmilla oma iteraattori.\n");

		// Ekan iteraattori ja säie.
		Iterator<Integer> iterator1 = list.getList().iterator();
		new Thread(() -> {
			while (iterator1.hasNext()) {
				System.out.println("Thread 1: " + iterator1.next());
			}
		}).start();

		// Tokan iteraattori ja säie.
		Iterator<Integer> iterator2 = list.getList().iterator();
		new Thread(() -> {
			while (iterator2.hasNext()) {
				System.out.println("Thread 2: " + iterator2.next());
			}
		}).start();

	}
}