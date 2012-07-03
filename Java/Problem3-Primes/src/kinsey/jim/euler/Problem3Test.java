package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem3Test {

	@Test
	public void test_largestPrimeFactor_0() {
		assertEquals(0, Problem3.largestPrimeFactor(0));
	}
	
	@Test
	public void test_largestPrimeFactor_2() {
		assertEquals(2, Problem3.largestPrimeFactor(2));
	}
	
	@Test
	public void test_largestPrimeFactor_6() {
		assertEquals(3, Problem3.largestPrimeFactor(3));
	}
	
	@Test
	public void test_primeFactors_2() {
		assertEquals(1, Problem3.primeFactors(2).size());
		assertEquals(2, Problem3.primeFactors(2).get(0).longValue());
	}

	@Test
	public void test_primeFactors_3() {
		assertEquals(1, Problem3.primeFactors(3).size());
		assertEquals(3, Problem3.primeFactors(3).get(0).longValue());
	}

	@Test
	public void test_primeFactors_6() {
		assertEquals(2, Problem3.primeFactors(6).size());
		assertEquals(2, Problem3.primeFactors(6).get(0).longValue());
		assertEquals(3, Problem3.primeFactors(6).get(1).longValue());
	}
}
