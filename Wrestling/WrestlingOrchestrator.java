package Wrestler;

import java.util.Scanner;

public class WrestlingOrchestrator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		// Getting User Input
		System.out.print("Enter your body weight in lbs: ");
		double bodyWeight = scanner.nextDouble();
		
		System.out.print("Enter your belly fat percentage (as decimal, e.g., 0.15): ");
		double bellyFat = scanner.nextDouble();
		
		System.out.print("Enter your tricep fat percentage (as decimal, e.g., 0.15): ");
		double tricepFat = scanner.nextDouble();
		
		System.out.print("Enter your back fat percentage (as decimal, e.g., 0.14): ");
		double backFat = scanner.nextDouble();
		
		scanner.nextLine(); // Consume leftover newline
		
		System.out.print("Enter your skill level (beginner/intermediate/advanced): ");
		String skillLevel = scanner.nextLine();
		
		// Initiate Classes
		MinimumWeightCalculator calculator = new MinimumWeightCalculator(bodyWeight, bellyFat, tricepFat, backFat, skillLevel);
		WeightClassStorage storage = new WeightClassStorage();
		WeightClassIterator iterator = new WeightClassIterator();
		
		// Calculate Minimum Weight
		double minWeightLbs = calculator.calculateMinimumWeight();
		double minWeightKg = calculator.convertLbsToKg(minWeightLbs);
		
		System.out.println("\n=== Results ===");
		System.out.printf("Minimum Safe Weight (lbs): %.2f%n",  minWeightLbs);
		System.out.printf("Minimum Safe Weight (kg): %,2f%n",  minWeightKg);
		
		System.out.println("High School Class: " + iterator.findLowestWeightClass(minWeightLbs,  storage.getHighSchoolLbs()));
		
		System.out.println("College Class: " + iterator.findLowestWeightClass(minWeightLbs,  storage.getCollegeLbs()));
		
		System.out.println("Olympic Class (kg): " + iterator.findLowestWeightClass(minWeightKg,  storage.getWorldKg()));
		
		scanner.close();
	}

}
