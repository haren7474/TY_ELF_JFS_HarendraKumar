Feature: Login Action

Scenario Outline: Successful login with valid credentials
	Given User navigate to login page
	When User enters "<users>" and "<pass>"
	Then Login should be successful
	Examples: 
			|users|pass|
			|trainee|trainee|
			|admin|manager|
			
Feature: Buy from Bluestone

@Smoke
Scenario Outline: Successful login with valid credentials
	Given User navigate to bluestone url
	When User click on All Jewelery
	 
	
	
	
	