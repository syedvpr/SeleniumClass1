package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11GoogleAcct {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	
	WebElement txtFirstName = driver.findElement(By.id("firstName"));
	txtFirstName.sendKeys("Syed");
	WebElement txtLastName = driver.findElement(By.id("lastName"));
	txtLastName.sendKeys("Mubarak");
	WebElement txtGmail = driver.findElement(By.id("username"));
	txtGmail.sendKeys("syedvpr168");
	WebElement txtPassword = driver.findElement(By.name("Passwd"));
	txtPassword.sendKeys("Mubarak@233");
	WebElement txtPassword1 = driver.findElement(By.name("ConfirmPasswd"));
	txtPassword1.sendKeys("Mubarak@233");
	
	WebElement btnCheckbox = driver.findElement(By.xpath("//input[@id='i3']"));
			btnCheckbox.click();
			
			WebElement btnNext = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
					btnNext.click();
			
}
}
