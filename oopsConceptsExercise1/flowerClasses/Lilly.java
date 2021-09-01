package flowerClasses;

import flowerInterfaces.Flowers;

public class Lilly implements Flowers {
	private int totalLilyToAddInBouquet;

	public Lilly(int totalLilyToAddInBouquet) {
		this.totalLilyToAddInBouquet = totalLilyToAddInBouquet;
	}
	
	public void setNumberOfLily(int totalLilyToAddInBouquet) {
		this.totalLilyToAddInBouquet = totalLilyToAddInBouquet;
	}

	public int getNumberOfLily() {
		return this.totalLilyToAddInBouquet;
	}

	public int totalAmountForSelectedFlowers() {
		return (this.totalLilyToAddInBouquet * 3);
	}
}
