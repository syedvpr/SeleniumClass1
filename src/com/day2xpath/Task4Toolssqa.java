package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4Toolssqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");

	WebElement txtFirstName = driver.findElement(By.id("first-name"));
	txtFirstName.sendKeys("Syed");
	WebElement txtLastName = driver.findElement(By.id("last-name"));
	txtLastName.sendKeys("Mubarak");
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("syedvpr@gmail.com");
	WebElement txtPhone = driver.findElement(By.id("mobile"));
	txtPhone.sendKeys("7010567408");
	WebElement chsCountry = driver.findElement(By.name("country"));
	chsCountry.sendKeys("India");
	WebElement txtCity = driver.findElement(By.id("city"));
	txtCity.sendKeys("India");
	WebElement txtMessage = driver.findElement(By.name("message"));
	txtMessage.sendKeys("Hi, Iam Student");

	WebElement btnSend = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
	btnSend.click();

	
}
}
