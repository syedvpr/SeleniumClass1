package com.day1driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		 // WebElement txtFirstName = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		// txtFirstName.sendKeys("Ramesh"); 
		 /*WebElement txtLastName =
		 /* driver.findElement(By.id("pass")); txtLastName.sendKeys("Kumar"); WebElement
		 * txtAddress = driver.findElement(By.id("email"));
		 * txtAddress.sendKeys("34/7, Gandhi Nagar, Chennai"); WebElement txtEmail =
		 * driver.findElement(By.id("pass")); txtEmail.sendKeys("ramesh456@gmail.com");
		 * WebElement txtPhone = driver.findElement(By.id("email"));
		 * txtPhone.sendKeys("7373229872"); WebElement txtLanguage =
		 * driver.findElement(By.id("msdd")); txtLanguage.sendKeys("Czech");
		 */

		WebElement txtPassword = driver.findElement(By.id("firstpassword"));
		txtPassword.sendKeys("Ram@12345");
		WebElement txtConfirm = driver.findElement(By.id("secondpassword"));
		txtConfirm.sendKeys("Ram@12345");

	}
}
