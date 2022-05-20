package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	
	WebElement btnSignIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	btnSignIn.click();
	WebElement btnRegister = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	btnRegister.click();
	WebElement txtMobile = driver.findElement(By.xpath("//input[@id='userName']"));
	txtMobile.sendKeys("7010567408");
	
	
	WebElement btnContinue = driver.findElement(By.xpath("//button[@id='checkUser']"));
	btnContinue.click();
	
	

}
}
