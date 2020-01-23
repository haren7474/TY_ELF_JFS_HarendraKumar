package com.tyss.datastructure.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) 
	{
		System.out.println("MMS");
		long number=999999L;
		
		countingDuration1();
		countingDuration2();
	}

	public static long addUpto(Long number) {
		
		long total=0L;
		
		for (int i = 0; i <= number; i++) 
		{
			total= total+ i;
		}
		return total;
	}
	
	public static long addUptoQuick(Long n) {
		
		return n*(n+1)/2;
	}
	
	public static void countingDuration1()
	{
		long number=999999999L;
		Instant start= Instant.now();
		System.out.println("addUpto Result: " + addUpto(number));
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("add upto took " + seconds + " seconds");
	}
	
	public static void countingDuration2()
	{
		long number=999999999L;
		Instant start= Instant.now();
		System.out.println("addUpto Quick Result: " + addUptoQuick(number));
		Instant end= Instant.now();
		
		long duration =Duration.between(start, end).toMillis();
		double seconds= duration/1000;
		System.out.println("add upto Quick took " + seconds + " seconds");
	}
}
