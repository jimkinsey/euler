package kinsey.jim.euler;

public class Problem5 {

	// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	//
	// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
	public static void main(String[] args) {
		System.out.println(smallestEvenlyDivisible(1, 20));
	}
	
	public static long smallestEvenlyDivisible(int start, int end) {
		for (long number = end;; number+=end) {
			for (long divisor = end; divisor >= start; divisor--) {
				if (isEvenlyDivisibleBy(number, divisor)) {
					if (divisor == start) {
						return number;
					}
				}
				else {
					break;
				}
			}
		}
	}
	
	public static boolean isEvenlyDivisibleBy(long number, long divisor) {
		return (number % divisor == 0);
	}
	
}
