package com.tyss.anotations1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
	@Test
	public void loginActi() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
	}
}