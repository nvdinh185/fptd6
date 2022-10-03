package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	private static final String ISBN_REGEX = "^[\\d-]{10,17}$";

	public static boolean checkValidIsbn(String isbn) {
		Pattern pattern = Pattern.compile(ISBN_REGEX);
		Matcher matcher = pattern.matcher(isbn);
		return matcher.find();
	}
}
