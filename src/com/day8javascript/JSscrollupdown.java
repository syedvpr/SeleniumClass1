package com.day8javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSscrollupdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	WebElement scrollDown = driver.findElement(By.xpath("//h3[@id='heading8828']"));
	WebElement scrollUp = driver.findElement(By.xpath("(//a[text()='Corporate Training'])[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	
	
}
}
