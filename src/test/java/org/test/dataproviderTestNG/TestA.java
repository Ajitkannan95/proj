package org.test.dataproviderTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestA {
	@Test(dataProvider = "login")
	private void TestA1(String user, String pass) {
		System.out.println("Test A1");
	}

	@Test
	private void TestA2() {
		Assert.assertTrue(false);
		System.out.println("Test A2");
	}

	@Test
	private void TestA3() {
		System.out.println("Test A3");
	}

	@DataProvider(name="login")
	Object[] [] data() {
		
	
	 Object[][] obj=new Object[][] {
		
		 {"Ak","12"},
		 {"as","55"},
		 {"de","985"}
	

	};
return obj;
}
}