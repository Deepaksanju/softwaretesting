package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//to login fb with multiple user name and password
public class Multipleusername extends Baseclss{
	WebDriver driver;
	
	@Given("User has to launch te browser and maximize the window")
	public void user_has_to_launch_te_browser_and_maximize_the_window() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	}

	@When("User has to launch the url")
	public void user_has_to_launch_the_url() {
	    driver.get("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string} in name")
	public void user_has_to_pass_the_data_in_name(String un) {
	   WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	   passtext(un, name);
	}

	@When("User has to pass the data {string} in password")
	public void user_has_to_pass_the_data_in_password(String ps) {
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 passtext(ps, password);
	}

	@Then("User will close")
	public void user_will_close() {
		driver.close();
	    
	}


}
