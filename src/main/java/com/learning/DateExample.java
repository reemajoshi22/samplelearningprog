package com.learning;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateExample {
	public static void main(String[] args) {
		DateExample dateExample = new DateExample();
		dateExample.date();
		dateExample.calendar();
		dateExample.locale();
		dateExample.performCalculations();
		dateExample.dateFormatEx();
		dateExample.simpleDateFormatExample();
		dateExample.simpledateWithLocale();
	}

	private void simpledateWithLocale() {
		String pattern = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,
				new Locale("fr", "FR"));
		String date = simpleDateFormat.format(new Date());
		System.out.println("with locale" + date);
	}

	private void simpleDateFormatExample() {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println("simple date format" + date);

	}

	private void dateFormatEx() {
		Locale locale = new Locale("fr", "FR");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,
				locale);
		String date = dateFormat.format(new Date());
		System.out.print("date format" + date);
	}

	private void performCalculations() {
		Calendar calendar = Calendar.getInstance();
		Locale locale = new Locale("fr");
		Date date = calendar.getTime();
		String df = DateFormat.getInstance().format(date);
		try {
			Date strToDate = DateFormat.getDateInstance().parse(df);
			System.out.println("parsed" + strToDate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("formatted date" + df);
		Date d1 = new Date(2_000_000_000_000L); // a trillion, Java 7 style
		System.out.println("1st date " + d1.toString());
		Date d2 = new Date(1_000_000_000_000L); // a trillion!
		System.out.println("1st date " + d2.toString());
		d2.setTime(d2.getTime() + 3_600_000); // 3_600_000 millis / hour
		System.out.println("new time " + d2.toString());
		Date now = new Date();
		System.out.println(now.getTime());
		Date d4 = new Date(1_000_000_000_000L);
		System.out.println("1st date " + d4.toString());
		Calendar c = Calendar.getInstance();
		c.setTime(d4); // #1
		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is "
				+ c.get(Calendar.DAY_OF_WEEK)); // #3
		c.add(Calendar.MONTH, 1); // #4
		Date d5 = c.getTime(); // #5
		System.out.println("new date " + d5.toString());

	}

	private void locale() {
		Locale locale = new Locale("en");
		Locale frLocale = new Locale("fr", "FR");
		System.out.println(locale.getDisplayLanguage());
		System.out.println(frLocale.getDisplayLanguage());
	}

	private void calendar() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.toString());
		System.out.println("Month is " + calendar.get(Calendar.DAY_OF_YEAR));
		calendar.roll(calendar.DAY_OF_YEAR, true);
		System.out.println("Month is " + calendar.get(Calendar.DAY_OF_YEAR));
		calendar.roll(calendar.DAY_OF_YEAR, false);
		System.out.println("Month is " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("hour is " + calendar.get(Calendar.HOUR));
		calendar.add(Calendar.HOUR, 4);
		System.out.println("hour is " + calendar.get(Calendar.HOUR));
	}

	private void date() {
		Date date = new Date();
		String dateString = date.toString();
		System.out.println(dateString);
	}
}
