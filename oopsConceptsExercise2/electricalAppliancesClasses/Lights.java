package electricalAppliancesClasses;

import electricalAppliancesInterface.ElectricalAppliances;

public class Lights implements ElectricalAppliances {
	private int totalSwitchedOnLightsInAppartment;

	public Lights(int totalSwitchedOnLightsInAppartment) {
		this.totalSwitchedOnLightsInAppartment = totalSwitchedOnLightsInAppartment;
	}
	
	public void setNumberOfSwitchedOnLights(int totalSwitchedOnLightsInAppartment) {
		this.totalSwitchedOnLightsInAppartment = totalSwitchedOnLightsInAppartment;
	}

	public int getNumberOfSwitchedOnLights() {
		return this.totalSwitchedOnLightsInAppartment;
	}

	public int totalUnitsConsumedBySwitchedOnAppliances() {
		return (this.totalSwitchedOnLightsInAppartment * 2);
	}
}
