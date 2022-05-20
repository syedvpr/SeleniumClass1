package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtBoxEmail = driver.findElement(By.name("email"));
	txtBoxEmail.sendKeys("Raman23@gmail.com");
	String attribute = txtBoxEmail.getAttribute("value");
	System.out.println(attribute);
	WebElement txtPassword = driver.findElement(By.name("pass"));
	txtPassword.sendKeys("Hello@12345");
	String attribute1 = txtPassword.getAttribute("value");
	System.out.println(attribute1);
}
}
