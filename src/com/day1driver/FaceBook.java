package com.day1driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement txtUserName = driver.findElement(By.id("email"));
	    //txtUserName.sendKeys("Ram Kumar");
	    //WebElement txtPassword = driver.findElement(By.id("pass"));
		//txtPassword.sendKeys("Hello@12345");
		
		//WebElement btnCNAcc = driver.findElement(By.xpath("(//div[@class=('_6ltg')])[2]"));
		WebElement btnCNAcc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		
		btnCNAcc.click();
		
		Thread.sleep(3000);
	
		WebElement txtBoxFirstName = driver.findElement(By.name("firstname"));
		txtBoxFirstName.sendKeys("syed");
		
		WebElement txtBoxLastName = driver.findElement(By.name("lastname"));
		txtBoxLastName.sendKeys("mubarak");
		
		WebElement txtBoxMobile = driver.findElement(By.name("reg_email__"));
		txtBoxMobile.sendKeys("7010567408");
		
		WebElement txtBoxPassword = driver.findElement(By.name("reg_passwd__"));
		txtBoxPassword.sendKeys("Syed@1991");
		WebElement txtRgender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		txtRgender.click();
		
		
	}
}
