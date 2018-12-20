package org.cucumber.Cucumbernew;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample {
static WebDriver driver;
@Given("The user is in Google Home page")
public void the_user_is_in_Google_Home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-15\\Desktop\\Manjula\\Cucumbernew\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
	driver.get("https://www.google.com/");
}

@When("User Search for Text")
public void user_Search_for_Text() throws Throwable {
	driver.findElement(By.name("q")).sendKeys("Java");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
}

@Then("User should be in Search Results page")
public void user_should_be_in_Search_Results_page() {
    Assert.assertTrue(driver.getCurrentUrl().contains("search"));
}



}
	