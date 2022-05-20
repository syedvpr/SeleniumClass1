package com.day3consoleprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		
		WebElement txtToSearch = driver.findElement(By.id("inputValEnter"));
		txtToSearch.sendKeys("titan watch");
		
		
		WebElement btnClick = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
		btnClick.click();
		
		WebElement btnImg = driver.findElement(By.xpath("(//p[@class=('product-title ')])[1]"));
		btnImg.click();

	}
	}


