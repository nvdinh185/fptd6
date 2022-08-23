package exe.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final String DATE_PATTERN = "dd/MM/yyyy";

	public static Date convertStrToDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String convertDateToString(Date dt) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		return sdf.format(dt);
	}

}
