package com.tyss.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo2 {
	static {
		System.setProperty("webdriver.chrome.driver", "D:/My Study/seleniumdemo/src/main/resources/chromedriver.exe");
	}
	
	@Test
	public static void demo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Reporter.log("from TestNgAnnonation: ", true);
	}
}
