package kinsey.jim.euler.library;

import java.util.ArrayList;
import java.util.Arrays;
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
	
}
