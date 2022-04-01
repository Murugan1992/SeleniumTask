package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayEight {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
		//instantiation
			WebDriver driver=new ChromeDriver();
			
			//to pass the URL
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			//driver.manage().window().maximize();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
			//(//button[@class='btn btn-danger'])
			driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			//a.sendKeys("Murugan");
	//String tx = a.getText();
	//System.out.println(tx);
	a.accept();
	}

}


//search.sendKeys("celling fan",Keys.ENTER);