package com.day12webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTablew3schools {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		//To get all rows from table
//		WebElement tableDatas = driver.findElement(By.id("customers"));
//		String text = tableDatas.getText();
//		System.out.println(text);
		
		//for loop using to find all rows
//		WebElement tableDatas = driver.findElement(By.id("customers"));
//		List<WebElement> allRows = tableDatas.findElements(By.tagName("tr"));
//		for (int i = 0; i < allRows.size(); i++) {
//			WebElement row = allRows.get(i);
//			String text = row.getText();
//			System.out.println(text);
//		}
		
		//for loop using to find all rows and data's
		WebElement tableDatas = driver.findElement(By.id("customers"));
		List<WebElement> allRows = tableDatas.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			WebElement row = allRows.get(i);
			List<WebElement> rowData = row.findElements(By.tagName("td"));
			for (int j = 0; j < rowData.size(); j++) {
				WebElement column = rowData.get(j);
				String text = column.getText();
				System.out.println(text);
//				if (text.equals("Mexico")) {
//					System.out.println(text);
//				}
				}	
			System.out.println();
}
}
}