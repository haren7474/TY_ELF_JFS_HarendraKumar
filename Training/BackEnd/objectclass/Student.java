package com.tyss.objectclass;

public class Student 
{
	int studId;
	String studName;
	
	public Student(int studId, String studName) 
	{
		this.studId = studId;
		this.studName = studName;
	}

	@Override
	public String toString() 
	{
		return studId+"\t"+ studName;
	}
	

	@Override
	public int hashCode()
	{
		return studId;
	}
	
}
