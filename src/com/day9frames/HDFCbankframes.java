package com.day9frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCbankframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		// To find total no. of frames
		List<WebElement> frameCount = driver.findElements(By.tagName("frame"));
		int size = frameCount.size();
		System.out.println(size);

		// Switching frame by using index no.
		// driver.switchTo().frame(0);
		// WebElement txtUserID = driver.findElement(By.name("fldLoginUserId"));
		// txtUserID.sendKeys("28302090");

		// Switching frame by using string id or string name
		// driver.switchTo().frame("login_page");
		// WebElement txtUserID1 = driver.findElement(By.name("fldLoginUserId"));
		// txtUserID1.sendKeys("30608090");

		// Switching frame by using WebElement reference
		WebElement frameName = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frameName);
		WebElement txtUserID2 = driver.findElement(By.name("fldLoginUserId"));
		txtUserID2.sendKeys("32425262");

	}
}