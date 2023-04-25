package tehtävä20;

import java.util.Iterator;

public class DMain {

	public static void main(String[] args) {
		List list = new List(20);

		/*
		 * D: forEachRemaining() metodin testaus iteroinnissa.
		 *
		 */

		System.out.println("D: forEachRemaining() metodin testaus:\n");

		Iterator<Integer> iterator = list.getList().iterator();

		iterator.forEachRemaining((number) -> System.out.println(number));

		/*
		 * D: forEachRemaining() metodin testaus kahdella säikeellä ja kahdella
		 * iteraattorilla.
		 * 
		 * Tulos: Toimii samalla tavalla kuin AMain:in koodi, jossa homma tehtiin
		 * perinteisellä while toistorakenteella.
		 */

		System.out.println("\n\nD: forEachRemaining() metodin testaus kahdella säikeellä ja kahdella iteraattorilla\n");

		// Ekan iteraattori ja säie.
		Iterator<Integer> iterator1 = list.getList().iterator();
		new Thread(() -> {
			iterator1.forEachRemaining((number) -> System.out.println("Thread 1: " + number));
		}).start();

		// Tokan iteraattori ja säie.
		Iterator<Integer> iterator2 = list.getList().iterator();
		new Thread(() -> {
			iterator2.forEachRemaining((number) -> System.out.println("Thread 2: " + number));
		}).start();

	}
}