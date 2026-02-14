package Wrestler;

public class MinimumWeightCalculator {
	
	// Instance Variables
	private double bodyWeightLbs;
	private double bellyFat;
	private double tricepFat;
	private double backFat;
	private String skillLevel;
	
	// Constructor
	public MinimumWeightCalculator(double bodyWeightLbs, double bellyFat, double tricepFat, double backFat, String skillLevel) {
		this.bodyWeightLbs = bodyWeightLbs;
		this.bellyFat = bellyFat;
		this.tricepFat = tricepFat;
		this.backFat = backFat;
		this.skillLevel = skillLevel;
	}
	
	// Getters
	
	public double getBodyWeightLbs() {
		return bodyWeightLbs;
	}
	
	public double getBellyFat() {
		return bellyFat;
	}
	
	public double getTricepFat() {
		return tricepFat;
	}
	
	public double getBackFat() {
		return backFat;
	}
	
	public String getSkillLevel() {
		return skillLevel;
	}
	
	// Setters
	
	public void setBodyWeightLbs(double bodyWeightLbs) {
		this.bodyWeightLbs = bodyWeightLbs;
	}
	
	public void setBellyFat(double bellyFat) {
		this.bellyFat = bellyFat;
	}
	
	public void setTricepFat(double tricepFat) {
		this.tricepFat = tricepFat;
	}
	
	public void setBackFat(double backFat) {
		this.backFat = backFat;
	}
	
	public void setSkillLevel(String skillLevle) {
		this.skillLevel = skillLevel;
	}
	
	// Calculation Methods
	
	public double calculateAverageBodyFat() {
		return (bellyFat + tricepFat + backFat) / 3.0;
	}
	
	public double calculateMinimumWeight() {
		double averageBodyFat = calculateAverageBodyFat();
		double leanMass = bodyWeightLbs * (1 - averageBodyFat);
		double minWeightByFat = leanMass / 0.93;
		
		double minWeightBySkill = bodyWeightLbs - getMaxLossBySkill();
		
		return Math.max(minWeightByFat,  minWeightBySkill);
	}
	
	private double getMaxLossBySkill() {
		if (skillLevel.equalsIgnoreCase("beginner")) {
			return 8;
		} else if (skillLevel.equalsIgnoreCase("intermediate")) {
			return 13;
		} else if (skillLevel.equalsIgnoreCase("advanced")) {
			return 20;
		}
		return 0;
	}
	
	public double convertLbsToKg(double lbs) {
		return lbs * .453592;
	}

}
