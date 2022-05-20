package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement btnEscape = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnEscape.click();

		
		WebElement txtToSearch = driver.findElement(By.name("q"));
		txtToSearch.sendKeys("headphones");
		
		
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
		btnClick.click();
		
		Thread.sleep(2000);
		
		WebElement btnImg = driver.findElement(By.xpath("//a[(text()='Aroma NB119B Badshah - 40 Hours Playtime Bluetooth Neck...')]"));
		btnImg.click();

	}
	}


