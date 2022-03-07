package org.test.dataproviderTestNG;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchbrowser(String browsername) {

		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "1":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.print("Out of  Brower");
			break;
		}

		return driver;
	}

	public static void lunchURL(String Url) {
		driver.get(Url);

	}

	public static void windowmax() {
		driver.manage().window().maximize();

	}

	public static void impwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	public void quit() {
		driver.quit();

	}

	public static String getcurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public static String gettitle() {
		String gettile = driver.getTitle();
		
		return gettile;

	}

	public static void sendkey(WebElement e, String data) {
		e.sendKeys(data);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void clear(WebElement e) {
		e.clear();
	}

	public static void getsize(WebElement e) {
		e.getSize();

	}

	public static void doubleclick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();

	}

	public static void contextclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void draganddrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}

	public static void movetoelement(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void SelectByindex(WebElement valueLocation, int index) {
		Select s = new Select(valueLocation);
		s.selectByIndex(index);

	}

	public static boolean SelectMultiple(WebElement valueLocation, int index) {
		Select s = new Select(valueLocation);
		boolean multiple = s.isMultiple();
		return multiple;

	}

	public static void screenSot(String imagename) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\ScreenShots\\" + imagename + ".png");
		FileUtils.copyFile(src, des);

	
	}
	
	public static   WebElement findelement(String locatorname,String locator) {
WebElement e= null;
		if(locatorname.equals("id")) {
			e=driver.findElement(By.id(locator));
		}
		else if(locatorname.equals("name")) {
			e=driver.findElement(By.name(locator));
		}
		else if(locatorname.equals("xpath")) {
			e=driver.findElement(By.xpath(locator));
		}
		
return e;

	}

	public void onStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
