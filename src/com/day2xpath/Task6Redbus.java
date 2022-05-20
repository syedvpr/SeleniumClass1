package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement btnSymbol = driver.findElement(By.id("hc"));
	btnSymbol.click();
	WebElement btnPress = driver.findElement(By.id("signInLink"));
	btnPress.click();
	WebElement txtMobile = driver.findElement(By.id("mobileNoInp"));
	txtMobile.sendKeys("7010567408");

	WebElement btnCapcha = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]"));
	btnCapcha.click();
	
	WebElement btnOTP = driver.findElement(By.id("otp-container"));
	btnOTP.click();
}
}
