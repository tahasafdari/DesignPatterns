package tehtävä20;

import java.util.Iterator;

public class BMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * B: Iteroidaan kokoelma kahdella säikeellä käyttäen samaa iteraattoria.
		 * 
		 * Tulos: Kaikki listan arvot tulostetaan. Säikeet tulostelevat listan samoja
		 * arvoja melkein järjestyksessä. Arvot eivät tulleet ihan järjestykessä vaan
		 * hyppivät välillä. Alhaalla yksi testiajo.
		 */
		
		System.out.println("B: 2 säiettä, sama iteraattori.\n");

		// Yhteinen iteraattori
		Iterator<Integer> iterator = list.getList().iterator();

		// EKa säie
		new Thread(() -> {
			while (iterator.hasNext()) {
				System.out.println("Thread 1: " + iterator.next());
			}
		}).start();

		// Toka säie
		new Thread(() -> {
			while (iterator.hasNext()) {
				System.out.println("Thread 2: " + iterator.next());
			}
		}).start();
	}

}
