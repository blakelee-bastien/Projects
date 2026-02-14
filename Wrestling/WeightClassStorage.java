package Wrestler;

public class WeightClassStorage {
	
	private double[] highSchoolLbs = { 106, 113, 120, 126, 132, 138, 144, 150, 157, 165, 175, 190, 215, 285};
	
	private double[] collegeLbs = {125, 133, 141, 149, 157, 165, 174, 184, 197, 285};
	
	private double[] olympicKg = {57, 65, 74, 86, 97, 125};
	
	private double[] worldKg = {57, 61, 65, 70, 74, 79, 86, 92, 97, 125};
	
	public double[] getHighSchoolLbs() { return highSchoolLbs; }
	public double[] getCollegeLbs() { return collegeLbs; }
	public double[] getOlympicKg() { return olympicKg; }
	public double[] getWorldKg() { return worldKg; }

}
