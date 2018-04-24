package com.framework.reports;

import org.apache.log4j.Logger;
import org.testng.Reporter;

public class TestNGCustomReporter extends Reporter {

	public static void log(Logger logger, String log) {
		logger.info(log);
		TestNGCustomReporter.customLog(log + "</br>");
	}

	public static void log(Logger logger, int log) {
		logger.info(log);
		TestNGCustomReporter.customLog(log + "</br>");
	}

	public static void customLog(String str) {
		log(getCurrentTestResult().getMethod().getMethodName() + " : " + str);

		Object[] params = getCurrentTestResult().getParameters();
		String testname = null;
		if (params.length > 0) {
			testname = getCurrentTestResult().getMethod().getMethodName() + "_" + params[0];
			if (params.length > 1) {
				testname = testname + "_" + params[1];
			}
		} else {
			testname = getCurrentTestResult().getMethod().getMethodName();
		}
		ReportBuilder.log(testname, str);
	}
}