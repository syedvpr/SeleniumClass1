package com.day10dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdownFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate.click();

		Thread.sleep(2000);

		//		WebElement dropDay = driver.findElement(By.name("birthday_day"));
		//		Select select = new Select(dropDay);
		//		select.selectByValue("28");
		//		
		//		WebElement dropMonth = driver.findElement(By.id("month"));
		//		Select select1 = new Select(dropMonth);
		//		select1.selectByVisibleText("Mar");
		
		//get options using list out dropDown
		WebElement dropYear = driver.findElement(By.id("year"));
		Select select = new Select(dropYear);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
	}
}