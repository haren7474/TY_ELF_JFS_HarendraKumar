package com.tyss.cucumberdemo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features= "D:/My Study/cucumberdemo/src/test/java/com/tyss/cucumberdemo/test/Features.feature")
@CucumberOptions(features = "D:/My Study/cucumberdemo/src/test/java/com/tyss/cucumberdemo/test/Features.feature", glue = {
		"com.tyss.cucumberdemo.stepdefinition" }, plugin = { "pretty", "html:target/cucumber" }, monochrome = true, tags= {"@Smoke"})
public class RunClass extends AbstractTestNGCucumberTests {

}
