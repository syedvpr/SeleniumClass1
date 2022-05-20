package com.day6alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	
	WebElement btnPromptAlert = driver.findElement(By.id("promtButton"));
	btnPromptAlert.click();
	
	Alert alert = driver.switchTo().alert();
	
	Thread.sleep(2000);
	
	alert.sendKeys("welcome");
	
	Thread.sleep(2000);
	
	alert.accept();
	
}
}
