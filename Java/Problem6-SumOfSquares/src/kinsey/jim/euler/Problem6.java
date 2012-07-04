package kinsey.jim.euler;

public class Problem6 {

	// The sum of the squares of the first ten natural numbers is,
	// 12 + 22 + ... + 102 = 385
	//
	// The square of the sum of the first ten natural numbers is,
	// (1 + 2 + ... + 10)2 = 552 = 3025
	//
	// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	//
	// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	
	public static void main(String[] args) {
		System.out.println(squareOfSums(100) - sumOfSquares(100));
	}
	
	public static long sumOfSquares(long max) {
		if (max == 0)
			return 0;
		return (max * max) + sumOfSquares(max - 1);
	}
	
	public static long squareOfSums(long max) {
		if (max == 0)
			return 0;
		return sum(max) * sum(max);
	}
	
	private static long sum(long max) {
		if (max == 0)
			return 0;
		return max + sum(max - 1);
	}
	
}
