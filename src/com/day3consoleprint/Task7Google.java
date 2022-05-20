package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement txtBoxSearch = driver.findElement(By.name("q"));
	txtBoxSearch.sendKeys("greens velmurugan");
	
	WebElement btnSearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
	btnSearch.click();
	
	WebElement btnSearch1 = driver.findElement(By.xpath("//cite[@class='iUh30 qLRx3b tjvcx']"));
	btnSearch1.click();
}
}
