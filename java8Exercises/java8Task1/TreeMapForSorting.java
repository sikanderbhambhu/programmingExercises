package java8Task1;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapForSorting {

	public static void main(String[] args) {
		// 11. Create TreeMap that sorts given set of employees in descending order of
		// their name
		Map<Employee, String> map = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Andy");
		Employee e3 = new Employee(3, "Carl");
		Employee e4 = new Employee(4, "Mike");
		Employee e5 = new Employee(5, "David");

		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		map.put(e3, e3.getName());
		map.put(e4, e4.getName());
		map.put(e5, e5.getName());

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

		// 7. Create a TreeSet that sorts the given set of numbers in reverse order
		TreeSet<Object> treeSet = new TreeSet<Object>((d1, d2) -> ((Integer) d2).compareTo((Integer) d1));

		treeSet.add(7);
		treeSet.add(19);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(11);

		treeSet.stream().forEach(e -> System.out.println("Tree Set Value: " + e));
				
	}
}
