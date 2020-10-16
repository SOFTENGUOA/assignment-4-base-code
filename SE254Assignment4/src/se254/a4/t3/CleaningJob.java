package se254.a4.t3;

public class CleaningJob {
	// The method inputs the floor and cleaner objects and
    // calculates the energy consumption cost for cleaning the floor area
	double cleaningRent(Floor floor, CleaningMachine cleaner) {
		double floorArea = floor.length() * floor.width();
		double electricityPerUnitArea = floor.getCondition() * cleaner.getCapability();
		double energyConsumption = electricityPerUnitArea * floorArea;
		return energyConsumption * cleaner.costPerUnitElectricity();
	}	
}
