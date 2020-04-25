package org.acc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		WebDriver driver= driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 WebElement google = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 google.sendKeys("chennai");
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		/* WebElement box=driver.findElement(By.xpath("(//button[contains(text(),'display ')])[1]"));
		 box.click();
		 Alert a=driver.switchTo().alert();
		 a.accept();
		 WebElement ok = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		 WebElement text=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		 text.click();
		 Alert a1=driver.switchTo().alert();
		 a1.sendKeys("sangeetha");
		 a1.accept();*/
		
	}

}
