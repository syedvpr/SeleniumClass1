package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5GreensTech2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement txtGnsTech = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
	String text = txtGnsTech.getText();
	System.out.println(text);
}
}
