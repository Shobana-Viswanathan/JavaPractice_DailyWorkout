package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo1 {
		@DataProvider(name="testData" ,parallel=true)
		public Object[][] dataprovfunc(){
			return new Object[][] {{"Selenium"},{"Automation"},{"Java"} };
		}
	}
