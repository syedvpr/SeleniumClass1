package com.day1driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch1 {
static void browserLaunching(String browserType, String url) {
	switch (browserType) {
	case "chrome": {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		break;	
	}
	case "firefox": {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		break;	
	}
	case "edge": {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SYED\\eclipse-workspace\\SeleniumClass1\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		break;	
	}
	

	default: {
		System.out.println("no browsertype is matching");
	}
	}}
public static void main(String[] args) {
	//browserLaunching("chrome", "https://www.facebook.com/");
	browserLaunching("firefox", "https://www.facebook.com/");

}
}

