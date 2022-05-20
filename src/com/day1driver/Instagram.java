package com.day1driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		
		Thread.sleep(1000);
		WebElement txtPhoneNum = driver.findElement(By.xpath("//input[@name='username']"));
		txtPhoneNum.sendKeys("Syed5678");
		WebElement txtPassword1 = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword1.sendKeys("Insta@4356");
	}
}
