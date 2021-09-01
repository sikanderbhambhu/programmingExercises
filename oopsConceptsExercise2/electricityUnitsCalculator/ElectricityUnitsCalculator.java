package electricityUnitsCalculator;

import java.util.ArrayList;
import java.util.List;

import electricalAppliancesClasses.Fan;
import electricalAppliancesClasses.Lights;
import electricalAppliancesClasses.TV;
import electricalAppliancesInterface.ElectricalAppliances;
import electricityUnitsGenerator.ElectricityUnitsGenerator;

public class ElectricityUnitsCalculator {
	public static void main(String[] args) {
		List<ElectricalAppliances> switchedOnAppliances = new ArrayList<ElectricalAppliances>();
		switchedOnAppliances.add(new Fan(4));
		switchedOnAppliances.add(new Lights(6));
		switchedOnAppliances.add(new TV(0));
		
		ElectricityUnitsGenerator buildBouquetObj = new ElectricityUnitsGenerator();
		int totalAmount = buildBouquetObj.calculateTotalUnitsForSwitchedOnAppliances(switchedOnAppliances);
		System.out.println("Total Units Consumed For Switched Off Appliances Is: "+ totalAmount);
	}
}
