package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1Test {

	@Test
	public void test_sumOfMultiples_0_0() {
		assertEquals(0, Problem1.sumOfMultiples(0, 0));
	}

	@Test
	public void test_sumOfMultiples_1_1() {
		assertEquals(0, Problem1.sumOfMultiples(1, 1));
	}
	
	@Test
	public void test_sumOfMultiples_2_1() {
		assertEquals(1, Problem1.sumOfMultiples(2, 1));
	}
	
	@Test
	public void test_sumOfMultiples_3_1() {
		assertEquals(3, Problem1.sumOfMultiples(3, 1));
	}
	
	@Test
	public void test_sumOfMultiples_3_2() {
		assertEquals(2, Problem1.sumOfMultiples(3, 2));
	}
	
	@Test
	public void test_sumOfMultiples_3_2_1() {
		assertEquals(3, Problem1.sumOfMultiples(3, 2, 1));
	}
	
	@Test
	public void test_sumOfMultiples_10_3_5() {
		assertEquals(23, Problem1.sumOfMultiples(10, 3, 5));
	}
	
}
