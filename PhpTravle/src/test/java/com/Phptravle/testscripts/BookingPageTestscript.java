package com.Phptravle.testscripts;

import org.testng.annotations.Test;

import com.Phptravel.pages.BookingPage;
import com.Phptravle.constant.FindLoc;
import com.Phptravle.constant.ValidateData;
import com.Phptravle.utils.CommonUtility;

public class BookingPageTestscript {

	FindLoc loc = new FindLoc();
	ValidateData validatedata = new ValidateData();

	@Test(priority = 3)
	public void BookingOption() {
		BookingPage.bookingPageTest(loc);
		CommonUtility.clickElement(loc.getlocator("loc.bookingoption.booknow.btn"));
	}
}
