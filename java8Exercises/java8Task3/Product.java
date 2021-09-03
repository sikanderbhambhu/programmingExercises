package java8Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Product {

	String productCategory;
	int productPrice;

	public Product(String productCategory, int productPrice) {
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public static List<Integer> generateListOfCostOfRequiredProducts(List<Product> productList,
			Function<Product, Integer> func) {
		return productList.stream().map(func).collect(Collectors.toList());
	}

	public static Integer findTotalCostOfAllProducts(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		List<Product> objectsList = new ArrayList<>();
		objectsList.add(new Product("Fashion", 1001));
		objectsList.add(new Product("Lifestyle", 999));
		objectsList.add(new Product("Electronics", 1001));
		objectsList.add(new Product("Electronics", 1010));
		objectsList.add(new Product("Electronics", 1500));
		objectsList.add(new Product("Lifestyle", 700));
		objectsList.add(new Product("Fashion", 950));
		objectsList.add(new Product("Electronics", 199));
		objectsList.add(new Product("Lifestyle", 919));
		objectsList.add(new Product("Fashion", 5000));

		// Calculate the total cost of all Electronics products whose prices is > 1000
		System.out.println(
				"Total Cost Is: " + findTotalCostOfAllProducts(generateListOfCostOfRequiredProducts(objectsList,
						e -> ((e.getProductCategory().equalsIgnoreCase("Electronics")) && (e.getProductPrice() > 1000))
								? e.getProductPrice()
								: 0)));

		// Calculate the total cost of all products whose prices is > 1000
		System.out.println(
				"Total Cost Is: " + findTotalCostOfAllProducts(generateListOfCostOfRequiredProducts(objectsList,
						e -> (e.getProductPrice() > 1000) ? e.getProductPrice() : 0)));
	}
}
