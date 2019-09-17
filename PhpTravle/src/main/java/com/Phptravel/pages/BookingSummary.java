package com.Phptravel.pages;

import com.Phptravle.constant.FindLoc;
import com.Phptravle.utils.CommonUtility;

public class BookingSummary {

	static String totalamount;
	

	public static void extraCheckBoxes(FindLoc loc) {

		CommonUtility.clickElement(loc.getlocator("loc.returnairticket.checkbox"));
		CommonUtility.clickElement(loc.getlocator("loc.3nightccomodation.checkbox"));
		CommonUtility.clickElement(loc.getlocator("loc.travelinsurance.checkbox"));
		CommonUtility.clickElement(loc.getlocator("loc.airportpickup.checkbox"));
	}

	public static void personalDetails(FindLoc loc, String firstname, String lastname, String email, String mobile_no,
			String address, String country) {
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.firstname.input"), 3, firstname);
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.lastname.input"), 3, lastname);
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.email.input"), 3, email);
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.confirmemail.input"), 3, email);
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.contactnumber.input"), 3, mobile_no);
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.address.input"), 3, address);
		CommonUtility.clickElement(loc.getlocator("loc.personaldetails.countrybox.btn"));
		CommonUtility.clickAndSendText(loc.getlocator("loc.personaldetails.country.input"), 3, country);
		CommonUtility.clickElement(loc.getlocator("loc.personaldetails.country.search.btn"));
		CommonUtility.scrollDownPage(600);
		extraCheckBoxes(loc);

	}

	public static void guestInfo(FindLoc loc, String name, String passno, String age, int counter) {
		switch (counter) {
		case 0:
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.name1.input"), 3, name);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.passportno1.inout"), 3, passno);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.age1.input"), 3, age);
			break;
		case 1:
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.name2.input"), 3, name);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.passportno2.inout"), 3, passno);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.age2.input"), 3, age);
			break;
		case 2:
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.name3.input"), 3, name);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.passportno3.inout"), 3, passno);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.age3.input"), 3, age);
			break;
		case 3:
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.name4.input"), 3, name);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.passportno4.inout"), 3, passno);
			CommonUtility.clickAndSendText(loc.getlocator("loc.guestinfo.age4.input"), 3, age);
			break;
		default:
			System.out.println("no data present");
		}
	}
}
