package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11Flipkart2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//WebElement btnLogin = driver.findElement(By.xpath("//a[@href='https://www.flipkart.com/account/login?ret=/']"));
		//btnLogin.click();
		
		
		WebElement txtBoxMobile = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtBoxMobile.sendKeys("7010567408");
		String attribute = txtBoxMobile.getAttribute("value");
		System.out.println(attribute);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("Hello@12345");
		String attribute1 = txtPassword.getAttribute("value");
		System.out.println(attribute1);

}

}
