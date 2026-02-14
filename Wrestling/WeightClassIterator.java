package Wrestler;

public class WeightClassIterator {
	public double findLowestWeightClass(double minimumWeight, double[] weightClasses) {
		for (int i = 0; i < weightClasses.length; i++) {
			if (weightClasses[i] >= minimumWeight) {
				return weightClasses[i];
			}
		}
		
		return -1;
	}

}
