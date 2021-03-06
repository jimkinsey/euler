package kinsey.jim.euler;

public class Problem2 {

	// Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
	//
	//	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	//
	//	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
		
	public static void main(String[] args) {
		System.out.println(sumOfEvenFibsBelow(4000000));
	}
	
	public static long sumOfEvenFibsBelow(int max) {
		long sum = 0;
		
		for (int i = 0, f = 0; f <= max; i++, f = fib(i)) {
			if (isEven(f)) {
				sum += f;
			}
		}
		
		return sum;
	}
	
	private static final int fib(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return fib(i - 1) + fib(i - 2);
	}
	
	private static boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
}
