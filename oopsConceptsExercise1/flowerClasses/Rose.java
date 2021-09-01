package flowerClasses;

import flowerInterfaces.Flowers;

public class Rose implements Flowers {
	private int totalRosesToAddInBouquet;

	public Rose(int totalRosesToAddInBouquet) {
		this.totalRosesToAddInBouquet = totalRosesToAddInBouquet;
	}
	
	public void setNumberOfRoses(int totalRosesToAddInBouquet) {
		this.totalRosesToAddInBouquet = totalRosesToAddInBouquet;
	}

	public int getNumberOfRoses() {
		return this.totalRosesToAddInBouquet;
	}

	public int totalAmountForSelectedFlowers() {
		return (this.totalRosesToAddInBouquet * 1);
	}
}
