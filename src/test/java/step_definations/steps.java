package step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	

@Given("User landed on Make my trip")
public void user_landed_on_make_my_trip() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	
	
}

@When("go to hotels section and select city,dates,peoples,budget")
public void go_to_hotels_section_and_select_city_dates_peoples_budget() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver.findElement(By.linkText("Hotels")).click();
	//driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("Munnar");
	driver.findElement(By.id("checkin")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[1]")).click();
	   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[4]")).click();
	   driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Price per Night']")).click();
	   driver.findElement(By.xpath("//li[contains(text(),'₹2500-₹5000')]")).click();
	
	
}

@When("click on search")
public void click_on_search() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	   driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
}

@Then("available hotels should displayed")
public void available_hotels_should_displayed() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}
