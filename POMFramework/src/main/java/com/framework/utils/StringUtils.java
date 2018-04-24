package com.framework.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.text.StrSubstitutor;



public class StringUtils {

	public static String replaceParameterizedString(String str, String[] replaceList) {
		String replacedString = StrSubstitutor.replace(str, getParameterMap(replaceList));
		return replacedString;
	}

	public static String replaceParameterizedString(String str, Map<String, String> replaceList) {
		String replacedString = StrSubstitutor.replace(str, replaceList);
		return replacedString;
	}

	private static Map<String, String> getParameterMap(String[] replaceList) {
		Map<String, String> map = new HashMap<String, String>();
		int i = 0;
		for (String temp : replaceList) {
			map.put("{" + i + "}", temp);
			i++;
		}
		return map;
	}

	public static String testDataModification(String stringToModify) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(4);
		String randomChar = RandomStringUtils.randomAlphabetic(4);
		return stringToModify + randomChar + "_" + randomInt;

	}

	public static Date stringToDate(String date) {
		DateFormat dateformat = new SimpleDateFormat("mm/dd/yyyy");
		Date startDate = null;
		try {
			startDate = (Date) dateformat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDate;
	}

	public static boolean isGreaterThanCurrentDate(Date dateToCompare) {
		boolean isGreater = false;
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		isGreater = dateToCompare.after(currentDate);
		return isGreater;
	}

	public static boolean isLesserThanCurrentDate(Date dateToCompare) {
		boolean isLesser = false;
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		isLesser = dateToCompare.before(currentDate);
		return isLesser;
	}
	
}
