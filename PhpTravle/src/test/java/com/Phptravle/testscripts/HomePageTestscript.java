package com.Phptravle.testscripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.Phptravel.pages.HomePage;
import com.Phptravle.constant.FindLoc;
import com.Phptravle.constant.ValidateData;
import com.Phptravle.dataprovider.HomePagedata;
import com.phptravles.testbase.TestBase;

public class HomePageTestscript extends TestBase {
	FindLoc loc = new FindLoc();
	ValidateData validatedata = new ValidateData();

	@Test(priority = 2, dataProvider = "home_page_data", dataProviderClass = HomePagedata.class)
	public void tourSearch(String city, String date) {
		HomePage.homePageTest(loc, city, date);
	}

	@AfterSuite
	public void processEnd() {
		driver.quit();
	}

}
