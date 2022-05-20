package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement txtFirstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		txtFirstName.sendKeys("Syed");
		WebElement txtLastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		txtLastName.sendKeys("Mubarak");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("34/7, Gandhi Nagar, Chennai");
		WebElement txtEmailaddress = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmailaddress.sendKeys("syedvpr@gmail.com");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys("7010567408");

		WebElement gender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		gender.click();
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
		hobbies.click();
		WebElement hobbies1 = driver.findElement(By.xpath("//input[@value='Movies']"));
		hobbies1.click();
		WebElement hobbies2 = driver.findElement(By.xpath("//input[@value='Hockey']"));
		hobbies2.click();
		WebElement chsLanguage = driver.findElement(By.xpath("//div[@id='msdd']"));
		chsLanguage.sendKeys("English");
		WebElement chsSkills = driver.findElement(By.xpath("//select[@value='skill']"));
		chsSkills.sendKeys("Java");
		WebElement chsCountry = driver.findElement(By.xpath("//select[@ng-model='country']"));
		chsCountry.sendKeys("India");
		
		WebElement chsSelectCountry = driver.findElement(By.xpath("//span[@role='combobox']"));
		chsSelectCountry.sendKeys("India");

		WebElement txtYear = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
		txtYear.sendKeys("1991");
		WebElement txtMonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		txtMonth.sendKeys("March");
		WebElement txtDay = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		txtDay.sendKeys("28");

		WebElement txtPassword = driver.findElement(By.id("firstpassword"));
		txtPassword.sendKeys("Ram@12345");
		WebElement txtConfirm = driver.findElement(By.id("secondpassword"));
		txtConfirm.sendKeys("Ram@12345");
	

	}
}
