package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement txtEmail = driver.findElement(By.name("email"));
	txtEmail.sendKeys("Raman23@gmail.com");
	WebElement txtPassword = driver.findElement(By.name("pass"));
	txtPassword.sendKeys("Hello@12345");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
	btnLogin.click();
	
}
}
