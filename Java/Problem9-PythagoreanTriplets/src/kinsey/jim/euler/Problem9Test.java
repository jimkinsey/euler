package kinsey.jim.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem9Test {

	@Test
	public void test_isPythagorean_0_0_0() {
		assertFalse(new Problem9.Triplet(0,0,0).isPythagorean());
	}

	@Test
	public void test_isPythagorean_3_4_5() {
		assertTrue(new Problem9.Triplet(3,4,5).isPythagorean());
	}
	
	@Test
	public void test_pythagoreanTripletWithSum_12() {
		Problem9.Triplet triplet = Problem9.pythagoreanTripletWithSum(12);
		
		assertEquals(3, triplet.a);
		assertEquals(4, triplet.b);
		assertEquals(5, triplet.c);
	}
	
}
