package org.test.dataproviderTestNG;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBOOK extends Loginpage  {

	@BeforeClass
private void beforeclass() {
	System.out.println("Before");
}
	

@BeforeMethod
private void beforemethod() {
System.out.println("Beforemethod");
launchbrowser("chrome");
lunchURL("https://www.facebook.com/");
windowmax();
impwait(10);
}


@AfterClass

private void Afterclass() {
System.out.println("Afterclass");

}

@AfterMethod
private void AfterMethod() {
System.out.println("AfterMethod");
quit();
}

@Test
private void Test1() {
System.out.println("Test");
WebElement log = Loginpage.findelement("id", "email");
sendkey(log, "ajitkannan");
sendkey(gettxtpwd(), "965252");

}

@Test(enabled=false)
private void test2() {
System.out.println("Test2");
}

@Test(enabled=false)
private void test3() {
System.out.println("test3");
}











	}



