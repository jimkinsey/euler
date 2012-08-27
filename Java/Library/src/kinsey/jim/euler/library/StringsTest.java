package kinsey.jim.euler.library;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringsTest {

	@Test
	public void test_head_of_empty_string_is_empty_string() {
		assertEquals("", Strings.head(""));
	}

	@Test
	public void test_head_of_H_is_H() {
		assertEquals("H", Strings.head("H"));
	}
	
	@Test
	public void test_head_of_Head_is_H() {
		assertEquals("H", Strings.head("Head"));
	}
	
	@Test
	public void test_tail_of_empty_string_is_empty_string() {
		assertEquals("", Strings.tail(""));
	}
	
	@Test
	public void test_tail_of_H_is_empty_string() {
		assertEquals("", Strings.tail("H"));
	}
	
	@Test
	public void test_tail_of_Head_is_ead() {
		assertEquals("ead", Strings.tail("Head"));
	}
	
}
