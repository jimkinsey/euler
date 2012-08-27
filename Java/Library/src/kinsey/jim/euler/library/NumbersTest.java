package kinsey.jim.euler.library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumbersTest {

	@Test
	public void test_isPrime_0() {
		assertFalse(Numbers.isPrime(0));
	}
	
	@Test
	public void test_isPrime_1() {
		assertFalse(Numbers.isPrime(1));
	}
	
	@Test
	public void test_isPrime_2() {
		assertTrue(Numbers.isPrime(2));
	}

	@Test
	public void test_isPrime_3() {
		assertTrue(Numbers.isPrime(3));
	}

	@Test
	public void test_isPrime_4() {
		assertFalse(Numbers.isPrime(4));
	}
	
	@Test
	public void test_isPrime_17() {
		assertTrue(Numbers.isPrime(17));
	}
	
	@Test
	public void test_get_digits_of_0_returns_0() {
		assertEquals(byteList(0), Numbers.getDigits(0));
	}
	
	@Test
	public void test_get_digits_of_1_returns_1() {
		assertEquals(byteList(1), Numbers.getDigits(1));
	}
	
	@Test
	public void test_get_digits_of_34_returns_3_4() {
		assertEquals(byteList(3,4), Numbers.getDigits(34));
	}
	
	@Test
	public void test_get_digits_of_1978_returns_1_9_7_8() {
		assertEquals(byteList(1,9,7,8), Numbers.getDigits(1978));
	}
	
	@Test
	public void test_get_digits_of_long() {
		assertEquals(byteList(2,1,4,7,4,8,3,6,4,8), Numbers.getDigits(2147483648L));
	}
	
	@Test
	public void test_get_digits_of_big_decimal() {
		assertEquals(byteList(9,2,2,3,3,7,2,0,3,6,8,5,4,7,7,5,8,0,8), Numbers.getDigits(new BigDecimal("9223372036854775808")));
	}

	private static List<Byte> byteList(Integer... integers) {
		List<Byte> bytes = new ArrayList<Byte>();
		for (Integer integer : integers)
			bytes.add(integer.byteValue());
		return bytes;
	}
	
	@Test
	public void test_from_digits_of_empty_list() {
		assertEquals(0, Numbers.fromDigits(byteList()).longValue());
	}
	
	@Test
	public void test_from_digits_of_one_digit_of_1() {
		assertEquals(1, Numbers.fromDigits(byteList(1)).longValue());
	}
	
	@Test
	public void test_from_digits_of_one_digit_of_2() {
		assertEquals(2, Numbers.fromDigits(byteList(2)).longValue());
	}
	
	@Test
	public void test_from_digits_of_two_digits_1_and_2() {
		assertEquals(12, Numbers.fromDigits(byteList(1,2)).longValue());
	}
	
	@Test
	public void test_product_0_0() {
		assertEquals("0", Numbers.product("0", "0"));
	}
	
	@Test
	public void test_product_1_1() {
		assertEquals("1", Numbers.product("1", "1"));
	}
	
	@Test
	public void test_product_2_2() {
		assertEquals("4", Numbers.product("2", "2"));
	}

	@Test
	public void test_product_6_7() {
		assertEquals("42", Numbers.product("6", "7"));
	}
	
	@Test
	public void test_product_10_13() {
		assertEquals("130", Numbers.product("10", "13"));
	}
	
	@Test
	public void test_product_strings_0_0() {
		assertEquals("0", Numbers.product("0", "0"));
	}
	
	@Test
	public void test_product_strings_10_10() {
		assertEquals("100", Numbers.product("10", "10"));
	}
	
	@Test
	public void test_product_strings_10_512() {
		assertEquals("5120", Numbers.product("10", "512"));
	}

	@Test
	public void test_product_large_number_2() {
		assertEquals("2000000000000000000000000", Numbers.product("1000000000000000000000000", "2"));
	}
	
	@Test
	public void test_pow_1_0() {
		assertEquals("1", Numbers.pow("1", 0));
	}
	
	@Test
	public void test_pow_3_0() {
		assertEquals("1", Numbers.pow("3", 0));
	}
	
	@Test
	public void test_pow_2_1() {
		assertEquals("2", Numbers.pow("2", 1));
	}
	
	@Test
	public void test_pow_2_2() {
		assertEquals("4", Numbers.pow("2", 2));
	}
	
	@Test
	public void test_pow_2_3() {
		assertEquals("8", Numbers.pow("2", 3));
	}
	
	@Test
	public void test_pow_2_1000() {
		assertEquals("8122380", Numbers.pow("2", 1000));
	}
	
	@Test
	public void test_sum_0() {
		assertEquals("0", Numbers.sum(Arrays.asList("0")));
	}
	
	@Test
	public void test_sum_2_2() {
		assertEquals("4", Numbers.sum(Arrays.asList("2", "2")));
	}
	
	@Test
	public void test_sum_1_2_3() {
		assertEquals("6", Numbers.sum(Arrays.asList("1", "2", "3")));
	}
	
	@Test
	public void test_sum_1_13() {
		assertEquals("14", Numbers.sum(Arrays.asList("1", "13")));
	}
	
	@Test
	public void test_sum_99_99() {
		assertEquals("198", Numbers.sum(Arrays.asList("99", "99")));
	}
	
	@Test
	public void test_sum_12345_246() {
		assertEquals("12591", Numbers.sum(Arrays.asList("12345", "246")));
	}
	
	@Test
	public void test_sum_20_7_1978() {
		assertEquals("2005", Numbers.sum(Arrays.asList("20", "7", "1978")));
	}
	
}
