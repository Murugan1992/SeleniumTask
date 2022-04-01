package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFive {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
		WebDriver driver=new ChromeDriver();
		
		//to pass the URL
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		WebElement course=driver.findElement(By.xpath("(//div[@class='header-browse-greens'])"));
a.moveToElement(course).perform();
course.click();
WebElement rpa=driver.findElement(By.xpath("//span[text()='RPA (6)']"));
a.moveToElement(rpa).perform();
rpa.click();
WebElement blue=driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
a.moveToElement(blue).perform();
blue.click();
}

}
//