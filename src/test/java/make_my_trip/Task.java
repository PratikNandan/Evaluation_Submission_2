package make_my_trip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	WebDriver driver;

	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

@Test
public void tasks() throws InterruptedException {
	driver.findElement(By.linkText("Hotels")).click();
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//span[normalize-space()='City, Property name or Location']")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("Munnar");
//	WebElement drpdwn = driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']"));
//	drpdwn.click();
//	
//
//	
//	Select select = new Select(drpdwn);
//	select.selectByVisibleText("Munnar");		
//	Thread.sleep(3000);
	
	
	 
	
	
	

//	driver.findElement(By.id("checkin")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//div[@aria-label='Sun Jul 28 2024'])[1]")).click();
//	Thread.sleep(3000);
//
//	driver.findElement(By.id("checkout")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//div[@aria-label='Sun Jul 31 2024'])[1]")).click();
	
	driver.findElement(By.id("checkin")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[1]")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[4]")).click();
	   driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Price per Night']")).click();
	   driver.findElement(By.xpath("//li[contains(text(),'₹2500-₹5000')]")).click();
	   driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
	driver.findElement(By.xpath("//button[@id=\"hsw_search_button\"]")).click();

	
	
}
}
