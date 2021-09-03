package java8Task1;

import java.util.TreeSet;

public class Exercise7 {

	public static void main(String[] args) {
		// Create a TreeSet that sorts the given set of numbers in reverse order
		TreeSet<Object> treeSet = new TreeSet<Object>((d1, d2) -> ((Integer) d2).compareTo((Integer) d1));

		treeSet.add(7);
		treeSet.add(19);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(11);

		treeSet.stream().forEach(e -> System.out.println("Tree Set Value: " + e));
	}
}
