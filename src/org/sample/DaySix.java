package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DaySix {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
		WebDriver driver=new ChromeDriver();
		//to pass the URL
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		WebElement log=driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[23]"));
		log.click();
	Thread.sleep(3000);
	WebElement whig=driver.findElement(By.xpath("(//a[@href='//www.shopclues.com/mobiles-smartphones.html?facet_brand[]=Realme&fsrc=facet_brand'])"));
		whig.click();
		
		
		
		
		
		
		
			
		
		
		
		
		//Robot r = new Robot();
		//for(int i=0;i<5; i++) {
		//		r.keyPress(KeyEvent.VK_DOWN);
		//		r.keyRelease(KeyEvent.VK_DOWN);
		//		
		//	}r.keyPress(KeyEvent.VK_ENTER);
			
			
		
		
		
}
}




//
		//WebElement resumefour=driver.findElement(By.xpath("(//a[@href='http://traininginchennai.in/Selenium_5and6yrs_Experience_Resume.pdf'])"));
		//a.moveToElement(resumefour).perform();
			//	a.contextClick(resumefour).perform();
//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		//a.doubleClick(resufour).perform();
		//a.contextClick(resufour).perform();
		//Robot r = new Robot();
		//for(int i=0;i<9; i++) {
			//r.keyPress(KeyEvent.VK_DOWN);
			//r.keyRelease(KeyEvent.VK_DOWN);
			
		//}r.keyPress(KeyEvent.VK_ENTER);




//a.keyDown(user, Keys.SHIFT).sendKeys("murugan").keyUp(Keys.SHIFT).build().perform();
//WebElement pass=driver.findElement(By.xpath("(//input[@type='password'])"));
//a.sendKeys(pass, "password").perform();
//a.sendKeys("Vel Murugan").perform();
//a.doubleClick(user).perform();
//a.contextClick(user).perform();
//Robot r=new Robot();
//r.keyPress(KeyEvent.VK_CONTROL);
//r.keyPress(KeyEvent.VK_X);
//r.keyRelease(KeyEvent.VK_CONTROL);
//r.keyRelease(KeyEvent.VK_X);
