package tehtävä22;

// ConcreateCommand 1
public class FlipUpCommand implements ICommand {

	private Screen screen;

	public FlipUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.up();
	}
}