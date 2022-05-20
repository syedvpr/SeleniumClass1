package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		
		WebElement txtToSearch = driver.findElement(By.id("autocomplete"));
		txtToSearch.sendKeys("shoes");
		
		
		WebElement btnSelect = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		btnSelect.click();
		
		Thread.sleep(1000);
		
		WebElement btnImg = driver.findElement(By.xpath("//div[@class='img_section']"));
		btnImg.click();

	}
	}
