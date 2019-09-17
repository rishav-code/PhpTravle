package com.Phptravle.constant;

import java.io.File;

public class FilePaths {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;
	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "test" + File.separator
			+ "resources" + File.separator;
	public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
	public final static String LIB_HOME = USER_HOME + "lib" + File.separator;

	public final static String CONFIG_FILE = RESOURCES_HOME + "testdata" + File.separator + "config.properties";
	public final static String CHROME_PATH = LIB_HOME + "chromedriver.exe";
	public final static String LOCATOR_FILE = LOCATOR_HOME + "locators.properties";
	public final static String TESTDATA_FILE = RESOURCES_HOME + "testdata" + File.separator + "phptravelstestdata.xlsx";
	public final static String VALIDATION_FILE = RESOURCES_HOME + "testdata" + File.separator
			+ "validatedata.properties";

}
