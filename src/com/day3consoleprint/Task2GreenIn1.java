package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2GreenIn1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	WebElement txtGnsTechIn = driver.findElement(By.xpath("//a[@id='home-tab']"));
	txtGnsTechIn.click();
	
	WebElement findElement = driver.findElement(By.xpath("(//p[contains(text(),'V')])[3]"));
	String text = findElement.getText();
	System.out.println(text);

}
}
