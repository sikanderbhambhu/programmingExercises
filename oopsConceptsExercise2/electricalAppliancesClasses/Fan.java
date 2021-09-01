package electricalAppliancesClasses;

import electricalAppliancesInterface.ElectricalAppliances;

public class Fan implements ElectricalAppliances {
	private int totalSwitchedOnFansInAppartment;

	public Fan(int totalSwitchedOnFansInAppartment) {
		this.totalSwitchedOnFansInAppartment = totalSwitchedOnFansInAppartment;
	}
	
	public void setNumberOfSwitchedOnFans(int totalSwitchedOnFansInAppartment) {
		this.totalSwitchedOnFansInAppartment = totalSwitchedOnFansInAppartment;
	}

	public int getNumberOfSwitchedOnFans() {
		return this.totalSwitchedOnFansInAppartment;
	}

	public int totalUnitsConsumedBySwitchedOnAppliances() {
		return (this.totalSwitchedOnFansInAppartment * 1);
	}
}
