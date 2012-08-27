package kinsey.jim.euler.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static <E> E head(List<E> list) {
		if (list.size() == 0)
			return null;
		return list.get(0);
	}
	
	public static <E> E head(E[] array) {
		return head(Arrays.asList(array));	
	}
	
	public static <E> List<E> tail(List<E> list) {
		if (list.size() == 0)
			return new ArrayList<E>();
		return list.subList(1, list.size());
	}
	
	public static <E> List<E> tail(E[] array) {
		return tail(Arrays.asList(array));
	}

	public static <E> List<E> concatenate(List<List<E>> lists) {
		if (lists.size() == 0)
			return new ArrayList<E>();
		return prepend(head(lists), concatenate(tail(lists)));
	}
	
	private static <E> List<E> prepend(List<E> prefix, List<E> list) {
		List<E> prepended = new ArrayList<E>(list);
		prepended.addAll(0, prefix);
		return prepended;
	}
	
	public static <E> List<E> concatenate(List<E>... lists) {
		return concatenate(Arrays.asList(lists));
	}
	
	@SuppressWarnings("rawtypes")
	public static List flatten(Object... toFlatten) {
		return flatten(Arrays.asList(toFlatten));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List flatten(List list) {
		if (list.size() == 0)
			return new ArrayList();
		return concatenate(flattenElement(head(list)), flatten(tail(list)));
	}
	
	@SuppressWarnings("rawtypes")
	private static List flattenElement(Object element) {
		if (element instanceof List)
			return flatten(((List) element));
		return Arrays.asList(element);
	}
	
	public static <E> List<List<E>> group(List<E> list, int size) {
		List<List<E>> grouped = new ArrayList<List<E>>();
		for (int i = 0; i < list.size(); i += size) {
			int j = Math.min(i + size, list.size());
			grouped.add(list.subList(i, j));
		}
		return grouped;
	}
	
	public static <E> List<List<E>> groupFromEnd(List<E> list, int size) {
		List<List<E>> groupedReversedList = group(reversed(copyOf(list)), size);
		return reverseGroupedList(groupedReversedList);
	}

	private static <E> List<List<E>> reverseGroupedList(List<List<E>> grouped) {
		for (List<E> group : grouped)
			Collections.reverse(group);
		return reversed(grouped);
	}
	
	public static <E> List<E> copyOf(List<E> src) {
		List<E> dest = new ArrayList<E>(src.size());
		for (E element : src)
			dest.add(element);
		return dest;
	}
	
	public static <E> List<E> reversed(List<E> src) {
		List<E> reversed = new ArrayList<E>(src.size());
		for (int i = src.size() - 1; i >= 0; i--)
			reversed.add(src.get(i));
		return reversed;
	}
	
}
