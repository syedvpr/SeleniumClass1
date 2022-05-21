package com.day11windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHamazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("iphone", Keys.ENTER);

		WebElement btnPhone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		btnPhone.click();

		String prtWinId = driver.getWindowHandle();
		System.out.println(prtWinId);

		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);

		for (String string : allWinId) {
			if (!(prtWinId.equals(string))) {	
				driver.switchTo().window(string);
			}
		}

		WebElement btnAdd2Cart = driver.findElement(By.id("add-to-cart-button"));
		btnAdd2Cart.click();
		
		System.out.println("Git repository");
	}
}