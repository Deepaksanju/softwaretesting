package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailsignin extends Baseclss {
	
	@Given("To launch the chrome browser and maximize window for gmail")
	public void to_launch_the_chrome_browser_and_maximize_window_for_gmail() {
	launch();
	maxi();
	
	}

	@When("To launch the url of gmail application")
	public void to_launch_the_url_of_gmail_application() {
      driver.get("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AXo7B7WmvUIgxDVbyO4VJuv8ejNVxDTKL8hIuxOV4U9S4jm-mtLZ79e2DiGByPZJNVvOU68NQxnWeQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AGEVcSRxA3A2BCnlD3spXauQE4_0X6sYCSeknULOD2uU7gNV6Teuil-W-Stx2Qic");
	}
	
	@When("To pass valid username in gmail field")
      public void to_pass_valid_username_in_gmail_field()  {
	
	   WebElement name = driver.findElement(By.xpath("//input[@type='password']"));
	  name.sendKeys("14141");
	  
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	  WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	  next.click();
	}

	@Then("To close the gmail")
	public void to_close_the_gmail() {
	   
	}
}
