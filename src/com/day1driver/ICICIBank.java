package com.day1driver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement txtUserId = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
		txtUserId.sendKeys("ARUN28302090");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		txtPassword.sendKeys("Arun%1995");

	}
}
