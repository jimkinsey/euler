package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import kinsey.jim.euler.library.Numbers;

import org.junit.Test;

public class Problem16Test {

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
	
}
