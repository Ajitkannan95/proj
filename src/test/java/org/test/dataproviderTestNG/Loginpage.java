package org.test.dataproviderTestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass  {

	public  Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtusername;

	@FindBy(id="pass")
private WebElement txtpwd;
	
	@FindBy(name="login")

	private WebElement loginbtn;
 
	
	
	public WebElement gettxtusername() {
		return txtusername;
	}

		public WebElement gettxtpwd() {
			
		return txtpwd;
		
		}

			public WebElement getloginbtn() {
				return loginbtn;
		
	}
}
