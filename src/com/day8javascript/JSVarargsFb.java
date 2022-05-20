package com.day8javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSVarargsFb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txtBoxUsername = driver.findElement(By.id("email"));
	WebElement txtBoxPassword = driver.findElement(By.id("pass"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//js.executeScript("arguments[1].setAttribute('value','syedvpr@gmail.com')", txtBoxUsername, txtBoxPassword);
	js.executeScript("arguments[0].setAttribute('value','syedvpr@gmail.com')", txtBoxUsername);
	js.executeScript("arguments[0].setAttribute('value','Syed55')", txtBoxPassword);
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()", btnLogin);
	
}
}
