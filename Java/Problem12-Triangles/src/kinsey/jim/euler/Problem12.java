package kinsey.jim.euler;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem12 {

	//The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
	//
	//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
	//
	//Let us list the factors of the first seven triangle numbers:
	//
	//     1: 1
	//     3: 1,3
	//     6: 1,2,3,6
	//    10: 1,2,5,10
	//    15: 1,3,5,15
	//    21: 1,3,7,21
	//    28: 1,2,4,7,14,28
	//
	//We can see that 28 is the first triangle number to have over five divisors.
	//
	//What is the value of the first triangle number to have over five hundred divisors?

	public static void main(String[] args) {
		System.out.println(firstTriangleWithMoreThanNFactors(500));
	}
	
	public static long firstTriangleWithMoreThanNFactors(int n) {
		for (long i = 1, t = triangle(i);; i++) {
			if (factors(t).size() > n) {
				return t;
			}
		}
	}
	
	public static long triangle(long n) {
		if (n == 0)
			return 0;
		return n + triangle(n - 1);
	}
	
	public static Set<Long> factors(long n) {
		Set<Long> factors = new LinkedHashSet<Long>();
		
		for (long a = 1, b = n; a <= b; a++, b = n / a) {
			if (n % a == 0) {
				factors.add(a);
				factors.add(b);
			}
		}
		
		return factors;
	}
		
}
