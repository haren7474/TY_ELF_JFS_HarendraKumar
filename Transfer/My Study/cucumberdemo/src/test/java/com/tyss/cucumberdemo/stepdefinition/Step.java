package com.tyss.cucumberdemo.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "D:/My Study/seleniumdemo/src/main/resources/chromedriver.exe");
	}

	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String un, String pw) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Login Successful");
	}
}
