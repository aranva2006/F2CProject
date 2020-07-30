package com.f2c.social.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class F2CUtils {
	private static final String WORD_SEPARATOR = " ";

	public static String convertToCamelCase(String text) {
		if (text == null || text.isEmpty()) {
			return text;
		}

		return Arrays.stream(text.split(WORD_SEPARATOR)).map(
				word -> word.isEmpty() ? word : Character.toTitleCase(word.charAt(0)) + word.substring(1).toLowerCase())
				.collect(Collectors.joining(WORD_SEPARATOR));
	}
}