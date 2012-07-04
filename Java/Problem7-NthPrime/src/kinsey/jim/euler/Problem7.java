package kinsey.jim.euler;

public class Problem7 {

	// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	//
	// What is the 10 001st prime number?
	
	public static void main(String[] args) {
		System.out.println(prime(10001));
	}
	
	public static long prime(long n) {
		int count = 0;
		
		for (int i = 1; count <= n; i++) {
			if (isPrime(i)) {
				count++;
				if (count == n)
					return i;
			}
		}
		
		return 0;
	}
	
	private static boolean isPrime(long number) {
		if (number < 2)
			return false;
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		
		return true;
	}
	
}
