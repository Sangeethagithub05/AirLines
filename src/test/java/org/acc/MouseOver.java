package org.acc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		WebDriver driver= driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		Actions acc=new Actions(driver);
		WebElement tv=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		acc.moveToElement(tv).perform();
		WebElement jui=driver.findElement(By.xpath("//a[text()='Juicer/Mixer/Grinder']"));
		jui.click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebElement juice=driver.findElement(By.xpath("//div[text()='Billion PowerGrind MG110 550 W Mixer Grinder']"));
		juice.click();
		String parent = driver.getWindowHandle();
		Set<String>  all= driver.getWindowHandles();
		List<String> li=new ArrayList();
		li.addAll(all);
		driver.switchTo().window(li.get(1));
		WebElement cart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		cart.click();
		}
	}
