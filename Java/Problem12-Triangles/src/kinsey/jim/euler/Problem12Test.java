package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Problem12Test {

	@Test 
	public void test_triangle_0() {
		assertEquals(0, Problem12.triangle(0));
	}

	@Test
	public void test_triangle_1() {
		assertEquals(1, Problem12.triangle(1));
	}
	
	@Test
	public void test_triangle_2() {
		assertEquals(3, Problem12.triangle(2));
	}
	
	@Test
	public void test_triangle_3() {
		assertEquals(6, Problem12.triangle(3));
	}
	
	@Test
	public void test_triangle_7() {
		assertEquals(28, Problem12.triangle(7));
	}
	
	@Test
	public void test_factors_0() {
		assertEquals(0, Problem12.factors(0).size());
	}
	
	@Test
	public void test_factors_1() {
		assertEquals(set(1l), Problem12.factors(1));
	}
	
	@Test
	public void test_factors_3() {
		assertEquals(set(1l, 3l), Problem12.factors(3));
	}

	@Test
	public void test_factors_6() {
		assertEquals(set(1l,2l,3l,6l), Problem12.factors(6));
	}

	@Test
	public void test_factors_10() {
		assertEquals(set(1l,2l,5l,10l), Problem12.factors(10));
	}

	@Test
	public void test_factors_28() {
		assertEquals(set(1l,2l,4l,7l,14l,28l), Problem12.factors(28));
	}

	private static <T> Set<T> set(T... items) {
		Set<T> set = new HashSet<T>();
		set.addAll(Arrays.asList(items));
		return set;
	}
	
}
