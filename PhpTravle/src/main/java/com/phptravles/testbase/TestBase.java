package com.phptravles.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.Phptravle.constant.FilePaths;
import com.Phptravle.utils.ReadProperty;

public class TestBase {
	public static WebDriver driver;
	Properties baseClass;
	String url;
	public static String browser;
	int downloadFile;

	@BeforeSuite
	public void intitailizeBrowser() throws IOException {

		baseClass = ReadProperty.loadProperty(FilePaths.CONFIG_FILE);
		url = baseClass.getProperty("url");
		browser = baseClass.getProperty("browser");

		System.out.println("browser is " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", FilePaths.CHROME_PATH);

			driver = new ChromeDriver();

			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}

	}
}
