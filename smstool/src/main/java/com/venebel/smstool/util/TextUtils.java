package com.venebel.smstool.util;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Random;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class TextUtils {

	/**
	 * Generate password random alphanumeric to student.
	 * 
	 * @return password 
	 */
	public static String generatePassword() {

		String password = "";
		long milis = new GregorianCalendar().getTimeInMillis();
		Random random = new Random(milis);
		int sizePassword = 8; //set the value in a property file.

		int i = 0;
		while (i < sizePassword) {
			char c = (char) random.nextInt(255);
			if ((c >= '0' && c <='9') || (c >='A' && c <='Z') || (c >='a' && c <='z')) {
				password += c;
				i++;
			}
		}

		return password;
	}

	public static String encodePassword(String rawPassword) {
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		return encoder.encode(rawPassword);
	}

	public static boolean matchesPassword(String rawPassword, String encodedPassword) {
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		return encoder.matches(rawPassword, encodedPassword);
	}

	public static String getFormattedMessage(String message, Object[] params) {
		return MessageFormat.format(message, params);
	}

	public static boolean isEmptyOrNull(String text) {
		return ((text == null) || (text.isEmpty()) || (text.trim().isEmpty()));
	}

}
