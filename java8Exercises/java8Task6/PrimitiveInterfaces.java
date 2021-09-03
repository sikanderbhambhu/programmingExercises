package java8Task6;

import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class PrimitiveInterfaces {

	public static boolean isPrime(int i) {
		IntPredicate isDivisible = index -> i % index == 0;
		return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
	}

	public static void squareOfNumber(int number) {
		IntConsumer intCon = $ -> System.out.println("Square of " + $ + " is: " + ($ * $));
		intCon.accept(number);
	}

	public static int randomNumberBelow5000() {
		IntSupplier intSup = () -> (int) ((Math.random() * 1000) + ((Math.random() * 8000)/2));
		return intSup.getAsInt();
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int givenNumber = new Scanner(System.in).nextInt();

		System.out.println("Is " + givenNumber + " a prime number: " + isPrime(givenNumber));
		squareOfNumber(givenNumber);		
		System.out.println("Random number below 5000 is: " + randomNumberBelow5000());
		
	}
}
