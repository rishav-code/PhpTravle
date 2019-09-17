package com.Phptravle.dataprovider;

import org.testng.annotations.DataProvider;

import com.Phptravle.constant.FilePaths;
import com.Phptravle.utils.ProvideData;

public class HomePagedata {
	@DataProvider(name = "home_page_data")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePaths.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}

}
