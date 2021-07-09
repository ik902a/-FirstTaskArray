package by.epam.validator;

public class ArrayValidator {
	private static final String PATTERN = "(\\-?\\d+,)*\\-?\\d+";

	public static boolean isRow(String row) {
		return row.matches(PATTERN);
	}
}
