package com.framework.asserts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;

public class SoftAssertionHandler {
	private static SoftAssert softAssert = new SoftAssert();
	private static Logger logger = LogManager.getLogger(SoftAssertionHandler.class);

	public static void verifyEquals(Object actualValue, Object expectedValue) {
		try {
			softAssert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyEquals(Object actualValue, Object expectedValue, String message) {
		try {
			softAssert.assertEquals(actualValue, expectedValue, message);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

	public static void verifyNotEquals(Object actualValue, Object expectedValue) {
		try {
			softAssert.assertNotEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyNotEquals(Object actualValue, Object expectedValue, String message) {
		try {
			softAssert.assertNotEquals(actualValue, expectedValue, message);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}
	
	public static void verifyTrue(boolean flag) {
		try {
			softAssert.assertTrue(flag);
		} catch (AssertionError e) {
			logger.error("False returned", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyFalse(boolean flag) {
		try {
			softAssert.assertFalse(flag);
		} catch (AssertionError e) {
			logger.error("True returned", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyTrue(boolean flag, String message) {
		try {
			softAssert.assertTrue(flag, message);
		} catch (AssertionError e) {
			logger.error("False returned", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

	public static void verifyFalse(boolean flag, String message) {
		try {
			softAssert.assertFalse(flag, message);
		} catch (AssertionError e) {
			logger.error("True returned", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

}
