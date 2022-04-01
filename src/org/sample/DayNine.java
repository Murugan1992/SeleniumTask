package org.sample;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayNine {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
		//instantiation
		WebDriver driver=new ChromeDriver();
		//to pass the URL
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("(//select[@aria-label='Year'])"));
		Select s= new Select(year);
		s.selectByVisibleText("2021");
List<WebElement> l = s.getOptions();
for (int i = 0; i < l.size(); i++) {
	WebElement t = l.get(i);
String t1= t.getAttribute("value");
System.out.println(t1);
}
	}
	
}


//s.selectByVisibleText("London");

//Thread.sleep(3000);
//driver.findElement(By.xpath("(//select[@name='country'])")).click();
//Thread.sleep(3000);
//WebElement day = driver.findElement(By.xpath("(//select[@name='country'])"));
//Select s= new Select(day);

//s.selectByVisibleText("2021");