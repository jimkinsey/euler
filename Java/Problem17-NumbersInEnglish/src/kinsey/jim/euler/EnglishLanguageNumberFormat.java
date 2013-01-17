package kinsey.jim.euler;

import static kinsey.jim.euler.library.Lists.flatten;
import static kinsey.jim.euler.library.Lists.groupFromEnd;
import static kinsey.jim.euler.library.Lists.head;
import static kinsey.jim.euler.library.Lists.tail;
import static kinsey.jim.euler.library.Numbers.fromDigits;
import static kinsey.jim.euler.library.Numbers.getDigits;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnglishLanguageNumberFormat extends NumberFormat {
	private static Map<Integer, String> namedPowersOfTen = new HashMap<Integer, String>();
	
	@Override
	public StringBuffer format(long number, StringBuffer buffer, FieldPosition position) {
		if (number == 0)
			return new StringBuffer("zero");
		StringBuffer result = new StringBuffer();
		result.append(formatThreeDigitGroups(getThreeDigitGroups(number)));
		return result;
	}

	private List<List<Byte>> getThreeDigitGroups(long number) {
		return groupFromEnd(getDigits(number), 3);
	}
	
	private String formatThreeDigitGroups(List<List<Byte>> digitGroups) {
		StringBuffer formatted = new StringBuffer();
		appendHead(formatted, digitGroups);
		appendTail(formatted, digitGroups);
		return formatted.toString();
	}
	
	private void appendHead(StringBuffer buffer, List<List<Byte>> digitGroups) {
		if (digitGroups.isEmpty())
			return;
		long headValue = fromDigits(head(digitGroups));
		buffer.append(new EnglishLanguageThreeDigitNumberFormat().format(headValue));
	}
	
	private void appendTail(StringBuffer buffer, List<List<Byte>> digitGroups) {
		if (digitGroups.isEmpty())
			return;
		List<List<Byte>> tail = tail(digitGroups);
		if (fromDigits(head(digitGroups)) > 0 && tail.size() > 0) {
			appendGroupName(buffer, digitGroups);
			appendGroupSeparator(buffer, tail);
		}
		buffer.append(formatThreeDigitGroups(tail));
	}

	private void appendGroupName(StringBuffer buffer, List<List<Byte>> digitGroups) {
		buffer.append(" ");
		buffer.append(nameOfPowerOfTen((digitGroups.size() - 1) * 3));
	}

	@SuppressWarnings("unchecked")
	private void appendGroupSeparator(StringBuffer buffer, List<List<Byte>> tail) {
		long tailValue = fromDigits(flatten(tail));
		if (tailValue >= 100)
			buffer.append(", ");
		else if (tailValue > 0)
			buffer.append(" and ");
	}

	private String nameOfPowerOfTen(int power) {
		if (namedPowersOfTen.containsKey(power))
			return namedPowersOfTen.get(power);
		throw new IllegalArgumentException("Power of 10 " + power + " does not have a unique name");
	}
	
	@Override
	public Number parse(String arg0, ParsePosition arg1) {
		throw new UnsupportedOperationException();
	}

	@Override
	public StringBuffer format(double arg0, StringBuffer arg1, FieldPosition arg2) {
		throw new UnsupportedOperationException();
	}
	
	static {
		namedPowersOfTen.put(3, "thousand");
		namedPowersOfTen.put(6, "million");
		namedPowersOfTen.put(9, "billion");
	}
}
