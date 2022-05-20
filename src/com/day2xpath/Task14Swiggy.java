package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14Swiggy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	
	WebElement btnSignup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	btnSignup.click();
	
	WebElement txtMobile = driver.findElement(By.id("mobile"));
	txtMobile.sendKeys("7010567488");
	
	WebElement txtName = driver.findElement(By.id("name"));
	txtName.sendKeys("Syed Mubarak");
	
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("syedvpr@gmail.com");
	
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys("Syed@34345");
	
	WebElement btnContinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
	btnContinue.click();

}
}
