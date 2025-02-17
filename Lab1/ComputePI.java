package hus.oop.lab1;

public class ComputePI {
	public static void main(String[] args) {
		System.out.println(computePI() + " | " + compare(computePI()) + "%");
		System.out.println(computePIUsingTerms() + " | " + compare(computePIUsingTerms()) + "%");
	}
	
	public static double computePI() {
		double sum = 0;
		int MAX_DENOMINATOR = 1000;
		
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			if (denominator % 4 == 1) {
				sum += (double) 1 / denominator;
			} else if (denominator % 4 == 3) {
				sum -= (double) 1 / denominator;
			} else {
				System.out.println("Impossible!");
			}
		}

		sum *= 4;
		return sum;
	}

	public static double computePIUsingTerms() {
		int MAX_TERM = 10000;
		double sum = 0;
		
		for (int term = 1; term <= MAX_TERM; term++) {
			if (term % 2 == 1) {
				sum += (double) 1 / (term * 2 - 1);
			} else {
				sum -= (double) 1 / (term * 2 - 1);
			}
		}
		
		return sum * 4;
	}
	
	public static double compare(double pi) {
		return (pi / Math.PI) * 100;
	}
}
