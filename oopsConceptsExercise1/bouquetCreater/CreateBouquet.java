package bouquetCreater;

import java.util.ArrayList;
import java.util.List;

import bouquetPriceCalculator.BouquetPriceCalculator;
import flowerClasses.Jasmine;
import flowerClasses.Lilly;
import flowerClasses.Rose;
import flowerInterfaces.Flowers;

public class CreateBouquet {
	public static void main(String[] args) {
		List<Flowers> flowersObjects = new ArrayList<Flowers>();
		flowersObjects.add(new Rose(40));
		flowersObjects.add(new Jasmine(10));
		flowersObjects.add(new Lilly(10));
		
		BouquetPriceCalculator buildBouquetObj = new BouquetPriceCalculator();
		int totalAmount = buildBouquetObj.calculatePriceOfBouquet(flowersObjects);
		System.out.println("Price of Bouquet is: "+ totalAmount);
	}
}
