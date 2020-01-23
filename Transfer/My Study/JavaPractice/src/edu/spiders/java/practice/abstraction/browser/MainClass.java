package edu.spiders.java.practice.abstraction.browser;

public class MainClass 
{
	public static void main(String[] args) 
	{
		BrowserFactory bf= new BrowserFactory();
		bf.getBrowser("Chrome").start();
		bf.getBrowser("Opera").start();
		bf.getBrowser("Safari").start();
	}
}
