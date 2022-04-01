package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayEleven {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
	WebDriver driver=new ChromeDriver();
	//to pass the URL
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	List<WebElement> allRow = driver.findElements(By.tagName("td"));
	for (int j= 0; j < allRow.size(); j++) {
		WebElement row=allRow.get(j);
		String t = row.getText();
	if (t.equals("fourth cell")) {
		System.out.println("Name:"+t);
	}
		
	}
	
		
	}
}



//for (int i = 0; i < allRow.size(); i++) {
//	WebElement row=allRow.get(i);
//	String t = row.getText();
//System.out.println(t);



//driver.manage().window().maximize();
	//Thread.sleep(3000);
	