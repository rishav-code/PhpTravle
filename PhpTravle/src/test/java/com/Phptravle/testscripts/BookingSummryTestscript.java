package com.Phptravle.testscripts;

import org.testng.annotations.Test;

import com.Phptravel.pages.BookingSummary;
import com.Phptravle.constant.FindLoc;
import com.Phptravle.constant.ValidateData;
import com.Phptravle.dataprovider.GuestData;
import com.Phptravle.dataprovider.PersonalData;

public class BookingSummryTestscript {

	FindLoc loc = new FindLoc();
	ValidateData validatedata = new ValidateData();
	static int counter = 0;

	@Test(priority = 4, dataProvider = "personal_details", dataProviderClass = PersonalData.class)
	public void personalDetailsInput(String[] data) {
		BookingSummary.personalDetails(loc, data[0], data[1], data[2], data[3], data[4], data[5]);

	}

	@Test(priority = 5, dataProvider = "guest_details", dataProviderClass = GuestData.class)
	public void guestInfoInput(String[] data) {
		System.out.println(counter);
		BookingSummary.guestInfo(loc, data[0], data[1], data[2], counter);
		counter++;
	}

}
