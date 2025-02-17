package hus.oop.lab1;

public class SumAverageIRunningInt {
	public static void main(String[] args) {
		int sum = 0;
		double average;
//		final int LOWERBOUND = 1;
//		final int UPPERBOUND = 100;
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		
//		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
//			sum += number;
//		}
		
//		int number = LOWERBOUND;
//		while (number <= UPPERBOUND) {
//			sum += number;
//			number++;
//		}
		
//		int number = LOWERBOUND;
//		do {
//			sum += number;
//			number++;
//		} while (number <= UPPERBOUND);

//		int count = 0;
//		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
//			sum += number;
//			count++;
//		}

		int count = 0;
		for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sum += number * number;
			count++;
		}
		
		average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);

		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
		System.out.println(count);
		
		sumOddEven(LOWERBOUND, UPPERBOUND);
	}
	
	
	public static void sumOddEven(int lowerBound, int upperBound) {
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		
		for (int number = lowerBound; number <= upperBound; number++) {
			if (number % 2 == 0) {
				sumEven += number;
			} else {
				sumOdd += number;
			}
		}
		
		if (sumOdd > sumEven) {
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}
		
		System.out.println(absDiff);
	}
}
