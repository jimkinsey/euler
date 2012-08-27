package kinsey.jim.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class EnglishLanguageNumberFormatTest {
	private EnglishLanguageNumberFormat format;
	
	@Before
	public void setUp() {
		format = new EnglishLanguageNumberFormat();
	}
	
	@Test
	public void test_format_0() {
		assertEquals("zero", format.format(0));
	}
	
	@Test
	public void test_format_1() {
		assertEquals("one", format.format(1));
	}
	
	@Test
	public void test_format_2() {
		assertEquals("two", format.format(2));
	}
	
	@Test
	public void test_format_3() {
		assertEquals("three", format.format(3));
	}
	
	@Test
	public void test_format_4() {
		assertEquals("four", format.format(4));
	}
	
	@Test
	public void test_format_5() {
		assertEquals("five", format.format(5));
	}

	@Test
	public void test_format_6() {
		assertEquals("six", format.format(6));
	}
	
	@Test
	public void test_format_14() {
		assertEquals("fourteen", format.format(14));
	}
	
	@Test
	public void test_format_20() {
		assertEquals("twenty", format.format(20));
	}
	
	@Test
	public void test_format_21() {
		assertEquals("twenty-one", format.format(21));
	}

	@Test
	public void test_format_42() {
		assertEquals("forty-two", format.format(42));
	}
	
	@Test
	public void test_format_30() {
		assertEquals("thirty", format.format(30));
	}
	
	@Test
	public void test_format_999() {
		assertEquals("nine hundred and ninety-nine", format.format(999));
	}
	
	@Test
	public void test_format_1000() {
		assertEquals("one thousand", format.format(1000));
	}
	
	@Test
	public void test_format_1024() {
		assertEquals("one thousand and twenty-four", format.format(1024));
	}
	
	@Test
	public void test_format_8192() {
		assertEquals("eight thousand, one hundred and ninety-two", format.format(8192));
	}
	
	@Test
	public void test_format_1000000() {
		assertEquals("one million", format.format(1000000));
	}
	
	@Test
	public void test_format_9000999() {
		assertEquals("nine million, nine hundred and ninety-nine", format.format(9000999));
	}
	
	@Test
	public void test_format_1234123674() {
		assertEquals("one billion, two hundred and thirty-four million, one hundred and twenty-three thousand, six hundred and seventy-four", format.format(1234123674));
	}
	
	@Test
	public void test_format_100() {
		assertEquals("one hundred", format.format(100));
	}
	
	@Test
	public void test_format_404() {
		assertEquals("four hundred and four", format.format(404));
	}
		
	@Test(expected=UnsupportedOperationException.class)
	public void test_double_formatting_is_unsupported() {
		format.format(1.0);
	}	
}
