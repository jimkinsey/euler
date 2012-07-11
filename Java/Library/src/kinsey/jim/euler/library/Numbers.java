package kinsey.jim.euler.library;

public class Numbers {
	
	public static boolean isPrime(Number number) {
		int x = number.intValue();
		
		if (x < 2 || (x > 2 && x % 2 == 0))
			return false;
		
		for (int i = 3; i <= Math.sqrt(x); i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
