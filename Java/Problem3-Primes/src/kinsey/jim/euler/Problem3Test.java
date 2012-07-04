package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		List<Long> factors = Problem3.primeFactors(2);
		
		assertEquals(1, factors.size());
		assertEquals(2, factors.get(0).longValue());
	}

	@Test
	public void test_primeFactors_3() {
		List<Long> factors = Problem3.primeFactors(3);
		
		assertEquals(1, factors.size());
		assertEquals(3, factors.get(0).longValue());
	}

	@Test
	public void test_primeFactors_4() {
		List<Long> factors = Problem3.primeFactors(4);
		
		assertEquals(2, factors.size());
		assertEquals(2, factors.get(0).longValue());
		assertEquals(2, factors.get(1).longValue());
	}
	
	@Test
	public void test_primeFactors_6() {
		List<Long> factors = Problem3.primeFactors(6);
		
		assertEquals(2, factors.size());
		assertEquals(2, factors.get(0).longValue());
		assertEquals(3, factors.get(1).longValue());
	}
	

	@Test
	public void test_primeFactors_8() {
		List<Long> factors = Problem3.primeFactors(8);
		
		assertEquals(3, factors.size());
		assertEquals(2, factors.get(0).longValue());
		assertEquals(2, factors.get(1).longValue());
		assertEquals(2, factors.get(2).longValue());
	}
	
	@Test
	public void test_primeFactors_10() {
		List<Long> factors = Problem3.primeFactors(10);
		
		assertEquals(2, factors.size());
		assertEquals(2, factors.get(0).longValue());
		assertEquals(5, factors.get(1).longValue());
	}
}
