package com.tyss.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "D:/My Study/seleniumdemo/src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver: " + driver);
		
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		
		String title= driver.getTitle();
		System.out.println("title: " + title);
		
		String currUrl= driver.getCurrentUrl();
		System.out.println("currUrl: " + currUrl);
		
		String pageSource= driver.getPageSource();
		//System.out.println(pageSource);
		
		driver.close();
	}
	
}
