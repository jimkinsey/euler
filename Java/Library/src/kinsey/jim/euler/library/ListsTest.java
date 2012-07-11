package kinsey.jim.euler.library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ListsTest {

	@SuppressWarnings("unchecked")
	@Test
	public void test_head_tail_empty() {
		assertNull(Lists.head(Collections.EMPTY_LIST));
		assertTrue(Lists.tail(Collections.EMPTY_LIST).isEmpty());
	}
	
	@Test
	public void test_head_tail_one_element() {
		final List<String> list = Arrays.asList("Hello");
		assertEquals("Hello", Lists.head(list));
		assertTrue(Lists.tail(list).isEmpty());
	}
	
	@Test
	public void test_head_tail_two_elements() {
		final List<String> list = Arrays.asList("Head", "Tail");
		assertEquals("Head", Lists.head(list));
		assertEquals(Arrays.asList("Tail"), Lists.tail(list));
	}

	@Test
	public void test_head_tail_three_elements() {
		final List<String> list = Arrays.asList("Head", "Body", "Tail");
		assertEquals("Head", Lists.head(list));
		assertEquals(Arrays.asList("Body", "Tail"), Lists.tail(list));
	}
	
}
