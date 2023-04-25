package tehtävä20;

import java.util.Iterator;

public class CMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * C:
		 */

		System.out.println("C: 2 säiettä (omat iteraattori). Toinen iteroi ja toinen muokkaa kokoelmaa.\n");

		// Ekan iteraattori ja säie.
		Iterator<Integer> iterator1 = list.getList().iterator();
		new Thread(() -> {
			while (iterator1.hasNext()) {
				System.out.println("Thread 1: " + iterator1.next());
				list.getList().add(0);
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
