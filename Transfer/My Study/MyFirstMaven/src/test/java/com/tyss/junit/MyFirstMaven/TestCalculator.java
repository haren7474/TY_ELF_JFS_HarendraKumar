package com.tyss.junit.MyFirstMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator 
{
	Calculator c= null;
	
	@BeforeEach
	void createEach()
	{
	c= new Calculator();
	}
	
	@Test
	public void testDiff()
	{
		
		int i= c.diff(10, 5);
		assertEquals(5, i);
	}
	
	@Test
	public void testSumWithNegative()
	{
		
		int i= c.sum(-10, -5);
		assertEquals(-15, i);
	}
	
	@Test
	public void testMult()
	{
		int m= c.mult(5, 2);
		assertEquals(10, m);
	}
	
	@Test
	public void testMultWithNegative()
	{
		int m= c.mult(5, -2);
		assertEquals(-10, m);
	}
	
	@Test
	public void testdDivision()
	{
		double d=c.div(10, 0);
		assertEquals(10.0, d);
	}
	
	@Test
	public void testDivForArithimeticExp()
		{
			assertThrows(ArithmeticException.class, 
					()->{
						c.div(10, 0);
					}
				);
		}
	
	@Test
	public void testFindLength()
	{
		int res= c.findLength("Hello");
		assertEquals(5, res);
	}
	
	@Test
	public void testFindLengthNull()
	{
		assertThrows(NullPointerException.class, 
				()->{
					c.findLength(null);
				}
				);
	}
}
	

