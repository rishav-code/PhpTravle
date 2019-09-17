package com.Phptravle.constant;

import java.io.IOException;
import java.util.Properties;

import com.Phptravle.utils.ReadProperty;

public class ValidateData {
	static Properties phptravelsvalidate;

	public ValidateData() {
		try {
			phptravelsvalidate = ReadProperty.loadProperty(FilePaths.VALIDATION_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static String getData(String key) {
		String value = phptravelsvalidate.getProperty(key);
		return value;

	}

}
