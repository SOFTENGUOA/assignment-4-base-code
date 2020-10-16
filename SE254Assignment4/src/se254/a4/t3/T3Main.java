package se254.a4.t3;

public class T3Main {

	public static void main(String[] args) {
		// define a floor
		Floor floor = new Floor();
		
		//Calculate the cleaning rent
		CleaningMachine cleaner = new CleaningMachine();
		CleaningJob cJob = new CleaningJob();
		System.out.println(cJob.cleaningRent(floor, cleaner));		
		
		//Calculate polishing rent
		PolishingMachine polisher = new PolishingMachine();
		PolishingJob pJob = new PolishingJob();
		System.out.println(pJob.polishingRent(floor, polisher));		
		
	}
}
