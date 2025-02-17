package hus.oop.lab1;

public class Fibonacci {
	public static void main(String[] args) {
		fibonacci();
		System.out.println();
		tribonacci();
	}
	
	public static void fibonacci() {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		
		System.out.println("The first " + nMax + " Fibonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			System.out.print(fn + " ");
			
			n++;
			sum += fn;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
		
		System.out.println();
		
		average = (double) sum / nMax;
		System.out.println("The average is: " + average);
	}
	
	public static void tribonacci() {
		int n = 4;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int fnMinus3 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2 + fnMinus3;
		double average;
		
		System.out.println("The first " + nMax + " Tribonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
		
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			System.out.print(fn + " ");
			
			n++;
			sum += fn;
			fnMinus3 = fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
		
		System.out.println();
		
		average = (double) sum / nMax;
		System.out.println("The average is: " + average);
	}
}
