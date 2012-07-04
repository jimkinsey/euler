package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem6Test {

	@Test
	public void test_sumOfSquares_0() {
		assertEquals(0, Problem6.sumOfSquares(0));
	}
	
	@Test
	public void test_sumOfSquares_1() {
		assertEquals(1, Problem6.sumOfSquares(1));
	}

	@Test
	public void test_sumOfSquares_2() {
		assertEquals(5, Problem6.sumOfSquares(2));
	}
	
	@Test
	public void test_sumOfSquares_10() {
		assertEquals(385, Problem6.sumOfSquares(10));
	}
	
	@Test
	public void test_squareOfSums_0() {
		assertEquals(0, Problem6.squareOfSums(0));
	}
	
	@Test
	public void test_squareOfSums_1() {
		assertEquals(1, Problem6.squareOfSums(1));
	}

	@Test
	public void test_squareOfSums_2() {
		assertEquals(9, Problem6.squareOfSums(2));
	}

	@Test
	public void test_squareOfSums_10() {
		assertEquals(3025, Problem6.squareOfSums(10));
	}
	
}
