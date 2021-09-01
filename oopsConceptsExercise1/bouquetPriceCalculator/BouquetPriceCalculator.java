package bouquetPriceCalculator;

import java.util.List;

import flowerInterfaces.Flowers;

public class BouquetPriceCalculator {
	
	public int calculatePriceOfBouquet(List<Flowers> flowersObjects) {
		int totalAmount = 0;
		for(Flowers currentObject : flowersObjects) {
			totalAmount = totalAmount + currentObject.totalAmountForSelectedFlowers();
		}
		return totalAmount;
	}
}