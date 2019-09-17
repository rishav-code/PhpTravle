package com.Phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Phptravle.constant.FindLoc;
import com.Phptravle.constant.ValidateData;
import com.Phptravle.utils.CommonUtility;

public class HomePage extends CommonUtility {

	public static void changeCurrency(WebDriver driver, FindLoc loc) {
		Actions action = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath(loc.getlocator("loc.currencyexchange.txt")));
		Action mouseover = action.moveToElement(wb).build();
		mouseover.perform();
		CommonUtility.clickElement(loc.getlocator("loc.inrcurrency.btn"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonUtility.clickElement(loc.getlocator("loc.acceptcookie.btn"));

	}

	public static void invalidCheckinDateValidation(WebDriver driver, FindLoc loc) {

		CommonUtility.clickElement(loc.getlocator("loc.tours.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.checkindate.btn"));
		CommonUtility.clearTextData(loc.getlocator("loc.checkindate.btn"));
		CommonUtility.clickAndSendText(loc.getlocator("loc.checkindate.btn"), 30,
				ValidateData.getData("homepage.checkin_date_input_data"));
		CommonUtility.clickElement(loc.getlocator("loc.homepage.search.btn"));

	}

	public static void cityInputValidation(FindLoc loc, ValidateData validatedata) {
		CommonUtility.clickElement(loc.getlocator("loc.backtohomapage.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.tours.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.city.btn"));
		CommonUtility.clickAndSendText(loc.getlocator("loc.cityinput.btn"), 30,
				ValidateData.getData("homepage.city_validate_input_data"));

	}

	public static void homePageTest(FindLoc loc, String city, String date) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonUtility.clickElement(loc.getlocator("loc.tours.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.city.btn"));
		CommonUtility.clearTextData(loc.getlocator("loc.cityinput.btn"));
		CommonUtility.clickAndSendText(loc.getlocator("loc.cityinput.btn"), 30, city);
		CommonUtility.clickElement(loc.getlocator("loc.citysearchoption.btn"));
		CommonUtility.clearTextData(loc.getlocator("loc.checkindate.btn"));
		CommonUtility.clickAndSendText(loc.getlocator("loc.checkindate.btn"), 30, date);
		CommonUtility.clickElement(loc.getlocator("loc.guests.dpdn"));
		CommonUtility.clickElement(loc.getlocator("loc.guestsnumber.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.homepage.search.btn"));
	}

}
