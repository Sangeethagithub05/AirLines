package org.acc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		WebDriver driver= driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.greenstechnologys.com/");
		 WebElement down=driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", down);
		 TakesScreenshot tk=(TakesScreenshot)driver;
		File temp= tk.getScreenshotAs(OutputType.FILE);
		File desc= new File("C:\\Users\\home\\eclipse-workspace\\JetCost\\Screenshot\\greens.png");
		FileUtils.copyFile(temp, desc);
		
	}

}
