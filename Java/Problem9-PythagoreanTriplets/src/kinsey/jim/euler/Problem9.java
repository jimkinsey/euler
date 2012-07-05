package kinsey.jim.euler;

public class Problem9 {

	//	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	//	a^2 + b^2 = c^2
	//	
	//	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	//	
	//	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	//	Find the product abc.
	
	public static void main(String[] args) {
		System.out.println(pythagoreanTripletWithSum(1000));
	}
	
	public static Triplet pythagoreanTripletWithSum(int sum) {
		for (int a = 1; a < (sum / 3); a++) {
			for (int b = 2; b < (sum / 2); b++) {
				for (int c = 3; c < (sum  - 2); c++) {
					Triplet triplet = new Triplet(a,b,c);
					if (triplet.isPythagorean() && triplet.sum() == sum) {
						return triplet;
					}
				}
			}
		}
		
		return null;
	}
	
	public static class Triplet {
		
		final int a;
		final int b;
		final int c;
		
		public Triplet(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public boolean isPythagorean() {
			return (a < b && b < c) && ((a * a) + (b * b) == (c * c));
		}
		
		public int sum() {
			return a + b + c;
		}
		
		public int product() {
			return a * b * c;
		}
		
		public String toString() {
			return "a = " + a + " b = " + b + " c = " + c + ", sum = " + sum() + ", product = " + product();
		}
		
	}
	
}
