package tehtävä21;

import java.util.HashMap;

public class Memory {
	private HashMap<Long, Character> memory = new HashMap<>();

	public void load(long position, char data) {
		System.out.println("Memory called load.");
		memory.put(position, data);
		System.out.println("kBootAddress: " + position + ", data: " + data);
	}

}
