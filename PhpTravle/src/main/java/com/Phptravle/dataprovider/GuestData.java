package com.Phptravle.dataprovider;

import org.testng.annotations.DataProvider;

import com.Phptravle.constant.FilePaths;
import com.Phptravle.utils.ProvideData;

public class GuestData {

	@DataProvider(name = "guest_details")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePaths.TESTDATA_FILE, 2);
		Object[][] getData = provideData.provideData();
		return getData;
	}

}
