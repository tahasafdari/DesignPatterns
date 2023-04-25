package tehtävä20;

import java.util.ArrayList;

public class List {

	private ArrayList<Integer> list;

	public List(int elements) {
		list = new ArrayList<Integer>();
		createElements(elements);
	}

	private void createElements(int elements) {
		for (int i = 1; i <= elements; i++) {
			list.add(i);
		}
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}
}