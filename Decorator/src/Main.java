public class Main {

	public static void main(String[] args) {
		System.out.println("HINNASTO\n");
		
		// Tropicana Pizza
		Pizza tropicana = new Kinkku(new Ananas(new Juusto(new Tomaattisose(new Pohja()))));
		
		System.out.println("\tTropicana");
		System.out.println("\tTäytteet: " + tropicana.tayta());
		System.out.println("\tHinta: " + tropicana.hinta() + " €\n\n");
		
		// Proscitto Pizza
		Pizza proscitto = new Kinkku(new Juusto(new Tomaattisose(new Pohja()))); 
		
		System.out.println("\tProscitto");
		System.out.println("\tTäytteet: " + proscitto.tayta());
		System.out.println("\tHinta: " + proscitto.hinta() + " €\n\n");
		
		// Francescana Pizza
		Pizza francescana = new Herkkusieni(new Kinkku(new Juusto(new Tomaattisose(new Pohja()))));
		
		System.out.println("\tFrancescana");
		System.out.println("\tTäytteet: " + francescana.tayta());
		System.out.println("\tHinta: " + francescana.hinta() + " €");
	}
}