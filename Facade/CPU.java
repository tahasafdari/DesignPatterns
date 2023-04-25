package tehtävä21;

public class CPU {
	private long address;

	public void freeze() {
		System.out.println("CPU called freeze.");
	}

	public void jump(long position) {
		System.out.println("Called CPU's jump.");
		address = position;
		System.out.println("CPU executed jump to " + address);
	}

	public void execute() {
		System.out.println("CPU called execute.");
	}
}