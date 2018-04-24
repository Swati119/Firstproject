package com.framework.asserts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class AssertionHandler {
	private static Logger logger = LogManager.getLogger(AssertionHandler.class);

	public static void verifyEquals(Object actualValue, Object expectedValue) {
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyEquals(Object actualValue, Object expectedValue, String message) {
		try {
			Assert.assertEquals(actualValue, expectedValue, message);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

	public static void verifyNotEquals(Object actualValue, Object expectedValue) {
		try {
			Assert.assertNotEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyNotEquals(Object actualValue, Object expectedValue, String message) {
		try {
			Assert.assertNotEquals(actualValue, expectedValue, message);
		} catch (AssertionError e) {
			logger.error("Value mismatch", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

	public static void verifyTrue(boolean flag) {
		try {
			Assert.assertTrue(flag);
		} catch (AssertionError e) {
			logger.error("False returned", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyFalse(boolean flag) {
		try {
			Assert.assertFalse(flag);
		} catch (AssertionError e) {
			logger.error("True returned", e);
			throw new AssertionError("Assertion Error!!!!\n " + e);
		}
	}

	public static void verifyTrue(boolean flag, String message) {
		try {
			Assert.assertTrue(flag, message);
		} catch (AssertionError e) {
			logger.error("False returned", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

	public static void verifyFalse(boolean flag, String message) {
		try {
			Assert.assertFalse(flag, message);
		} catch (AssertionError e) {
			logger.error("True returned", e);
			throw new AssertionError("Assertion Error!!!! " + message + "\n " + e);
		}
	}

}
