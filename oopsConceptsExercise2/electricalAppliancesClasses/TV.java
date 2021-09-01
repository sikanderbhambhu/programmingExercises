package electricalAppliancesClasses;

import electricalAppliancesInterface.ElectricalAppliances;

public class TV implements ElectricalAppliances {
	private int totalSwitchedOnTVsInAppartment;

	public TV(int totalSwitchedOnTVsInAppartment) {
		this.totalSwitchedOnTVsInAppartment = totalSwitchedOnTVsInAppartment;
	}
	
	public void setNumberOfSwitchedOnTVs(int totalSwitchedOnTVsInAppartment) {
		this.totalSwitchedOnTVsInAppartment = totalSwitchedOnTVsInAppartment;
	}

	public int getNumberOfSwitchedOnTVs() {
		return this.totalSwitchedOnTVsInAppartment;
	}

	public int totalUnitsConsumedBySwitchedOnAppliances() {
		return (this.totalSwitchedOnTVsInAppartment * 3);
	}
}
