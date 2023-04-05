package tehtävä15;

import java.util.ArrayList;
import java.util.Random;

// Adaptee, Existing class.
public class KokonaislukuGeneraattori implements IGeneraattori {

	private Random randomi;
	private ArrayList<Integer> numerot;
	private static final int ARVOTTAVIALKM = 10;
	private static final int MAKSIMI = 100;

	public KokonaislukuGeneraattori() {
		numerot = new ArrayList<Integer>();
	}

	@Override
	public void LuoSatunnaislukuGeneraattori() {
		randomi = new Random();
	}

	@Override
	public void ArvoSatunnaisetNumerot() {
		for (int i = 0; i < ARVOTTAVIALKM; i++) {
			numerot.add(randomi.nextInt(MAKSIMI));
		}
	}

	@Override
	public void TulostaSatunnaisetNumerot() {
		for (Integer i : numerot) {
			System.out.println(i);
		}
	}
}