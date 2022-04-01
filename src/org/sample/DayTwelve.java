package org.sample;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwelve {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
		//instantiation
			WebDriver driver=new ChromeDriver();
			//to pass the URL
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement sign=driver.findElement(By.xpath("(//a[@class='_1_3w1N'])"));
        js.executeScript("arguments[0].click()",sign);
       
        		WebElement user=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
               js.executeScript("arguments[0].setAttribute('value','murugan12592')",user);
               Object s=js.executeScript("return arguments[0].getAttribute('value')",user);
           	System.out.println("User Id:"+s);  
               WebElement pass=driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
               js.executeScript("arguments[0].setAttribute('value','pass123')",pass);
               Object p=js.executeScript("return arguments[0].getAttribute('value')",pass);
              	System.out.println("Password:"+p); 
              WebElement log=driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])"));
                js.executeScript("arguments[0].click()",log);
                  
	}
}







//Thread.sleep(6000);
//WebElement scrUp=driver.findElement(By.xpath("(//div[@class='heading__articles'])"));
//js.executeScript("arguments[0].scrollIntoView(false)",scrUp);


//String s=scrDown.getText();
//System.out.println(s);

//Object s=js.executeScript("return arguments[0].getAttribute('value')",scrDown);
	//System.out.println(t);
	//WebElement text=driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][5]"));