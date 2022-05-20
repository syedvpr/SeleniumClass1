package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13Myntra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement txtMobile = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	txtMobile.sendKeys("7010567408");
	WebElement btnContinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	btnContinue.click();
	
}
}
