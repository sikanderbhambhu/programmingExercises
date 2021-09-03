package java8Task1;

import java.util.Map;
import java.util.TreeMap;

class Exercise10 {

	private int id;
	private String name;

	public Exercise10(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public void setID(int salary) {
		this.id = salary;
	}

	public String toString() {
		return this.name + " " + this.id;
	}

	public static void main(String[] args) {
		// Create a TreeMap that sorts the given set of employees in descending order of their name
		Map<Exercise10, String> map = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

		Exercise10 e1 = new Exercise10(1, "John");
		Exercise10 e2 = new Exercise10(2, "Andy");
		Exercise10 e3 = new Exercise10(3, "Carl");
		Exercise10 e4 = new Exercise10(4, "Mike");
		Exercise10 e5 = new Exercise10(5, "David");

		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		map.put(e3, e3.getName());
		map.put(e4, e4.getName());
		map.put(e5, e5.getName());

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
