package kinsey.jim.euler.library;

import static kinsey.jim.euler.library.Lists.flatten;

import java.util.ArrayList;
import java.util.List;

public class Strings {

	public static String head(String string) {
		if (string.length() == 0)
			return string;
		return string.substring(0, 1);
	}

	public static String tail(String string) {
		if (string.length() <= 1)
			return "";
		return string.substring(1);
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> characters(String string) {
		if (string.length() == 0)
			return new ArrayList<String>();
		return flatten(head(string), characters(tail(string)));
	}
}
