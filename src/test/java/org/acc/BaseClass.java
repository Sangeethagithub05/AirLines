package org.acc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 }
public static void loadurl(String url) {
	driver.get(url);
	}
public static void type(WebElement element,String name) {
	element.sendKeys(name);
	}
public static void btnclick(WebElement element) {
	element.click();
	}
public static void quitBrowser() {
	driver.quit();
}
public static void dropDown(WebElement element,String name) {
	Select s=new Select(element);
	s.selectByVisibleText(name);
}

public static String ordernum(WebElement element)
{
	return element.getAttribute("value");
}
}
