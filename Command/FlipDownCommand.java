package tehtävä22;

// ConcreateCommand 2
public class FlipDownCommand implements ICommand {

	private Screen screen;

	public FlipDownCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.down();
	}
}