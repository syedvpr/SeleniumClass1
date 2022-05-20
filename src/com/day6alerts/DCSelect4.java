package com.day6alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DCSelect4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	
	WebElement txtBoxUsername = driver.findElement(By.id("login1"));
	txtBoxUsername.sendKeys("welcome");
	
	Actions actions = new Actions(driver);
	
	actions.doubleClick(txtBoxUsername).perform();
	
}
}
