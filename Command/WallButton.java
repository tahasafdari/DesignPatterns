package tehtävä22;

// Invoker
public class WallButton {
	private ICommand cmd;
	
	public WallButton(ICommand cmd) {
		this.cmd = cmd;
	}
	
	public void push() {
		cmd.execute();
	}
}