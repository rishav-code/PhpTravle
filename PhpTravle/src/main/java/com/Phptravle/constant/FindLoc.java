package com.Phptravle.constant;

import java.io.IOException;
import java.util.Properties;

import com.Phptravle.utils.ReadProperty;

public class FindLoc {
	static Properties phptravelsloc;

	public FindLoc() {
		try {
			phptravelsloc = ReadProperty.loadProperty(FilePaths.LOCATOR_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getlocator(String key) {
		String value = phptravelsloc.getProperty(key);
		return value;

	}

}
