package com.day1driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtPlaceFrom = driver.findElement(By.id("src"));
		txtPlaceFrom.sendKeys("Chennai");
		WebElement txtPlaceTo = driver.findElement(By.id("dest"));
		txtPlaceTo.sendKeys("Thanjavur");
	}
}
