package com.day2xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10Amazon2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement btnSearch = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/41Ix2JelnmL._AC_SY200_.jpg']"));
	btnSearch.click();

}
}
