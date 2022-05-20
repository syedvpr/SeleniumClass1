package com.day4actionsmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1DragandDrop {


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement sBank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement dBank = driver.findElement(By.id("bank"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(sBank, dBank).perform();
	
	WebElement sAmount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement dAmount = driver.findElement(By.id("amt7"));
	actions.dragAndDrop(sAmount, dAmount).perform();

	WebElement sSales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement dSales = driver.findElement(By.id("loan"));
	actions.dragAndDrop(sSales, dSales).perform();

	WebElement sAmount1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement dAmount1 = driver.findElement(By.id("amt8"));
	actions.dragAndDrop(sAmount1, dAmount1).perform();
	
	WebElement txtPrint = driver.findElement(By.xpath("//a[contains(text(),'Pe')]"));
	String text = txtPrint.getText();
	System.out.println(text);
}


}
