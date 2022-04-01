package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\SeleniumFastracBatch\\Drivers\\chromedriver.exe");
	//instantiation
	WebDriver driver=new ChromeDriver();
	//to pass the URL
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions a= new Actions(driver);
	WebElement s1=driver.findElement(By.xpath("(//li[@class='block14 ui-draggable'])"));
	WebElement d1=driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
	a.dragAndDrop(s1,d1).perform();
	WebElement s2=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])"));
	WebElement d2=driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	a.dragAndDrop(s2,d2).perform();
	WebElement s3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement d3=driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
	a.dragAndDrop(s3,d3).perform();
	WebElement s4=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
	WebElement d4=driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
	a.dragAndDrop(s4,d4).perform();
	}

}




//driver.findElement(By.xpath("(//span[text()='Trainer']")).click();
//Thread.sleep(3000);
//Thread.sleep(3000);
	//WebElement logi=driver.findElement(By.xpath("(//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0'])"));
	//logi.click();

//to locate user name
	//WebElement note=driver.findElement(By.id("email"));
	//note.sendKeys("murugan12592");
	//to locate password field
	//WebElement to=driver.findElement(By.id("pass"));
//to.sendKeys("Pass@123");
	//locate login
//WebElement text=driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][5]"));
//String s=text.getText();
//System.out.println(s);