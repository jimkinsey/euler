package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Problem8Test {

	@Test
	public void test_product_empty() {
		assertEquals(0, Problem8.product(new ArrayList<Integer>()).intValue());
	}

	@Test
	public void test_product_0() {
		assertEquals(0, Problem8.product(Arrays.asList(0)).intValue());
	}

	@Test
	public void test_product_1() {
		assertEquals(1, Problem8.product(Arrays.asList(1)).intValue());
	}

	@Test
	public void test_product_1_2() {
		assertEquals(2, Problem8.product(Arrays.asList(1,2)).intValue());
	}

	@Test
	public void test_product_1_2_3() {
		assertEquals(6, Problem8.product(Arrays.asList(1,2,3)).intValue());
	}
	
	@Test
	public void test_digitsInString_0() {
		assertEquals(0, Problem8.digitsInString("0").get(0).intValue());
	}

	@Test
	public void test_digitsInString_1() {
		assertEquals(1, Problem8.digitsInString("1").get(0).intValue());
	}

	@Test
	public void test_digitsInString_12() {
		List<Integer> digitsInString = Problem8.digitsInString("12");
		assertEquals(1, digitsInString.get(0).intValue());
		assertEquals(2, digitsInString.get(1).intValue());
	}

	@Test
	public void test_digitsInString_123() {
		List<Integer> digitsInString = Problem8.digitsInString("123");
		assertEquals(1, digitsInString.get(0).intValue());
		assertEquals(2, digitsInString.get(1).intValue());
		assertEquals(3, digitsInString.get(2).intValue());
	}
}
