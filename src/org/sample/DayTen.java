package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DayTen {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
		WebDriver driver=new ChromeDriver();
		//to pass the URL
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//(//button[@class='_2KpZ6l _2doB4z'])
		driver.findElement(By.xpath("(//div[@class='collapse show'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='collapse show'])[3]")).click();
		WebElement search=driver.findElement(By.xpath("(//input[@class='SearchBox__input'])"));
		search.sendKeys("celling fan",Keys.ENTER);
		driver.findElement(By.xpath("(//input[@class='SearchBox__input'])")).click();
		//(//li[@class='pointer'])[89]
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Ceiling Fans'])")).click();
		Thread.sleep(3000);
				driver.findElement(By.xpath("(//img[@class='stretchy'])[1]")).click();
	
				
					//to fetch parent id
		//String parId=driver.getWindowHandle();
		//System.out.println(parId);
				//to fetch all window
		//Set<String> allWin=driver.getWindowHandles();
	//	System.out.println(allWin);
		//			List<String> l=new LinkedList<String>();
		//	l.addAll(allWin);
			//driver.switchTo().window(l.get(1));
						//add to cart //(//input[@class='_36yFo0'])
			//driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2U9uOA _3v1-ww'])")).sendKeys("600072");
			//	WebElement rs=driver.findElement(By.xpath("(//td[@class='line-content'])[33]"));
			//String s=rs.getText();
			//System.out.println(s);
		
}
}
//WebElement search=driver.findElement(By.xpath("(//input[@class='_3704LK'])"));
		//search.sendKeys("hp laptop",Keys.ENTER);	
			
            
			//(//span[@class='a-price-whole'])[1]
//a.moveToElement(iphon).perform();
		//a.contextClick(iphon).perform();
		//Robot r = new Robot();
		//for(int i=0;i<2; i++) {
		//		r.keyPress(KeyEvent.VK_DOWN);
			//	r.keyRelease(KeyEvent.VK_DOWN);
				
//}r.keyPress(KeyEvent.VK_ENTER);


