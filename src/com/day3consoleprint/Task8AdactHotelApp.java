package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8AdactHotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtBoxUsername = driver.findElement(By.id("username"));
		txtBoxUsername.sendKeys("syed3456");
		String attribute = txtBoxUsername.getAttribute("value");
		System.out.println(attribute);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Hello@12345");
		String attribute1 = txtPassword.getAttribute("value");
		System.out.println(attribute1);
	}
}
