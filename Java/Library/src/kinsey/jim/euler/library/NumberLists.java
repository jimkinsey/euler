package kinsey.jim.euler.library;

import static kinsey.jim.euler.library.Lists.head;
import static kinsey.jim.euler.library.Lists.tail;

import java.util.List;

public class NumberLists {

	public static <T extends Number> long sum(List<T> numbers) {
		if (numbers.size() == 0)
			return 0;
		return head(numbers).longValue() + sum(tail(numbers));
	}
	
	public static <T extends Number> long product(List<T> numbers) {
		if (numbers.size() == 0)
			return 0;
		if (numbers.size() == 1)
			return numbers.get(0).longValue();
		return head(numbers).longValue() * product(tail(numbers));
	}
	
}
