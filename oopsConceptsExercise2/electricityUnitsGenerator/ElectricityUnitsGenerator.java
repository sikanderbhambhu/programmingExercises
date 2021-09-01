package electricityUnitsGenerator;

import java.util.List;

import electricalAppliancesInterface.ElectricalAppliances;

public class ElectricityUnitsGenerator {

	public int calculateTotalUnitsForSwitchedOnAppliances(List<ElectricalAppliances> electricalAppliancesObjects) {
		int totalUnitsConsumed = 0;
		for (ElectricalAppliances currentObject : electricalAppliancesObjects) {
			totalUnitsConsumed = totalUnitsConsumed + currentObject.totalUnitsConsumedBySwitchedOnAppliances();
		}
		return totalUnitsConsumed;
	}
}
