package se254.a4.t3;

public class PolishingJob{
	double polishingRent(Floor floor, PolishingMachine polisher) {
		double floorArea = floor.length() * floor.width();
		double electricityPerUnitArea = floor.getCondition() * polisher.getCapability();
		double energyConsumption = electricityPerUnitArea * floorArea;
		return energyConsumption * polisher.costPerUnitElectricity();
	}
}