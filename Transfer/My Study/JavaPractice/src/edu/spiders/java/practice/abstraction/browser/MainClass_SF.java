package edu.spiders.java.practice.abstraction.browser;

public class MainClass_SF 
{
	public static void main(String[] args) 
	{
		BrowserFactory_SF bf= new BrowserFactory_SF();
		System.out.print("Chrome Calling: ");
		bf.getBrowser(new Chrome());
		
		System.out.print("Safari Calling: ");
		bf.getBrowser(new Safari());
		
		System.out.print("Opera Calling: ");
		bf.getBrowser(new Opera());
	}
}
