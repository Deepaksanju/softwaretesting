package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclss {
	public WebDriver driver;
public  void launch() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
public  void maxi() {
	driver.manage().window().maximize();
}
public  void url(String url) {
	driver.getCurrentUrl();
}
public void passtext(String text,WebElement ele) {
	ele.sendKeys(text);
}
}
