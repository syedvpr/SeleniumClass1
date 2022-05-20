package com.day4actionsmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2Sprint {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement btnClose1 = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
	btnClose1.click();
	
	Thread.sleep(2000);
	
	WebElement btnClose2 = driver.findElement(By.xpath("(//button[@class='phx-modal__close'])[1]"));
	btnClose2.click();
	
	WebElement lnkPhones = driver.findElement(By.xpath("(//a[@class='unav-headerNav__header-link '])[2]"));
	Actions actions= new Actions(driver);
	actions.moveToElement(lnkPhones).perform();
	
	WebElement btn5Gphones = driver.findElement(By.xpath("//a[contains(text(),'5G p')]"));
	btn5Gphones.click();
	
	WebElement txtSprint = driver.findElement(By.xpath("(//a[contains(text(),'Do')])[3]"));
	String text = txtSprint.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
}
}
