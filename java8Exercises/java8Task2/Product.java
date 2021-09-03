package java8Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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

	public static void filterProductsBasedOnCategoryAndPrice(List<Product> products,
			Predicate<Product> predRef) {
		products.stream().filter(predRef).collect(Collectors.<Product>toList())
				.forEach(e -> System.out.println("Product: " + e.productCategory + " and Price: " + e.productPrice));
	}

	public static void main(String[] args) {
		List<Product> objectsList = new ArrayList<>();
		objectsList.add(new Product("Electronics", 100));
		objectsList.add(new Product("Lifestyle", 101));
		objectsList.add(new Product("Electronics", 101));
		objectsList.add(new Product("Electronics", 150));
		objectsList.add(new Product("Fashion", 101));
		objectsList.add(new Product("Electronics", 99));

		filterProductsBasedOnCategoryAndPrice(objectsList,
				e -> e.productCategory.equalsIgnoreCase("Electronics") && e.productPrice > 100);
	}
}
