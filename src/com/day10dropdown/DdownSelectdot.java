package com.day10dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdownSelectdot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");

		//To find multiple options (present or not)
		WebElement dropFruits = driver.findElement(By.id("fruits"));
		Select select = new Select(dropFruits);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);

		//getOptions using select list out from dropDown
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement ele = options.get(i);
			String text = ele.getText();
			select.selectByVisibleText(text);
		}
		//getFirstSelectedOption from dropDown in console
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String attribute = firstSelectedOption.getAttribute("value");
		System.out.println(attribute);


		//getAllSelectedOption from dropDown in console
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement element = allSelectedOptions.get(i);
			String text = element.getText();
			System.out.println(text);

		//deSelectBy some options in dropDown
			Thread.sleep(2000);
			select.deselectByIndex(1);
			Thread.sleep(2000);
			select.deselectByValue("grape");
			Thread.sleep(2000);
			select.deselectByVisibleText("Orange");

		//deSelectAll options in dropDown
			select.deselectAll();
		}
	}
}