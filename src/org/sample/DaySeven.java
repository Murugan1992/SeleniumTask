package org.sample;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaySeven {

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
		WebDriver driver=new ChromeDriver();
		//to pass the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement search=driver.findElement(By.xpath("(//input[@type='text'])"));
        js.executeScript("arguments[0].setAttribute('value','motorolo')",search);
	//	WebElement scrDown=driver.findElement(By.xpath("(//h2[@class='mb-0'])[4]"));
		//js.executeScript("arguments[0].scrollIntoView(false)",scrDown);

		//create object for screenshoot
		TakesScreenshot t=(TakesScreenshot)driver;
		// to take screen shot
		File src = t.getScreenshotAs(OutputType.FILE);
	// to create dest
		File dest=new File("C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\ScreenShot\\pic8.png");
		//to copy the file
		FileUtils.copyFile(src,dest);
		
		
		
		
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//WebElement scrDown=driver.findElement(By.xpath("(//div[@class='heading__articles'])"));
		//js.executeScript("arguments[0].scrollIntoView(false)",scrDown);

		
		
		
		
		
		
		
//WebElement log=driver.findElement(By.xpath("(//button[@class='modal__close'])[2]"));
	//log.click();
	
	
}
}
//WebElement scrDown=driver.findElement(By.xpath("(//div[@class='heading__articles'])"));
//js.executeScript("arguments[0].scrollIntoView(false)",scrDown);