package tehtävä22;

public class TestScreen {

	public static void main(String[] args) {
		Screen screen = new Screen();
		ICommand switchUp = new FlipUpCommand(screen);
		ICommand switchDown = new FlipDownCommand(screen);
		WallButton buttonUp = new WallButton(switchUp);
		WallButton buttonDown = new WallButton(switchDown);

		buttonUp.push();
		buttonDown.push();
	}
}