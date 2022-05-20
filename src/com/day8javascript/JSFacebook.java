package com.day8javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSFacebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement txtBoxUsername = driver.findElement(By.id("email"));
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','syedvpr@gmail.com')", txtBoxUsername);
	
	//return arguments, getAttribute for output in console
	
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtBoxUsername);
	
	String mail = (String) executeScript;
	System.out.println(mail);
	
}
}
