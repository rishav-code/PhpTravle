package com.Phptravle.dataprovider;

import org.testng.annotations.DataProvider;

import com.Phptravle.constant.FilePaths;
import com.Phptravle.utils.ProvideData;

public class PersonalData {

	@DataProvider(name = "personal_details")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePaths.TESTDATA_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}

}
