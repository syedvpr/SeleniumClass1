package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7ClearTrips {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	WebElement txtPlaceFrom = driver.findElement(By.id("from_station"));
	txtPlaceFrom.sendKeys("Chennai");
	WebElement txtPlaceTo = driver.findElement(By.id("to_station"));
	txtPlaceTo.sendKeys("Thanjavur");
	WebElement btnSearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
	btnSearch.click();
}
}
