package kinsey.jim.euler.library;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class NumberListsTest {

	@Test
	public void test_product_empty() {
		assertEquals(0, NumberLists.product(new ArrayList<Integer>()));
	}

	@Test
	public void test_product_0() {
		assertEquals(0, NumberLists.product(Arrays.asList(0)));
	}

	@Test
	public void test_product_1() {
		assertEquals(1, NumberLists.product(Arrays.asList(1)));
	}

	@Test
	public void test_product_1_2() {
		assertEquals(2, NumberLists.product(Arrays.asList(1,2)));
	}

	@Test
	public void test_product_1_2_3() {
		assertEquals(6, NumberLists.product(Arrays.asList(1,2,3)));
	}
	
	@Test
	public void test_sum_empty() {
		assertEquals(0, NumberLists.sum(new ArrayList<Integer>()));
	}

	@Test
	public void test_sum_0() {
		assertEquals(0, NumberLists.sum(Arrays.asList(0)));
	}

	@Test
	public void test_sum_1() {
		assertEquals(1, NumberLists.sum(Arrays.asList(1)));
	}

	@Test
	public void test_sum_1_2() {
		assertEquals(3, NumberLists.sum(Arrays.asList(1,2)));
	}

	@Test
	public void test_sum_1_2_3() {
		assertEquals(6, NumberLists.sum(Arrays.asList(1,2,3)));
	}
	
}
