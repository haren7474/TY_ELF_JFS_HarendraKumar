package com.tyss.executionflow;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeSuite
	public void m1() {
		Reporter.log("@BeforeSuite", true);
	}

	@BeforeTest
	public void m2() {
		Reporter.log("@BeforeTest Executed", true);
	}

	@BeforeClass
	public void m3() {
		Reporter.log("@@BeforeClass Executed", true);
	}

	@BeforeMethod
	public void m4() {
		Reporter.log("@BeforeMethod Executed", true);
	}

	@AfterSuite
	public void m5() {
		Reporter.log("@AfterSuite Executed", true);
	}

	@AfterTest
	public void m6() {
		Reporter.log("@AfterTest Executed", true);
	}

	@AfterClass
	public void m7() {
		Reporter.log("@@AfterClass Executed", true);
	}

	@AfterMethod
	public void m8() {
		Reporter.log("@AfterMethod Executed", true);
	}

}
