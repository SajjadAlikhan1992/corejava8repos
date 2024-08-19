package com.example.javapredicates;

public class LoggerUtil {

	private static LoggerUtil logger = null;

	private LoggerUtil() {

	}

	public static LoggerUtil getInstance() {

		if (logger == null) {
			logger = new LoggerUtil();
		}
		return logger;
	}

	public void printLogMessage(String message) {
		System.out.println("Logger Message---------->" + message);
	}

}
