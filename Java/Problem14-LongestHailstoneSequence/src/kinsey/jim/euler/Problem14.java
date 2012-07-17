package kinsey.jim.euler;

public class Problem14 {

	public static void main (String[] args) {
		System.out.println(startPointWithLongestSequence(1000000));
	}

	public static int startPointWithLongestSequence(int limit) {
		int start = 0;
		int maxLength = 0;
		
		for (int i = 1; i < limit; i++) {
			int length = hailstoneSequenceLength(i);
			if (length > maxLength) {
				maxLength = length;
				start = i;
			}
		}
		
		return start;
	}
	
	public static int hailstoneSequenceLength(long n) {
		if (n == 1)
			return 1;
		return hailstoneSequenceLength(nextHailstoneNumber(n)) + 1;
	}
	
	private static long nextHailstoneNumber(long n) {
		if (n > 1) {
			if (n % 2 == 0)
				return (n / 2);
			else
				return (3 * n) + 1;
		}
		return 1;
	}
	
}
