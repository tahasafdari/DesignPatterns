import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		Scanner scanner = new Scanner(System.in);
		int input;

		System.out.println("Starting the game...\n");

		do {
			System.out.println("Commands:\n" + "1. Attack\n" + "2. Dodge\n" + "3. Skip a turn\n" + "4. Move\n"
					+ "5. Check current exp\n" + "6. Exit the game");
			System.out.print("Enter a number to select a move: ");
			
			input = scanner.nextInt();

			switch (input) {
			case 1:
				pokemon.attack();
				break;
			case 2:
				pokemon.dodge();
				break;
			case 3:
				pokemon.skip();
				break;
			case 4:
				pokemon.move();
				break;
			case 5:
				System.out.println("\nCurrent exp points: " + pokemon.getEXP() + "\n");
				break;
			case 6:
				break;
			default:
				System.out.println("\nInvalid input.\n");
				break;
			}
		} while (input != 6);
	}
}