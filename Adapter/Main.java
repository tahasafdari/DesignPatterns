package tehtävä15;

public class Main {

	public static void main(String[] args) {
		IGenerator intGenerator = new IntGenerator(new KokonaislukuGeneraattori());
		IGenerator doubleGenerator = new DoubleGenerator();
		
		// Testing Adapter
		System.out.println("Generate and print 10 random integers:");
		intGenerator.GenerateRandomNumbers();
		intGenerator.PrintRandomNumbers();
		
		// Testing Local Implementation
		System.out.println("\nGenerate and print 10 random doubles:");
		doubleGenerator.GenerateRandomNumbers();
		doubleGenerator.PrintRandomNumbers();
	}
}