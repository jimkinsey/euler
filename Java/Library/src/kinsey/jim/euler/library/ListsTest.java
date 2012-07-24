package kinsey.jim.euler.library;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
		final List<String> list = asList("Hello");
		assertEquals("Hello", Lists.head(list));
		assertTrue(Lists.tail(list).isEmpty());
	}
	
	@Test
	public void test_head_tail_two_elements() {
		final List<String> list = asList("Head", "Tail");
		assertEquals("Head", Lists.head(list));
		assertEquals(asList("Tail"), Lists.tail(list));
	}

	@Test
	public void test_head_tail_three_elements() {
		final List<String> list = asList("Head", "Body", "Tail");
		assertEquals("Head", Lists.head(list));
		assertEquals(asList("Body", "Tail"), Lists.tail(list));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_concatenate_one_list() {
		final List<String> list = asList("Hello", "World");
		assertEquals(list, Lists.concatenate(asList(list)));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_concatenate_two_lists() {
		final List<List<String>> twoLists = asList(
				asList("One", "Two"),
				asList("Three", "Four")
			);
		assertEquals(asList("One", "Two", "Three", "Four"), Lists.concatenate(twoLists));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_concatenate_three_lists() {
		final List<List<String>> threeLists = asList(
				asList("One", "Two"),
				asList("Three", "Four"),
				asList("Five")
			);
		assertEquals(asList("One", "Two", "Three", "Four", "Five"), Lists.concatenate(threeLists));
	}
	
	
	@Test
	public void test_flatten_one_object() {
		final Object oneObject = Integer.valueOf(2);
		assertEquals(asList(oneObject), Lists.flatten(oneObject));
	}
	
	@Test
	public void test_flatten_two_objects() {
		final Object one = Integer.valueOf(1);
		final Object two = Integer.valueOf(2);
		assertEquals(asList(one, two), Lists.flatten(one, two));
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test_flatten_one_list_of_only_objects() {
		final List list = asList("One", "Two");
		assertEquals(list, Lists.flatten(list));
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test_flatten_two_lists_of_only_objects() {
		final List one = asList("One");
		final List two = asList("Two");
		assertEquals(asList("One", "Two"), Lists.flatten(one, two));
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test_flatten_one_object_one_list_of_objects() {
		final Object one = "One";
		final List objects = asList("Two");
		assertEquals(asList("One", "Two"), Lists.flatten(one, objects));
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void test_flatten_recursively() {
		final List listsAndObjects = asList(1,asList(2,asList(3,4),5));
		assertEquals(asList(1,2,3,4,5), Lists.flatten(listsAndObjects));
	}
	
}
