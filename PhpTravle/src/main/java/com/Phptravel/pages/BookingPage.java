package com.Phptravel.pages;

import com.Phptravle.constant.FindLoc;
import com.Phptravle.utils.CommonUtility;

public class BookingPage {

	public static void bookingPageTest(FindLoc loc) {
		CommonUtility.clickElement(loc.getlocator("loc.tourdetails.btn"));
		CommonUtility.scrollDownPage(5000);
		CommonUtility.clickElement(loc.getlocator("loc.adults.dpdn"));
		CommonUtility.clickElement(loc.getlocator("loc.adultsnumber.btn"));
		CommonUtility.clickElement(loc.getlocator("loc.children.dpdn"));
		CommonUtility.clickElement(loc.getlocator("loc.chilnumber.btn"));
	}

}
