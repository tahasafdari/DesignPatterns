package tehtävä21;

import java.util.HashMap;

public class HardDrive {
	private long sector = 0x7C00;
	private char character = 'A';
	private HashMap<Long, Character> data = new HashMap<>();

	public HardDrive() {
		data.put(sector, character);
	}
	
	public char read(long lba, int size) {
		System.out.println("Hard Drive called read.");
		char data = this.data.get(lba);
		System.out.println("Getting data from " + lba + " sector");
		return data;
	}
}