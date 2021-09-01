package flowerClasses;

import flowerInterfaces.Flowers;

public class Jasmine implements Flowers {
	private int totalJasminesToAddInBouquet;

	public Jasmine(int totalJasminesToAddInBouquet) {
		this.totalJasminesToAddInBouquet = totalJasminesToAddInBouquet;
	}
	
	public void setNumberOfJasmines(int totalJasminesToAddInBouquet) {
		this.totalJasminesToAddInBouquet = totalJasminesToAddInBouquet;
	}

	public int getNumberOfJasmines() {
		return this.totalJasminesToAddInBouquet;
	}

	public int totalAmountForSelectedFlowers() {
		return (this.totalJasminesToAddInBouquet * 2);
	}
}
