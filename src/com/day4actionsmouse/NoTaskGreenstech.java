package com.day4actionsmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoTaskGreenstech {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	WebElement lnkCourses = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(lnkCourses).perform();
	
	WebElement btnBigData = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
	btnBigData.click();
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	WebElement lnkCourses1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
	actions.moveToElement(lnkCourses1).perform();
	
	WebElement lnkOracleTraining = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
	actions.moveToElement(lnkOracleTraining).perform();
	
}
}
