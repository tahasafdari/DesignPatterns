package tehtävä15;

import java.util.ArrayList;
import java.util.Random;

// Local Implementation
public class DoubleGenerator implements IGenerator {

	private Random random;
	private ArrayList<Double> numbers;
	private static final int DRAWNUMBERS = 10;
	
	public DoubleGenerator() {
		numbers = new ArrayList<Double>();
	}
	
	@Override
	public void GenerateRandomNumbers() {
		random = new Random();
		for (int i = 0; i < DRAWNUMBERS; i++) {
			numbers.add(random.nextDouble());
		}
	}

	@Override
	public void PrintRandomNumbers() {
		for (Double d : numbers) {
			System.out.println(d);
		}
	}
}